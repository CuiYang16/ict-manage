package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class TechnologyCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyCodeExample() {
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

        public Criteria andTechnologyCodeIdIsNull() {
            addCriterion("technology_code_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdIsNotNull() {
            addCriterion("technology_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdEqualTo(Integer value) {
            addCriterion("technology_code_id =", value, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdNotEqualTo(Integer value) {
            addCriterion("technology_code_id <>", value, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdGreaterThan(Integer value) {
            addCriterion("technology_code_id >", value, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("technology_code_id >=", value, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdLessThan(Integer value) {
            addCriterion("technology_code_id <", value, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("technology_code_id <=", value, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdIn(List<Integer> values) {
            addCriterion("technology_code_id in", values, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdNotIn(List<Integer> values) {
            addCriterion("technology_code_id not in", values, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("technology_code_id between", value1, value2, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("technology_code_id not between", value1, value2, "technologyCodeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailIsNull() {
            addCriterion("technology_code_detail is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailIsNotNull() {
            addCriterion("technology_code_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailEqualTo(String value) {
            addCriterion("technology_code_detail =", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailNotEqualTo(String value) {
            addCriterion("technology_code_detail <>", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailGreaterThan(String value) {
            addCriterion("technology_code_detail >", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("technology_code_detail >=", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailLessThan(String value) {
            addCriterion("technology_code_detail <", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailLessThanOrEqualTo(String value) {
            addCriterion("technology_code_detail <=", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailLike(String value) {
            addCriterion("technology_code_detail like", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailNotLike(String value) {
            addCriterion("technology_code_detail not like", value, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailIn(List<String> values) {
            addCriterion("technology_code_detail in", values, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailNotIn(List<String> values) {
            addCriterion("technology_code_detail not in", values, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailBetween(String value1, String value2) {
            addCriterion("technology_code_detail between", value1, value2, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeDetailNotBetween(String value1, String value2) {
            addCriterion("technology_code_detail not between", value1, value2, "technologyCodeDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityIsNull() {
            addCriterion("technology_code_complexity is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityIsNotNull() {
            addCriterion("technology_code_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityEqualTo(String value) {
            addCriterion("technology_code_complexity =", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityNotEqualTo(String value) {
            addCriterion("technology_code_complexity <>", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityGreaterThan(String value) {
            addCriterion("technology_code_complexity >", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("technology_code_complexity >=", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityLessThan(String value) {
            addCriterion("technology_code_complexity <", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityLessThanOrEqualTo(String value) {
            addCriterion("technology_code_complexity <=", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityLike(String value) {
            addCriterion("technology_code_complexity like", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityNotLike(String value) {
            addCriterion("technology_code_complexity not like", value, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityIn(List<String> values) {
            addCriterion("technology_code_complexity in", values, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityNotIn(List<String> values) {
            addCriterion("technology_code_complexity not in", values, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityBetween(String value1, String value2) {
            addCriterion("technology_code_complexity between", value1, value2, "technologyCodeComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyCodeComplexityNotBetween(String value1, String value2) {
            addCriterion("technology_code_complexity not between", value1, value2, "technologyCodeComplexity");
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