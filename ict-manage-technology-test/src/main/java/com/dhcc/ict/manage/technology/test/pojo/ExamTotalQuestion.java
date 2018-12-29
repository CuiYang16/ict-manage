package com.dhcc.ict.manage.technology.test.pojo;

import java.util.List;

public class ExamTotalQuestion {

	private List<TechnologyChooseOne> chooseOnes;
	private List<TechnologyChooseMuch> chooseMuchs;
	private List<TechnologyJudge> judges;
	private List<TechnologyCode> codes;

	public List<TechnologyChooseOne> getChooseOnes() {
		return chooseOnes;
	}

	public void setChooseOnes(List<TechnologyChooseOne> chooseOnes) {
		this.chooseOnes = chooseOnes;
	}

	public List<TechnologyChooseMuch> getChooseMuchs() {
		return chooseMuchs;
	}

	public void setChooseMuchs(List<TechnologyChooseMuch> chooseMuchs) {
		this.chooseMuchs = chooseMuchs;
	}

	public List<TechnologyJudge> getJudges() {
		return judges;
	}

	public void setJudges(List<TechnologyJudge> judges) {
		this.judges = judges;
	}

	public List<TechnologyCode> getCodes() {
		return codes;
	}

	public void setCodes(List<TechnologyCode> codes) {
		this.codes = codes;
	}

	public ExamTotalQuestion(List<TechnologyChooseOne> chooseOnes, List<TechnologyChooseMuch> chooseMuchs,
			List<TechnologyJudge> judges, List<TechnologyCode> codes) {
		super();
		this.chooseOnes = chooseOnes;
		this.chooseMuchs = chooseMuchs;
		this.judges = judges;
		this.codes = codes;
	}

	public ExamTotalQuestion() {
		super();
	}

}
