package com.dhcc.ict.manage.loginandregister.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Certificate {
    /**
     * 用户证书id
     */
    private Integer certificateId;

    /**
     * 证书类别
     */
    private String certificateType;

    /**
     * 获得时间
     */
    private String certificateAcquisitionTime;

    /**
     * 证书编号
     */
    private String certificateNumber;

    /**
     * 成绩
     */
    private Double score;

    /**
     * 有效期
     */
    private String vld;

    /**
     * 用户关联
     */
    private Integer userId;

    /**
     * 证书附件
     */
    private byte[] certificateAnnex;

    public Certificate(Integer certificateId, String certificateType, String certificateAcquisitionTime, String certificateNumber, Double score, String vld, Integer userId, byte[] certificateAnnex) {
        this.certificateId = certificateId;
        this.certificateType = certificateType;
        this.certificateAcquisitionTime = certificateAcquisitionTime;
        this.certificateNumber = certificateNumber;
        this.score = score;
        this.vld = vld;
        this.userId = userId;
        this.certificateAnnex = certificateAnnex;
    }

    public Certificate() {
        super();
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateAcquisitionTime() {
        return certificateAcquisitionTime;
    }

    public void setCertificateAcquisitionTime(String certificateAcquisitionTime) {
        this.certificateAcquisitionTime = certificateAcquisitionTime == null ? null : certificateAcquisitionTime.trim();
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getVld() {
        return vld;
    }

    public void setVld(String vld) {
        this.vld = vld == null ? null : vld.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public byte[] getCertificateAnnex() {
        return certificateAnnex;
    }

    public void setCertificateAnnex(byte[] certificateAnnex) {
        this.certificateAnnex = certificateAnnex;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}