package com.dhcc.ict.manage.exam.manage.pojo;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserDetail {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户账号
     */
    private String accountNumber;

    /**
     * 用户编号
     */
    private String userNumber;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 毕业时间
     */
    private Date graduationTime;

    /**
     * 在职状态
     */
    private String incumbencyState;

    /**
     * 工作状态
     */
    private String workingState;

    /**
     * 账号状态
     */
    private String accountNumberState;

    /**
     * 身份证号
     */
    private String identityCardNumber;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 户籍所在地
     */
    private String domicile;

    /**
     * 是否合作伙伴
     */
    private String isPartner;

    /**
     * 是否华为员工
     */
    private String isHuaweiemployee;

    /**
     * 第一语言
     */
    private String firstLanguage;

    /**
     * 第二语言
     */
    private String secondLanguage;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * 邮箱1
     */
    private String email1;

    /**
     * 邮箱2
     */
    private String email2;

    /**
     * 微信
     */
    private String wechat;

    /**
     * qq号
     */
    private String qqNumber;

    /**
     * 毕业院校
     */
    private String graduateInstitutions;

    /**
     * 学历
     */
    private String education;

    /**
     * 专业
     */
    private String major;

    /**
     * 教育开始日期
     */
    private Date startDate;

    /**
     * 教育结束日期
     */
    private Date endDate;

    /**
     * 现工作地
     */
    private String presentWorkPlace;

    /**
     * 期望工作地
     */
    private String desiredWorkPlace;

    /**
     * 求职岗位
     */
    private String jobWanted;

    /**
     * 是否接受海外工作
     */
    private String overseaAssignment;

    /**
     * 专业特长
     */
    private String specialty;

    /**
     * 兴趣爱好
     */
    private String hobby;

    /**
     * 其他特长
     */
    private String otherSpecial;

    /**
     * 简历附件
     */
    private String resumeAttachment;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 完善信息
     */
    private String perfecInformation;

    /**
     * 部门id
     */
    private Integer groupId;

    public UserDetail(Integer userId, String userName, String userPwd, String accountNumber, String userNumber, String birthday, String sex, Date graduationTime, String incumbencyState, String workingState, String accountNumberState, String identityCardNumber, String nativePlace, String domicile, String isPartner, String isHuaweiemployee, String firstLanguage, String secondLanguage, String telephone, String email1, String email2, String wechat, String qqNumber, String graduateInstitutions, String education, String major, Date startDate, Date endDate, String presentWorkPlace, String desiredWorkPlace, String jobWanted, String overseaAssignment, String specialty, String hobby, String otherSpecial, String resumeAttachment, Date registerTime, String perfecInformation, Integer groupId) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.accountNumber = accountNumber;
        this.userNumber = userNumber;
        this.birthday = birthday;
        this.sex = sex;
        this.graduationTime = graduationTime;
        this.incumbencyState = incumbencyState;
        this.workingState = workingState;
        this.accountNumberState = accountNumberState;
        this.identityCardNumber = identityCardNumber;
        this.nativePlace = nativePlace;
        this.domicile = domicile;
        this.isPartner = isPartner;
        this.isHuaweiemployee = isHuaweiemployee;
        this.firstLanguage = firstLanguage;
        this.secondLanguage = secondLanguage;
        this.telephone = telephone;
        this.email1 = email1;
        this.email2 = email2;
        this.wechat = wechat;
        this.qqNumber = qqNumber;
        this.graduateInstitutions = graduateInstitutions;
        this.education = education;
        this.major = major;
        this.startDate = startDate;
        this.endDate = endDate;
        this.presentWorkPlace = presentWorkPlace;
        this.desiredWorkPlace = desiredWorkPlace;
        this.jobWanted = jobWanted;
        this.overseaAssignment = overseaAssignment;
        this.specialty = specialty;
        this.hobby = hobby;
        this.otherSpecial = otherSpecial;
        this.resumeAttachment = resumeAttachment;
        this.registerTime = registerTime;
        this.perfecInformation = perfecInformation;
        this.groupId = groupId;
    }

    public UserDetail() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getIncumbencyState() {
        return incumbencyState;
    }

    public void setIncumbencyState(String incumbencyState) {
        this.incumbencyState = incumbencyState == null ? null : incumbencyState.trim();
    }

    public String getWorkingState() {
        return workingState;
    }

    public void setWorkingState(String workingState) {
        this.workingState = workingState == null ? null : workingState.trim();
    }

    public String getAccountNumberState() {
        return accountNumberState;
    }

    public void setAccountNumberState(String accountNumberState) {
        this.accountNumberState = accountNumberState == null ? null : accountNumberState.trim();
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber == null ? null : identityCardNumber.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile == null ? null : domicile.trim();
    }

    public String getIsPartner() {
        return isPartner;
    }

    public void setIsPartner(String isPartner) {
        this.isPartner = isPartner == null ? null : isPartner.trim();
    }

    public String getIsHuaweiemployee() {
        return isHuaweiemployee;
    }

    public void setIsHuaweiemployee(String isHuaweiemployee) {
        this.isHuaweiemployee = isHuaweiemployee == null ? null : isHuaweiemployee.trim();
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage == null ? null : firstLanguage.trim();
    }

    public String getSecondLanguage() {
        return secondLanguage;
    }

    public void setSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage == null ? null : secondLanguage.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber == null ? null : qqNumber.trim();
    }

    public String getGraduateInstitutions() {
        return graduateInstitutions;
    }

    public void setGraduateInstitutions(String graduateInstitutions) {
        this.graduateInstitutions = graduateInstitutions == null ? null : graduateInstitutions.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPresentWorkPlace() {
        return presentWorkPlace;
    }

    public void setPresentWorkPlace(String presentWorkPlace) {
        this.presentWorkPlace = presentWorkPlace == null ? null : presentWorkPlace.trim();
    }

    public String getDesiredWorkPlace() {
        return desiredWorkPlace;
    }

    public void setDesiredWorkPlace(String desiredWorkPlace) {
        this.desiredWorkPlace = desiredWorkPlace == null ? null : desiredWorkPlace.trim();
    }

    public String getJobWanted() {
        return jobWanted;
    }

    public void setJobWanted(String jobWanted) {
        this.jobWanted = jobWanted == null ? null : jobWanted.trim();
    }

    public String getOverseaAssignment() {
        return overseaAssignment;
    }

    public void setOverseaAssignment(String overseaAssignment) {
        this.overseaAssignment = overseaAssignment == null ? null : overseaAssignment.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getOtherSpecial() {
        return otherSpecial;
    }

    public void setOtherSpecial(String otherSpecial) {
        this.otherSpecial = otherSpecial == null ? null : otherSpecial.trim();
    }

    public String getResumeAttachment() {
        return resumeAttachment;
    }

    public void setResumeAttachment(String resumeAttachment) {
        this.resumeAttachment = resumeAttachment == null ? null : resumeAttachment.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getPerfecInformation() {
        return perfecInformation;
    }

    public void setPerfecInformation(String perfecInformation) {
        this.perfecInformation = perfecInformation == null ? null : perfecInformation.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}