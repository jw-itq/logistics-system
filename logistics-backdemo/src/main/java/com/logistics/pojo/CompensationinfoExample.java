package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompensationinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompensationinfoExample() {
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

        public Criteria andAmendsIsNull() {
            addCriterion("amends is null");
            return (Criteria) this;
        }

        public Criteria andAmendsIsNotNull() {
            addCriterion("amends is not null");
            return (Criteria) this;
        }

        public Criteria andAmendsEqualTo(Double value) {
            addCriterion("amends =", value, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsNotEqualTo(Double value) {
            addCriterion("amends <>", value, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsGreaterThan(Double value) {
            addCriterion("amends >", value, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsGreaterThanOrEqualTo(Double value) {
            addCriterion("amends >=", value, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsLessThan(Double value) {
            addCriterion("amends <", value, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsLessThanOrEqualTo(Double value) {
            addCriterion("amends <=", value, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsIn(List<Double> values) {
            addCriterion("amends in", values, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsNotIn(List<Double> values) {
            addCriterion("amends not in", values, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsBetween(Double value1, Double value2) {
            addCriterion("amends between", value1, value2, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsNotBetween(Double value1, Double value2) {
            addCriterion("amends not between", value1, value2, "amends");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeIsNull() {
            addCriterion("amends_time is null");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeIsNotNull() {
            addCriterion("amends_time is not null");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeEqualTo(Date value) {
            addCriterionForJDBCDate("amends_time =", value, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("amends_time <>", value, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("amends_time >", value, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("amends_time >=", value, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeLessThan(Date value) {
            addCriterionForJDBCDate("amends_time <", value, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("amends_time <=", value, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeIn(List<Date> values) {
            addCriterionForJDBCDate("amends_time in", values, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("amends_time not in", values, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("amends_time between", value1, value2, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andAmendsTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("amends_time not between", value1, value2, "amendsTime");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsIsNull() {
            addCriterion("bad_destroy_goods is null");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsIsNotNull() {
            addCriterion("bad_destroy_goods is not null");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsEqualTo(Double value) {
            addCriterion("bad_destroy_goods =", value, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsNotEqualTo(Double value) {
            addCriterion("bad_destroy_goods <>", value, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsGreaterThan(Double value) {
            addCriterion("bad_destroy_goods >", value, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsGreaterThanOrEqualTo(Double value) {
            addCriterion("bad_destroy_goods >=", value, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsLessThan(Double value) {
            addCriterion("bad_destroy_goods <", value, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsLessThanOrEqualTo(Double value) {
            addCriterion("bad_destroy_goods <=", value, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsIn(List<Double> values) {
            addCriterion("bad_destroy_goods in", values, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsNotIn(List<Double> values) {
            addCriterion("bad_destroy_goods not in", values, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsBetween(Double value1, Double value2) {
            addCriterion("bad_destroy_goods between", value1, value2, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andBadDestroyGoodsNotBetween(Double value1, Double value2) {
            addCriterion("bad_destroy_goods not between", value1, value2, "badDestroyGoods");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdIsNull() {
            addCriterion("receive_station_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdIsNotNull() {
            addCriterion("receive_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdEqualTo(Integer value) {
            addCriterion("receive_station_id =", value, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdNotEqualTo(Integer value) {
            addCriterion("receive_station_id <>", value, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdGreaterThan(Integer value) {
            addCriterion("receive_station_id >", value, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_station_id >=", value, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdLessThan(Integer value) {
            addCriterion("receive_station_id <", value, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_station_id <=", value, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdIn(List<Integer> values) {
            addCriterion("receive_station_id in", values, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdNotIn(List<Integer> values) {
            addCriterion("receive_station_id not in", values, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_station_id between", value1, value2, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_station_id not between", value1, value2, "receiveStationId");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameIsNull() {
            addCriterion("receive_station_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameIsNotNull() {
            addCriterion("receive_station_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameEqualTo(String value) {
            addCriterion("receive_station_name =", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameNotEqualTo(String value) {
            addCriterion("receive_station_name <>", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameGreaterThan(String value) {
            addCriterion("receive_station_name >", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_station_name >=", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameLessThan(String value) {
            addCriterion("receive_station_name <", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameLessThanOrEqualTo(String value) {
            addCriterion("receive_station_name <=", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameLike(String value) {
            addCriterion("receive_station_name like", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameNotLike(String value) {
            addCriterion("receive_station_name not like", value, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameIn(List<String> values) {
            addCriterion("receive_station_name in", values, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameNotIn(List<String> values) {
            addCriterion("receive_station_name not in", values, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameBetween(String value1, String value2) {
            addCriterion("receive_station_name between", value1, value2, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andReceiveStationNameNotBetween(String value1, String value2) {
            addCriterion("receive_station_name not between", value1, value2, "receiveStationName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNull() {
            addCriterion("write_date is null");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNotNull() {
            addCriterion("write_date is not null");
            return (Criteria) this;
        }

        public Criteria andWriteDateEqualTo(Date value) {
            addCriterionForJDBCDate("write_date =", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("write_date <>", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThan(Date value) {
            addCriterionForJDBCDate("write_date >", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("write_date >=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThan(Date value) {
            addCriterionForJDBCDate("write_date <", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("write_date <=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateIn(List<Date> values) {
            addCriterionForJDBCDate("write_date in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("write_date not in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("write_date between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("write_date not between", value1, value2, "writeDate");
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