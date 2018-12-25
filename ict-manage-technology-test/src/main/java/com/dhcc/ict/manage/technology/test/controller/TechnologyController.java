package com.dhcc.ict.manage.technology.test.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.dhcc.ict.manage.technology.test.pojo.ExamQuestion;
import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamSubmitDetail;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecord;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudge;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyType;
import com.dhcc.ict.manage.technology.test.pojo.UserDetail;
import com.dhcc.ict.manage.technology.test.service.TechnologyService;
import com.dhcc.ict.manage.technology.test.util.DateUtil;

@Controller
@RequestMapping("/tectest")
public class TechnologyController {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Autowired
	private TechnologyService technologyService;

	// 获取所有考试类别
	@ResponseBody
	@RequestMapping("/getalltype")
	public List<TechnologyType> getgetAllTechnologyType() {
		return technologyService.getAllTechnologyType();
	}

	// 开始考试,获取试卷信息
	@ResponseBody
	@RequestMapping("/gettestpaper")
	public ModelAndView getExamQuestion(HttpSession session, int testType, ModelAndView modelAndView) {
		/* session = request.getSession(); */
		// 获取当前用户信息
		UserDetail userDetail = (UserDetail) session.getAttribute("localUser");
		// 获取用户对应面试记录
		InterviewRecord interviewRecord = technologyService.getInterviewRecord(1);// userDetail.getUserId();
		if (interviewRecord != null) {
			ExamRule examRule = technologyService.getExamRule(interviewRecord.getInterviewerId());
			ExamQuestion examQuestion = technologyService.getTestList(examRule, testType);
			session.setAttribute("userExamQuestion", examQuestion);
			// 插入考试记录(考试类别，用户id)
			ExamRecord examRecord = new ExamRecord();
			examRecord.setTechnologyTypeId(testType);
			examRecord.setUserId(1);// userDetail.getUserId();
			try {
				examRecord.setExamStarttime(dateFormat.parse(dateFormat.format(new Date())));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			session.setAttribute("userExamRecord", examRecord);

			modelAndView.addObject("sessionid", session.getId());
			modelAndView.addObject("technologyOne",
					JSONObject.parseArray(examQuestion.getTechnologyOne(), TechnologyChooseOne.class));
			modelAndView.addObject("technologyMuch",
					JSONObject.parseArray(examQuestion.getTechnologyMuch(), TechnologyChooseMuch.class));
			modelAndView.addObject("technologyJudge",
					JSONObject.parseArray(examQuestion.getTechnologyJuage(), TechnologyJudge.class));
			modelAndView.addObject("examQuestion", examQuestion);
			modelAndView.setViewName("technology_test.html");
			return modelAndView;
		}
		return null;
	}

	// 保存试卷
	@RequestMapping("/insert")
	public void insertExamQuestion(HttpSession session) {
		// session = request.getSession();
		// 保存试卷
		Integer examQuestionId = technologyService
				.insertExamQuestion((ExamQuestion) session.getAttribute("userExamQuestion"));
		// 更新考试记录信息(试卷id，开始时间)
		if (examQuestionId != null) {

			ExamRecord examRecord = (ExamRecord) session.getAttribute("userExamRecord");

			try {
				examRecord.setExamQuestionId(examQuestionId);
				examRecord.setExamStarttime(dateFormat.parse(dateFormat.format(new Date())));
			} catch (ParseException e) {
				System.out.println("technoloyController.java（保存试卷）");
				e.printStackTrace();
			}
			session.setAttribute("userExamRecord", examRecord);
		}
	}

	// 判卷（JSON.parseObject(JSON_OBJ_STR, new TypeReference<Student>() {});）
	@ResponseBody
	@RequestMapping("/getGrade")
	public ExamRecord giveGrade(HttpSession session, String userSubmitDetail) {

		// session = request.getSession();
		System.out.println(session.getId());

		// 保存试卷
		ExamQuestion examQuestion = (ExamQuestion) session.getAttribute("userExamQuestion");
		Integer examQuestionId = technologyService.insertExamQuestion(examQuestion);
		// 更新考试记录信息(试卷id，开始时间)
		if (examQuestionId != null) {

			ExamRecord examRecord = (ExamRecord) session.getAttribute("userExamRecord");

			try {
				examRecord.setExamQuestionId(examQuestionId);

				List<List<ExamSubmitDetail>> examList = technologyService.getExamRecord(userSubmitDetail);

				// 保存考试记录（结束时间，考试实际时间，考生答案）
				ExamRecord examRecord2 = technologyService.getGrade(examList, examQuestion);
				examRecord.setChooseOneScore(examRecord2.getChooseOneScore());
				examRecord.setChooseMuchScore(examRecord2.getChooseMuchScore());
				examRecord.setChooseJurge(examRecord2.getChooseJurge());
				examRecord.setTotalScore(examRecord2.getTotalScore());
				examRecord.setExamEndtime(dateFormat.parse(dateFormat.format(new Date())));
				examRecord.setUserAnswer(userSubmitDetail);
				Integer diff = DateUtil.diff(examRecord.getExamStarttime(), examRecord.getExamEndtime(), "minute");
				examRecord.setExamRealityTime(diff);
			} catch (ParseException e) {
				System.out.println("technoloyController.java（保存试卷）");
				e.printStackTrace();
			}

			// 保存考试记录
			technologyService.insertExamRecord(examRecord);
			return examRecord;
		}
		return null;
	}

	@RequestMapping("/tttt")
	public String tt() {
		return "forward:ictmanagetechnologytest/tectest/tttt";
	}
}
