package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ExamUserAnswer {
    /**
     * 用户答案表
     */
    private Integer userAnswerId;

    /**
     * 试题类型+id
     */
    private String questionTypeId;

    /**
     * 用户答案
     */
    private String userAnswer;

    /**
     * 是否正确
     */
    private String userAnswerRight;

    /**
     * 试卷标识
     */
    private String paperFlag;

    public ExamUserAnswer(Integer userAnswerId, String questionTypeId, String userAnswer, String userAnswerRight, String paperFlag) {
        this.userAnswerId = userAnswerId;
        this.questionTypeId = questionTypeId;
        this.userAnswer = userAnswer;
        this.userAnswerRight = userAnswerRight;
        this.paperFlag = paperFlag;
    }

    public ExamUserAnswer() {
        super();
    }

    public Integer getUserAnswerId() {
        return userAnswerId;
    }

    public void setUserAnswerId(Integer userAnswerId) {
        this.userAnswerId = userAnswerId;
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId == null ? null : questionTypeId.trim();
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    public String getUserAnswerRight() {
        return userAnswerRight;
    }

    public void setUserAnswerRight(String userAnswerRight) {
        this.userAnswerRight = userAnswerRight == null ? null : userAnswerRight.trim();
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