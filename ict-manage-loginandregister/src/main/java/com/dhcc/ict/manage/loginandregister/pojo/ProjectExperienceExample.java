package com.dhcc.ict.manage.loginandregister.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProjectExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExperienceExample() {
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

        public Criteria andProjectExperienceIdIsNull() {
            addCriterion("project_experience_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdIsNotNull() {
            addCriterion("project_experience_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdEqualTo(Integer value) {
            addCriterion("project_experience_id =", value, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdNotEqualTo(Integer value) {
            addCriterion("project_experience_id <>", value, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdGreaterThan(Integer value) {
            addCriterion("project_experience_id >", value, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_experience_id >=", value, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdLessThan(Integer value) {
            addCriterion("project_experience_id <", value, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_experience_id <=", value, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdIn(List<Integer> values) {
            addCriterion("project_experience_id in", values, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdNotIn(List<Integer> values) {
            addCriterion("project_experience_id not in", values, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdBetween(Integer value1, Integer value2) {
            addCriterion("project_experience_id between", value1, value2, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_experience_id not between", value1, value2, "projectExperienceId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNull() {
            addCriterion("corporate_name is null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNotNull() {
            addCriterion("corporate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameEqualTo(String value) {
            addCriterion("corporate_name =", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotEqualTo(String value) {
            addCriterion("corporate_name <>", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThan(String value) {
            addCriterion("corporate_name >", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_name >=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThan(String value) {
            addCriterion("corporate_name <", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThanOrEqualTo(String value) {
            addCriterion("corporate_name <=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLike(String value) {
            addCriterion("corporate_name like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotLike(String value) {
            addCriterion("corporate_name not like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIn(List<String> values) {
            addCriterion("corporate_name in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotIn(List<String> values) {
            addCriterion("corporate_name not in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameBetween(String value1, String value2) {
            addCriterion("corporate_name between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotBetween(String value1, String value2) {
            addCriterion("corporate_name not between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNull() {
            addCriterion("project_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNotNull() {
            addCriterion("project_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualTo(String value) {
            addCriterion("project_start_time =", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualTo(String value) {
            addCriterion("project_start_time <>", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThan(String value) {
            addCriterion("project_start_time >", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("project_start_time >=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThan(String value) {
            addCriterion("project_start_time <", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualTo(String value) {
            addCriterion("project_start_time <=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLike(String value) {
            addCriterion("project_start_time like", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotLike(String value) {
            addCriterion("project_start_time not like", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIn(List<String> values) {
            addCriterion("project_start_time in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotIn(List<String> values) {
            addCriterion("project_start_time not in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeBetween(String value1, String value2) {
            addCriterion("project_start_time between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotBetween(String value1, String value2) {
            addCriterion("project_start_time not between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(String value) {
            addCriterion("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(String value) {
            addCriterion("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(String value) {
            addCriterion("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(String value) {
            addCriterion("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(String value) {
            addCriterion("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLike(String value) {
            addCriterion("project_end_time like", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotLike(String value) {
            addCriterion("project_end_time not like", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<String> values) {
            addCriterion("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<String> values) {
            addCriterion("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(String value1, String value2) {
            addCriterion("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(String value1, String value2) {
            addCriterion("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectIsNull() {
            addCriterion("role_of_project is null");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectIsNotNull() {
            addCriterion("role_of_project is not null");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectEqualTo(String value) {
            addCriterion("role_of_project =", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectNotEqualTo(String value) {
            addCriterion("role_of_project <>", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectGreaterThan(String value) {
            addCriterion("role_of_project >", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectGreaterThanOrEqualTo(String value) {
            addCriterion("role_of_project >=", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectLessThan(String value) {
            addCriterion("role_of_project <", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectLessThanOrEqualTo(String value) {
            addCriterion("role_of_project <=", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectLike(String value) {
            addCriterion("role_of_project like", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectNotLike(String value) {
            addCriterion("role_of_project not like", value, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectIn(List<String> values) {
            addCriterion("role_of_project in", values, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectNotIn(List<String> values) {
            addCriterion("role_of_project not in", values, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectBetween(String value1, String value2) {
            addCriterion("role_of_project between", value1, value2, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andRoleOfProjectNotBetween(String value1, String value2) {
            addCriterion("role_of_project not between", value1, value2, "roleOfProject");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNull() {
            addCriterion("project_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNotNull() {
            addCriterion("project_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualTo(String value) {
            addCriterion("project_description =", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualTo(String value) {
            addCriterion("project_description <>", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThan(String value) {
            addCriterion("project_description >", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_description >=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThan(String value) {
            addCriterion("project_description <", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_description <=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLike(String value) {
            addCriterion("project_description like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotLike(String value) {
            addCriterion("project_description not like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIn(List<String> values) {
            addCriterion("project_description in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotIn(List<String> values) {
            addCriterion("project_description not in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionBetween(String value1, String value2) {
            addCriterion("project_description between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_description not between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionIsNull() {
            addCriterion("responsibility_description is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionIsNotNull() {
            addCriterion("responsibility_description is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionEqualTo(String value) {
            addCriterion("responsibility_description =", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionNotEqualTo(String value) {
            addCriterion("responsibility_description <>", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionGreaterThan(String value) {
            addCriterion("responsibility_description >", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("responsibility_description >=", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionLessThan(String value) {
            addCriterion("responsibility_description <", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionLessThanOrEqualTo(String value) {
            addCriterion("responsibility_description <=", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionLike(String value) {
            addCriterion("responsibility_description like", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionNotLike(String value) {
            addCriterion("responsibility_description not like", value, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionIn(List<String> values) {
            addCriterion("responsibility_description in", values, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionNotIn(List<String> values) {
            addCriterion("responsibility_description not in", values, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionBetween(String value1, String value2) {
            addCriterion("responsibility_description between", value1, value2, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDescriptionNotBetween(String value1, String value2) {
            addCriterion("responsibility_description not between", value1, value2, "responsibilityDescription");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNull() {
            addCriterion("project_address is null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNotNull() {
            addCriterion("project_address is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressEqualTo(String value) {
            addCriterion("project_address =", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotEqualTo(String value) {
            addCriterion("project_address <>", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThan(String value) {
            addCriterion("project_address >", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThanOrEqualTo(String value) {
            addCriterion("project_address >=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThan(String value) {
            addCriterion("project_address <", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThanOrEqualTo(String value) {
            addCriterion("project_address <=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLike(String value) {
            addCriterion("project_address like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotLike(String value) {
            addCriterion("project_address not like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIn(List<String> values) {
            addCriterion("project_address in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotIn(List<String> values) {
            addCriterion("project_address not in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressBetween(String value1, String value2) {
            addCriterion("project_address between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotBetween(String value1, String value2) {
            addCriterion("project_address not between", value1, value2, "projectAddress");
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