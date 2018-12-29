package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ExamPaper {
    /**
     * 试卷表
     */
    private Integer examPaperId;

    /**
     * 试题编号
     */
    private Integer questionId;

    /**
     * 试题正确答案
     */
    private String questionTrueAnswer;

    /**
     * 试题类型（one,much,judge,code）
     */
    private String questionType;

    /**
     * 试卷唯一标识
     */
    private String paperFlag;

    public ExamPaper(Integer examPaperId, Integer questionId, String questionTrueAnswer, String questionType, String paperFlag) {
        this.examPaperId = examPaperId;
        this.questionId = questionId;
        this.questionTrueAnswer = questionTrueAnswer;
        this.questionType = questionType;
        this.paperFlag = paperFlag;
    }

    public ExamPaper() {
        super();
    }

    public Integer getExamPaperId() {
        return examPaperId;
    }

    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTrueAnswer() {
        return questionTrueAnswer;
    }

    public void setQuestionTrueAnswer(String questionTrueAnswer) {
        this.questionTrueAnswer = questionTrueAnswer == null ? null : questionTrueAnswer.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getPaperFlag() {
        return paperFlag;
    }

    public void setPaperFlag(String paperFlag) {
        this.paperFlag = paperFlag == null ? null : paperFlag.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}