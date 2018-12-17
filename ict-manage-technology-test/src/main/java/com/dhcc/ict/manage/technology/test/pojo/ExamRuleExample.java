package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExamRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamRuleExample() {
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

        public Criteria andExamRuleIdIsNull() {
            addCriterion("exam_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdIsNotNull() {
            addCriterion("exam_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdEqualTo(Integer value) {
            addCriterion("exam_rule_id =", value, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdNotEqualTo(Integer value) {
            addCriterion("exam_rule_id <>", value, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdGreaterThan(Integer value) {
            addCriterion("exam_rule_id >", value, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_rule_id >=", value, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdLessThan(Integer value) {
            addCriterion("exam_rule_id <", value, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_rule_id <=", value, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdIn(List<Integer> values) {
            addCriterion("exam_rule_id in", values, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdNotIn(List<Integer> values) {
            addCriterion("exam_rule_id not in", values, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_rule_id between", value1, value2, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_rule_id not between", value1, value2, "examRuleId");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameIsNull() {
            addCriterion("exam_rule_name is null");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameIsNotNull() {
            addCriterion("exam_rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameEqualTo(String value) {
            addCriterion("exam_rule_name =", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameNotEqualTo(String value) {
            addCriterion("exam_rule_name <>", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameGreaterThan(String value) {
            addCriterion("exam_rule_name >", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_rule_name >=", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameLessThan(String value) {
            addCriterion("exam_rule_name <", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameLessThanOrEqualTo(String value) {
            addCriterion("exam_rule_name <=", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameLike(String value) {
            addCriterion("exam_rule_name like", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameNotLike(String value) {
            addCriterion("exam_rule_name not like", value, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameIn(List<String> values) {
            addCriterion("exam_rule_name in", values, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameNotIn(List<String> values) {
            addCriterion("exam_rule_name not in", values, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameBetween(String value1, String value2) {
            addCriterion("exam_rule_name between", value1, value2, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andExamRuleNameNotBetween(String value1, String value2) {
            addCriterion("exam_rule_name not between", value1, value2, "examRuleName");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountIsNull() {
            addCriterion("choose_one_count is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountIsNotNull() {
            addCriterion("choose_one_count is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountEqualTo(Integer value) {
            addCriterion("choose_one_count =", value, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountNotEqualTo(Integer value) {
            addCriterion("choose_one_count <>", value, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountGreaterThan(Integer value) {
            addCriterion("choose_one_count >", value, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_one_count >=", value, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountLessThan(Integer value) {
            addCriterion("choose_one_count <", value, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountLessThanOrEqualTo(Integer value) {
            addCriterion("choose_one_count <=", value, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountIn(List<Integer> values) {
            addCriterion("choose_one_count in", values, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountNotIn(List<Integer> values) {
            addCriterion("choose_one_count not in", values, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountBetween(Integer value1, Integer value2) {
            addCriterion("choose_one_count between", value1, value2, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseOneCountNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_one_count not between", value1, value2, "chooseOneCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountIsNull() {
            addCriterion("choose_much_count is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountIsNotNull() {
            addCriterion("choose_much_count is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountEqualTo(Integer value) {
            addCriterion("choose_much_count =", value, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountNotEqualTo(Integer value) {
            addCriterion("choose_much_count <>", value, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountGreaterThan(Integer value) {
            addCriterion("choose_much_count >", value, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_much_count >=", value, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountLessThan(Integer value) {
            addCriterion("choose_much_count <", value, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountLessThanOrEqualTo(Integer value) {
            addCriterion("choose_much_count <=", value, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountIn(List<Integer> values) {
            addCriterion("choose_much_count in", values, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountNotIn(List<Integer> values) {
            addCriterion("choose_much_count not in", values, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountBetween(Integer value1, Integer value2) {
            addCriterion("choose_much_count between", value1, value2, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseMuchCountNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_much_count not between", value1, value2, "chooseMuchCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountIsNull() {
            addCriterion("choose_jurge_count is null");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountIsNotNull() {
            addCriterion("choose_jurge_count is not null");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountEqualTo(Integer value) {
            addCriterion("choose_jurge_count =", value, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountNotEqualTo(Integer value) {
            addCriterion("choose_jurge_count <>", value, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountGreaterThan(Integer value) {
            addCriterion("choose_jurge_count >", value, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_jurge_count >=", value, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountLessThan(Integer value) {
            addCriterion("choose_jurge_count <", value, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountLessThanOrEqualTo(Integer value) {
            addCriterion("choose_jurge_count <=", value, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountIn(List<Integer> values) {
            addCriterion("choose_jurge_count in", values, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountNotIn(List<Integer> values) {
            addCriterion("choose_jurge_count not in", values, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountBetween(Integer value1, Integer value2) {
            addCriterion("choose_jurge_count between", value1, value2, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_jurge_count not between", value1, value2, "chooseJurgeCount");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("exam_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(Integer value) {
            addCriterion("exam_time =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(Integer value) {
            addCriterion("exam_time <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(Integer value) {
            addCriterion("exam_time >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_time >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(Integer value) {
            addCriterion("exam_time <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(Integer value) {
            addCriterion("exam_time <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<Integer> values) {
            addCriterion("exam_time in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<Integer> values) {
            addCriterion("exam_time not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(Integer value1, Integer value2) {
            addCriterion("exam_time between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_time not between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdIsNull() {
            addCriterion("interviewer_id is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdIsNotNull() {
            addCriterion("interviewer_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdEqualTo(Integer value) {
            addCriterion("interviewer_id =", value, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdNotEqualTo(Integer value) {
            addCriterion("interviewer_id <>", value, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdGreaterThan(Integer value) {
            addCriterion("interviewer_id >", value, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("interviewer_id >=", value, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdLessThan(Integer value) {
            addCriterion("interviewer_id <", value, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdLessThanOrEqualTo(Integer value) {
            addCriterion("interviewer_id <=", value, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdIn(List<Integer> values) {
            addCriterion("interviewer_id in", values, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdNotIn(List<Integer> values) {
            addCriterion("interviewer_id not in", values, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdBetween(Integer value1, Integer value2) {
            addCriterion("interviewer_id between", value1, value2, "interviewerId");
            return (Criteria) this;
        }

        public Criteria andInterviewerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("interviewer_id not between", value1, value2, "interviewerId");
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