package com.dhcc.ict.manage.loginandregister.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class InterviewRecord {
    /**
     * 
     */
    private Integer interviewRecordId;

    /**
     * 
     */
    private String interviewResults;

    /**
     * 
     */
    private String interviewerComments;

    /**
     * 
     */
    private String interviewerRemarks;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 面试官id
     */
    private Integer interviewerId;

    /**
     * 考试记录id
     */
    private Integer examRecordId;

    /**
     * 
     */
    private byte[] interviewerName;

    public InterviewRecord(Integer interviewRecordId, String interviewResults, String interviewerComments, String interviewerRemarks, Integer userId, Integer interviewerId, Integer examRecordId, byte[] interviewerName) {
        this.interviewRecordId = interviewRecordId;
        this.interviewResults = interviewResults;
        this.interviewerComments = interviewerComments;
        this.interviewerRemarks = interviewerRemarks;
        this.userId = userId;
        this.interviewerId = interviewerId;
        this.examRecordId = examRecordId;
        this.interviewerName = interviewerName;
    }

    public InterviewRecord() {
        super();
    }

    public Integer getInterviewRecordId() {
        return interviewRecordId;
    }

    public void setInterviewRecordId(Integer interviewRecordId) {
        this.interviewRecordId = interviewRecordId;
    }

    public String getInterviewResults() {
        return interviewResults;
    }

    public void setInterviewResults(String interviewResults) {
        this.interviewResults = interviewResults == null ? null : interviewResults.trim();
    }

    public String getInterviewerComments() {
        return interviewerComments;
    }

    public void setInterviewerComments(String interviewerComments) {
        this.interviewerComments = interviewerComments == null ? null : interviewerComments.trim();
    }

    public String getInterviewerRemarks() {
        return interviewerRemarks;
    }

    public void setInterviewerRemarks(String interviewerRemarks) {
        this.interviewerRemarks = interviewerRemarks == null ? null : interviewerRemarks.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(Integer interviewerId) {
        this.interviewerId = interviewerId;
    }

    public Integer getExamRecordId() {
        return examRecordId;
    }

    public void setExamRecordId(Integer examRecordId) {
        this.examRecordId = examRecordId;
    }

    public byte[] getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(byte[] interviewerName) {
        this.interviewerName = interviewerName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}