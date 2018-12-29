package com.dhcc.ict.manage.exam.manage.pojo;

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
    private String technologyOne;

    /**
     * 
     */
    private String technologyMuch;

    /**
     * 
     */
    private String technologyJuage;

    public ExamQuestion(Integer examQuestionId, String technologyOne, String technologyMuch, String technologyJuage) {
        this.examQuestionId = examQuestionId;
        this.technologyOne = technologyOne;
        this.technologyMuch = technologyMuch;
        this.technologyJuage = technologyJuage;
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

    public String getTechnologyOne() {
        return technologyOne;
    }

    public void setTechnologyOne(String technologyOne) {
        this.technologyOne = technologyOne == null ? null : technologyOne.trim();
    }

    public String getTechnologyMuch() {
        return technologyMuch;
    }

    public void setTechnologyMuch(String technologyMuch) {
        this.technologyMuch = technologyMuch == null ? null : technologyMuch.trim();
    }

    public String getTechnologyJuage() {
        return technologyJuage;
    }

    public void setTechnologyJuage(String technologyJuage) {
        this.technologyJuage = technologyJuage == null ? null : technologyJuage.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}