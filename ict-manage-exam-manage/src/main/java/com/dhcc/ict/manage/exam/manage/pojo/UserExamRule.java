package com.dhcc.ict.manage.exam.manage.pojo;

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

    public UserExamRule(Integer userId, Integer examRuleId) {
        this.userId = userId;
        this.examRuleId = examRuleId;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}