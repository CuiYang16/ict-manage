package com.dhcc.ict.manage.technology.test.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.dhcc.ict.manage.technology.test.dao.ExamQuestionMapper;
import com.dhcc.ict.manage.technology.test.dao.ExamRuleMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyChooseMuchMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyJudgeMapper;
import com.dhcc.ict.manage.technology.test.pojo.ExamQuestion;
import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample.Criteria;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudge;

@Service
public class TechnologyService {

	@Autowired
	private ExamRuleMapper examRuleMapper;
	@Autowired
	private TechnologyChooseOneMapper chooseOneMapper;
	@Autowired
	private TechnologyChooseMuchMapper chooseMuchMapper;
	@Autowired
	private TechnologyJudgeMapper judgeMapper;
	@Autowired
	private ExamQuestionMapper examQuestionMapper;

	// 获取试卷生成规则
	public ExamRule getExamRule(Integer userId) {
		ExamRuleExample example = new ExamRuleExample();
		Criteria criteria = example.createCriteria();
		criteria.andInterviewerIdEqualTo(userId);
		ExamRule examRule = examRuleMapper.selectByExample(example).get(0);
		return examRule;
	}

	// 从数据库抽题
	public ExamQuestion getTestList(ExamRule examRule, String testType) {
		// 单选。多选。选择题总数
		int chooseOneCount = chooseOneMapper.countByExample(null);
		int chooseMuchCount = chooseMuchMapper.countByExample(null);
		int judgeCount = judgeMapper.countByExample(null);

		// 抽取单选题
		List<TechnologyChooseOne> chooseOneList = chooseOneMapper.selectByLimit(
				new Random().nextInt(chooseOneCount - examRule.getChooseOneCount() - 1), examRule.getChooseOneCount(),
				testType);

		// 抽取多选题
		List<TechnologyChooseMuch> chooseMuchList = chooseMuchMapper.selectByLimitMuch(
				new Random().nextInt(chooseMuchCount - examRule.getChooseMuchCount() - 1),
				examRule.getChooseMuchCount(), testType);

		// 抽取判断题
		List<TechnologyJudge> judgeList = judgeMapper.selectByLimitJudge(
				new Random().nextInt(judgeCount - examRule.getJurgeCount() - 1), examRule.getJurgeCount(), testType);

		ExamQuestion examQuestion = new ExamQuestion();
		examQuestion.setTechnologyOne(JSON.toJSONString(chooseOneList));
		examQuestion.setTechnologyMuch(JSON.toJSONString(chooseMuchList));
		examQuestion.setTechnologyJuage(JSON.toJSONString(judgeList));
		return examQuestion;

	}

	// 保存试卷
	public int insertExamQuestion(ExamQuestion examQuestion) {
		int insert = examQuestionMapper.insert(examQuestion);
		return insert;
	}

	//成绩
	public ExamRecord getExamRecord() {
		return new ExamRecord();
	}
}
