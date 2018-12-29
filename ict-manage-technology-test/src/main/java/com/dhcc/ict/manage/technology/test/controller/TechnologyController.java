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

import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamSubmitDetail;
import com.dhcc.ict.manage.technology.test.pojo.ExamTotalQuestion;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyType;
import com.dhcc.ict.manage.technology.test.pojo.UserDetail;
import com.dhcc.ict.manage.technology.test.pojo.UserExamRule;
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
	public ModelAndView getExamQuestion(HttpSession session, int testType, ModelAndView modelAndView)
			throws ParseException {
		ExamTotalQuestion examTotalQuestion = null;
		ExamRule examRule = null;
		// 获取当前用户信息
		UserDetail userDetail = (UserDetail) session.getAttribute("localUser");
		// 获取用户对应面试记录
		UserExamRule userExamRule = technologyService.getUserExamRule(1);// userDetail.getUserId();

		// 判断出卷方式
		if (userExamRule.getPaperFlag() != null && !userExamRule.getPaperFlag().equals("")) {
			examTotalQuestion = technologyService.getUnifyTest(userExamRule.getPaperFlag());
		} else {

			examRule = technologyService.getExamRule(userExamRule);
			examTotalQuestion = technologyService.getTestList(examRule);

		}
		session.setAttribute("userExamQuestion", examTotalQuestion);
		// 插入考试记录(考试类别，用户id)
		ExamRecord examRecord = new ExamRecord();
		examRecord.setTechnologyTypeId(examRule.getTechnologyTypeId());
		examRecord.setUserId(1);// userDetail.getUserId();
		examRecord.setExamStarttime(dateFormat.parse(dateFormat.format(new Date())));

		session.setAttribute("userExamRecord", examRecord);

		modelAndView.addObject("examPaper", examTotalQuestion);
		modelAndView.setViewName("exam-paper.html");
		return modelAndView;

	}

	// 保存试卷，判卷
	@ResponseBody
	@RequestMapping("/getGrade")
	public ExamRecord giveGrade(HttpSession session, String userSubmitDetail) {

		// session = request.getSession();
		System.out.println(session.getId());

		// 保存试卷
		ExamTotalQuestion examTotalQuestion = (ExamTotalQuestion) session.getAttribute("userExamQuestion");
		String paperFlag = technologyService.insertExamPaper(examTotalQuestion);
		// 更新考试记录信息(试卷id，开始时间)
		if (paperFlag != null) {

			ExamRecord examRecord = (ExamRecord) session.getAttribute("userExamRecord");

			try {
				examRecord.setPaperFlag(paperFlag);

				List<List<ExamSubmitDetail>> examList = technologyService.getExamRecord(userSubmitDetail);

				// 保存考试记录（结束时间，考试实际时间，考生答案）
				ExamRecord examRecord2 = technologyService.getGrade(examList, examTotalQuestion, paperFlag);
				examRecord.setChooseOneScore(examRecord2.getChooseOneScore());
				examRecord.setChooseMuchScore(examRecord2.getChooseMuchScore());
				examRecord.setChooseJurge(examRecord2.getChooseJurge());
				examRecord.setTotalScore(examRecord2.getTotalScore());
				examRecord.setExamEndtime(dateFormat.parse(dateFormat.format(new Date())));
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

}
