package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserExamRule {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 试卷规则id
     */
    private Integer examRuleId;

    /**
     * 试卷标识
     */
    private String paperFlag;

    public UserExamRule(Integer userId, Integer examRuleId, String paperFlag) {
        this.userId = userId;
        this.examRuleId = examRuleId;
        this.paperFlag = paperFlag;
    }

    public UserExamRule() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExamRuleId() {
        return examRuleId;
    }

    public void setExamRuleId(Integer examRuleId) {
        this.examRuleId = examRuleId;
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