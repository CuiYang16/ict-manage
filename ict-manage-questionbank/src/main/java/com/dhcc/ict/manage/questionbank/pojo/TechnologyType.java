package com.dhcc.ict.manage.questionbank.pojo;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyType {
    /**
     * 
     */
    private Integer technologyTypeId;

    /**
     * 技术考试类别
     */
    private String technologyTypeName;
    
    //一对多映射
   /* private List<TechnologyChooseOne> technologyChooseOneys;
    
    private List<TechnologyChooseMuch> technologyChooseMuchys;
    
    private List<TechnologyJudge> technologyJudgeys;*/

    public TechnologyType(Integer technologyTypeId, String technologyTypeName) {
        this.technologyTypeId = technologyTypeId;
        this.technologyTypeName = technologyTypeName;
    }

    public TechnologyType() {
        super();
    }

    public Integer getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(Integer technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
    }

    public String getTechnologyTypeName() {
        return technologyTypeName;
    }

    public void setTechnologyTypeName(String technologyTypeName) {
        this.technologyTypeName = technologyTypeName == null ? null : technologyTypeName.trim();
    }
    
    

  /*  public List<TechnologyChooseOne> getTechnologyChooseOneys() {
		return technologyChooseOneys;
	}

	public void setTechnologyChooseOneys(List<TechnologyChooseOne> technologyChooseOneys) {
		this.technologyChooseOneys = technologyChooseOneys;
	}

	public List<TechnologyChooseMuch> getTechnologyChooseMuchys() {
		return technologyChooseMuchys;
	}

	public void setTechnologyChooseMuchys(List<TechnologyChooseMuch> technologyChooseMuchys) {
		this.technologyChooseMuchys = technologyChooseMuchys;
	}

	public List<TechnologyJudge> getTechnologyJudgeys() {
		return technologyJudgeys;
	}

	public void setTechnologyJudgeys(List<TechnologyJudge> technologyJudgeys) {
		this.technologyJudgeys = technologyJudgeys;
	}
*/
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}