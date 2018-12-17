package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ExamQuestion {
    /**
     * 试卷表
     */
    private Integer examQuestionId;

    /**
     * 实体编号数组
     */
    private String technologyTestIdarr;

    public ExamQuestion(Integer examQuestionId, String technologyTestIdarr) {
        this.examQuestionId = examQuestionId;
        this.technologyTestIdarr = technologyTestIdarr;
    }

    public ExamQuestion() {
        super();
    }

    public Integer getExamQuestionId() {
        return examQuestionId;
    }

    public void setExamQuestionId(Integer examQuestionId) {
        this.examQuestionId = examQuestionId;
    }

    public String getTechnologyTestIdarr() {
        return technologyTestIdarr;
    }

    public void setTechnologyTestIdarr(String technologyTestIdarr) {
        this.technologyTestIdarr = technologyTestIdarr == null ? null : technologyTestIdarr.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}