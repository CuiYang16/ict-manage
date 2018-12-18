package com.dhcc.ict.manage.loginandregister.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class WorkExperience {
    /**
     * 工作经历
     */
    private Integer workExperienceId;

    /**
     * 公司名称
     */
    private String corporateName;

    /**
     * 入职时间
     */
    private String entryTime;

    /**
     * 离职时间
     */
    private String departureTime;

    /**
     * 用户关联
     */
    private Integer userId;

    public WorkExperience(Integer workExperienceId, String corporateName, String entryTime, String departureTime, Integer userId) {
        this.workExperienceId = workExperienceId;
        this.corporateName = corporateName;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.userId = userId;
    }

    public WorkExperience() {
        super();
    }

    public Integer getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(Integer workExperienceId) {
        this.workExperienceId = workExperienceId;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName == null ? null : corporateName.trim();
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime == null ? null : entryTime.trim();
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime == null ? null : departureTime.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}