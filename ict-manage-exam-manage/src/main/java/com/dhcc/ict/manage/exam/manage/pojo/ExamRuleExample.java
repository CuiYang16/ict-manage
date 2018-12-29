package com.dhcc.ict.manage.exam.manage.pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andJurgeCountIsNull() {
            addCriterion("jurge_count is null");
            return (Criteria) this;
        }

        public Criteria andJurgeCountIsNotNull() {
            addCriterion("jurge_count is not null");
            return (Criteria) this;
        }

        public Criteria andJurgeCountEqualTo(Integer value) {
            addCriterion("jurge_count =", value, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountNotEqualTo(Integer value) {
            addCriterion("jurge_count <>", value, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountGreaterThan(Integer value) {
            addCriterion("jurge_count >", value, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("jurge_count >=", value, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountLessThan(Integer value) {
            addCriterion("jurge_count <", value, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountLessThanOrEqualTo(Integer value) {
            addCriterion("jurge_count <=", value, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountIn(List<Integer> values) {
            addCriterion("jurge_count in", values, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountNotIn(List<Integer> values) {
            addCriterion("jurge_count not in", values, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountBetween(Integer value1, Integer value2) {
            addCriterion("jurge_count between", value1, value2, "jurgeCount");
            return (Criteria) this;
        }

        public Criteria andJurgeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("jurge_count not between", value1, value2, "jurgeCount");
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

        public Criteria andExamComplexityIsNull() {
            addCriterion("exam_complexity is null");
            return (Criteria) this;
        }

        public Criteria andExamComplexityIsNotNull() {
            addCriterion("exam_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andExamComplexityEqualTo(String value) {
            addCriterion("exam_complexity =", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityNotEqualTo(String value) {
            addCriterion("exam_complexity <>", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityGreaterThan(String value) {
            addCriterion("exam_complexity >", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("exam_complexity >=", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityLessThan(String value) {
            addCriterion("exam_complexity <", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityLessThanOrEqualTo(String value) {
            addCriterion("exam_complexity <=", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityLike(String value) {
            addCriterion("exam_complexity like", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityNotLike(String value) {
            addCriterion("exam_complexity not like", value, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityIn(List<String> values) {
            addCriterion("exam_complexity in", values, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityNotIn(List<String> values) {
            addCriterion("exam_complexity not in", values, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityBetween(String value1, String value2) {
            addCriterion("exam_complexity between", value1, value2, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andExamComplexityNotBetween(String value1, String value2) {
            addCriterion("exam_complexity not between", value1, value2, "examComplexity");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(Date value) {
            addCriterion("valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(Date value) {
            addCriterion("valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(Date value) {
            addCriterion("valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(Date value) {
            addCriterion("valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(Date value) {
            addCriterion("valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<Date> values) {
            addCriterion("valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<Date> values) {
            addCriterion("valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(Date value1, Date value2) {
            addCriterion("valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(Date value1, Date value2) {
            addCriterion("valid_time not between", value1, value2, "validTime");
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