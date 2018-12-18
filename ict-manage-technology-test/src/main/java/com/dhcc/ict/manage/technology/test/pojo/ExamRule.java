package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ExamRule {
    /**
     * 试卷生成规则
     */
    private Integer examRuleId;

    /**
     * 规则名
     */
    private String examRuleName;

    /**
     * 总题数
     */
    private Integer totalCount;

    /**
     * 单选题数
     */
    private Integer chooseOneCount;

    /**
     * 多选题数
     */
    private Integer chooseMuchCount;

    /**
     * 判断题数
     */
    private Integer jurgeCount;

    /**
     * 考试时间
     */
    private Integer examTime;

    /**
     * 面试官
     */
    private Integer interviewerId;

    public ExamRule(Integer examRuleId, String examRuleName, Integer totalCount, Integer chooseOneCount, Integer chooseMuchCount, Integer jurgeCount, Integer examTime, Integer interviewerId) {
        this.examRuleId = examRuleId;
        this.examRuleName = examRuleName;
        this.totalCount = totalCount;
        this.chooseOneCount = chooseOneCount;
        this.chooseMuchCount = chooseMuchCount;
        this.jurgeCount = jurgeCount;
        this.examTime = examTime;
        this.interviewerId = interviewerId;
    }

    public ExamRule() {
        super();
    }

    public Integer getExamRuleId() {
        return examRuleId;
    }

    public void setExamRuleId(Integer examRuleId) {
        this.examRuleId = examRuleId;
    }

    public String getExamRuleName() {
        return examRuleName;
    }

    public void setExamRuleName(String examRuleName) {
        this.examRuleName = examRuleName == null ? null : examRuleName.trim();
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getChooseOneCount() {
        return chooseOneCount;
    }

    public void setChooseOneCount(Integer chooseOneCount) {
        this.chooseOneCount = chooseOneCount;
    }

    public Integer getChooseMuchCount() {
        return chooseMuchCount;
    }

    public void setChooseMuchCount(Integer chooseMuchCount) {
        this.chooseMuchCount = chooseMuchCount;
    }

    public Integer getJurgeCount() {
        return jurgeCount;
    }

    public void setJurgeCount(Integer jurgeCount) {
        this.jurgeCount = jurgeCount;
    }

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public Integer getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(Integer interviewerId) {
        this.interviewerId = interviewerId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}