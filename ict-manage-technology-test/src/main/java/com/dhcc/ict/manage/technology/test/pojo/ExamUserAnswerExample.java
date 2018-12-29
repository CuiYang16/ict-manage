package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExamUserAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamUserAnswerExample() {
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

        public Criteria andUserAnswerIdIsNull() {
            addCriterion("user_answer_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdIsNotNull() {
            addCriterion("user_answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdEqualTo(Integer value) {
            addCriterion("user_answer_id =", value, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdNotEqualTo(Integer value) {
            addCriterion("user_answer_id <>", value, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdGreaterThan(Integer value) {
            addCriterion("user_answer_id >", value, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_answer_id >=", value, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdLessThan(Integer value) {
            addCriterion("user_answer_id <", value, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_answer_id <=", value, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdIn(List<Integer> values) {
            addCriterion("user_answer_id in", values, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdNotIn(List<Integer> values) {
            addCriterion("user_answer_id not in", values, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("user_answer_id between", value1, value2, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_answer_id not between", value1, value2, "userAnswerId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNull() {
            addCriterion("question_type_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNotNull() {
            addCriterion("question_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdEqualTo(String value) {
            addCriterion("question_type_id =", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotEqualTo(String value) {
            addCriterion("question_type_id <>", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThan(String value) {
            addCriterion("question_type_id >", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_type_id >=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThan(String value) {
            addCriterion("question_type_id <", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThanOrEqualTo(String value) {
            addCriterion("question_type_id <=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLike(String value) {
            addCriterion("question_type_id like", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotLike(String value) {
            addCriterion("question_type_id not like", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIn(List<String> values) {
            addCriterion("question_type_id in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotIn(List<String> values) {
            addCriterion("question_type_id not in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdBetween(String value1, String value2) {
            addCriterion("question_type_id between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotBetween(String value1, String value2) {
            addCriterion("question_type_id not between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIsNull() {
            addCriterion("user_answer is null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIsNotNull() {
            addCriterion("user_answer is not null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerEqualTo(String value) {
            addCriterion("user_answer =", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotEqualTo(String value) {
            addCriterion("user_answer <>", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerGreaterThan(String value) {
            addCriterion("user_answer >", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("user_answer >=", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLessThan(String value) {
            addCriterion("user_answer <", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLessThanOrEqualTo(String value) {
            addCriterion("user_answer <=", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLike(String value) {
            addCriterion("user_answer like", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotLike(String value) {
            addCriterion("user_answer not like", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIn(List<String> values) {
            addCriterion("user_answer in", values, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotIn(List<String> values) {
            addCriterion("user_answer not in", values, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerBetween(String value1, String value2) {
            addCriterion("user_answer between", value1, value2, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotBetween(String value1, String value2) {
            addCriterion("user_answer not between", value1, value2, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightIsNull() {
            addCriterion("user_answer_right is null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightIsNotNull() {
            addCriterion("user_answer_right is not null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightEqualTo(String value) {
            addCriterion("user_answer_right =", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightNotEqualTo(String value) {
            addCriterion("user_answer_right <>", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightGreaterThan(String value) {
            addCriterion("user_answer_right >", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightGreaterThanOrEqualTo(String value) {
            addCriterion("user_answer_right >=", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightLessThan(String value) {
            addCriterion("user_answer_right <", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightLessThanOrEqualTo(String value) {
            addCriterion("user_answer_right <=", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightLike(String value) {
            addCriterion("user_answer_right like", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightNotLike(String value) {
            addCriterion("user_answer_right not like", value, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightIn(List<String> values) {
            addCriterion("user_answer_right in", values, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightNotIn(List<String> values) {
            addCriterion("user_answer_right not in", values, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightBetween(String value1, String value2) {
            addCriterion("user_answer_right between", value1, value2, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andUserAnswerRightNotBetween(String value1, String value2) {
            addCriterion("user_answer_right not between", value1, value2, "userAnswerRight");
            return (Criteria) this;
        }

        public Criteria andPaperFlagIsNull() {
            addCriterion("paper_flag is null");
            return (Criteria) this;
        }

        public Criteria andPaperFlagIsNotNull() {
            addCriterion("paper_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPaperFlagEqualTo(String value) {
            addCriterion("paper_flag =", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotEqualTo(String value) {
            addCriterion("paper_flag <>", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagGreaterThan(String value) {
            addCriterion("paper_flag >", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagGreaterThanOrEqualTo(String value) {
            addCriterion("paper_flag >=", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagLessThan(String value) {
            addCriterion("paper_flag <", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagLessThanOrEqualTo(String value) {
            addCriterion("paper_flag <=", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagLike(String value) {
            addCriterion("paper_flag like", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotLike(String value) {
            addCriterion("paper_flag not like", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagIn(List<String> values) {
            addCriterion("paper_flag in", values, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotIn(List<String> values) {
            addCriterion("paper_flag not in", values, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagBetween(String value1, String value2) {
            addCriterion("paper_flag between", value1, value2, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotBetween(String value1, String value2) {
            addCriterion("paper_flag not between", value1, value2, "paperFlag");
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