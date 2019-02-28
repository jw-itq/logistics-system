package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillreleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillreleaseExample() {
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

        public Criteria andAcceptStationIsNull() {
            addCriterion("accept_station is null");
            return (Criteria) this;
        }

        public Criteria andAcceptStationIsNotNull() {
            addCriterion("accept_station is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptStationEqualTo(String value) {
            addCriterion("accept_station =", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotEqualTo(String value) {
            addCriterion("accept_station <>", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationGreaterThan(String value) {
            addCriterion("accept_station >", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationGreaterThanOrEqualTo(String value) {
            addCriterion("accept_station >=", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationLessThan(String value) {
            addCriterion("accept_station <", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationLessThanOrEqualTo(String value) {
            addCriterion("accept_station <=", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationLike(String value) {
            addCriterion("accept_station like", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotLike(String value) {
            addCriterion("accept_station not like", value, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationIn(List<String> values) {
            addCriterion("accept_station in", values, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotIn(List<String> values) {
            addCriterion("accept_station not in", values, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationBetween(String value1, String value2) {
            addCriterion("accept_station between", value1, value2, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andAcceptStationNotBetween(String value1, String value2) {
            addCriterion("accept_station not between", value1, value2, "acceptStation");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNull() {
            addCriterion("bill_code is null");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNotNull() {
            addCriterion("bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andBillCodeEqualTo(String value) {
            addCriterion("bill_code =", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotEqualTo(String value) {
            addCriterion("bill_code <>", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThan(String value) {
            addCriterion("bill_code >", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_code >=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThan(String value) {
            addCriterion("bill_code <", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThanOrEqualTo(String value) {
            addCriterion("bill_code <=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLike(String value) {
            addCriterion("bill_code like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotLike(String value) {
            addCriterion("bill_code not like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeIn(List<String> values) {
            addCriterion("bill_code in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotIn(List<String> values) {
            addCriterion("bill_code not in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeBetween(String value1, String value2) {
            addCriterion("bill_code between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotBetween(String value1, String value2) {
            addCriterion("bill_code not between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("bill_type like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("bill_type not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonIsNull() {
            addCriterion("receive_bill_person is null");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonIsNotNull() {
            addCriterion("receive_bill_person is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonEqualTo(String value) {
            addCriterion("receive_bill_person =", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonNotEqualTo(String value) {
            addCriterion("receive_bill_person <>", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonGreaterThan(String value) {
            addCriterion("receive_bill_person >", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonGreaterThanOrEqualTo(String value) {
            addCriterion("receive_bill_person >=", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonLessThan(String value) {
            addCriterion("receive_bill_person <", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonLessThanOrEqualTo(String value) {
            addCriterion("receive_bill_person <=", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonLike(String value) {
            addCriterion("receive_bill_person like", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonNotLike(String value) {
            addCriterion("receive_bill_person not like", value, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonIn(List<String> values) {
            addCriterion("receive_bill_person in", values, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonNotIn(List<String> values) {
            addCriterion("receive_bill_person not in", values, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonBetween(String value1, String value2) {
            addCriterion("receive_bill_person between", value1, value2, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillPersonNotBetween(String value1, String value2) {
            addCriterion("receive_bill_person not between", value1, value2, "receiveBillPerson");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeIsNull() {
            addCriterion("receive_bill_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeIsNotNull() {
            addCriterion("receive_bill_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeEqualTo(Date value) {
            addCriterionForJDBCDate("receive_bill_time =", value, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("receive_bill_time <>", value, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("receive_bill_time >", value, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receive_bill_time >=", value, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeLessThan(Date value) {
            addCriterionForJDBCDate("receive_bill_time <", value, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receive_bill_time <=", value, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeIn(List<Date> values) {
            addCriterionForJDBCDate("receive_bill_time in", values, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("receive_bill_time not in", values, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receive_bill_time between", value1, value2, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBillTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receive_bill_time not between", value1, value2, "receiveBillTime");
            return (Criteria) this;
        }

        public Criteria andReleasePersonIsNull() {
            addCriterion("release_person is null");
            return (Criteria) this;
        }

        public Criteria andReleasePersonIsNotNull() {
            addCriterion("release_person is not null");
            return (Criteria) this;
        }

        public Criteria andReleasePersonEqualTo(String value) {
            addCriterion("release_person =", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonNotEqualTo(String value) {
            addCriterion("release_person <>", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonGreaterThan(String value) {
            addCriterion("release_person >", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonGreaterThanOrEqualTo(String value) {
            addCriterion("release_person >=", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonLessThan(String value) {
            addCriterion("release_person <", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonLessThanOrEqualTo(String value) {
            addCriterion("release_person <=", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonLike(String value) {
            addCriterion("release_person like", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonNotLike(String value) {
            addCriterion("release_person not like", value, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonIn(List<String> values) {
            addCriterion("release_person in", values, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonNotIn(List<String> values) {
            addCriterion("release_person not in", values, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonBetween(String value1, String value2) {
            addCriterion("release_person between", value1, value2, "releasePerson");
            return (Criteria) this;
        }

        public Criteria andReleasePersonNotBetween(String value1, String value2) {
            addCriterion("release_person not between", value1, value2, "releasePerson");
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