package com.dhcc.ict.manage.questionbank.pojo;
//查询多选题库和类别的扩展类
public class QuestionBankMuch {
private  TechnologyChooseMuch technologyChooseMuch;
	
	private String technologyTypeName;

	public TechnologyChooseMuch getTechnologyChooseMuch() {
		return technologyChooseMuch;
	}

	public void setTechnologyChooseMuch(TechnologyChooseMuch technologyChooseMuch) {
		this.technologyChooseMuch = technologyChooseMuch;
	}

	public String getTechnologyTypeName() {
		return technologyTypeName;
	}

	public void setTechnologyTypeName(String technologyTypeName) {
		this.technologyTypeName = technologyTypeName;
	}

	public QuestionBankMuch(TechnologyChooseMuch technologyChooseMuch, String technologyTypeName) {
		super();
		this.technologyChooseMuch = technologyChooseMuch;
		this.technologyTypeName = technologyTypeName;
	}
	
	public QuestionBankMuch() {

	}
	
	
}
