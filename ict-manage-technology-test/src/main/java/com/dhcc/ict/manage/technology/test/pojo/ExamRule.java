package com.dhcc.ict.manage.technology.test.pojo;

import java.util.Date;
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
     * 编程题
     */
    private Integer codeCount;

    /**
     * 考试时间
     */
    private Integer examTime;

    /**
     * 难易程度
     */
    private String examComplexity;

    /**
     * 试卷有效时间
     */
    private Date validTime;

    /**
     * 是否统一试卷
     */
    private String unifyQuestion;

    /**
     * 试卷类型
     */
    private Integer technologyTypeId;

    /**
     * 面试官
     */
    private Integer interviewerId;

    public ExamRule(Integer examRuleId, String examRuleName, Integer totalCount, Integer chooseOneCount, Integer chooseMuchCount, Integer jurgeCount, Integer codeCount, Integer examTime, String examComplexity, Date validTime, String unifyQuestion, Integer technologyTypeId, Integer interviewerId) {
        this.examRuleId = examRuleId;
        this.examRuleName = examRuleName;
        this.totalCount = totalCount;
        this.chooseOneCount = chooseOneCount;
        this.chooseMuchCount = chooseMuchCount;
        this.jurgeCount = jurgeCount;
        this.codeCount = codeCount;
        this.examTime = examTime;
        this.examComplexity = examComplexity;
        this.validTime = validTime;
        this.unifyQuestion = unifyQuestion;
        this.technologyTypeId = technologyTypeId;
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

    public Integer getCodeCount() {
        return codeCount;
    }

    public void setCodeCount(Integer codeCount) {
        this.codeCount = codeCount;
    }

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public String getExamComplexity() {
        return examComplexity;
    }

    public void setExamComplexity(String examComplexity) {
        this.examComplexity = examComplexity == null ? null : examComplexity.trim();
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public String getUnifyQuestion() {
        return unifyQuestion;
    }

    public void setUnifyQuestion(String unifyQuestion) {
        this.unifyQuestion = unifyQuestion == null ? null : unifyQuestion.trim();
    }

    public Integer getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(Integer technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
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