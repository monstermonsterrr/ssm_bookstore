package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PromoterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromoterExample() {
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

        public Criteria andPromoIdIsNull() {
            addCriterion("promo_id is null");
            return (Criteria) this;
        }

        public Criteria andPromoIdIsNotNull() {
            addCriterion("promo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromoIdEqualTo(Integer value) {
            addCriterion("promo_id =", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotEqualTo(Integer value) {
            addCriterion("promo_id <>", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdGreaterThan(Integer value) {
            addCriterion("promo_id >", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo_id >=", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdLessThan(Integer value) {
            addCriterion("promo_id <", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdLessThanOrEqualTo(Integer value) {
            addCriterion("promo_id <=", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdIn(List<Integer> values) {
            addCriterion("promo_id in", values, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotIn(List<Integer> values) {
            addCriterion("promo_id not in", values, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdBetween(Integer value1, Integer value2) {
            addCriterion("promo_id between", value1, value2, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promo_id not between", value1, value2, "promoId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Integer value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Integer value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Integer value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Integer value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Integer value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Integer> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Integer> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Integer value1, Integer value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPromoNameIsNull() {
            addCriterion("promo_name is null");
            return (Criteria) this;
        }

        public Criteria andPromoNameIsNotNull() {
            addCriterion("promo_name is not null");
            return (Criteria) this;
        }

        public Criteria andPromoNameEqualTo(String value) {
            addCriterion("promo_name =", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotEqualTo(String value) {
            addCriterion("promo_name <>", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameGreaterThan(String value) {
            addCriterion("promo_name >", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameGreaterThanOrEqualTo(String value) {
            addCriterion("promo_name >=", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLessThan(String value) {
            addCriterion("promo_name <", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLessThanOrEqualTo(String value) {
            addCriterion("promo_name <=", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLike(String value) {
            addCriterion("promo_name like", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotLike(String value) {
            addCriterion("promo_name not like", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameIn(List<String> values) {
            addCriterion("promo_name in", values, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotIn(List<String> values) {
            addCriterion("promo_name not in", values, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameBetween(String value1, String value2) {
            addCriterion("promo_name between", value1, value2, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotBetween(String value1, String value2) {
            addCriterion("promo_name not between", value1, value2, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoAmountIsNull() {
            addCriterion("promo_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromoAmountIsNotNull() {
            addCriterion("promo_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromoAmountEqualTo(Integer value) {
            addCriterion("promo_amount =", value, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountNotEqualTo(Integer value) {
            addCriterion("promo_amount <>", value, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountGreaterThan(Integer value) {
            addCriterion("promo_amount >", value, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo_amount >=", value, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountLessThan(Integer value) {
            addCriterion("promo_amount <", value, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountLessThanOrEqualTo(Integer value) {
            addCriterion("promo_amount <=", value, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountIn(List<Integer> values) {
            addCriterion("promo_amount in", values, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountNotIn(List<Integer> values) {
            addCriterion("promo_amount not in", values, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountBetween(Integer value1, Integer value2) {
            addCriterion("promo_amount between", value1, value2, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("promo_amount not between", value1, value2, "promoAmount");
            return (Criteria) this;
        }

        public Criteria andPromoPriceIsNull() {
            addCriterion("promo_price is null");
            return (Criteria) this;
        }

        public Criteria andPromoPriceIsNotNull() {
            addCriterion("promo_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromoPriceEqualTo(Integer value) {
            addCriterion("promo_price =", value, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceNotEqualTo(Integer value) {
            addCriterion("promo_price <>", value, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceGreaterThan(Integer value) {
            addCriterion("promo_price >", value, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo_price >=", value, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceLessThan(Integer value) {
            addCriterion("promo_price <", value, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceLessThanOrEqualTo(Integer value) {
            addCriterion("promo_price <=", value, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceIn(List<Integer> values) {
            addCriterion("promo_price in", values, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceNotIn(List<Integer> values) {
            addCriterion("promo_price not in", values, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceBetween(Integer value1, Integer value2) {
            addCriterion("promo_price between", value1, value2, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("promo_price not between", value1, value2, "promoPrice");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseIsNull() {
            addCriterion("promo_table_false is null");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseIsNotNull() {
            addCriterion("promo_table_false is not null");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseEqualTo(Integer value) {
            addCriterion("promo_table_false =", value, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseNotEqualTo(Integer value) {
            addCriterion("promo_table_false <>", value, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseGreaterThan(Integer value) {
            addCriterion("promo_table_false >", value, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo_table_false >=", value, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseLessThan(Integer value) {
            addCriterion("promo_table_false <", value, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseLessThanOrEqualTo(Integer value) {
            addCriterion("promo_table_false <=", value, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseIn(List<Integer> values) {
            addCriterion("promo_table_false in", values, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseNotIn(List<Integer> values) {
            addCriterion("promo_table_false not in", values, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseBetween(Integer value1, Integer value2) {
            addCriterion("promo_table_false between", value1, value2, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableFalseNotBetween(Integer value1, Integer value2) {
            addCriterion("promo_table_false not between", value1, value2, "promoTableFalse");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueIsNull() {
            addCriterion("promo_table_true is null");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueIsNotNull() {
            addCriterion("promo_table_true is not null");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueEqualTo(Integer value) {
            addCriterion("promo_table_true =", value, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueNotEqualTo(Integer value) {
            addCriterion("promo_table_true <>", value, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueGreaterThan(Integer value) {
            addCriterion("promo_table_true >", value, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo_table_true >=", value, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueLessThan(Integer value) {
            addCriterion("promo_table_true <", value, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueLessThanOrEqualTo(Integer value) {
            addCriterion("promo_table_true <=", value, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueIn(List<Integer> values) {
            addCriterion("promo_table_true in", values, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueNotIn(List<Integer> values) {
            addCriterion("promo_table_true not in", values, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueBetween(Integer value1, Integer value2) {
            addCriterion("promo_table_true between", value1, value2, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoTableTrueNotBetween(Integer value1, Integer value2) {
            addCriterion("promo_table_true not between", value1, value2, "promoTableTrue");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeIsNull() {
            addCriterion("promo_add_sub_time is null");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeIsNotNull() {
            addCriterion("promo_add_sub_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeEqualTo(Date value) {
            addCriterionForJDBCDate("promo_add_sub_time =", value, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("promo_add_sub_time <>", value, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("promo_add_sub_time >", value, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promo_add_sub_time >=", value, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeLessThan(Date value) {
            addCriterionForJDBCDate("promo_add_sub_time <", value, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promo_add_sub_time <=", value, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeIn(List<Date> values) {
            addCriterionForJDBCDate("promo_add_sub_time in", values, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("promo_add_sub_time not in", values, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promo_add_sub_time between", value1, value2, "promoAddSubTime");
            return (Criteria) this;
        }

        public Criteria andPromoAddSubTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promo_add_sub_time not between", value1, value2, "promoAddSubTime");
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