package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyType {
    /**
     * 
     */
    private Integer technologyTypeId;

    /**
     * 技术考试类别
     */
    private String technologyTypeName;

    public TechnologyType(Integer technologyTypeId, String technologyTypeName) {
        this.technologyTypeId = technologyTypeId;
        this.technologyTypeName = technologyTypeName;
    }

    public TechnologyType() {
        super();
    }

    public Integer getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(Integer technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
    }

    public String getTechnologyTypeName() {
        return technologyTypeName;
    }

    public void setTechnologyTypeName(String technologyTypeName) {
        this.technologyTypeName = technologyTypeName == null ? null : technologyTypeName.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}