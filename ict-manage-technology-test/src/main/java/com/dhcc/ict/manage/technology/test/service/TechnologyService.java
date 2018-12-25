package com.dhcc.ict.manage.technology.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.dhcc.ict.manage.technology.test.dao.ExamQuestionMapper;
import com.dhcc.ict.manage.technology.test.dao.ExamRecordMapper;
import com.dhcc.ict.manage.technology.test.dao.ExamRuleMapper;
import com.dhcc.ict.manage.technology.test.dao.InterviewRecordMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyChooseMuchMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyJudgeMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyTypeMapper;
import com.dhcc.ict.manage.technology.test.pojo.ExamQuestion;
import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample.Criteria;
import com.dhcc.ict.manage.technology.test.pojo.ExamSubmitDetail;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecord;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecordExample;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudge;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyType;

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
	@Autowired
	private TechnologyTypeMapper technologyTypeMapper;
	@Autowired
	private ExamRecordMapper examRecordMapper;
	@Autowired
	private InterviewRecordMapper interviewRecordMapper;

	// 获取所有类别
	public List<TechnologyType> getAllTechnologyType() {
		List<TechnologyType> technologyTypeList = technologyTypeMapper.selectByExample(null);
		return technologyTypeList;
	}

	// 获取面试记录信息
	public InterviewRecord getInterviewRecord(int userId) {
		InterviewRecordExample interviewRecordExample = new InterviewRecordExample();
		interviewRecordExample.createCriteria().andUserIdEqualTo(userId);
		List<InterviewRecord> interviewRecordList = interviewRecordMapper.selectByExample(interviewRecordExample);
		if (interviewRecordList.size() == 1) {
			return interviewRecordList.get(0);
		}
		return null;
	}

	// 获取试卷生成规则
	public ExamRule getExamRule(Integer interviewId) {
		ExamRuleExample example = new ExamRuleExample();
		Criteria criteria = example.createCriteria();
		criteria.andInterviewerIdEqualTo(interviewId);
		List<ExamRule> examRuleList = examRuleMapper.selectByExample(example);
		if (examRuleList.size() == 1) {
			return examRuleList.get(0);
		}
		return null;
	}

	// 从数据库抽题
	public ExamQuestion getTestList(ExamRule examRule, int testType) {
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
		int id = examQuestion.getExamQuestionId();
		return examQuestion.getExamQuestionId();
	}

	// 保存部分考试记录(用户，试卷，考试类别)
	public int insertExamRecord(ExamRecord examRecord) {
		int flag = examRecordMapper.insert(examRecord);
		return examRecord.getExamRecordId();
	}

	// 解析考生试卷信息
	public List<List<ExamSubmitDetail>> getExamRecord(String userSubmitDetail) {

		JSONObject submitObject = JSONObject.parseObject(userSubmitDetail);
		// 分别获取不同题型的信息
		String chooseone = submitObject.getString("oneSubmit");
		List<ExamSubmitDetail> submitChooseOne = JSON.parseObject(chooseone,
				new TypeReference<List<ExamSubmitDetail>>() {
				});
		String choosemuch = submitObject.getString("muchSubmit");
		List<ExamSubmitDetail> submitChooseMuch = JSON.parseObject(choosemuch,
				new TypeReference<List<ExamSubmitDetail>>() {
				});
		String judge = submitObject.getString("judgeSubmit");
		List<ExamSubmitDetail> submitJudge = JSON.parseObject(judge, new TypeReference<List<ExamSubmitDetail>>() {
		});
		List<List<ExamSubmitDetail>> listArr = new ArrayList<List<ExamSubmitDetail>>();
		listArr.add(submitChooseOne);
		listArr.add(submitChooseMuch);
		listArr.add(submitJudge);

		return listArr;
	}

	// 判卷
	public ExamRecord getGrade(List<List<ExamSubmitDetail>> list, ExamQuestion examQuestion) {
		int chooseOneGrade = 0;
		int chooseMuchGrade = 0;
		int judgeGrade = 0;
		int count = 0;

		// 单选成绩
		List<TechnologyChooseOne> questionChooseOne = JSON.parseObject(examQuestion.getTechnologyOne(),
				new TypeReference<List<TechnologyChooseOne>>() {
				});
		List<ExamSubmitDetail> userChooseOne = list.get(0);

		for (int i = 0, listSize = questionChooseOne.size(); i < listSize - 1; i++) {
			if (questionChooseOne.get(i).getChooseOneId() == userChooseOne.get(i).getQuestionId()) {
				if (questionChooseOne.get(i).getChooseOneTrueAnswer().equals(userChooseOne.get(i).getUserAnswer())) {
					chooseOneGrade += 1;
				}
			} else {

			}
		}

		// 多选成绩
		List<TechnologyChooseMuch> questionChooseMuch = JSON.parseObject(examQuestion.getTechnologyMuch(),
				new TypeReference<List<TechnologyChooseMuch>>() {
				});
		List<ExamSubmitDetail> userChooseMuch = list.get(1);

		for (int i = 0, listSize = questionChooseMuch.size(); i < listSize - 1; i++) {
			if (questionChooseMuch.get(i).getChooseMuchId() == userChooseMuch.get(i).getQuestionId()) {
				String[] trueAnswer = questionChooseMuch.get(i).getChooseMuchTrueAnswer().split(",");
				String[] userAnswer = userChooseMuch.get(i).getUserAnswer().split(",");
				// 判断成绩（如果全部相同加三分，选不全加一分，选错不加分）
				if (Arrays.equals(trueAnswer, userAnswer)) {
					chooseMuchGrade += 3;
				} else {

					for (int j = 0; j < userAnswer.length - 1; j++) {
						for (int k = 0; k < trueAnswer.length - 1; k++) {
							if (userAnswer[j].equals(trueAnswer[k])) {
								count++;
							}
						}
					}
					if (count == userAnswer.length) {
						chooseMuchGrade += 1;
						count = 0;
					}
				}
			} else {

			}
		}
		// 判断成绩
		List<TechnologyJudge> questionjudge = JSON.parseObject(examQuestion.getTechnologyJuage(),
				new TypeReference<List<TechnologyJudge>>() {
				});
		List<ExamSubmitDetail> userJudge = list.get(2);

		for (int i = 0, listSize = questionjudge.size(); i < listSize - 1; i++) {
			System.out.println(userJudge.get(i).getUserAnswer());
			if (questionjudge.get(i).getTechnologyJudgeId() == userJudge.get(i).getQuestionId()) {
				if (questionjudge.get(i).getTechnologyJudgeTrueAnswer().equals(userJudge.get(i).getUserAnswer())) {
					judgeGrade += 1;
				}
			} else {

			}
		}
		ExamRecord examRecord = new ExamRecord();
		examRecord.setChooseOneScore(chooseOneGrade);
		examRecord.setChooseMuchScore(chooseMuchGrade);
		examRecord.setChooseJurge(judgeGrade);
		examRecord.setTotalScore(chooseOneGrade + chooseMuchGrade + judgeGrade);
		return examRecord;
	}
}
