package com.dhcc.ict.manage.permission.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Permission {
    /**
     * 
     */
    private Integer permissionsId;

    /**
     * 权限名
     */
    private String permissionsName;

    public Permission(Integer permissionsId, String permissionsName) {
        this.permissionsId = permissionsId;
        this.permissionsName = permissionsName;
    }

    public Permission() {
        super();
    }

    public Integer getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName == null ? null : permissionsName.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}