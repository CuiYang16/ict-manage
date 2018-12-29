package com.dhcc.ict.manage.technology.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.dhcc.ict.manage.technology.test.dao.ExamPaperMapper;
import com.dhcc.ict.manage.technology.test.dao.ExamRecordMapper;
import com.dhcc.ict.manage.technology.test.dao.ExamRuleMapper;
import com.dhcc.ict.manage.technology.test.dao.ExamUserAnswerMapper;
import com.dhcc.ict.manage.technology.test.dao.InterviewRecordMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyChooseMuchMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyChooseOneMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyCodeMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyJudgeMapper;
import com.dhcc.ict.manage.technology.test.dao.TechnologyTypeMapper;
import com.dhcc.ict.manage.technology.test.dao.UserExamRuleMapper;
import com.dhcc.ict.manage.technology.test.pojo.ExamPaper;
import com.dhcc.ict.manage.technology.test.pojo.ExamRecord;
import com.dhcc.ict.manage.technology.test.pojo.ExamRule;
import com.dhcc.ict.manage.technology.test.pojo.ExamRuleExample;
import com.dhcc.ict.manage.technology.test.pojo.ExamSubmitDetail;
import com.dhcc.ict.manage.technology.test.pojo.ExamTotalQuestion;
import com.dhcc.ict.manage.technology.test.pojo.ExamUserAnswer;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecord;
import com.dhcc.ict.manage.technology.test.pojo.InterviewRecordExample;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuch;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseMuchExample;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOne;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyChooseOneExample;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyCode;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyCodeExample;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudge;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyJudgeExample;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyType;
import com.dhcc.ict.manage.technology.test.pojo.TechnologyTypeExample;
import com.dhcc.ict.manage.technology.test.pojo.UserExamRule;
import com.dhcc.ict.manage.technology.test.pojo.UserExamRuleExample;

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
	private TechnologyCodeMapper codeMapper;
	@Autowired
	private ExamPaperMapper examPaperMapper;
	@Autowired
	private TechnologyTypeMapper technologyTypeMapper;
	@Autowired
	private ExamRecordMapper examRecordMapper;
	@Autowired
	private InterviewRecordMapper interviewRecordMapper;
	@Autowired
	private UserExamRuleMapper userExamRuleMapper;
	@Autowired
	private ExamUserAnswerMapper userAnswerMapper;

	// 获取所有类别
	public List<TechnologyType> getAllTechnologyType() {
		List<TechnologyType> technologyTypeList = technologyTypeMapper.selectByExample(null);
		return technologyTypeList;
	}

	// 根据id获取类别
	public String getTechnologyTypeName(Integer technologyTypeId) {
		TechnologyTypeExample technologyTypeExample = new TechnologyTypeExample();
		technologyTypeExample.createCriteria().andTechnologyTypeIdEqualTo(technologyTypeId);
		List<TechnologyType> technologyTypeList = technologyTypeMapper.selectByExample(technologyTypeExample);
		return technologyTypeList.get(0).getTechnologyTypeName();
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

	// 获取用户试卷表信息
	public UserExamRule getUserExamRule(Integer userId) {
		UserExamRuleExample userExamRuleExample = new UserExamRuleExample();
		userExamRuleExample.createCriteria().andUserIdEqualTo(userId);
		List<UserExamRule> userExamRuleList = userExamRuleMapper.selectByExample(userExamRuleExample);
		if (userExamRuleList.size() > 0) {
			return userExamRuleList.get(0);
		}
		return null;
	}

	// 获取用户具体试卷规则
	public ExamRule getExamRule(UserExamRule userExamRule) {
		ExamRuleExample examRuleExample = new ExamRuleExample();
		examRuleExample.createCriteria().andExamRuleIdEqualTo(userExamRule.getExamRuleId());
		List<ExamRule> examRuleList = examRuleMapper.selectByExample(examRuleExample);
		if (examRuleList.size() > 0) {
			return examRuleList.get(0);
		}
		return null;
	}

	// 从数据库抽题(随机)
	public ExamTotalQuestion getTestList(ExamRule examRule) {
		// 单选。多选。选择题总数
		TechnologyChooseOneExample chooseOneExample = new TechnologyChooseOneExample();
		chooseOneExample.createCriteria().andChooseOneComplexityEqualTo(examRule.getExamComplexity());
		int chooseOneCount = chooseOneMapper.countByExample(chooseOneExample);

		TechnologyChooseMuchExample chooseMuchExample = new TechnologyChooseMuchExample();
		chooseMuchExample.createCriteria().andChooseMuchComplexityEqualTo(examRule.getExamComplexity());
		int chooseMuchCount = chooseMuchMapper.countByExample(chooseMuchExample);

		TechnologyJudgeExample judgeExample = new TechnologyJudgeExample();
		judgeExample.createCriteria().andTechnologyJudgeComplexityEqualTo(examRule.getExamComplexity());
		int judgeCount = judgeMapper.countByExample(judgeExample);

		TechnologyCodeExample codeExample = new TechnologyCodeExample();
		codeExample.createCriteria().andTechnologyCodeComplexityEqualTo(examRule.getExamComplexity());
		int codeCount = codeMapper.countByExample(codeExample);
		Integer technologyTypeId = examRule.getTechnologyTypeId();

		// 抽取单选题
		List<TechnologyChooseOne> chooseOneList = chooseOneMapper.selectByLimit(
				new Random().nextInt(chooseOneCount - examRule.getChooseOneCount() - 1), examRule.getChooseOneCount(),
				technologyTypeId, examRule.getExamComplexity());

		// 抽取多选题
		List<TechnologyChooseMuch> chooseMuchList = chooseMuchMapper.selectByLimitMuch(
				new Random().nextInt(chooseMuchCount - examRule.getChooseMuchCount() - 1),
				examRule.getChooseMuchCount(), technologyTypeId, examRule.getExamComplexity());

		// 抽取判断题
		List<TechnologyJudge> judgeList = judgeMapper.selectByLimitJudge(
				new Random().nextInt(judgeCount - examRule.getJurgeCount() - 1), examRule.getJurgeCount(),
				technologyTypeId, examRule.getExamComplexity());

		// 抽取编程题
		List<TechnologyCode> codeList = codeMapper.selectByLimitCode(
				new Random().nextInt(codeCount - examRule.getCodeCount() - 1), examRule.getCodeCount(),
				technologyTypeId, examRule.getExamComplexity());

		ExamTotalQuestion examTotalQuestion = new ExamTotalQuestion(chooseOneList, chooseMuchList, judgeList, codeList);
		return examTotalQuestion;

	}

	// 从数据库查询试卷（统一考试）
	public ExamTotalQuestion getUnifyTest(String paperFlag) {
		List<TechnologyChooseOne> chooseOnes = chooseOneMapper.selectByPaper(paperFlag, "one");
		List<TechnologyChooseMuch> chooseMuchs = chooseMuchMapper.selectByPaper(paperFlag, "much");
		List<TechnologyJudge> judges = judgeMapper.selectByPaper(paperFlag, "judge");
		List<TechnologyCode> codes = codeMapper.selectByPaper(paperFlag, "code");
		return new ExamTotalQuestion(chooseOnes, chooseMuchs, judges, codes);

	}

	// 保存试卷
	public String insertExamPaper(ExamTotalQuestion examTotalQuestion) {
		String paperFlag = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
		List<ExamPaper> papers = new ArrayList<ExamPaper>();
		ExamPaper examPaper = null;

		List<TechnologyChooseOne> chooseOnes = examTotalQuestion.getChooseOnes();
		for (TechnologyChooseOne technologyChooseOne : chooseOnes) {
			examPaper = new ExamPaper();
			examPaper.setQuestionId(technologyChooseOne.getChooseOneId());
			examPaper.setQuestionTrueAnswer(technologyChooseOne.getChooseOneTrueAnswer());
			examPaper.setQuestionType("one");
			examPaper.setPaperFlag(paperFlag);
			papers.add(examPaper);
		}
		List<TechnologyChooseMuch> chooseMuchs = examTotalQuestion.getChooseMuchs();
		for (TechnologyChooseMuch technologyChooseMuch : chooseMuchs) {
			examPaper = new ExamPaper();
			examPaper.setQuestionId(technologyChooseMuch.getChooseMuchId());
			examPaper.setQuestionTrueAnswer(technologyChooseMuch.getChooseMuchTrueAnswer());
			examPaper.setQuestionType("much");
			examPaper.setPaperFlag(paperFlag);
			papers.add(examPaper);
		}
		List<TechnologyJudge> judges = examTotalQuestion.getJudges();
		for (TechnologyJudge technologyJudge : judges) {
			examPaper = new ExamPaper();
			examPaper.setQuestionId(technologyJudge.getTechnologyJudgeId());
			examPaper.setQuestionTrueAnswer(technologyJudge.getTechnologyJudgeTrueAnswer());
			examPaper.setQuestionType("judge");
			examPaper.setPaperFlag(paperFlag);
			papers.add(examPaper);
		}
		List<TechnologyCode> codes = examTotalQuestion.getCodes();
		for (TechnologyCode technologyCode : codes) {
			examPaper = new ExamPaper();
			examPaper.setQuestionId(technologyCode.getTechnologyCodeId());
			examPaper.setQuestionTrueAnswer(null);
			examPaper.setQuestionType("code");
			examPaper.setPaperFlag(paperFlag);
			papers.add(examPaper);
		}
		int insertPaper = examPaperMapper.insertPaper(papers);
		if (insertPaper != papers.size()) {
			return null;
		}
		return paperFlag;
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
	/**
	 * @param list用户提交信息
	 * @param examQuestion
	 * @return
	 */
	public ExamRecord getGrade(List<List<ExamSubmitDetail>> list, ExamTotalQuestion examTotalQuestion,
			String paperFlag) {
		int chooseOneGrade = 0;
		int chooseMuchGrade = 0;
		int judgeGrade = 0;
		int count = 0;
		List<ExamUserAnswer> answers = new ArrayList<ExamUserAnswer>();
		ExamUserAnswer answer = null;

		// 单选成绩
		List<TechnologyChooseOne> questionChooseOne = examTotalQuestion.getChooseOnes();
		List<ExamSubmitDetail> userChooseOne = list.get(0);

		for (int i = 0, listSize = questionChooseOne.size(); i < listSize; i++) {
			answer = new ExamUserAnswer();
			answer.setPaperFlag(paperFlag);
			if (questionChooseOne.get(i).getChooseOneId().equals(userChooseOne.get(i).getQuestionId())) {

				answer.setQuestionTypeId("one-" + questionChooseOne.get(i).getChooseOneId());
				answer.setUserAnswer(userChooseOne.get(i).getUserAnswer());
				System.out.println(userChooseOne.get(i).getUserAnswer());
				if (questionChooseOne.get(i).getChooseOneTrueAnswer().equals(userChooseOne.get(i).getUserAnswer())) {
					chooseOneGrade += 1;
					answer.setUserAnswerRight("right");
				} else {
					answer.setUserAnswerRight("error");
				}
			} else {

			}

			answers.add(answer);
		}

		// 多选成绩
		List<TechnologyChooseMuch> questionChooseMuch = examTotalQuestion.getChooseMuchs();
		List<ExamSubmitDetail> userChooseMuch = list.get(1);
		System.out.println(userChooseMuch.size());
		for (int i = 0, listSize = questionChooseMuch.size(); i < listSize; i++) {
			answer = new ExamUserAnswer();
			answer.setPaperFlag(paperFlag);
			if (questionChooseMuch.get(i).getChooseMuchId().equals(userChooseMuch.get(i).getQuestionId())) {

				answer.setQuestionTypeId("much-" + questionChooseMuch.get(i).getChooseMuchId());
				answer.setUserAnswer(userChooseMuch.get(i).getUserAnswer());

				String[] trueAnswer = questionChooseMuch.get(i).getChooseMuchTrueAnswer().split(",");
				String[] userAnswer = userChooseMuch.get(i).getUserAnswer().split(",");
				// 判断成绩（如果全部相同加三分，选不全加一分，选错不加分）
				if (Arrays.equals(trueAnswer, userAnswer)) {
					chooseMuchGrade += 3;
					answer.setUserAnswerRight("right");
				} else {

					for (int j = 0; j < userAnswer.length; j++) {
						for (int k = 0; k < trueAnswer.length; k++) {
							if (userAnswer[j].equals(trueAnswer[k])) {
								count++;
							}
						}
					}

					if (count == userAnswer.length) {
						chooseMuchGrade += 1;
						count = 0;
						answer.setUserAnswerRight("not-all-right");
					} else {
						answer.setUserAnswerRight("error");
					}
				}
			} else {

			}
			System.out.println(answer.getUserAnswer());
			System.out.println(answer.getUserAnswerRight());
			answers.add(answer);
		}
		// 判断成绩
		List<TechnologyJudge> questionjudge = examTotalQuestion.getJudges();
		List<ExamSubmitDetail> userJudge = list.get(2);

		for (int i = 0, listSize = questionjudge.size(); i < listSize; i++) {
			answer = new ExamUserAnswer();
			answer.setPaperFlag(paperFlag);
			if (questionjudge.get(i).getTechnologyJudgeId().equals(userJudge.get(i).getQuestionId())) {

				answer.setQuestionTypeId("judge-" + questionjudge.get(i).getTechnologyJudgeId());
				answer.setUserAnswer(userJudge.get(i).getUserAnswer());

				if (questionjudge.get(i).getTechnologyJudgeTrueAnswer().equals(userJudge.get(i).getUserAnswer())) {
					judgeGrade += 1;
					answer.setUserAnswerRight("right");
				} else {
					answer.setUserAnswerRight("error");
				}
			} else {

			}
			answers.add(answer);
		}
		ExamRecord examRecord = new ExamRecord();
		examRecord.setChooseOneScore(chooseOneGrade);
		examRecord.setChooseMuchScore(chooseMuchGrade);
		examRecord.setChooseJurge(judgeGrade);
		examRecord.setTotalScore(chooseOneGrade + chooseMuchGrade + judgeGrade);

		// 保存答案
		userAnswerMapper.insertUserAnswer(answers);
		return examRecord;
	}

}
