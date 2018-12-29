package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class InterviewRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewRecordExample() {
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

        public Criteria andInterviewRecordIdIsNull() {
            addCriterion("interview_record_id is null");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdIsNotNull() {
            addCriterion("interview_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdEqualTo(Integer value) {
            addCriterion("interview_record_id =", value, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdNotEqualTo(Integer value) {
            addCriterion("interview_record_id <>", value, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdGreaterThan(Integer value) {
            addCriterion("interview_record_id >", value, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_record_id >=", value, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdLessThan(Integer value) {
            addCriterion("interview_record_id <", value, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("interview_record_id <=", value, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdIn(List<Integer> values) {
            addCriterion("interview_record_id in", values, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdNotIn(List<Integer> values) {
            addCriterion("interview_record_id not in", values, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("interview_record_id between", value1, value2, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_record_id not between", value1, value2, "interviewRecordId");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameIsNull() {
            addCriterion("interviewer_name is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameIsNotNull() {
            addCriterion("interviewer_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameEqualTo(String value) {
            addCriterion("interviewer_name =", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameNotEqualTo(String value) {
            addCriterion("interviewer_name <>", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameGreaterThan(String value) {
            addCriterion("interviewer_name >", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameGreaterThanOrEqualTo(String value) {
            addCriterion("interviewer_name >=", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameLessThan(String value) {
            addCriterion("interviewer_name <", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameLessThanOrEqualTo(String value) {
            addCriterion("interviewer_name <=", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameLike(String value) {
            addCriterion("interviewer_name like", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameNotLike(String value) {
            addCriterion("interviewer_name not like", value, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameIn(List<String> values) {
            addCriterion("interviewer_name in", values, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameNotIn(List<String> values) {
            addCriterion("interviewer_name not in", values, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameBetween(String value1, String value2) {
            addCriterion("interviewer_name between", value1, value2, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewerNameNotBetween(String value1, String value2) {
            addCriterion("interviewer_name not between", value1, value2, "interviewerName");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsIsNull() {
            addCriterion("interview_results is null");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsIsNotNull() {
            addCriterion("interview_results is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsEqualTo(String value) {
            addCriterion("interview_results =", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsNotEqualTo(String value) {
            addCriterion("interview_results <>", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsGreaterThan(String value) {
            addCriterion("interview_results >", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsGreaterThanOrEqualTo(String value) {
            addCriterion("interview_results >=", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsLessThan(String value) {
            addCriterion("interview_results <", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsLessThanOrEqualTo(String value) {
            addCriterion("interview_results <=", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsLike(String value) {
            addCriterion("interview_results like", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsNotLike(String value) {
            addCriterion("interview_results not like", value, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsIn(List<String> values) {
            addCriterion("interview_results in", values, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsNotIn(List<String> values) {
            addCriterion("interview_results not in", values, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsBetween(String value1, String value2) {
            addCriterion("interview_results between", value1, value2, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewResultsNotBetween(String value1, String value2) {
            addCriterion("interview_results not between", value1, value2, "interviewResults");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsIsNull() {
            addCriterion("interviewer_comments is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsIsNotNull() {
            addCriterion("interviewer_comments is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsEqualTo(String value) {
            addCriterion("interviewer_comments =", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsNotEqualTo(String value) {
            addCriterion("interviewer_comments <>", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsGreaterThan(String value) {
            addCriterion("interviewer_comments >", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("interviewer_comments >=", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsLessThan(String value) {
            addCriterion("interviewer_comments <", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsLessThanOrEqualTo(String value) {
            addCriterion("interviewer_comments <=", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsLike(String value) {
            addCriterion("interviewer_comments like", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsNotLike(String value) {
            addCriterion("interviewer_comments not like", value, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsIn(List<String> values) {
            addCriterion("interviewer_comments in", values, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsNotIn(List<String> values) {
            addCriterion("interviewer_comments not in", values, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsBetween(String value1, String value2) {
            addCriterion("interviewer_comments between", value1, value2, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerCommentsNotBetween(String value1, String value2) {
            addCriterion("interviewer_comments not between", value1, value2, "interviewerComments");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksIsNull() {
            addCriterion("interviewer_remarks is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksIsNotNull() {
            addCriterion("interviewer_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksEqualTo(String value) {
            addCriterion("interviewer_remarks =", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksNotEqualTo(String value) {
            addCriterion("interviewer_remarks <>", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksGreaterThan(String value) {
            addCriterion("interviewer_remarks >", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("interviewer_remarks >=", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksLessThan(String value) {
            addCriterion("interviewer_remarks <", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksLessThanOrEqualTo(String value) {
            addCriterion("interviewer_remarks <=", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksLike(String value) {
            addCriterion("interviewer_remarks like", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksNotLike(String value) {
            addCriterion("interviewer_remarks not like", value, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksIn(List<String> values) {
            addCriterion("interviewer_remarks in", values, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksNotIn(List<String> values) {
            addCriterion("interviewer_remarks not in", values, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksBetween(String value1, String value2) {
            addCriterion("interviewer_remarks between", value1, value2, "interviewerRemarks");
            return (Criteria) this;
        }

        public Criteria andInterviewerRemarksNotBetween(String value1, String value2) {
            addCriterion("interviewer_remarks not between", value1, value2, "interviewerRemarks");
            return (Criteria) this;
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

        public Criteria andExamRecordIdIsNull() {
            addCriterion("exam_record_id is null");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdIsNotNull() {
            addCriterion("exam_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdEqualTo(Integer value) {
            addCriterion("exam_record_id =", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdNotEqualTo(Integer value) {
            addCriterion("exam_record_id <>", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdGreaterThan(Integer value) {
            addCriterion("exam_record_id >", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_record_id >=", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdLessThan(Integer value) {
            addCriterion("exam_record_id <", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_record_id <=", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdIn(List<Integer> values) {
            addCriterion("exam_record_id in", values, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdNotIn(List<Integer> values) {
            addCriterion("exam_record_id not in", values, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_record_id between", value1, value2, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_record_id not between", value1, value2, "examRecordId");
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