package com.dhcc.ict.manage.technology.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhcc.ict.manage.technology.test.dao.ExamRuleMapper;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample.Criteria;

@Controller
public class TechnologyController {

	@Autowired
	private ExamRuleMapper examRuleMapper;

	@RequestMapping("/getExamRule")
	public ExamRule getExamRule(Integer userId) {
		ExamRuleExample example = new ExamRuleExample();
		Criteria criteria = example.createCriteria();
		criteria.andInterviewerIdEqualTo(userId);
		ExamRule examRule = examRuleMapper.selectByExample(example).get(0);
		return examRule;
	}
}
