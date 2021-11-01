package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchoolidIsNull() {
            addCriterion("schoolid is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("schoolid is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(Integer value) {
            addCriterion("schoolid =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(Integer value) {
            addCriterion("schoolid <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(Integer value) {
            addCriterion("schoolid >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolid >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(Integer value) {
            addCriterion("schoolid <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(Integer value) {
            addCriterion("schoolid <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<Integer> values) {
            addCriterion("schoolid in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<Integer> values) {
            addCriterion("schoolid not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(Integer value1, Integer value2) {
            addCriterion("schoolid between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolid not between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameIsNull() {
            addCriterion("sch_major_name is null");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameIsNotNull() {
            addCriterion("sch_major_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameEqualTo(String value) {
            addCriterion("sch_major_name =", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameNotEqualTo(String value) {
            addCriterion("sch_major_name <>", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameGreaterThan(String value) {
            addCriterion("sch_major_name >", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_major_name >=", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameLessThan(String value) {
            addCriterion("sch_major_name <", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameLessThanOrEqualTo(String value) {
            addCriterion("sch_major_name <=", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameLike(String value) {
            addCriterion("sch_major_name like", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameNotLike(String value) {
            addCriterion("sch_major_name not like", value, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameIn(List<String> values) {
            addCriterion("sch_major_name in", values, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameNotIn(List<String> values) {
            addCriterion("sch_major_name not in", values, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameBetween(String value1, String value2) {
            addCriterion("sch_major_name between", value1, value2, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorNameNotBetween(String value1, String value2) {
            addCriterion("sch_major_name not between", value1, value2, "schMajorName");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdIsNull() {
            addCriterion("sch_major_id is null");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdIsNotNull() {
            addCriterion("sch_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdEqualTo(Integer value) {
            addCriterion("sch_major_id =", value, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdNotEqualTo(Integer value) {
            addCriterion("sch_major_id <>", value, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdGreaterThan(Integer value) {
            addCriterion("sch_major_id >", value, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sch_major_id >=", value, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdLessThan(Integer value) {
            addCriterion("sch_major_id <", value, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sch_major_id <=", value, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdIn(List<Integer> values) {
            addCriterion("sch_major_id in", values, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdNotIn(List<Integer> values) {
            addCriterion("sch_major_id not in", values, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("sch_major_id between", value1, value2, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sch_major_id not between", value1, value2, "schMajorId");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignIsNull() {
            addCriterion("sch_major_sign is null");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignIsNotNull() {
            addCriterion("sch_major_sign is not null");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignEqualTo(String value) {
            addCriterion("sch_major_sign =", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignNotEqualTo(String value) {
            addCriterion("sch_major_sign <>", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignGreaterThan(String value) {
            addCriterion("sch_major_sign >", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignGreaterThanOrEqualTo(String value) {
            addCriterion("sch_major_sign >=", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignLessThan(String value) {
            addCriterion("sch_major_sign <", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignLessThanOrEqualTo(String value) {
            addCriterion("sch_major_sign <=", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignLike(String value) {
            addCriterion("sch_major_sign like", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignNotLike(String value) {
            addCriterion("sch_major_sign not like", value, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignIn(List<String> values) {
            addCriterion("sch_major_sign in", values, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignNotIn(List<String> values) {
            addCriterion("sch_major_sign not in", values, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignBetween(String value1, String value2) {
            addCriterion("sch_major_sign between", value1, value2, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSignNotBetween(String value1, String value2) {
            addCriterion("sch_major_sign not between", value1, value2, "schMajorSign");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeIsNull() {
            addCriterion("sch_major_sub_time is null");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeIsNotNull() {
            addCriterion("sch_major_sub_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sch_major_sub_time =", value, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sch_major_sub_time <>", value, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sch_major_sub_time >", value, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sch_major_sub_time >=", value, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeLessThan(Date value) {
            addCriterionForJDBCDate("sch_major_sub_time <", value, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sch_major_sub_time <=", value, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sch_major_sub_time in", values, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sch_major_sub_time not in", values, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sch_major_sub_time between", value1, value2, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchMajorSubTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sch_major_sub_time not between", value1, value2, "schMajorSubTime");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNull() {
            addCriterion("sch_name is null");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNotNull() {
            addCriterion("sch_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchNameEqualTo(String value) {
            addCriterion("sch_name =", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotEqualTo(String value) {
            addCriterion("sch_name <>", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThan(String value) {
            addCriterion("sch_name >", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_name >=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThan(String value) {
            addCriterion("sch_name <", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThanOrEqualTo(String value) {
            addCriterion("sch_name <=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLike(String value) {
            addCriterion("sch_name like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotLike(String value) {
            addCriterion("sch_name not like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameIn(List<String> values) {
            addCriterion("sch_name in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotIn(List<String> values) {
            addCriterion("sch_name not in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameBetween(String value1, String value2) {
            addCriterion("sch_name between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotBetween(String value1, String value2) {
            addCriterion("sch_name not between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchDescIsNull() {
            addCriterion("sch_desc is null");
            return (Criteria) this;
        }

        public Criteria andSchDescIsNotNull() {
            addCriterion("sch_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSchDescEqualTo(String value) {
            addCriterion("sch_desc =", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotEqualTo(String value) {
            addCriterion("sch_desc <>", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescGreaterThan(String value) {
            addCriterion("sch_desc >", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescGreaterThanOrEqualTo(String value) {
            addCriterion("sch_desc >=", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLessThan(String value) {
            addCriterion("sch_desc <", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLessThanOrEqualTo(String value) {
            addCriterion("sch_desc <=", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLike(String value) {
            addCriterion("sch_desc like", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotLike(String value) {
            addCriterion("sch_desc not like", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescIn(List<String> values) {
            addCriterion("sch_desc in", values, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotIn(List<String> values) {
            addCriterion("sch_desc not in", values, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescBetween(String value1, String value2) {
            addCriterion("sch_desc between", value1, value2, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotBetween(String value1, String value2) {
            addCriterion("sch_desc not between", value1, value2, "schDesc");
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