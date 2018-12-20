package com.dhcc.ict.manage.questionbank.pojo;
//查询判断题库和类别的扩展类
public class QuestionBankJudge {
    private  TechnologyJudge technologyJudge;
	
	private String technologyTypeName;

	public TechnologyJudge getTechnologyJudge() {
		return technologyJudge;
	}

	public void setTechnologyJudge(TechnologyJudge technologyJudge) {
		this.technologyJudge = technologyJudge;
	}

	public String getTechnologyTypeName() {
		return technologyTypeName;
	}

	public void setTechnologyTypeName(String technologyTypeName) {
		this.technologyTypeName = technologyTypeName;
	}

	public QuestionBankJudge(TechnologyJudge technologyJudge, String technologyTypeName) {
		super();
		this.technologyJudge = technologyJudge;
		this.technologyTypeName = technologyTypeName;
	}
	public QuestionBankJudge() {
	
	}

	
	

}
