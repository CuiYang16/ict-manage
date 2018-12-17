package com.dhcc.ict.manage.loginandregister.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("user_pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("user_pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("user_pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("user_pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("user_pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("user_pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("user_pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("user_pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("user_pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("user_pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("user_pwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("account_number is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("account_number =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("account_number <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("account_number >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("account_number >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("account_number <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("account_number <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("account_number like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("account_number not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("account_number in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("account_number not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("account_number between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("account_number not between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("user_number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("user_number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("user_number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("user_number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("user_number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("user_number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("user_number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("user_number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("user_number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("user_number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("user_number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("graduation_time is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("graduation_time is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(Date value) {
            addCriterion("graduation_time =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(Date value) {
            addCriterion("graduation_time <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(Date value) {
            addCriterion("graduation_time >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_time >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(Date value) {
            addCriterion("graduation_time <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(Date value) {
            addCriterion("graduation_time <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<Date> values) {
            addCriterion("graduation_time in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<Date> values) {
            addCriterion("graduation_time not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(Date value1, Date value2) {
            addCriterion("graduation_time between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(Date value1, Date value2) {
            addCriterion("graduation_time not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateIsNull() {
            addCriterion("incumbency_state is null");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateIsNotNull() {
            addCriterion("incumbency_state is not null");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateEqualTo(String value) {
            addCriterion("incumbency_state =", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateNotEqualTo(String value) {
            addCriterion("incumbency_state <>", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateGreaterThan(String value) {
            addCriterion("incumbency_state >", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateGreaterThanOrEqualTo(String value) {
            addCriterion("incumbency_state >=", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateLessThan(String value) {
            addCriterion("incumbency_state <", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateLessThanOrEqualTo(String value) {
            addCriterion("incumbency_state <=", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateLike(String value) {
            addCriterion("incumbency_state like", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateNotLike(String value) {
            addCriterion("incumbency_state not like", value, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateIn(List<String> values) {
            addCriterion("incumbency_state in", values, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateNotIn(List<String> values) {
            addCriterion("incumbency_state not in", values, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateBetween(String value1, String value2) {
            addCriterion("incumbency_state between", value1, value2, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andIncumbencyStateNotBetween(String value1, String value2) {
            addCriterion("incumbency_state not between", value1, value2, "incumbencyState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateIsNull() {
            addCriterion("working_state is null");
            return (Criteria) this;
        }

        public Criteria andWorkingStateIsNotNull() {
            addCriterion("working_state is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingStateEqualTo(String value) {
            addCriterion("working_state =", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotEqualTo(String value) {
            addCriterion("working_state <>", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateGreaterThan(String value) {
            addCriterion("working_state >", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateGreaterThanOrEqualTo(String value) {
            addCriterion("working_state >=", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateLessThan(String value) {
            addCriterion("working_state <", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateLessThanOrEqualTo(String value) {
            addCriterion("working_state <=", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateLike(String value) {
            addCriterion("working_state like", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotLike(String value) {
            addCriterion("working_state not like", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateIn(List<String> values) {
            addCriterion("working_state in", values, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotIn(List<String> values) {
            addCriterion("working_state not in", values, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateBetween(String value1, String value2) {
            addCriterion("working_state between", value1, value2, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotBetween(String value1, String value2) {
            addCriterion("working_state not between", value1, value2, "workingState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateIsNull() {
            addCriterion("account_number_state is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateIsNotNull() {
            addCriterion("account_number_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateEqualTo(String value) {
            addCriterion("account_number_state =", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateNotEqualTo(String value) {
            addCriterion("account_number_state <>", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateGreaterThan(String value) {
            addCriterion("account_number_state >", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateGreaterThanOrEqualTo(String value) {
            addCriterion("account_number_state >=", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateLessThan(String value) {
            addCriterion("account_number_state <", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateLessThanOrEqualTo(String value) {
            addCriterion("account_number_state <=", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateLike(String value) {
            addCriterion("account_number_state like", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateNotLike(String value) {
            addCriterion("account_number_state not like", value, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateIn(List<String> values) {
            addCriterion("account_number_state in", values, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateNotIn(List<String> values) {
            addCriterion("account_number_state not in", values, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateBetween(String value1, String value2) {
            addCriterion("account_number_state between", value1, value2, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andAccountNumberStateNotBetween(String value1, String value2) {
            addCriterion("account_number_state not between", value1, value2, "accountNumberState");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberIsNull() {
            addCriterion("identity_card_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberIsNotNull() {
            addCriterion("identity_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberEqualTo(String value) {
            addCriterion("identity_card_number =", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberNotEqualTo(String value) {
            addCriterion("identity_card_number <>", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberGreaterThan(String value) {
            addCriterion("identity_card_number >", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_number >=", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberLessThan(String value) {
            addCriterion("identity_card_number <", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberLessThanOrEqualTo(String value) {
            addCriterion("identity_card_number <=", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberLike(String value) {
            addCriterion("identity_card_number like", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberNotLike(String value) {
            addCriterion("identity_card_number not like", value, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberIn(List<String> values) {
            addCriterion("identity_card_number in", values, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberNotIn(List<String> values) {
            addCriterion("identity_card_number not in", values, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberBetween(String value1, String value2) {
            addCriterion("identity_card_number between", value1, value2, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNumberNotBetween(String value1, String value2) {
            addCriterion("identity_card_number not between", value1, value2, "identityCardNumber");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andDomicileIsNull() {
            addCriterion("domicile is null");
            return (Criteria) this;
        }

        public Criteria andDomicileIsNotNull() {
            addCriterion("domicile is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileEqualTo(String value) {
            addCriterion("domicile =", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotEqualTo(String value) {
            addCriterion("domicile <>", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileGreaterThan(String value) {
            addCriterion("domicile >", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("domicile >=", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLessThan(String value) {
            addCriterion("domicile <", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLessThanOrEqualTo(String value) {
            addCriterion("domicile <=", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLike(String value) {
            addCriterion("domicile like", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotLike(String value) {
            addCriterion("domicile not like", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileIn(List<String> values) {
            addCriterion("domicile in", values, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotIn(List<String> values) {
            addCriterion("domicile not in", values, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileBetween(String value1, String value2) {
            addCriterion("domicile between", value1, value2, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotBetween(String value1, String value2) {
            addCriterion("domicile not between", value1, value2, "domicile");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIsNull() {
            addCriterion("is_partner is null");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIsNotNull() {
            addCriterion("is_partner is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartnerEqualTo(String value) {
            addCriterion("is_partner =", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotEqualTo(String value) {
            addCriterion("is_partner <>", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerGreaterThan(String value) {
            addCriterion("is_partner >", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("is_partner >=", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLessThan(String value) {
            addCriterion("is_partner <", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLessThanOrEqualTo(String value) {
            addCriterion("is_partner <=", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLike(String value) {
            addCriterion("is_partner like", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotLike(String value) {
            addCriterion("is_partner not like", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIn(List<String> values) {
            addCriterion("is_partner in", values, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotIn(List<String> values) {
            addCriterion("is_partner not in", values, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerBetween(String value1, String value2) {
            addCriterion("is_partner between", value1, value2, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotBetween(String value1, String value2) {
            addCriterion("is_partner not between", value1, value2, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeIsNull() {
            addCriterion("is_huaweiemployee is null");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeIsNotNull() {
            addCriterion("is_huaweiemployee is not null");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeEqualTo(String value) {
            addCriterion("is_huaweiemployee =", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeNotEqualTo(String value) {
            addCriterion("is_huaweiemployee <>", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeGreaterThan(String value) {
            addCriterion("is_huaweiemployee >", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeGreaterThanOrEqualTo(String value) {
            addCriterion("is_huaweiemployee >=", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeLessThan(String value) {
            addCriterion("is_huaweiemployee <", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeLessThanOrEqualTo(String value) {
            addCriterion("is_huaweiemployee <=", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeLike(String value) {
            addCriterion("is_huaweiemployee like", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeNotLike(String value) {
            addCriterion("is_huaweiemployee not like", value, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeIn(List<String> values) {
            addCriterion("is_huaweiemployee in", values, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeNotIn(List<String> values) {
            addCriterion("is_huaweiemployee not in", values, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeBetween(String value1, String value2) {
            addCriterion("is_huaweiemployee between", value1, value2, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andIsHuaweiemployeeNotBetween(String value1, String value2) {
            addCriterion("is_huaweiemployee not between", value1, value2, "isHuaweiemployee");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageIsNull() {
            addCriterion("first_language is null");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageIsNotNull() {
            addCriterion("first_language is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageEqualTo(String value) {
            addCriterion("first_language =", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageNotEqualTo(String value) {
            addCriterion("first_language <>", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageGreaterThan(String value) {
            addCriterion("first_language >", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("first_language >=", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageLessThan(String value) {
            addCriterion("first_language <", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageLessThanOrEqualTo(String value) {
            addCriterion("first_language <=", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageLike(String value) {
            addCriterion("first_language like", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageNotLike(String value) {
            addCriterion("first_language not like", value, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageIn(List<String> values) {
            addCriterion("first_language in", values, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageNotIn(List<String> values) {
            addCriterion("first_language not in", values, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageBetween(String value1, String value2) {
            addCriterion("first_language between", value1, value2, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andFirstLanguageNotBetween(String value1, String value2) {
            addCriterion("first_language not between", value1, value2, "firstLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageIsNull() {
            addCriterion("second_language is null");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageIsNotNull() {
            addCriterion("second_language is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageEqualTo(String value) {
            addCriterion("second_language =", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageNotEqualTo(String value) {
            addCriterion("second_language <>", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageGreaterThan(String value) {
            addCriterion("second_language >", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("second_language >=", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageLessThan(String value) {
            addCriterion("second_language <", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageLessThanOrEqualTo(String value) {
            addCriterion("second_language <=", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageLike(String value) {
            addCriterion("second_language like", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageNotLike(String value) {
            addCriterion("second_language not like", value, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageIn(List<String> values) {
            addCriterion("second_language in", values, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageNotIn(List<String> values) {
            addCriterion("second_language not in", values, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageBetween(String value1, String value2) {
            addCriterion("second_language between", value1, value2, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageNotBetween(String value1, String value2) {
            addCriterion("second_language not between", value1, value2, "secondLanguage");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNull() {
            addCriterion("email1 is null");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNotNull() {
            addCriterion("email1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail1EqualTo(String value) {
            addCriterion("email1 =", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotEqualTo(String value) {
            addCriterion("email1 <>", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThan(String value) {
            addCriterion("email1 >", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThanOrEqualTo(String value) {
            addCriterion("email1 >=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThan(String value) {
            addCriterion("email1 <", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThanOrEqualTo(String value) {
            addCriterion("email1 <=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Like(String value) {
            addCriterion("email1 like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotLike(String value) {
            addCriterion("email1 not like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1In(List<String> values) {
            addCriterion("email1 in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotIn(List<String> values) {
            addCriterion("email1 not in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Between(String value1, String value2) {
            addCriterion("email1 between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotBetween(String value1, String value2) {
            addCriterion("email1 not between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNull() {
            addCriterion("email2 is null");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNotNull() {
            addCriterion("email2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail2EqualTo(String value) {
            addCriterion("email2 =", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotEqualTo(String value) {
            addCriterion("email2 <>", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThan(String value) {
            addCriterion("email2 >", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("email2 >=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThan(String value) {
            addCriterion("email2 <", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThanOrEqualTo(String value) {
            addCriterion("email2 <=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Like(String value) {
            addCriterion("email2 like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotLike(String value) {
            addCriterion("email2 not like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2In(List<String> values) {
            addCriterion("email2 in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotIn(List<String> values) {
            addCriterion("email2 not in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Between(String value1, String value2) {
            addCriterion("email2 between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotBetween(String value1, String value2) {
            addCriterion("email2 not between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andQqNumberIsNull() {
            addCriterion("qq_number is null");
            return (Criteria) this;
        }

        public Criteria andQqNumberIsNotNull() {
            addCriterion("qq_number is not null");
            return (Criteria) this;
        }

        public Criteria andQqNumberEqualTo(String value) {
            addCriterion("qq_number =", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotEqualTo(String value) {
            addCriterion("qq_number <>", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberGreaterThan(String value) {
            addCriterion("qq_number >", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberGreaterThanOrEqualTo(String value) {
            addCriterion("qq_number >=", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberLessThan(String value) {
            addCriterion("qq_number <", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberLessThanOrEqualTo(String value) {
            addCriterion("qq_number <=", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberLike(String value) {
            addCriterion("qq_number like", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotLike(String value) {
            addCriterion("qq_number not like", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberIn(List<String> values) {
            addCriterion("qq_number in", values, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotIn(List<String> values) {
            addCriterion("qq_number not in", values, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberBetween(String value1, String value2) {
            addCriterion("qq_number between", value1, value2, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotBetween(String value1, String value2) {
            addCriterion("qq_number not between", value1, value2, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsIsNull() {
            addCriterion("graduate_institutions is null");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsIsNotNull() {
            addCriterion("graduate_institutions is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsEqualTo(String value) {
            addCriterion("graduate_institutions =", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsNotEqualTo(String value) {
            addCriterion("graduate_institutions <>", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsGreaterThan(String value) {
            addCriterion("graduate_institutions >", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_institutions >=", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsLessThan(String value) {
            addCriterion("graduate_institutions <", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsLessThanOrEqualTo(String value) {
            addCriterion("graduate_institutions <=", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsLike(String value) {
            addCriterion("graduate_institutions like", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsNotLike(String value) {
            addCriterion("graduate_institutions not like", value, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsIn(List<String> values) {
            addCriterion("graduate_institutions in", values, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsNotIn(List<String> values) {
            addCriterion("graduate_institutions not in", values, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsBetween(String value1, String value2) {
            addCriterion("graduate_institutions between", value1, value2, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionsNotBetween(String value1, String value2) {
            addCriterion("graduate_institutions not between", value1, value2, "graduateInstitutions");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceIsNull() {
            addCriterion("present_work_place is null");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceIsNotNull() {
            addCriterion("present_work_place is not null");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceEqualTo(String value) {
            addCriterion("present_work_place =", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceNotEqualTo(String value) {
            addCriterion("present_work_place <>", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceGreaterThan(String value) {
            addCriterion("present_work_place >", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("present_work_place >=", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceLessThan(String value) {
            addCriterion("present_work_place <", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("present_work_place <=", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceLike(String value) {
            addCriterion("present_work_place like", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceNotLike(String value) {
            addCriterion("present_work_place not like", value, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceIn(List<String> values) {
            addCriterion("present_work_place in", values, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceNotIn(List<String> values) {
            addCriterion("present_work_place not in", values, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceBetween(String value1, String value2) {
            addCriterion("present_work_place between", value1, value2, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andPresentWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("present_work_place not between", value1, value2, "presentWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceIsNull() {
            addCriterion("desired_work_place is null");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceIsNotNull() {
            addCriterion("desired_work_place is not null");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceEqualTo(String value) {
            addCriterion("desired_work_place =", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceNotEqualTo(String value) {
            addCriterion("desired_work_place <>", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceGreaterThan(String value) {
            addCriterion("desired_work_place >", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("desired_work_place >=", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceLessThan(String value) {
            addCriterion("desired_work_place <", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("desired_work_place <=", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceLike(String value) {
            addCriterion("desired_work_place like", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceNotLike(String value) {
            addCriterion("desired_work_place not like", value, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceIn(List<String> values) {
            addCriterion("desired_work_place in", values, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceNotIn(List<String> values) {
            addCriterion("desired_work_place not in", values, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceBetween(String value1, String value2) {
            addCriterion("desired_work_place between", value1, value2, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andDesiredWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("desired_work_place not between", value1, value2, "desiredWorkPlace");
            return (Criteria) this;
        }

        public Criteria andJobWantedIsNull() {
            addCriterion("job_wanted is null");
            return (Criteria) this;
        }

        public Criteria andJobWantedIsNotNull() {
            addCriterion("job_wanted is not null");
            return (Criteria) this;
        }

        public Criteria andJobWantedEqualTo(String value) {
            addCriterion("job_wanted =", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedNotEqualTo(String value) {
            addCriterion("job_wanted <>", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedGreaterThan(String value) {
            addCriterion("job_wanted >", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedGreaterThanOrEqualTo(String value) {
            addCriterion("job_wanted >=", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedLessThan(String value) {
            addCriterion("job_wanted <", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedLessThanOrEqualTo(String value) {
            addCriterion("job_wanted <=", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedLike(String value) {
            addCriterion("job_wanted like", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedNotLike(String value) {
            addCriterion("job_wanted not like", value, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedIn(List<String> values) {
            addCriterion("job_wanted in", values, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedNotIn(List<String> values) {
            addCriterion("job_wanted not in", values, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedBetween(String value1, String value2) {
            addCriterion("job_wanted between", value1, value2, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andJobWantedNotBetween(String value1, String value2) {
            addCriterion("job_wanted not between", value1, value2, "jobWanted");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentIsNull() {
            addCriterion("oversea_assignment is null");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentIsNotNull() {
            addCriterion("oversea_assignment is not null");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentEqualTo(String value) {
            addCriterion("oversea_assignment =", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentNotEqualTo(String value) {
            addCriterion("oversea_assignment <>", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentGreaterThan(String value) {
            addCriterion("oversea_assignment >", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentGreaterThanOrEqualTo(String value) {
            addCriterion("oversea_assignment >=", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentLessThan(String value) {
            addCriterion("oversea_assignment <", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentLessThanOrEqualTo(String value) {
            addCriterion("oversea_assignment <=", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentLike(String value) {
            addCriterion("oversea_assignment like", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentNotLike(String value) {
            addCriterion("oversea_assignment not like", value, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentIn(List<String> values) {
            addCriterion("oversea_assignment in", values, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentNotIn(List<String> values) {
            addCriterion("oversea_assignment not in", values, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentBetween(String value1, String value2) {
            addCriterion("oversea_assignment between", value1, value2, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andOverseaAssignmentNotBetween(String value1, String value2) {
            addCriterion("oversea_assignment not between", value1, value2, "overseaAssignment");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("specialty like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("specialty not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialIsNull() {
            addCriterion("other_special is null");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialIsNotNull() {
            addCriterion("other_special is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialEqualTo(String value) {
            addCriterion("other_special =", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialNotEqualTo(String value) {
            addCriterion("other_special <>", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialGreaterThan(String value) {
            addCriterion("other_special >", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("other_special >=", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialLessThan(String value) {
            addCriterion("other_special <", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialLessThanOrEqualTo(String value) {
            addCriterion("other_special <=", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialLike(String value) {
            addCriterion("other_special like", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialNotLike(String value) {
            addCriterion("other_special not like", value, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialIn(List<String> values) {
            addCriterion("other_special in", values, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialNotIn(List<String> values) {
            addCriterion("other_special not in", values, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialBetween(String value1, String value2) {
            addCriterion("other_special between", value1, value2, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andOtherSpecialNotBetween(String value1, String value2) {
            addCriterion("other_special not between", value1, value2, "otherSpecial");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentIsNull() {
            addCriterion("resume_attachment is null");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentIsNotNull() {
            addCriterion("resume_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentEqualTo(String value) {
            addCriterion("resume_attachment =", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentNotEqualTo(String value) {
            addCriterion("resume_attachment <>", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentGreaterThan(String value) {
            addCriterion("resume_attachment >", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("resume_attachment >=", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentLessThan(String value) {
            addCriterion("resume_attachment <", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentLessThanOrEqualTo(String value) {
            addCriterion("resume_attachment <=", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentLike(String value) {
            addCriterion("resume_attachment like", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentNotLike(String value) {
            addCriterion("resume_attachment not like", value, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentIn(List<String> values) {
            addCriterion("resume_attachment in", values, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentNotIn(List<String> values) {
            addCriterion("resume_attachment not in", values, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentBetween(String value1, String value2) {
            addCriterion("resume_attachment between", value1, value2, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andResumeAttachmentNotBetween(String value1, String value2) {
            addCriterion("resume_attachment not between", value1, value2, "resumeAttachment");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationIsNull() {
            addCriterion("perfec_information is null");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationIsNotNull() {
            addCriterion("perfec_information is not null");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationEqualTo(String value) {
            addCriterion("perfec_information =", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationNotEqualTo(String value) {
            addCriterion("perfec_information <>", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationGreaterThan(String value) {
            addCriterion("perfec_information >", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationGreaterThanOrEqualTo(String value) {
            addCriterion("perfec_information >=", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationLessThan(String value) {
            addCriterion("perfec_information <", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationLessThanOrEqualTo(String value) {
            addCriterion("perfec_information <=", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationLike(String value) {
            addCriterion("perfec_information like", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationNotLike(String value) {
            addCriterion("perfec_information not like", value, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationIn(List<String> values) {
            addCriterion("perfec_information in", values, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationNotIn(List<String> values) {
            addCriterion("perfec_information not in", values, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationBetween(String value1, String value2) {
            addCriterion("perfec_information between", value1, value2, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andPerfecInformationNotBetween(String value1, String value2) {
            addCriterion("perfec_information not between", value1, value2, "perfecInformation");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}