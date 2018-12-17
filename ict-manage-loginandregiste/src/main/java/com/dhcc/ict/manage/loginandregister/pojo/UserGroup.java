package com.dhcc.ict.manage.loginandregister.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserGroup {
    /**
     * 组织id
     */
    private Integer groupId;

    /**
     * 组织名称
     */
    private String groupName;

    /**
     * 组织编号
     */
    private String groupNumber;

    public UserGroup(Integer groupId, String groupName, String groupNumber) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupNumber = groupNumber;
    }

    public UserGroup() {
        super();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber == null ? null : groupNumber.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}