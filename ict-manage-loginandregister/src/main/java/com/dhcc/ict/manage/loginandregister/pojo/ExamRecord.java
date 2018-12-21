package com.dhcc.ict.manage.loginandregister.pojo;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ExamRecord {
    /**
     * 考试记录表
     */
    private Integer examRecordId;

    /**
     * 考试开始时间
     */
    private Date examStarttime;

    /**
     * 考试结束时间
     */
    private Date examEndtime;

    /**
     * 实际时间
     */
    private Integer examRealityTime;

    /**
     * 单选成绩
     */
    private Integer chooseOneScore;

    /**
     * 多选成绩
     */
    private Integer chooseMuchScore;

    /**
     * 判断成绩
     */
    private Integer chooseJurge;

    /**
     * 总成绩
     */
    private Integer totalScore;

    /**
     * 考试答案（存字符串）
     */
    private String userAnswer;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 试卷id
     */
    private Integer examQuestionId;

    /**
     * 试卷类别
     */
    private Integer technologyTypeId;

    /**
     * 试卷难易
     */
    private String technologyTestComplexity;

    public ExamRecord(Integer examRecordId, Date examStarttime, Date examEndtime, Integer examRealityTime, Integer chooseOneScore, Integer chooseMuchScore, Integer chooseJurge, Integer totalScore, String userAnswer, Integer userId, Integer examQuestionId, Integer technologyTypeId, String technologyTestComplexity) {
        this.examRecordId = examRecordId;
        this.examStarttime = examStarttime;
        this.examEndtime = examEndtime;
        this.examRealityTime = examRealityTime;
        this.chooseOneScore = chooseOneScore;
        this.chooseMuchScore = chooseMuchScore;
        this.chooseJurge = chooseJurge;
        this.totalScore = totalScore;
        this.userAnswer = userAnswer;
        this.userId = userId;
        this.examQuestionId = examQuestionId;
        this.technologyTypeId = technologyTypeId;
        this.technologyTestComplexity = technologyTestComplexity;
    }

    public ExamRecord() {
        super();
    }

    public Integer getExamRecordId() {
        return examRecordId;
    }

    public void setExamRecordId(Integer examRecordId) {
        this.examRecordId = examRecordId;
    }

    public Date getExamStarttime() {
        return examStarttime;
    }

    public void setExamStarttime(Date examStarttime) {
        this.examStarttime = examStarttime;
    }

    public Date getExamEndtime() {
        return examEndtime;
    }

    public void setExamEndtime(Date examEndtime) {
        this.examEndtime = examEndtime;
    }

    public Integer getExamRealityTime() {
        return examRealityTime;
    }

    public void setExamRealityTime(Integer examRealityTime) {
        this.examRealityTime = examRealityTime;
    }

    public Integer getChooseOneScore() {
        return chooseOneScore;
    }

    public void setChooseOneScore(Integer chooseOneScore) {
        this.chooseOneScore = chooseOneScore;
    }

    public Integer getChooseMuchScore() {
        return chooseMuchScore;
    }

    public void setChooseMuchScore(Integer chooseMuchScore) {
        this.chooseMuchScore = chooseMuchScore;
    }

    public Integer getChooseJurge() {
        return chooseJurge;
    }

    public void setChooseJurge(Integer chooseJurge) {
        this.chooseJurge = chooseJurge;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExamQuestionId() {
        return examQuestionId;
    }

    public void setExamQuestionId(Integer examQuestionId) {
        this.examQuestionId = examQuestionId;
    }

    public Integer getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(Integer technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
    }

    public String getTechnologyTestComplexity() {
        return technologyTestComplexity;
    }

    public void setTechnologyTestComplexity(String technologyTestComplexity) {
        this.technologyTestComplexity = technologyTestComplexity == null ? null : technologyTestComplexity.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}