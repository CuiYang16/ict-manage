package com.dhcc.ict.manage.questionbank.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyJudge {
    /**
     * 
     */
    private Integer technologyJudgeId;

    /**
     * 
     */
    private String technologyJudgeDetail;

    /**
     * 正确答案
     */
    private String technologyJudgeTrueAnswer;

    /**
     * 难易程度
     */
    private String technologyJudgeComplexity;

    /**
     * 类别
     */
    private Integer technologyTypeId;

    public TechnologyJudge(Integer technologyJudgeId, String technologyJudgeDetail, String technologyJudgeTrueAnswer, String technologyJudgeComplexity, Integer technologyTypeId) {
        this.technologyJudgeId = technologyJudgeId;
        this.technologyJudgeDetail = technologyJudgeDetail;
        this.technologyJudgeTrueAnswer = technologyJudgeTrueAnswer;
        this.technologyJudgeComplexity = technologyJudgeComplexity;
        this.technologyTypeId = technologyTypeId;
    }

    public TechnologyJudge() {
        super();
    }

    public Integer getTechnologyJudgeId() {
        return technologyJudgeId;
    }

    public void setTechnologyJudgeId(Integer technologyJudgeId) {
        this.technologyJudgeId = technologyJudgeId;
    }

    public String getTechnologyJudgeDetail() {
        return technologyJudgeDetail;
    }

    public void setTechnologyJudgeDetail(String technologyJudgeDetail) {
        this.technologyJudgeDetail = technologyJudgeDetail == null ? null : technologyJudgeDetail.trim();
    }

    public String getTechnologyJudgeTrueAnswer() {
        return technologyJudgeTrueAnswer;
    }

    public void setTechnologyJudgeTrueAnswer(String technologyJudgeTrueAnswer) {
        this.technologyJudgeTrueAnswer = technologyJudgeTrueAnswer == null ? null : technologyJudgeTrueAnswer.trim();
    }

    public String getTechnologyJudgeComplexity() {
        return technologyJudgeComplexity;
    }

    public void setTechnologyJudgeComplexity(String technologyJudgeComplexity) {
        this.technologyJudgeComplexity = technologyJudgeComplexity == null ? null : technologyJudgeComplexity.trim();
    }

    public Integer getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(Integer technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}