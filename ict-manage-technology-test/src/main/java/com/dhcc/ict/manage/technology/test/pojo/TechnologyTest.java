package com.dhcc.ict.manage.technology.test.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyTest {
    /**
     * 题库表
     */
    private Integer technologyTestId;

    /**
     * 题目内容
     */
    private String technologyTestDetail;

    /**
     * 答案1
     */
    private String technologyTestAnswer1;

    /**
     * 答案2
     */
    private String technologyTestAnswer2;

    /**
     * 答案3
     */
    private String technologyTestAnswer3;

    /**
     * 答案4
     */
    private String technologyTestAnswer4;

    /**
     * 答案5
     */
    private String technologyTestAnswer5;

    /**
     * 正确答案
     */
    private String technologyTestTrueAnswer;

    /**
     * 难易程度
     */
    private String technologyTestComplexity;

    /**
     * 题型
     */
    private String technologyTestType;

    /**
     * 题目类别
     */
    private Integer technologyTypeId;

    public TechnologyTest(Integer technologyTestId, String technologyTestDetail, String technologyTestAnswer1, String technologyTestAnswer2, String technologyTestAnswer3, String technologyTestAnswer4, String technologyTestAnswer5, String technologyTestTrueAnswer, String technologyTestComplexity, String technologyTestType, Integer technologyTypeId) {
        this.technologyTestId = technologyTestId;
        this.technologyTestDetail = technologyTestDetail;
        this.technologyTestAnswer1 = technologyTestAnswer1;
        this.technologyTestAnswer2 = technologyTestAnswer2;
        this.technologyTestAnswer3 = technologyTestAnswer3;
        this.technologyTestAnswer4 = technologyTestAnswer4;
        this.technologyTestAnswer5 = technologyTestAnswer5;
        this.technologyTestTrueAnswer = technologyTestTrueAnswer;
        this.technologyTestComplexity = technologyTestComplexity;
        this.technologyTestType = technologyTestType;
        this.technologyTypeId = technologyTypeId;
    }

    public TechnologyTest() {
        super();
    }

    public Integer getTechnologyTestId() {
        return technologyTestId;
    }

    public void setTechnologyTestId(Integer technologyTestId) {
        this.technologyTestId = technologyTestId;
    }

    public String getTechnologyTestDetail() {
        return technologyTestDetail;
    }

    public void setTechnologyTestDetail(String technologyTestDetail) {
        this.technologyTestDetail = technologyTestDetail == null ? null : technologyTestDetail.trim();
    }

    public String getTechnologyTestAnswer1() {
        return technologyTestAnswer1;
    }

    public void setTechnologyTestAnswer1(String technologyTestAnswer1) {
        this.technologyTestAnswer1 = technologyTestAnswer1 == null ? null : technologyTestAnswer1.trim();
    }

    public String getTechnologyTestAnswer2() {
        return technologyTestAnswer2;
    }

    public void setTechnologyTestAnswer2(String technologyTestAnswer2) {
        this.technologyTestAnswer2 = technologyTestAnswer2 == null ? null : technologyTestAnswer2.trim();
    }

    public String getTechnologyTestAnswer3() {
        return technologyTestAnswer3;
    }

    public void setTechnologyTestAnswer3(String technologyTestAnswer3) {
        this.technologyTestAnswer3 = technologyTestAnswer3 == null ? null : technologyTestAnswer3.trim();
    }

    public String getTechnologyTestAnswer4() {
        return technologyTestAnswer4;
    }

    public void setTechnologyTestAnswer4(String technologyTestAnswer4) {
        this.technologyTestAnswer4 = technologyTestAnswer4 == null ? null : technologyTestAnswer4.trim();
    }

    public String getTechnologyTestAnswer5() {
        return technologyTestAnswer5;
    }

    public void setTechnologyTestAnswer5(String technologyTestAnswer5) {
        this.technologyTestAnswer5 = technologyTestAnswer5 == null ? null : technologyTestAnswer5.trim();
    }

    public String getTechnologyTestTrueAnswer() {
        return technologyTestTrueAnswer;
    }

    public void setTechnologyTestTrueAnswer(String technologyTestTrueAnswer) {
        this.technologyTestTrueAnswer = technologyTestTrueAnswer == null ? null : technologyTestTrueAnswer.trim();
    }

    public String getTechnologyTestComplexity() {
        return technologyTestComplexity;
    }

    public void setTechnologyTestComplexity(String technologyTestComplexity) {
        this.technologyTestComplexity = technologyTestComplexity == null ? null : technologyTestComplexity.trim();
    }

    public String getTechnologyTestType() {
        return technologyTestType;
    }

    public void setTechnologyTestType(String technologyTestType) {
        this.technologyTestType = technologyTestType == null ? null : technologyTestType.trim();
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