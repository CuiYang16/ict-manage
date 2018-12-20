package com.dhcc.ict.manage.questionbank.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TechnologyChooseMuch {
    /**
     * 
     */
    private Integer chooseMuchId;

    /**
     * 多选题内容
     */
    private String chooseMuchDetail;

    /**
     * 
     */
    private String chooseMuchAnswer1;

    /**
     * 
     */
    private String chooseMuchAnswer2;

    /**
     * 
     */
    private String chooseMuchAnswer3;

    /**
     * 
     */
    private String chooseMuchAnswer4;

    /**
     * 
     */
    private String chooseMuchAnswer5;

    /**
     * 正确答案（选项组合数组）
     */
    private String chooseMuchTrueAnswer;

    /**
     * 难易程度
     */
    private String chooseMuchComplexity;

    /**
     * 类别
     */
    private Integer technologyTypeId;

    public TechnologyChooseMuch(Integer chooseMuchId, String chooseMuchDetail, String chooseMuchAnswer1, String chooseMuchAnswer2, String chooseMuchAnswer3, String chooseMuchAnswer4, String chooseMuchAnswer5, String chooseMuchTrueAnswer, String chooseMuchComplexity, Integer technologyTypeId) {
        this.chooseMuchId = chooseMuchId;
        this.chooseMuchDetail = chooseMuchDetail;
        this.chooseMuchAnswer1 = chooseMuchAnswer1;
        this.chooseMuchAnswer2 = chooseMuchAnswer2;
        this.chooseMuchAnswer3 = chooseMuchAnswer3;
        this.chooseMuchAnswer4 = chooseMuchAnswer4;
        this.chooseMuchAnswer5 = chooseMuchAnswer5;
        this.chooseMuchTrueAnswer = chooseMuchTrueAnswer;
        this.chooseMuchComplexity = chooseMuchComplexity;
        this.technologyTypeId = technologyTypeId;
    }

    public TechnologyChooseMuch() {
        super();
    }

    public Integer getChooseMuchId() {
        return chooseMuchId;
    }

    public void setChooseMuchId(Integer chooseMuchId) {
        this.chooseMuchId = chooseMuchId;
    }

    public String getChooseMuchDetail() {
        return chooseMuchDetail;
    }

    public void setChooseMuchDetail(String chooseMuchDetail) {
        this.chooseMuchDetail = chooseMuchDetail == null ? null : chooseMuchDetail.trim();
    }

    public String getChooseMuchAnswer1() {
        return chooseMuchAnswer1;
    }

    public void setChooseMuchAnswer1(String chooseMuchAnswer1) {
        this.chooseMuchAnswer1 = chooseMuchAnswer1 == null ? null : chooseMuchAnswer1.trim();
    }

    public String getChooseMuchAnswer2() {
        return chooseMuchAnswer2;
    }

    public void setChooseMuchAnswer2(String chooseMuchAnswer2) {
        this.chooseMuchAnswer2 = chooseMuchAnswer2 == null ? null : chooseMuchAnswer2.trim();
    }

    public String getChooseMuchAnswer3() {
        return chooseMuchAnswer3;
    }

    public void setChooseMuchAnswer3(String chooseMuchAnswer3) {
        this.chooseMuchAnswer3 = chooseMuchAnswer3 == null ? null : chooseMuchAnswer3.trim();
    }

    public String getChooseMuchAnswer4() {
        return chooseMuchAnswer4;
    }

    public void setChooseMuchAnswer4(String chooseMuchAnswer4) {
        this.chooseMuchAnswer4 = chooseMuchAnswer4 == null ? null : chooseMuchAnswer4.trim();
    }

    public String getChooseMuchAnswer5() {
        return chooseMuchAnswer5;
    }

    public void setChooseMuchAnswer5(String chooseMuchAnswer5) {
        this.chooseMuchAnswer5 = chooseMuchAnswer5 == null ? null : chooseMuchAnswer5.trim();
    }

    public String getChooseMuchTrueAnswer() {
        return chooseMuchTrueAnswer;
    }

    public void setChooseMuchTrueAnswer(String chooseMuchTrueAnswer) {
        this.chooseMuchTrueAnswer = chooseMuchTrueAnswer == null ? null : chooseMuchTrueAnswer.trim();
    }

    public String getChooseMuchComplexity() {
        return chooseMuchComplexity;
    }

    public void setChooseMuchComplexity(String chooseMuchComplexity) {
        this.chooseMuchComplexity = chooseMuchComplexity == null ? null : chooseMuchComplexity.trim();
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