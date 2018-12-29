package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExamPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamPaperExample() {
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

        public Criteria andExamPaperIdIsNull() {
            addCriterion("exam_paper_id is null");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdIsNotNull() {
            addCriterion("exam_paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdEqualTo(Integer value) {
            addCriterion("exam_paper_id =", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdNotEqualTo(Integer value) {
            addCriterion("exam_paper_id <>", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdGreaterThan(Integer value) {
            addCriterion("exam_paper_id >", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_paper_id >=", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdLessThan(Integer value) {
            addCriterion("exam_paper_id <", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_paper_id <=", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdIn(List<Integer> values) {
            addCriterion("exam_paper_id in", values, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdNotIn(List<Integer> values) {
            addCriterion("exam_paper_id not in", values, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_paper_id between", value1, value2, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_paper_id not between", value1, value2, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerIsNull() {
            addCriterion("question_true_answer is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerIsNotNull() {
            addCriterion("question_true_answer is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerEqualTo(String value) {
            addCriterion("question_true_answer =", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerNotEqualTo(String value) {
            addCriterion("question_true_answer <>", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerGreaterThan(String value) {
            addCriterion("question_true_answer >", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("question_true_answer >=", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerLessThan(String value) {
            addCriterion("question_true_answer <", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerLessThanOrEqualTo(String value) {
            addCriterion("question_true_answer <=", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerLike(String value) {
            addCriterion("question_true_answer like", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerNotLike(String value) {
            addCriterion("question_true_answer not like", value, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerIn(List<String> values) {
            addCriterion("question_true_answer in", values, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerNotIn(List<String> values) {
            addCriterion("question_true_answer not in", values, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerBetween(String value1, String value2) {
            addCriterion("question_true_answer between", value1, value2, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTrueAnswerNotBetween(String value1, String value2) {
            addCriterion("question_true_answer not between", value1, value2, "questionTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(String value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(String value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(String value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(String value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(String value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLike(String value) {
            addCriterion("question_type like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotLike(String value) {
            addCriterion("question_type not like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<String> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<String> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(String value1, String value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(String value1, String value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
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