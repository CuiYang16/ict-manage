package com.dhcc.ict.manage.technology.test.pojo;

//考试提交信息
public class ExamSubmitDetail {

	private Integer questionId;
	private String userAnswer;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public ExamSubmitDetail(Integer questionId, String userAnswer) {
		super();
		this.questionId = questionId;
		this.userAnswer = userAnswer;
	}

	public ExamSubmitDetail() {
		super();
	}

	@Override
	public String toString() {
		return "ExamSubmitDetail [questionId=" + questionId + ", userAnswer=" + userAnswer + "]";
	}

}
