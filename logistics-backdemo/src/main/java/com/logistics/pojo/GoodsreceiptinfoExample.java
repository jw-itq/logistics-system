package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsreceiptinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsreceiptinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordIsNull() {
            addCriterion("check_goods_record is null");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordIsNotNull() {
            addCriterion("check_goods_record is not null");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordEqualTo(String value) {
            addCriterion("check_goods_record =", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordNotEqualTo(String value) {
            addCriterion("check_goods_record <>", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordGreaterThan(String value) {
            addCriterion("check_goods_record >", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordGreaterThanOrEqualTo(String value) {
            addCriterion("check_goods_record >=", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordLessThan(String value) {
            addCriterion("check_goods_record <", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordLessThanOrEqualTo(String value) {
            addCriterion("check_goods_record <=", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordLike(String value) {
            addCriterion("check_goods_record like", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordNotLike(String value) {
            addCriterion("check_goods_record not like", value, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordIn(List<String> values) {
            addCriterion("check_goods_record in", values, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordNotIn(List<String> values) {
            addCriterion("check_goods_record not in", values, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordBetween(String value1, String value2) {
            addCriterion("check_goods_record between", value1, value2, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andCheckGoodsRecordNotBetween(String value1, String value2) {
            addCriterion("check_goods_record not between", value1, value2, "checkGoodsRecord");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeIsNull() {
            addCriterion("goods_revert_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeIsNotNull() {
            addCriterion("goods_revert_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeEqualTo(String value) {
            addCriterion("goods_revert_code =", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeNotEqualTo(String value) {
            addCriterion("goods_revert_code <>", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeGreaterThan(String value) {
            addCriterion("goods_revert_code >", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_revert_code >=", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeLessThan(String value) {
            addCriterion("goods_revert_code <", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_revert_code <=", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeLike(String value) {
            addCriterion("goods_revert_code like", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeNotLike(String value) {
            addCriterion("goods_revert_code not like", value, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeIn(List<String> values) {
            addCriterion("goods_revert_code in", values, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeNotIn(List<String> values) {
            addCriterion("goods_revert_code not in", values, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeBetween(String value1, String value2) {
            addCriterion("goods_revert_code between", value1, value2, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertCodeNotBetween(String value1, String value2) {
            addCriterion("goods_revert_code not between", value1, value2, "goodsRevertCode");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateIsNull() {
            addCriterion("rceive_goods_date is null");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateIsNotNull() {
            addCriterion("rceive_goods_date is not null");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateEqualTo(Date value) {
            addCriterionForJDBCDate("rceive_goods_date =", value, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rceive_goods_date <>", value, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("rceive_goods_date >", value, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rceive_goods_date >=", value, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateLessThan(Date value) {
            addCriterionForJDBCDate("rceive_goods_date <", value, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rceive_goods_date <=", value, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateIn(List<Date> values) {
            addCriterionForJDBCDate("rceive_goods_date in", values, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rceive_goods_date not in", values, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rceive_goods_date between", value1, value2, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andRceiveGoodsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rceive_goods_date not between", value1, value2, "rceiveGoodsDate");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonIsNull() {
            addCriterion("receive_goods_person is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonIsNotNull() {
            addCriterion("receive_goods_person is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonEqualTo(String value) {
            addCriterion("receive_goods_person =", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonNotEqualTo(String value) {
            addCriterion("receive_goods_person <>", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonGreaterThan(String value) {
            addCriterion("receive_goods_person >", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_person >=", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonLessThan(String value) {
            addCriterion("receive_goods_person <", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_person <=", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonLike(String value) {
            addCriterion("receive_goods_person like", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonNotLike(String value) {
            addCriterion("receive_goods_person not like", value, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonIn(List<String> values) {
            addCriterion("receive_goods_person in", values, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonNotIn(List<String> values) {
            addCriterion("receive_goods_person not in", values, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonBetween(String value1, String value2) {
            addCriterion("receive_goods_person between", value1, value2, "receiveGoodsPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsPersonNotBetween(String value1, String value2) {
            addCriterion("receive_goods_person not between", value1, value2, "receiveGoodsPerson");
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