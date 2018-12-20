package com.dhcc.ict.manage.questionbank.pojo;

import java.util.ArrayList;
import java.util.List;

public class TechnologyJudgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyJudgeExample() {
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

        public Criteria andTechnologyJudgeIdIsNull() {
            addCriterion("technology_judge_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdIsNotNull() {
            addCriterion("technology_judge_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdEqualTo(Integer value) {
            addCriterion("technology_judge_id =", value, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdNotEqualTo(Integer value) {
            addCriterion("technology_judge_id <>", value, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdGreaterThan(Integer value) {
            addCriterion("technology_judge_id >", value, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("technology_judge_id >=", value, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdLessThan(Integer value) {
            addCriterion("technology_judge_id <", value, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("technology_judge_id <=", value, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdIn(List<Integer> values) {
            addCriterion("technology_judge_id in", values, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdNotIn(List<Integer> values) {
            addCriterion("technology_judge_id not in", values, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdBetween(Integer value1, Integer value2) {
            addCriterion("technology_judge_id between", value1, value2, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("technology_judge_id not between", value1, value2, "technologyJudgeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailIsNull() {
            addCriterion("technology_judge_detail is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailIsNotNull() {
            addCriterion("technology_judge_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailEqualTo(String value) {
            addCriterion("technology_judge_detail =", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailNotEqualTo(String value) {
            addCriterion("technology_judge_detail <>", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailGreaterThan(String value) {
            addCriterion("technology_judge_detail >", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("technology_judge_detail >=", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailLessThan(String value) {
            addCriterion("technology_judge_detail <", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailLessThanOrEqualTo(String value) {
            addCriterion("technology_judge_detail <=", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailLike(String value) {
            addCriterion("technology_judge_detail like", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailNotLike(String value) {
            addCriterion("technology_judge_detail not like", value, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailIn(List<String> values) {
            addCriterion("technology_judge_detail in", values, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailNotIn(List<String> values) {
            addCriterion("technology_judge_detail not in", values, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailBetween(String value1, String value2) {
            addCriterion("technology_judge_detail between", value1, value2, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeDetailNotBetween(String value1, String value2) {
            addCriterion("technology_judge_detail not between", value1, value2, "technologyJudgeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerIsNull() {
            addCriterion("technology_judge_true_answer is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerIsNotNull() {
            addCriterion("technology_judge_true_answer is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerEqualTo(String value) {
            addCriterion("technology_judge_true_answer =", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerNotEqualTo(String value) {
            addCriterion("technology_judge_true_answer <>", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerGreaterThan(String value) {
            addCriterion("technology_judge_true_answer >", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("technology_judge_true_answer >=", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerLessThan(String value) {
            addCriterion("technology_judge_true_answer <", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerLessThanOrEqualTo(String value) {
            addCriterion("technology_judge_true_answer <=", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerLike(String value) {
            addCriterion("technology_judge_true_answer like", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerNotLike(String value) {
            addCriterion("technology_judge_true_answer not like", value, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerIn(List<String> values) {
            addCriterion("technology_judge_true_answer in", values, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerNotIn(List<String> values) {
            addCriterion("technology_judge_true_answer not in", values, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerBetween(String value1, String value2) {
            addCriterion("technology_judge_true_answer between", value1, value2, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeTrueAnswerNotBetween(String value1, String value2) {
            addCriterion("technology_judge_true_answer not between", value1, value2, "technologyJudgeTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityIsNull() {
            addCriterion("technology_judge_complexity is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityIsNotNull() {
            addCriterion("technology_judge_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityEqualTo(String value) {
            addCriterion("technology_judge_complexity =", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityNotEqualTo(String value) {
            addCriterion("technology_judge_complexity <>", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityGreaterThan(String value) {
            addCriterion("technology_judge_complexity >", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("technology_judge_complexity >=", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityLessThan(String value) {
            addCriterion("technology_judge_complexity <", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityLessThanOrEqualTo(String value) {
            addCriterion("technology_judge_complexity <=", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityLike(String value) {
            addCriterion("technology_judge_complexity like", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityNotLike(String value) {
            addCriterion("technology_judge_complexity not like", value, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityIn(List<String> values) {
            addCriterion("technology_judge_complexity in", values, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityNotIn(List<String> values) {
            addCriterion("technology_judge_complexity not in", values, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityBetween(String value1, String value2) {
            addCriterion("technology_judge_complexity between", value1, value2, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyJudgeComplexityNotBetween(String value1, String value2) {
            addCriterion("technology_judge_complexity not between", value1, value2, "technologyJudgeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdIsNull() {
            addCriterion("technology_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdIsNotNull() {
            addCriterion("technology_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdEqualTo(Integer value) {
            addCriterion("technology_type_id =", value, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdNotEqualTo(Integer value) {
            addCriterion("technology_type_id <>", value, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdGreaterThan(Integer value) {
            addCriterion("technology_type_id >", value, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("technology_type_id >=", value, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdLessThan(Integer value) {
            addCriterion("technology_type_id <", value, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("technology_type_id <=", value, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdIn(List<Integer> values) {
            addCriterion("technology_type_id in", values, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdNotIn(List<Integer> values) {
            addCriterion("technology_type_id not in", values, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("technology_type_id between", value1, value2, "technologyTypeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("technology_type_id not between", value1, value2, "technologyTypeId");
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