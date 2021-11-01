package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuSchNameIsNull() {
            addCriterion("stu_sch_name is null");
            return (Criteria) this;
        }

        public Criteria andStuSchNameIsNotNull() {
            addCriterion("stu_sch_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuSchNameEqualTo(String value) {
            addCriterion("stu_sch_name =", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameNotEqualTo(String value) {
            addCriterion("stu_sch_name <>", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameGreaterThan(String value) {
            addCriterion("stu_sch_name >", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sch_name >=", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameLessThan(String value) {
            addCriterion("stu_sch_name <", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameLessThanOrEqualTo(String value) {
            addCriterion("stu_sch_name <=", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameLike(String value) {
            addCriterion("stu_sch_name like", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameNotLike(String value) {
            addCriterion("stu_sch_name not like", value, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameIn(List<String> values) {
            addCriterion("stu_sch_name in", values, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameNotIn(List<String> values) {
            addCriterion("stu_sch_name not in", values, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameBetween(String value1, String value2) {
            addCriterion("stu_sch_name between", value1, value2, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchNameNotBetween(String value1, String value2) {
            addCriterion("stu_sch_name not between", value1, value2, "stuSchName");
            return (Criteria) this;
        }

        public Criteria andStuSchIdIsNull() {
            addCriterion("stu_sch_id is null");
            return (Criteria) this;
        }

        public Criteria andStuSchIdIsNotNull() {
            addCriterion("stu_sch_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuSchIdEqualTo(Integer value) {
            addCriterion("stu_sch_id =", value, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdNotEqualTo(Integer value) {
            addCriterion("stu_sch_id <>", value, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdGreaterThan(Integer value) {
            addCriterion("stu_sch_id >", value, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_sch_id >=", value, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdLessThan(Integer value) {
            addCriterion("stu_sch_id <", value, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_sch_id <=", value, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdIn(List<Integer> values) {
            addCriterion("stu_sch_id in", values, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdNotIn(List<Integer> values) {
            addCriterion("stu_sch_id not in", values, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_sch_id between", value1, value2, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_sch_id not between", value1, value2, "stuSchId");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorIsNull() {
            addCriterion("stu_sub_major is null");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorIsNotNull() {
            addCriterion("stu_sub_major is not null");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorEqualTo(String value) {
            addCriterion("stu_sub_major =", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorNotEqualTo(String value) {
            addCriterion("stu_sub_major <>", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorGreaterThan(String value) {
            addCriterion("stu_sub_major >", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sub_major >=", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorLessThan(String value) {
            addCriterion("stu_sub_major <", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorLessThanOrEqualTo(String value) {
            addCriterion("stu_sub_major <=", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorLike(String value) {
            addCriterion("stu_sub_major like", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorNotLike(String value) {
            addCriterion("stu_sub_major not like", value, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorIn(List<String> values) {
            addCriterion("stu_sub_major in", values, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorNotIn(List<String> values) {
            addCriterion("stu_sub_major not in", values, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorBetween(String value1, String value2) {
            addCriterion("stu_sub_major between", value1, value2, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuSubMajorNotBetween(String value1, String value2) {
            addCriterion("stu_sub_major not between", value1, value2, "stuSubMajor");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNull() {
            addCriterion("stu_tel is null");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNotNull() {
            addCriterion("stu_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStuTelEqualTo(String value) {
            addCriterion("stu_tel =", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotEqualTo(String value) {
            addCriterion("stu_tel <>", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThan(String value) {
            addCriterion("stu_tel >", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThanOrEqualTo(String value) {
            addCriterion("stu_tel >=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThan(String value) {
            addCriterion("stu_tel <", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThanOrEqualTo(String value) {
            addCriterion("stu_tel <=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLike(String value) {
            addCriterion("stu_tel like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotLike(String value) {
            addCriterion("stu_tel not like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelIn(List<String> values) {
            addCriterion("stu_tel in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotIn(List<String> values) {
            addCriterion("stu_tel not in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelBetween(String value1, String value2) {
            addCriterion("stu_tel between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotBetween(String value1, String value2) {
            addCriterion("stu_tel not between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeIsNull() {
            addCriterion("stu_sub_time is null");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeIsNotNull() {
            addCriterion("stu_sub_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeEqualTo(Date value) {
            addCriterionForJDBCDate("stu_sub_time =", value, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_sub_time <>", value, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_sub_time >", value, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_sub_time >=", value, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeLessThan(Date value) {
            addCriterionForJDBCDate("stu_sub_time <", value, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_sub_time <=", value, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeIn(List<Date> values) {
            addCriterionForJDBCDate("stu_sub_time in", values, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_sub_time not in", values, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_sub_time between", value1, value2, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuSubTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_sub_time not between", value1, value2, "stuSubTime");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameIsNull() {
            addCriterion("stu_promo_name is null");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameIsNotNull() {
            addCriterion("stu_promo_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameEqualTo(String value) {
            addCriterion("stu_promo_name =", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameNotEqualTo(String value) {
            addCriterion("stu_promo_name <>", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameGreaterThan(String value) {
            addCriterion("stu_promo_name >", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_promo_name >=", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameLessThan(String value) {
            addCriterion("stu_promo_name <", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameLessThanOrEqualTo(String value) {
            addCriterion("stu_promo_name <=", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameLike(String value) {
            addCriterion("stu_promo_name like", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameNotLike(String value) {
            addCriterion("stu_promo_name not like", value, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameIn(List<String> values) {
            addCriterion("stu_promo_name in", values, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameNotIn(List<String> values) {
            addCriterion("stu_promo_name not in", values, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameBetween(String value1, String value2) {
            addCriterion("stu_promo_name between", value1, value2, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoNameNotBetween(String value1, String value2) {
            addCriterion("stu_promo_name not between", value1, value2, "stuPromoName");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdIsNull() {
            addCriterion("stu_promo_id is null");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdIsNotNull() {
            addCriterion("stu_promo_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdEqualTo(Integer value) {
            addCriterion("stu_promo_id =", value, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdNotEqualTo(Integer value) {
            addCriterion("stu_promo_id <>", value, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdGreaterThan(Integer value) {
            addCriterion("stu_promo_id >", value, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_promo_id >=", value, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdLessThan(Integer value) {
            addCriterion("stu_promo_id <", value, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_promo_id <=", value, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdIn(List<Integer> values) {
            addCriterion("stu_promo_id in", values, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdNotIn(List<Integer> values) {
            addCriterion("stu_promo_id not in", values, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_promo_id between", value1, value2, "stuPromoId");
            return (Criteria) this;
        }

        public Criteria andStuPromoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_promo_id not between", value1, value2, "stuPromoId");
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