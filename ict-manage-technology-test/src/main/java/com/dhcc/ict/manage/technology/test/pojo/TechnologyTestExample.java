package com.dhcc.ict.manage.technology.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class TechnologyTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyTestExample() {
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

        public Criteria andTechnologyTestIdIsNull() {
            addCriterion("technology_test_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdIsNotNull() {
            addCriterion("technology_test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdEqualTo(Integer value) {
            addCriterion("technology_test_id =", value, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdNotEqualTo(Integer value) {
            addCriterion("technology_test_id <>", value, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdGreaterThan(Integer value) {
            addCriterion("technology_test_id >", value, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("technology_test_id >=", value, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdLessThan(Integer value) {
            addCriterion("technology_test_id <", value, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("technology_test_id <=", value, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdIn(List<Integer> values) {
            addCriterion("technology_test_id in", values, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdNotIn(List<Integer> values) {
            addCriterion("technology_test_id not in", values, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdBetween(Integer value1, Integer value2) {
            addCriterion("technology_test_id between", value1, value2, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("technology_test_id not between", value1, value2, "technologyTestId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailIsNull() {
            addCriterion("technology_test_detail is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailIsNotNull() {
            addCriterion("technology_test_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailEqualTo(String value) {
            addCriterion("technology_test_detail =", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailNotEqualTo(String value) {
            addCriterion("technology_test_detail <>", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailGreaterThan(String value) {
            addCriterion("technology_test_detail >", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailGreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_detail >=", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailLessThan(String value) {
            addCriterion("technology_test_detail <", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailLessThanOrEqualTo(String value) {
            addCriterion("technology_test_detail <=", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailLike(String value) {
            addCriterion("technology_test_detail like", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailNotLike(String value) {
            addCriterion("technology_test_detail not like", value, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailIn(List<String> values) {
            addCriterion("technology_test_detail in", values, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailNotIn(List<String> values) {
            addCriterion("technology_test_detail not in", values, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailBetween(String value1, String value2) {
            addCriterion("technology_test_detail between", value1, value2, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestDetailNotBetween(String value1, String value2) {
            addCriterion("technology_test_detail not between", value1, value2, "technologyTestDetail");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1IsNull() {
            addCriterion("technology_test_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1IsNotNull() {
            addCriterion("technology_test_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1EqualTo(String value) {
            addCriterion("technology_test_answer1 =", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1NotEqualTo(String value) {
            addCriterion("technology_test_answer1 <>", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1GreaterThan(String value) {
            addCriterion("technology_test_answer1 >", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_answer1 >=", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1LessThan(String value) {
            addCriterion("technology_test_answer1 <", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1LessThanOrEqualTo(String value) {
            addCriterion("technology_test_answer1 <=", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1Like(String value) {
            addCriterion("technology_test_answer1 like", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1NotLike(String value) {
            addCriterion("technology_test_answer1 not like", value, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1In(List<String> values) {
            addCriterion("technology_test_answer1 in", values, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1NotIn(List<String> values) {
            addCriterion("technology_test_answer1 not in", values, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1Between(String value1, String value2) {
            addCriterion("technology_test_answer1 between", value1, value2, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer1NotBetween(String value1, String value2) {
            addCriterion("technology_test_answer1 not between", value1, value2, "technologyTestAnswer1");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2IsNull() {
            addCriterion("technology_test_answer2 is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2IsNotNull() {
            addCriterion("technology_test_answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2EqualTo(String value) {
            addCriterion("technology_test_answer2 =", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2NotEqualTo(String value) {
            addCriterion("technology_test_answer2 <>", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2GreaterThan(String value) {
            addCriterion("technology_test_answer2 >", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_answer2 >=", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2LessThan(String value) {
            addCriterion("technology_test_answer2 <", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2LessThanOrEqualTo(String value) {
            addCriterion("technology_test_answer2 <=", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2Like(String value) {
            addCriterion("technology_test_answer2 like", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2NotLike(String value) {
            addCriterion("technology_test_answer2 not like", value, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2In(List<String> values) {
            addCriterion("technology_test_answer2 in", values, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2NotIn(List<String> values) {
            addCriterion("technology_test_answer2 not in", values, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2Between(String value1, String value2) {
            addCriterion("technology_test_answer2 between", value1, value2, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer2NotBetween(String value1, String value2) {
            addCriterion("technology_test_answer2 not between", value1, value2, "technologyTestAnswer2");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3IsNull() {
            addCriterion("technology_test_answer3 is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3IsNotNull() {
            addCriterion("technology_test_answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3EqualTo(String value) {
            addCriterion("technology_test_answer3 =", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3NotEqualTo(String value) {
            addCriterion("technology_test_answer3 <>", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3GreaterThan(String value) {
            addCriterion("technology_test_answer3 >", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_answer3 >=", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3LessThan(String value) {
            addCriterion("technology_test_answer3 <", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3LessThanOrEqualTo(String value) {
            addCriterion("technology_test_answer3 <=", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3Like(String value) {
            addCriterion("technology_test_answer3 like", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3NotLike(String value) {
            addCriterion("technology_test_answer3 not like", value, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3In(List<String> values) {
            addCriterion("technology_test_answer3 in", values, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3NotIn(List<String> values) {
            addCriterion("technology_test_answer3 not in", values, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3Between(String value1, String value2) {
            addCriterion("technology_test_answer3 between", value1, value2, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer3NotBetween(String value1, String value2) {
            addCriterion("technology_test_answer3 not between", value1, value2, "technologyTestAnswer3");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4IsNull() {
            addCriterion("technology_test_answer4 is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4IsNotNull() {
            addCriterion("technology_test_answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4EqualTo(String value) {
            addCriterion("technology_test_answer4 =", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4NotEqualTo(String value) {
            addCriterion("technology_test_answer4 <>", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4GreaterThan(String value) {
            addCriterion("technology_test_answer4 >", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4GreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_answer4 >=", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4LessThan(String value) {
            addCriterion("technology_test_answer4 <", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4LessThanOrEqualTo(String value) {
            addCriterion("technology_test_answer4 <=", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4Like(String value) {
            addCriterion("technology_test_answer4 like", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4NotLike(String value) {
            addCriterion("technology_test_answer4 not like", value, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4In(List<String> values) {
            addCriterion("technology_test_answer4 in", values, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4NotIn(List<String> values) {
            addCriterion("technology_test_answer4 not in", values, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4Between(String value1, String value2) {
            addCriterion("technology_test_answer4 between", value1, value2, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer4NotBetween(String value1, String value2) {
            addCriterion("technology_test_answer4 not between", value1, value2, "technologyTestAnswer4");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5IsNull() {
            addCriterion("technology_test_answer5 is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5IsNotNull() {
            addCriterion("technology_test_answer5 is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5EqualTo(String value) {
            addCriterion("technology_test_answer5 =", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5NotEqualTo(String value) {
            addCriterion("technology_test_answer5 <>", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5GreaterThan(String value) {
            addCriterion("technology_test_answer5 >", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5GreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_answer5 >=", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5LessThan(String value) {
            addCriterion("technology_test_answer5 <", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5LessThanOrEqualTo(String value) {
            addCriterion("technology_test_answer5 <=", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5Like(String value) {
            addCriterion("technology_test_answer5 like", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5NotLike(String value) {
            addCriterion("technology_test_answer5 not like", value, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5In(List<String> values) {
            addCriterion("technology_test_answer5 in", values, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5NotIn(List<String> values) {
            addCriterion("technology_test_answer5 not in", values, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5Between(String value1, String value2) {
            addCriterion("technology_test_answer5 between", value1, value2, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestAnswer5NotBetween(String value1, String value2) {
            addCriterion("technology_test_answer5 not between", value1, value2, "technologyTestAnswer5");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerIsNull() {
            addCriterion("technology_test_true_answer is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerIsNotNull() {
            addCriterion("technology_test_true_answer is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerEqualTo(String value) {
            addCriterion("technology_test_true_answer =", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerNotEqualTo(String value) {
            addCriterion("technology_test_true_answer <>", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerGreaterThan(String value) {
            addCriterion("technology_test_true_answer >", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_true_answer >=", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerLessThan(String value) {
            addCriterion("technology_test_true_answer <", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerLessThanOrEqualTo(String value) {
            addCriterion("technology_test_true_answer <=", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerLike(String value) {
            addCriterion("technology_test_true_answer like", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerNotLike(String value) {
            addCriterion("technology_test_true_answer not like", value, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerIn(List<String> values) {
            addCriterion("technology_test_true_answer in", values, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerNotIn(List<String> values) {
            addCriterion("technology_test_true_answer not in", values, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerBetween(String value1, String value2) {
            addCriterion("technology_test_true_answer between", value1, value2, "technologyTestTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTrueAnswerNotBetween(String value1, String value2) {
            addCriterion("technology_test_true_answer not between", value1, value2, "technologyTestTrueAnswer");
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

        public Criteria andTechnologyTestTypeIsNull() {
            addCriterion("technology_test_type is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeIsNotNull() {
            addCriterion("technology_test_type is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeEqualTo(String value) {
            addCriterion("technology_test_type =", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeNotEqualTo(String value) {
            addCriterion("technology_test_type <>", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeGreaterThan(String value) {
            addCriterion("technology_test_type >", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("technology_test_type >=", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeLessThan(String value) {
            addCriterion("technology_test_type <", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeLessThanOrEqualTo(String value) {
            addCriterion("technology_test_type <=", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeLike(String value) {
            addCriterion("technology_test_type like", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeNotLike(String value) {
            addCriterion("technology_test_type not like", value, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeIn(List<String> values) {
            addCriterion("technology_test_type in", values, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeNotIn(List<String> values) {
            addCriterion("technology_test_type not in", values, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeBetween(String value1, String value2) {
            addCriterion("technology_test_type between", value1, value2, "technologyTestType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTestTypeNotBetween(String value1, String value2) {
            addCriterion("technology_test_type not between", value1, value2, "technologyTestType");
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