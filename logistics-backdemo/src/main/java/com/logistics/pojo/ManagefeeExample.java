package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ManagefeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagefeeExample() {
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

        public Criteria andHouseRentIsNull() {
            addCriterion("house_rent is null");
            return (Criteria) this;
        }

        public Criteria andHouseRentIsNotNull() {
            addCriterion("house_rent is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRentEqualTo(Double value) {
            addCriterion("house_rent =", value, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentNotEqualTo(Double value) {
            addCriterion("house_rent <>", value, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentGreaterThan(Double value) {
            addCriterion("house_rent >", value, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentGreaterThanOrEqualTo(Double value) {
            addCriterion("house_rent >=", value, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentLessThan(Double value) {
            addCriterion("house_rent <", value, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentLessThanOrEqualTo(Double value) {
            addCriterion("house_rent <=", value, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentIn(List<Double> values) {
            addCriterion("house_rent in", values, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentNotIn(List<Double> values) {
            addCriterion("house_rent not in", values, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentBetween(Double value1, Double value2) {
            addCriterion("house_rent between", value1, value2, "houseRent");
            return (Criteria) this;
        }

        public Criteria andHouseRentNotBetween(Double value1, Double value2) {
            addCriterion("house_rent not between", value1, value2, "houseRent");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeIsNull() {
            addCriterion("office_fee is null");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeIsNotNull() {
            addCriterion("office_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeEqualTo(Double value) {
            addCriterion("office_fee =", value, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeNotEqualTo(Double value) {
            addCriterion("office_fee <>", value, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeGreaterThan(Double value) {
            addCriterion("office_fee >", value, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("office_fee >=", value, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeLessThan(Double value) {
            addCriterion("office_fee <", value, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeLessThanOrEqualTo(Double value) {
            addCriterion("office_fee <=", value, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeIn(List<Double> values) {
            addCriterion("office_fee in", values, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeNotIn(List<Double> values) {
            addCriterion("office_fee not in", values, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeBetween(Double value1, Double value2) {
            addCriterion("office_fee between", value1, value2, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOfficeFeeNotBetween(Double value1, Double value2) {
            addCriterion("office_fee not between", value1, value2, "officeFee");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutIsNull() {
            addCriterion("other_payout is null");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutIsNotNull() {
            addCriterion("other_payout is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutEqualTo(Double value) {
            addCriterion("other_payout =", value, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutNotEqualTo(Double value) {
            addCriterion("other_payout <>", value, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutGreaterThan(Double value) {
            addCriterion("other_payout >", value, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutGreaterThanOrEqualTo(Double value) {
            addCriterion("other_payout >=", value, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutLessThan(Double value) {
            addCriterion("other_payout <", value, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutLessThanOrEqualTo(Double value) {
            addCriterion("other_payout <=", value, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutIn(List<Double> values) {
            addCriterion("other_payout in", values, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutNotIn(List<Double> values) {
            addCriterion("other_payout not in", values, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutBetween(Double value1, Double value2) {
            addCriterion("other_payout between", value1, value2, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andOtherPayoutNotBetween(Double value1, Double value2) {
            addCriterion("other_payout not between", value1, value2, "otherPayout");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthIsNull() {
            addCriterion("payout_month is null");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthIsNotNull() {
            addCriterion("payout_month is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthEqualTo(String value) {
            addCriterion("payout_month =", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthNotEqualTo(String value) {
            addCriterion("payout_month <>", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthGreaterThan(String value) {
            addCriterion("payout_month >", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthGreaterThanOrEqualTo(String value) {
            addCriterion("payout_month >=", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthLessThan(String value) {
            addCriterion("payout_month <", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthLessThanOrEqualTo(String value) {
            addCriterion("payout_month <=", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthLike(String value) {
            addCriterion("payout_month like", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthNotLike(String value) {
            addCriterion("payout_month not like", value, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthIn(List<String> values) {
            addCriterion("payout_month in", values, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthNotIn(List<String> values) {
            addCriterion("payout_month not in", values, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthBetween(String value1, String value2) {
            addCriterion("payout_month between", value1, value2, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPayoutMonthNotBetween(String value1, String value2) {
            addCriterion("payout_month not between", value1, value2, "payoutMonth");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeIsNull() {
            addCriterion("phone_fee is null");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeIsNotNull() {
            addCriterion("phone_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeEqualTo(Double value) {
            addCriterion("phone_fee =", value, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeNotEqualTo(Double value) {
            addCriterion("phone_fee <>", value, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeGreaterThan(Double value) {
            addCriterion("phone_fee >", value, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("phone_fee >=", value, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeLessThan(Double value) {
            addCriterion("phone_fee <", value, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeLessThanOrEqualTo(Double value) {
            addCriterion("phone_fee <=", value, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeIn(List<Double> values) {
            addCriterion("phone_fee in", values, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeNotIn(List<Double> values) {
            addCriterion("phone_fee not in", values, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeBetween(Double value1, Double value2) {
            addCriterion("phone_fee between", value1, value2, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andPhoneFeeNotBetween(Double value1, Double value2) {
            addCriterion("phone_fee not between", value1, value2, "phoneFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeIsNull() {
            addCriterion("water_elec_fee is null");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeIsNotNull() {
            addCriterion("water_elec_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeEqualTo(Double value) {
            addCriterion("water_elec_fee =", value, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeNotEqualTo(Double value) {
            addCriterion("water_elec_fee <>", value, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeGreaterThan(Double value) {
            addCriterion("water_elec_fee >", value, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("water_elec_fee >=", value, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeLessThan(Double value) {
            addCriterion("water_elec_fee <", value, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeLessThanOrEqualTo(Double value) {
            addCriterion("water_elec_fee <=", value, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeIn(List<Double> values) {
            addCriterion("water_elec_fee in", values, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeNotIn(List<Double> values) {
            addCriterion("water_elec_fee not in", values, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeBetween(Double value1, Double value2) {
            addCriterion("water_elec_fee between", value1, value2, "waterElecFee");
            return (Criteria) this;
        }

        public Criteria andWaterElecFeeNotBetween(Double value1, Double value2) {
            addCriterion("water_elec_fee not between", value1, value2, "waterElecFee");
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