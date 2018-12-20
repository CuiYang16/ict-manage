package com.dhcc.ict.manage.questionbank.pojo;

import java.util.ArrayList;
import java.util.List;

public class TechnologyChooseMuchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyChooseMuchExample() {
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

        public Criteria andChooseMuchIdIsNull() {
            addCriterion("choose_much_id is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdIsNotNull() {
            addCriterion("choose_much_id is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdEqualTo(Integer value) {
            addCriterion("choose_much_id =", value, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdNotEqualTo(Integer value) {
            addCriterion("choose_much_id <>", value, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdGreaterThan(Integer value) {
            addCriterion("choose_much_id >", value, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose_much_id >=", value, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdLessThan(Integer value) {
            addCriterion("choose_much_id <", value, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdLessThanOrEqualTo(Integer value) {
            addCriterion("choose_much_id <=", value, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdIn(List<Integer> values) {
            addCriterion("choose_much_id in", values, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdNotIn(List<Integer> values) {
            addCriterion("choose_much_id not in", values, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdBetween(Integer value1, Integer value2) {
            addCriterion("choose_much_id between", value1, value2, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("choose_much_id not between", value1, value2, "chooseMuchId");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailIsNull() {
            addCriterion("choose_much_detail is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailIsNotNull() {
            addCriterion("choose_much_detail is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailEqualTo(String value) {
            addCriterion("choose_much_detail =", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailNotEqualTo(String value) {
            addCriterion("choose_much_detail <>", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailGreaterThan(String value) {
            addCriterion("choose_much_detail >", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailGreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_detail >=", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailLessThan(String value) {
            addCriterion("choose_much_detail <", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailLessThanOrEqualTo(String value) {
            addCriterion("choose_much_detail <=", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailLike(String value) {
            addCriterion("choose_much_detail like", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailNotLike(String value) {
            addCriterion("choose_much_detail not like", value, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailIn(List<String> values) {
            addCriterion("choose_much_detail in", values, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailNotIn(List<String> values) {
            addCriterion("choose_much_detail not in", values, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailBetween(String value1, String value2) {
            addCriterion("choose_much_detail between", value1, value2, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchDetailNotBetween(String value1, String value2) {
            addCriterion("choose_much_detail not between", value1, value2, "chooseMuchDetail");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1IsNull() {
            addCriterion("choose_much_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1IsNotNull() {
            addCriterion("choose_much_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1EqualTo(String value) {
            addCriterion("choose_much_answer1 =", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1NotEqualTo(String value) {
            addCriterion("choose_much_answer1 <>", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1GreaterThan(String value) {
            addCriterion("choose_much_answer1 >", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_answer1 >=", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1LessThan(String value) {
            addCriterion("choose_much_answer1 <", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1LessThanOrEqualTo(String value) {
            addCriterion("choose_much_answer1 <=", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1Like(String value) {
            addCriterion("choose_much_answer1 like", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1NotLike(String value) {
            addCriterion("choose_much_answer1 not like", value, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1In(List<String> values) {
            addCriterion("choose_much_answer1 in", values, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1NotIn(List<String> values) {
            addCriterion("choose_much_answer1 not in", values, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1Between(String value1, String value2) {
            addCriterion("choose_much_answer1 between", value1, value2, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer1NotBetween(String value1, String value2) {
            addCriterion("choose_much_answer1 not between", value1, value2, "chooseMuchAnswer1");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2IsNull() {
            addCriterion("choose_much_answer2 is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2IsNotNull() {
            addCriterion("choose_much_answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2EqualTo(String value) {
            addCriterion("choose_much_answer2 =", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2NotEqualTo(String value) {
            addCriterion("choose_much_answer2 <>", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2GreaterThan(String value) {
            addCriterion("choose_much_answer2 >", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_answer2 >=", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2LessThan(String value) {
            addCriterion("choose_much_answer2 <", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2LessThanOrEqualTo(String value) {
            addCriterion("choose_much_answer2 <=", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2Like(String value) {
            addCriterion("choose_much_answer2 like", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2NotLike(String value) {
            addCriterion("choose_much_answer2 not like", value, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2In(List<String> values) {
            addCriterion("choose_much_answer2 in", values, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2NotIn(List<String> values) {
            addCriterion("choose_much_answer2 not in", values, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2Between(String value1, String value2) {
            addCriterion("choose_much_answer2 between", value1, value2, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer2NotBetween(String value1, String value2) {
            addCriterion("choose_much_answer2 not between", value1, value2, "chooseMuchAnswer2");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3IsNull() {
            addCriterion("choose_much_answer3 is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3IsNotNull() {
            addCriterion("choose_much_answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3EqualTo(String value) {
            addCriterion("choose_much_answer3 =", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3NotEqualTo(String value) {
            addCriterion("choose_much_answer3 <>", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3GreaterThan(String value) {
            addCriterion("choose_much_answer3 >", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_answer3 >=", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3LessThan(String value) {
            addCriterion("choose_much_answer3 <", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3LessThanOrEqualTo(String value) {
            addCriterion("choose_much_answer3 <=", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3Like(String value) {
            addCriterion("choose_much_answer3 like", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3NotLike(String value) {
            addCriterion("choose_much_answer3 not like", value, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3In(List<String> values) {
            addCriterion("choose_much_answer3 in", values, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3NotIn(List<String> values) {
            addCriterion("choose_much_answer3 not in", values, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3Between(String value1, String value2) {
            addCriterion("choose_much_answer3 between", value1, value2, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer3NotBetween(String value1, String value2) {
            addCriterion("choose_much_answer3 not between", value1, value2, "chooseMuchAnswer3");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4IsNull() {
            addCriterion("choose_much_answer4 is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4IsNotNull() {
            addCriterion("choose_much_answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4EqualTo(String value) {
            addCriterion("choose_much_answer4 =", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4NotEqualTo(String value) {
            addCriterion("choose_much_answer4 <>", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4GreaterThan(String value) {
            addCriterion("choose_much_answer4 >", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4GreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_answer4 >=", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4LessThan(String value) {
            addCriterion("choose_much_answer4 <", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4LessThanOrEqualTo(String value) {
            addCriterion("choose_much_answer4 <=", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4Like(String value) {
            addCriterion("choose_much_answer4 like", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4NotLike(String value) {
            addCriterion("choose_much_answer4 not like", value, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4In(List<String> values) {
            addCriterion("choose_much_answer4 in", values, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4NotIn(List<String> values) {
            addCriterion("choose_much_answer4 not in", values, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4Between(String value1, String value2) {
            addCriterion("choose_much_answer4 between", value1, value2, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer4NotBetween(String value1, String value2) {
            addCriterion("choose_much_answer4 not between", value1, value2, "chooseMuchAnswer4");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5IsNull() {
            addCriterion("choose_much_answer5 is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5IsNotNull() {
            addCriterion("choose_much_answer5 is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5EqualTo(String value) {
            addCriterion("choose_much_answer5 =", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5NotEqualTo(String value) {
            addCriterion("choose_much_answer5 <>", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5GreaterThan(String value) {
            addCriterion("choose_much_answer5 >", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5GreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_answer5 >=", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5LessThan(String value) {
            addCriterion("choose_much_answer5 <", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5LessThanOrEqualTo(String value) {
            addCriterion("choose_much_answer5 <=", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5Like(String value) {
            addCriterion("choose_much_answer5 like", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5NotLike(String value) {
            addCriterion("choose_much_answer5 not like", value, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5In(List<String> values) {
            addCriterion("choose_much_answer5 in", values, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5NotIn(List<String> values) {
            addCriterion("choose_much_answer5 not in", values, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5Between(String value1, String value2) {
            addCriterion("choose_much_answer5 between", value1, value2, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchAnswer5NotBetween(String value1, String value2) {
            addCriterion("choose_much_answer5 not between", value1, value2, "chooseMuchAnswer5");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerIsNull() {
            addCriterion("choose_much_true_answer is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerIsNotNull() {
            addCriterion("choose_much_true_answer is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerEqualTo(String value) {
            addCriterion("choose_much_true_answer =", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerNotEqualTo(String value) {
            addCriterion("choose_much_true_answer <>", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerGreaterThan(String value) {
            addCriterion("choose_much_true_answer >", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_true_answer >=", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerLessThan(String value) {
            addCriterion("choose_much_true_answer <", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerLessThanOrEqualTo(String value) {
            addCriterion("choose_much_true_answer <=", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerLike(String value) {
            addCriterion("choose_much_true_answer like", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerNotLike(String value) {
            addCriterion("choose_much_true_answer not like", value, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerIn(List<String> values) {
            addCriterion("choose_much_true_answer in", values, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerNotIn(List<String> values) {
            addCriterion("choose_much_true_answer not in", values, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerBetween(String value1, String value2) {
            addCriterion("choose_much_true_answer between", value1, value2, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchTrueAnswerNotBetween(String value1, String value2) {
            addCriterion("choose_much_true_answer not between", value1, value2, "chooseMuchTrueAnswer");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityIsNull() {
            addCriterion("choose_much_complexity is null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityIsNotNull() {
            addCriterion("choose_much_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityEqualTo(String value) {
            addCriterion("choose_much_complexity =", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityNotEqualTo(String value) {
            addCriterion("choose_much_complexity <>", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityGreaterThan(String value) {
            addCriterion("choose_much_complexity >", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("choose_much_complexity >=", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityLessThan(String value) {
            addCriterion("choose_much_complexity <", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityLessThanOrEqualTo(String value) {
            addCriterion("choose_much_complexity <=", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityLike(String value) {
            addCriterion("choose_much_complexity like", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityNotLike(String value) {
            addCriterion("choose_much_complexity not like", value, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityIn(List<String> values) {
            addCriterion("choose_much_complexity in", values, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityNotIn(List<String> values) {
            addCriterion("choose_much_complexity not in", values, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityBetween(String value1, String value2) {
            addCriterion("choose_much_complexity between", value1, value2, "chooseMuchComplexity");
            return (Criteria) this;
        }

        public Criteria andChooseMuchComplexityNotBetween(String value1, String value2) {
            addCriterion("choose_much_complexity not between", value1, value2, "chooseMuchComplexity");
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