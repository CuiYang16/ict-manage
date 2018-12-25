package com.dhcc.ict.manage.examanalysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhcc.ict.manage.examanalysis.pojo.ExamRecord;
import com.dhcc.ict.manage.examanalysis.service.ExamRecordService;

@Controller
public class ExamRecordController {
	
	@Autowired
	private ExamRecordService examRecordService; 
	
	@RequestMapping("/count")
	public List<ExamRecord> count(Integer userId) {
		examRecordService.count(userId);
		return null ;	
	}

	
	@RequestMapping("/avageScore")
	public List<ExamRecord> avageScore(Integer totalScore) {
		examRecordService.avageScore(totalScore);
		return null ;	
	}
 
}
