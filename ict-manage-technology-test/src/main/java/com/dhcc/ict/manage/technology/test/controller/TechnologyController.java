package com.dhcc.ict.manage.technology.test.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.dhcc.ict.manage.technology.test.pojo.ExamQuestion;
import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamSubmitDetail;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecord;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyType;
import com.dhcc.ict.manage.technology.test.pojo.UserDetail;
import com.dhcc.ict.manage.technology.test.service.TechnologyService;

@Controller
public class TechnologyController {

	private ExamQuestion examQuestion;
	private UserDetail userDetail;

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
	public ExamQuestion getExamQuestion(HttpServletRequest request, int testType) {
		HttpSession session = request.getSession();
		// 获取当前用户信息
		userDetail = (UserDetail) session.getAttribute("localUser");
		// 获取用户对应面试记录
		InterviewRecord interviewRecord = technologyService.getInterviewRecord(userDetail.getUserId());
		ExamRule examRule = technologyService.getExamRule(interviewRecord.getInterviewerId());
		examQuestion = technologyService.getTestList(examRule, testType);

		// 插入考试记录
		ExamRecord examRecord = new ExamRecord();
		examRecord.setTechnologyTypeId(testType);
		examRecord.setUserId(userDetail.getUserId());
		technologyService.insertExamRecord(examRecord);
		return examQuestion;
	}

	// 保存试卷
	@RequestMapping("/insert")
	public void insertExamQuestion() {
		// 保存试卷
		Integer examQuestionId = technologyService.insertExamQuestion(examQuestion);
		// 更新考试记录信息
		if (examQuestionId != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ExamRecord examRecord = new ExamRecord();
			examRecord.setExamQuestionId(examQuestionId);
			try {
				examRecord.setExamStarttime(dateFormat.parse(dateFormat.format(new Date())));
			} catch (ParseException e) {
				System.out.println("technoloyController.java（保存试卷）");
				e.printStackTrace();
			}
			// 更新考试记录表
			technologyService.updateExamRecord(examRecord, userDetail.getUserId());
		}
	}

	// 判卷（JSON.parseObject(JSON_OBJ_STR, new TypeReference<Student>() {});）
	public void giveGrade(String userSubmitDetail) {
		JSONObject submitObject = JSONObject.parseObject(userSubmitDetail);
		String chooseone = submitObject.getString("chooseone");
		List<ExamSubmitDetail> submitChooseOne = JSON.parseObject(chooseone,
				new TypeReference<List<ExamSubmitDetail>>() {
				});
		String choosemuch = submitObject.getString("choosemuch");
		List<ExamSubmitDetail> submitChooseMuch = JSON.parseObject(choosemuch,
				new TypeReference<List<ExamSubmitDetail>>() {
				});
		String judge = submitObject.getString("judge");
		List<ExamSubmitDetail> submitJudge = JSON.parseObject(judge, new TypeReference<List<ExamSubmitDetail>>() {
		});

	}

}
