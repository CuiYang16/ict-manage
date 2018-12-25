package com.dhcc.ict.manage.examanalysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhcc.ict.manage.examanalysis.pojo.ExamRecord;
import com.dhcc.ict.manage.examanalysis.service.ExamRecordService;

@Controller
public class ExamRecordController {
	
	@Autowired
	private ExamRecordService examRecordService;
	
	@RequestMapping("/score")
	public String analysisScore(Integer examReordid) {
		examRecordService.analysisScore(examReordid);
		return "echart";
		
		
	}

}
