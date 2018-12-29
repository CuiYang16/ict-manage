package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyCode {
    /**
     * 编程题
     */
    private Integer technologyCodeId;

    /**
     * 题目内容
     */
    private String technologyCodeDetail;

    /**
     * 难易程度
     */
    private String technologyCodeComplexity;

    /**
     * 类别
     */
    private Integer technologyTypeId;

    public TechnologyCode(Integer technologyCodeId, String technologyCodeDetail, String technologyCodeComplexity, Integer technologyTypeId) {
        this.technologyCodeId = technologyCodeId;
        this.technologyCodeDetail = technologyCodeDetail;
        this.technologyCodeComplexity = technologyCodeComplexity;
        this.technologyTypeId = technologyTypeId;
    }

    public TechnologyCode() {
        super();
    }

    public Integer getTechnologyCodeId() {
        return technologyCodeId;
    }

    public void setTechnologyCodeId(Integer technologyCodeId) {
        this.technologyCodeId = technologyCodeId;
    }

    public String getTechnologyCodeDetail() {
        return technologyCodeDetail;
    }

    public void setTechnologyCodeDetail(String technologyCodeDetail) {
        this.technologyCodeDetail = technologyCodeDetail == null ? null : technologyCodeDetail.trim();
    }

    public String getTechnologyCodeComplexity() {
        return technologyCodeComplexity;
    }

    public void setTechnologyCodeComplexity(String technologyCodeComplexity) {
        this.technologyCodeComplexity = technologyCodeComplexity == null ? null : technologyCodeComplexity.trim();
    }

    public Integer getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(Integer technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}