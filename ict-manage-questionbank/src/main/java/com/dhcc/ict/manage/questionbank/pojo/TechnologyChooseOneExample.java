package com.dhcc.ict.manage.questionbank.pojo;

import java.util.ArrayList;
import java.util.List;

public class TechnologyChooseOneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyChooseOneExample() {
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

        public Criteria andChooseOneIdIsNull() {
            addCriterion("choose_one_id is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdIsNotNull() {
            addCriterion("choose_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdEqualTo(Integer value) {
            addCriterion("choose_one_id =", value, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdNotEqualTo(Integer value) {
            addCriterion("choose_one_id <>", value, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdGreaterThan(Integer value) {
            addCriterion("choose_one_id >", value, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_one_id >=", value, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdLessThan(Integer value) {
            addCriterion("choose_one_id <", value, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdLessThanOrEqualTo(Integer value) {
            addCriterion("choose_one_id <=", value, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdIn(List<Integer> values) {
            addCriterion("choose_one_id in", values, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdNotIn(List<Integer> values) {
            addCriterion("choose_one_id not in", values, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdBetween(Integer value1, Integer value2) {
            addCriterion("choose_one_id between", value1, value2, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_one_id not between", value1, value2, "chooseOneId");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailIsNull() {
            addCriterion("choose_one_detail is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailIsNotNull() {
            addCriterion("choose_one_detail is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailEqualTo(String value) {
            addCriterion("choose_one_detail =", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailNotEqualTo(String value) {
            addCriterion("choose_one_detail <>", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailGreaterThan(String value) {
            addCriterion("choose_one_detail >", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailGreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_detail >=", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailLessThan(String value) {
            addCriterion("choose_one_detail <", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailLessThanOrEqualTo(String value) {
            addCriterion("choose_one_detail <=", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailLike(String value) {
            addCriterion("choose_one_detail like", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailNotLike(String value) {
            addCriterion("choose_one_detail not like", value, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailIn(List<String> values) {
            addCriterion("choose_one_detail in", values, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailNotIn(List<String> values) {
            addCriterion("choose_one_detail not in", values, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailBetween(String value1, String value2) {
            addCriterion("choose_one_detail between", value1, value2, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneDetailNotBetween(String value1, String value2) {
            addCriterion("choose_one_detail not between", value1, value2, "chooseOneDetail");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1IsNull() {
            addCriterion("choose_one_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1IsNotNull() {
            addCriterion("choose_one_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1EqualTo(String value) {
            addCriterion("choose_one_answer1 =", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1NotEqualTo(String value) {
            addCriterion("choose_one_answer1 <>", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1GreaterThan(String value) {
            addCriterion("choose_one_answer1 >", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_answer1 >=", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1LessThan(String value) {
            addCriterion("choose_one_answer1 <", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1LessThanOrEqualTo(String value) {
            addCriterion("choose_one_answer1 <=", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1Like(String value) {
            addCriterion("choose_one_answer1 like", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1NotLike(String value) {
            addCriterion("choose_one_answer1 not like", value, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1In(List<String> values) {
            addCriterion("choose_one_answer1 in", values, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1NotIn(List<String> values) {
            addCriterion("choose_one_answer1 not in", values, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1Between(String value1, String value2) {
            addCriterion("choose_one_answer1 between", value1, value2, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer1NotBetween(String value1, String value2) {
            addCriterion("choose_one_answer1 not between", value1, value2, "chooseOneAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2IsNull() {
            addCriterion("choose_one_answer2 is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2IsNotNull() {
            addCriterion("choose_one_answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2EqualTo(String value) {
            addCriterion("choose_one_answer2 =", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2NotEqualTo(String value) {
            addCriterion("choose_one_answer2 <>", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2GreaterThan(String value) {
            addCriterion("choose_one_answer2 >", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_answer2 >=", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2LessThan(String value) {
            addCriterion("choose_one_answer2 <", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2LessThanOrEqualTo(String value) {
            addCriterion("choose_one_answer2 <=", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2Like(String value) {
            addCriterion("choose_one_answer2 like", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2NotLike(String value) {
            addCriterion("choose_one_answer2 not like", value, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2In(List<String> values) {
            addCriterion("choose_one_answer2 in", values, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2NotIn(List<String> values) {
            addCriterion("choose_one_answer2 not in", values, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2Between(String value1, String value2) {
            addCriterion("choose_one_answer2 between", value1, value2, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer2NotBetween(String value1, String value2) {
            addCriterion("choose_one_answer2 not between", value1, value2, "chooseOneAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3IsNull() {
            addCriterion("choose_one_answer3 is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3IsNotNull() {
            addCriterion("choose_one_answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3EqualTo(String value) {
            addCriterion("choose_one_answer3 =", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3NotEqualTo(String value) {
            addCriterion("choose_one_answer3 <>", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3GreaterThan(String value) {
            addCriterion("choose_one_answer3 >", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_answer3 >=", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3LessThan(String value) {
            addCriterion("choose_one_answer3 <", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3LessThanOrEqualTo(String value) {
            addCriterion("choose_one_answer3 <=", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3Like(String value) {
            addCriterion("choose_one_answer3 like", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3NotLike(String value) {
            addCriterion("choose_one_answer3 not like", value, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3In(List<String> values) {
            addCriterion("choose_one_answer3 in", values, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3NotIn(List<String> values) {
            addCriterion("choose_one_answer3 not in", values, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3Between(String value1, String value2) {
            addCriterion("choose_one_answer3 between", value1, value2, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer3NotBetween(String value1, String value2) {
            addCriterion("choose_one_answer3 not between", value1, value2, "chooseOneAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4IsNull() {
            addCriterion("choose_one_answer4 is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4IsNotNull() {
            addCriterion("choose_one_answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4EqualTo(String value) {
            addCriterion("choose_one_answer4 =", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4NotEqualTo(String value) {
            addCriterion("choose_one_answer4 <>", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4GreaterThan(String value) {
            addCriterion("choose_one_answer4 >", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4GreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_answer4 >=", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4LessThan(String value) {
            addCriterion("choose_one_answer4 <", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4LessThanOrEqualTo(String value) {
            addCriterion("choose_one_answer4 <=", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4Like(String value) {
            addCriterion("choose_one_answer4 like", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4NotLike(String value) {
            addCriterion("choose_one_answer4 not like", value, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4In(List<String> values) {
            addCriterion("choose_one_answer4 in", values, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4NotIn(List<String> values) {
            addCriterion("choose_one_answer4 not in", values, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4Between(String value1, String value2) {
            addCriterion("choose_one_answer4 between", value1, value2, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneAnswer4NotBetween(String value1, String value2) {
            addCriterion("choose_one_answer4 not between", value1, value2, "chooseOneAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerIsNull() {
            addCriterion("choose_one_true_answer is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerIsNotNull() {
            addCriterion("choose_one_true_answer is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerEqualTo(String value) {
            addCriterion("choose_one_true_answer =", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerNotEqualTo(String value) {
            addCriterion("choose_one_true_answer <>", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerGreaterThan(String value) {
            addCriterion("choose_one_true_answer >", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_true_answer >=", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerLessThan(String value) {
            addCriterion("choose_one_true_answer <", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerLessThanOrEqualTo(String value) {
            addCriterion("choose_one_true_answer <=", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerLike(String value) {
            addCriterion("choose_one_true_answer like", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerNotLike(String value) {
            addCriterion("choose_one_true_answer not like", value, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerIn(List<String> values) {
            addCriterion("choose_one_true_answer in", values, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerNotIn(List<String> values) {
            addCriterion("choose_one_true_answer not in", values, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerBetween(String value1, String value2) {
            addCriterion("choose_one_true_answer between", value1, value2, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneTrueAnswerNotBetween(String value1, String value2) {
            addCriterion("choose_one_true_answer not between", value1, value2, "chooseOneTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityIsNull() {
            addCriterion("choose_one_complexity is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityIsNotNull() {
            addCriterion("choose_one_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityEqualTo(String value) {
            addCriterion("choose_one_complexity =", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityNotEqualTo(String value) {
            addCriterion("choose_one_complexity <>", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityGreaterThan(String value) {
            addCriterion("choose_one_complexity >", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("choose_one_complexity >=", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityLessThan(String value) {
            addCriterion("choose_one_complexity <", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityLessThanOrEqualTo(String value) {
            addCriterion("choose_one_complexity <=", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityLike(String value) {
            addCriterion("choose_one_complexity like", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityNotLike(String value) {
            addCriterion("choose_one_complexity not like", value, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityIn(List<String> values) {
            addCriterion("choose_one_complexity in", values, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityNotIn(List<String> values) {
            addCriterion("choose_one_complexity not in", values, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityBetween(String value1, String value2) {
            addCriterion("choose_one_complexity between", value1, value2, "chooseOneComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseOneComplexityNotBetween(String value1, String value2) {
            addCriterion("choose_one_complexity not between", value1, value2, "chooseOneComplexity");
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