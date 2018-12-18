package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyChooseOne {
    /**
     * 
     */
    private Integer chooseOneId;

    /**
     * 题目内容
     */
    private String chooseOneDetail;

    /**
     * 答案1
     */
    private String chooseOneAnswer1;

    /**
     * 答案2
     */
    private String chooseOneAnswer2;

    /**
     * 答案3
     */
    private String chooseOneAnswer3;

    /**
     * 答案4
     */
    private String chooseOneAnswer4;

    /**
     * 正确答案
     */
    private String chooseOneTrueAnswer;

    /**
     * 难以程度
     */
    private String chooseOneComplexity;

    /**
     * 题目类别
     */
    private Integer technologyTypeId;

    public TechnologyChooseOne(Integer chooseOneId, String chooseOneDetail, String chooseOneAnswer1, String chooseOneAnswer2, String chooseOneAnswer3, String chooseOneAnswer4, String chooseOneTrueAnswer, String chooseOneComplexity, Integer technologyTypeId) {
        this.chooseOneId = chooseOneId;
        this.chooseOneDetail = chooseOneDetail;
        this.chooseOneAnswer1 = chooseOneAnswer1;
        this.chooseOneAnswer2 = chooseOneAnswer2;
        this.chooseOneAnswer3 = chooseOneAnswer3;
        this.chooseOneAnswer4 = chooseOneAnswer4;
        this.chooseOneTrueAnswer = chooseOneTrueAnswer;
        this.chooseOneComplexity = chooseOneComplexity;
        this.technologyTypeId = technologyTypeId;
    }

    public TechnologyChooseOne() {
        super();
    }

    public Integer getChooseOneId() {
        return chooseOneId;
    }

    public void setChooseOneId(Integer chooseOneId) {
        this.chooseOneId = chooseOneId;
    }

    public String getChooseOneDetail() {
        return chooseOneDetail;
    }

    public void setChooseOneDetail(String chooseOneDetail) {
        this.chooseOneDetail = chooseOneDetail == null ? null : chooseOneDetail.trim();
    }

    public String getChooseOneAnswer1() {
        return chooseOneAnswer1;
    }

    public void setChooseOneAnswer1(String chooseOneAnswer1) {
        this.chooseOneAnswer1 = chooseOneAnswer1 == null ? null : chooseOneAnswer1.trim();
    }

    public String getChooseOneAnswer2() {
        return chooseOneAnswer2;
    }

    public void setChooseOneAnswer2(String chooseOneAnswer2) {
        this.chooseOneAnswer2 = chooseOneAnswer2 == null ? null : chooseOneAnswer2.trim();
    }

    public String getChooseOneAnswer3() {
        return chooseOneAnswer3;
    }

    public void setChooseOneAnswer3(String chooseOneAnswer3) {
        this.chooseOneAnswer3 = chooseOneAnswer3 == null ? null : chooseOneAnswer3.trim();
    }

    public String getChooseOneAnswer4() {
        return chooseOneAnswer4;
    }

    public void setChooseOneAnswer4(String chooseOneAnswer4) {
        this.chooseOneAnswer4 = chooseOneAnswer4 == null ? null : chooseOneAnswer4.trim();
    }

    public String getChooseOneTrueAnswer() {
        return chooseOneTrueAnswer;
    }

    public void setChooseOneTrueAnswer(String chooseOneTrueAnswer) {
        this.chooseOneTrueAnswer = chooseOneTrueAnswer == null ? null : chooseOneTrueAnswer.trim();
    }

    public String getChooseOneComplexity() {
        return chooseOneComplexity;
    }

    public void setChooseOneComplexity(String chooseOneComplexity) {
        this.chooseOneComplexity = chooseOneComplexity == null ? null : chooseOneComplexity.trim();
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