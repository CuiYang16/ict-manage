package com.dhcc.ict.manage.questionbank.pojo;
//查询单选题库和类别的扩展类

public class QuestionBankOne{
	private  TechnologyChooseOne technologyChooseOne;
	
	private String technologyTypeName;
	
	public String getTechnologyTypeName() {
		return technologyTypeName;
	}

	public void setTechnologyTypeName(String technologyTypeName) {
		this.technologyTypeName = technologyTypeName;
	}

	public TechnologyChooseOne getTechnologyChooseOne() {
		return technologyChooseOne;
	}

	public void setTechnologyChooseOne(TechnologyChooseOne technologyChooseOne) {
		this.technologyChooseOne = technologyChooseOne;
	}

	public QuestionBankOne(TechnologyChooseOne technologyChooseOne, String technologyTypeName) {
		super();
		this.technologyChooseOne = technologyChooseOne;
		this.technologyTypeName = technologyTypeName;
	}

	public QuestionBankOne() {
		super();
	}



	
	
	

}
