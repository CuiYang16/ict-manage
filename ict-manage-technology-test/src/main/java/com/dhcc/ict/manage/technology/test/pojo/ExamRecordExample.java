package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamRecordExample() {
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

        public Criteria andExamStarttimeIsNull() {
            addCriterion("exam_starttime is null");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeIsNotNull() {
            addCriterion("exam_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeEqualTo(Date value) {
            addCriterion("exam_starttime =", value, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeNotEqualTo(Date value) {
            addCriterion("exam_starttime <>", value, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeGreaterThan(Date value) {
            addCriterion("exam_starttime >", value, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_starttime >=", value, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeLessThan(Date value) {
            addCriterion("exam_starttime <", value, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_starttime <=", value, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeIn(List<Date> values) {
            addCriterion("exam_starttime in", values, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeNotIn(List<Date> values) {
            addCriterion("exam_starttime not in", values, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeBetween(Date value1, Date value2) {
            addCriterion("exam_starttime between", value1, value2, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_starttime not between", value1, value2, "examStarttime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeIsNull() {
            addCriterion("exam_endtime is null");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeIsNotNull() {
            addCriterion("exam_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeEqualTo(Date value) {
            addCriterion("exam_endtime =", value, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeNotEqualTo(Date value) {
            addCriterion("exam_endtime <>", value, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeGreaterThan(Date value) {
            addCriterion("exam_endtime >", value, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_endtime >=", value, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeLessThan(Date value) {
            addCriterion("exam_endtime <", value, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_endtime <=", value, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeIn(List<Date> values) {
            addCriterion("exam_endtime in", values, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeNotIn(List<Date> values) {
            addCriterion("exam_endtime not in", values, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeBetween(Date value1, Date value2) {
            addCriterion("exam_endtime between", value1, value2, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_endtime not between", value1, value2, "examEndtime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeIsNull() {
            addCriterion("exam_reality_time is null");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeIsNotNull() {
            addCriterion("exam_reality_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeEqualTo(Integer value) {
            addCriterion("exam_reality_time =", value, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeNotEqualTo(Integer value) {
            addCriterion("exam_reality_time <>", value, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeGreaterThan(Integer value) {
            addCriterion("exam_reality_time >", value, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_reality_time >=", value, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeLessThan(Integer value) {
            addCriterion("exam_reality_time <", value, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeLessThanOrEqualTo(Integer value) {
            addCriterion("exam_reality_time <=", value, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeIn(List<Integer> values) {
            addCriterion("exam_reality_time in", values, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeNotIn(List<Integer> values) {
            addCriterion("exam_reality_time not in", values, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeBetween(Integer value1, Integer value2) {
            addCriterion("exam_reality_time between", value1, value2, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andExamRealityTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_reality_time not between", value1, value2, "examRealityTime");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreIsNull() {
            addCriterion("choose_one_score is null");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreIsNotNull() {
            addCriterion("choose_one_score is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreEqualTo(Integer value) {
            addCriterion("choose_one_score =", value, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreNotEqualTo(Integer value) {
            addCriterion("choose_one_score <>", value, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreGreaterThan(Integer value) {
            addCriterion("choose_one_score >", value, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_one_score >=", value, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreLessThan(Integer value) {
            addCriterion("choose_one_score <", value, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreLessThanOrEqualTo(Integer value) {
            addCriterion("choose_one_score <=", value, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreIn(List<Integer> values) {
            addCriterion("choose_one_score in", values, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreNotIn(List<Integer> values) {
            addCriterion("choose_one_score not in", values, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreBetween(Integer value1, Integer value2) {
            addCriterion("choose_one_score between", value1, value2, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseOneScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_one_score not between", value1, value2, "chooseOneScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreIsNull() {
            addCriterion("choose_much_score is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreIsNotNull() {
            addCriterion("choose_much_score is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreEqualTo(Integer value) {
            addCriterion("choose_much_score =", value, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreNotEqualTo(Integer value) {
            addCriterion("choose_much_score <>", value, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreGreaterThan(Integer value) {
            addCriterion("choose_much_score >", value, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_much_score >=", value, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreLessThan(Integer value) {
            addCriterion("choose_much_score <", value, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreLessThanOrEqualTo(Integer value) {
            addCriterion("choose_much_score <=", value, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreIn(List<Integer> values) {
            addCriterion("choose_much_score in", values, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreNotIn(List<Integer> values) {
            addCriterion("choose_much_score not in", values, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreBetween(Integer value1, Integer value2) {
            addCriterion("choose_much_score between", value1, value2, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseMuchScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_much_score not between", value1, value2, "chooseMuchScore");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeIsNull() {
            addCriterion("choose_jurge is null");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeIsNotNull() {
            addCriterion("choose_jurge is not null");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeEqualTo(Integer value) {
            addCriterion("choose_jurge =", value, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeNotEqualTo(Integer value) {
            addCriterion("choose_jurge <>", value, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeGreaterThan(Integer value) {
            addCriterion("choose_jurge >", value, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_jurge >=", value, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeLessThan(Integer value) {
            addCriterion("choose_jurge <", value, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeLessThanOrEqualTo(Integer value) {
            addCriterion("choose_jurge <=", value, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeIn(List<Integer> values) {
            addCriterion("choose_jurge in", values, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeNotIn(List<Integer> values) {
            addCriterion("choose_jurge not in", values, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeBetween(Integer value1, Integer value2) {
            addCriterion("choose_jurge between", value1, value2, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andChooseJurgeNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_jurge not between", value1, value2, "chooseJurge");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Integer value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Integer value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Integer value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Integer value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Integer> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Integer> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
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

        public Criteria andExamQuestionIdIsNull() {
            addCriterion("exam_question_id is null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdIsNotNull() {
            addCriterion("exam_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdEqualTo(Integer value) {
            addCriterion("exam_question_id =", value, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdNotEqualTo(Integer value) {
            addCriterion("exam_question_id <>", value, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdGreaterThan(Integer value) {
            addCriterion("exam_question_id >", value, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_question_id >=", value, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdLessThan(Integer value) {
            addCriterion("exam_question_id <", value, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_question_id <=", value, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdIn(List<Integer> values) {
            addCriterion("exam_question_id in", values, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdNotIn(List<Integer> values) {
            addCriterion("exam_question_id not in", values, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_question_id between", value1, value2, "examQuestionId");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_question_id not between", value1, value2, "examQuestionId");
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

        public Criteria andTechnologyTestComplexityIsNull() {
            addCriterion("technology_test_complexity is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityIsNotNull() {
            addCriterion("technology_test_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityEqualTo(String value) {
            addCriterion("technology_test_complexity =", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityNotEqualTo(String value) {
            addCriterion("technology_test_complexity <>", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityGreaterThan(String value) {
            addCriterion("technology_test_complexity >", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_complexity >=", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityLessThan(String value) {
            addCriterion("technology_test_complexity <", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityLessThanOrEqualTo(String value) {
            addCriterion("technology_test_complexity <=", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityLike(String value) {
            addCriterion("technology_test_complexity like", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityNotLike(String value) {
            addCriterion("technology_test_complexity not like", value, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityIn(List<String> values) {
            addCriterion("technology_test_complexity in", values, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityNotIn(List<String> values) {
            addCriterion("technology_test_complexity not in", values, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityBetween(String value1, String value2) {
            addCriterion("technology_test_complexity between", value1, value2, "technologyTestComplexity");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestComplexityNotBetween(String value1, String value2) {
            addCriterion("technology_test_complexity not between", value1, value2, "technologyTestComplexity");
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