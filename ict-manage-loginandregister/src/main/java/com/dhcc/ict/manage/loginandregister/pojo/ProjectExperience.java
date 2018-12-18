package com.dhcc.ict.manage.loginandregister.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ProjectExperience {
    /**
     * 项目经验
     */
    private Integer projectExperienceId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 公司名称
     */
    private String corporateName;

    /**
     * 项目开始时间
     */
    private String projectStartTime;

    /**
     * 项目结束时间
     */
    private String projectEndTime;

    /**
     * 担任角色
     */
    private String roleOfProject;

    /**
     * 项目描述
     */
    private String projectDescription;

    /**
     * 职责描述
     */
    private String responsibilityDescription;

    /**
     * 项目地址
     */
    private String projectAddress;

    /**
     * 用户关联
     */
    private Integer userId;

    public ProjectExperience(Integer projectExperienceId, String projectName, String corporateName, String projectStartTime, String projectEndTime, String roleOfProject, String projectDescription, String responsibilityDescription, String projectAddress, Integer userId) {
        this.projectExperienceId = projectExperienceId;
        this.projectName = projectName;
        this.corporateName = corporateName;
        this.projectStartTime = projectStartTime;
        this.projectEndTime = projectEndTime;
        this.roleOfProject = roleOfProject;
        this.projectDescription = projectDescription;
        this.responsibilityDescription = responsibilityDescription;
        this.projectAddress = projectAddress;
        this.userId = userId;
    }

    public ProjectExperience() {
        super();
    }

    public Integer getProjectExperienceId() {
        return projectExperienceId;
    }

    public void setProjectExperienceId(Integer projectExperienceId) {
        this.projectExperienceId = projectExperienceId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName == null ? null : corporateName.trim();
    }

    public String getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectStartTime(String projectStartTime) {
        this.projectStartTime = projectStartTime == null ? null : projectStartTime.trim();
    }

    public String getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(String projectEndTime) {
        this.projectEndTime = projectEndTime == null ? null : projectEndTime.trim();
    }

    public String getRoleOfProject() {
        return roleOfProject;
    }

    public void setRoleOfProject(String roleOfProject) {
        this.roleOfProject = roleOfProject == null ? null : roleOfProject.trim();
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription == null ? null : projectDescription.trim();
    }

    public String getResponsibilityDescription() {
        return responsibilityDescription;
    }

    public void setResponsibilityDescription(String responsibilityDescription) {
        this.responsibilityDescription = responsibilityDescription == null ? null : responsibilityDescription.trim();
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress == null ? null : projectAddress.trim();
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