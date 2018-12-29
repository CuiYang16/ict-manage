package com.dhcc.ict.manage.exam.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.ict.manage.exam.manage.pojo.ExamRecord;
import com.dhcc.ict.manage.exam.manage.service.ExamManageService;

@Controller
@RequestMapping("/exammanage")
public class ExamManageController {

	@Autowired
	private ExamManageService examManageService;

	@RequestMapping("/getexamrecord")
	@ResponseBody
	public List<ExamRecord> getExamRecord() {
		List<ExamRecord> list = examManageService.getExamRecord(1);
		return list;
	}
}
