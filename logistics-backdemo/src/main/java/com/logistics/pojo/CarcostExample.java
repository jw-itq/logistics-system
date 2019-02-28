package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarcostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarcostExample() {
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

        public Criteria andDriverCodeIsNull() {
            addCriterion("driver_code is null");
            return (Criteria) this;
        }

        public Criteria andDriverCodeIsNotNull() {
            addCriterion("driver_code is not null");
            return (Criteria) this;
        }

        public Criteria andDriverCodeEqualTo(String value) {
            addCriterion("driver_code =", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotEqualTo(String value) {
            addCriterion("driver_code <>", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeGreaterThan(String value) {
            addCriterion("driver_code >", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeGreaterThanOrEqualTo(String value) {
            addCriterion("driver_code >=", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeLessThan(String value) {
            addCriterion("driver_code <", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeLessThanOrEqualTo(String value) {
            addCriterion("driver_code <=", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeLike(String value) {
            addCriterion("driver_code like", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotLike(String value) {
            addCriterion("driver_code not like", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeIn(List<String> values) {
            addCriterion("driver_code in", values, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotIn(List<String> values) {
            addCriterion("driver_code not in", values, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeBetween(String value1, String value2) {
            addCriterion("driver_code between", value1, value2, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotBetween(String value1, String value2) {
            addCriterion("driver_code not between", value1, value2, "driverCode");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalIsNull() {
            addCriterion("add_carriage_total is null");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalIsNotNull() {
            addCriterion("add_carriage_total is not null");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalEqualTo(Double value) {
            addCriterion("add_carriage_total =", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalNotEqualTo(Double value) {
            addCriterion("add_carriage_total <>", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalGreaterThan(Double value) {
            addCriterion("add_carriage_total >", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("add_carriage_total >=", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalLessThan(Double value) {
            addCriterion("add_carriage_total <", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalLessThanOrEqualTo(Double value) {
            addCriterion("add_carriage_total <=", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalIn(List<Double> values) {
            addCriterion("add_carriage_total in", values, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalNotIn(List<Double> values) {
            addCriterion("add_carriage_total not in", values, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalBetween(Double value1, Double value2) {
            addCriterion("add_carriage_total between", value1, value2, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalNotBetween(Double value1, Double value2) {
            addCriterion("add_carriage_total not between", value1, value2, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightIsNull() {
            addCriterion("allow_carry_weight is null");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightIsNotNull() {
            addCriterion("allow_carry_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightEqualTo(Double value) {
            addCriterion("allow_carry_weight =", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightNotEqualTo(Double value) {
            addCriterion("allow_carry_weight <>", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightGreaterThan(Double value) {
            addCriterion("allow_carry_weight >", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("allow_carry_weight >=", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightLessThan(Double value) {
            addCriterion("allow_carry_weight <", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightLessThanOrEqualTo(Double value) {
            addCriterion("allow_carry_weight <=", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightIn(List<Double> values) {
            addCriterion("allow_carry_weight in", values, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightNotIn(List<Double> values) {
            addCriterion("allow_carry_weight not in", values, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightBetween(Double value1, Double value2) {
            addCriterion("allow_carry_weight between", value1, value2, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightNotBetween(Double value1, Double value2) {
            addCriterion("allow_carry_weight not between", value1, value2, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeIsNull() {
            addCriterion("back_bill_code is null");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeIsNotNull() {
            addCriterion("back_bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeEqualTo(String value) {
            addCriterion("back_bill_code =", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeNotEqualTo(String value) {
            addCriterion("back_bill_code <>", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeGreaterThan(String value) {
            addCriterion("back_bill_code >", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("back_bill_code >=", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeLessThan(String value) {
            addCriterion("back_bill_code <", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeLessThanOrEqualTo(String value) {
            addCriterion("back_bill_code <=", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeLike(String value) {
            addCriterion("back_bill_code like", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeNotLike(String value) {
            addCriterion("back_bill_code not like", value, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeIn(List<String> values) {
            addCriterion("back_bill_code in", values, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeNotIn(List<String> values) {
            addCriterion("back_bill_code not in", values, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeBetween(String value1, String value2) {
            addCriterion("back_bill_code between", value1, value2, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBackBillCodeNotBetween(String value1, String value2) {
            addCriterion("back_bill_code not between", value1, value2, "backBillCode");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeIsNull() {
            addCriterion("balance_time is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeIsNotNull() {
            addCriterion("balance_time is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeEqualTo(Date value) {
            addCriterion("balance_time =", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeNotEqualTo(Date value) {
            addCriterion("balance_time <>", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeGreaterThan(Date value) {
            addCriterion("balance_time >", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("balance_time >=", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeLessThan(Date value) {
            addCriterion("balance_time <", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("balance_time <=", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeIn(List<Date> values) {
            addCriterion("balance_time in", values, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeNotIn(List<Date> values) {
            addCriterion("balance_time not in", values, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeBetween(Date value1, Date value2) {
            addCriterion("balance_time between", value1, value2, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("balance_time not between", value1, value2, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNull() {
            addCriterion("car_width is null");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNotNull() {
            addCriterion("car_width is not null");
            return (Criteria) this;
        }

        public Criteria andCarWidthEqualTo(String value) {
            addCriterion("car_width =", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotEqualTo(String value) {
            addCriterion("car_width <>", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThan(String value) {
            addCriterion("car_width >", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThanOrEqualTo(String value) {
            addCriterion("car_width >=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThan(String value) {
            addCriterion("car_width <", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThanOrEqualTo(String value) {
            addCriterion("car_width <=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLike(String value) {
            addCriterion("car_width like", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotLike(String value) {
            addCriterion("car_width not like", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthIn(List<String> values) {
            addCriterion("car_width in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotIn(List<String> values) {
            addCriterion("car_width not in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthBetween(String value1, String value2) {
            addCriterion("car_width between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotBetween(String value1, String value2) {
            addCriterion("car_width not between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalIsNull() {
            addCriterion("carry_fee_total is null");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalIsNotNull() {
            addCriterion("carry_fee_total is not null");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalEqualTo(Double value) {
            addCriterion("carry_fee_total =", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalNotEqualTo(Double value) {
            addCriterion("carry_fee_total <>", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalGreaterThan(Double value) {
            addCriterion("carry_fee_total >", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("carry_fee_total >=", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalLessThan(Double value) {
            addCriterion("carry_fee_total <", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalLessThanOrEqualTo(Double value) {
            addCriterion("carry_fee_total <=", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalIn(List<Double> values) {
            addCriterion("carry_fee_total in", values, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalNotIn(List<Double> values) {
            addCriterion("carry_fee_total not in", values, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalBetween(Double value1, Double value2) {
            addCriterion("carry_fee_total between", value1, value2, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalNotBetween(Double value1, Double value2) {
            addCriterion("carry_fee_total not between", value1, value2, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationIsNull() {
            addCriterion("deal_goods_station is null");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationIsNotNull() {
            addCriterion("deal_goods_station is not null");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationEqualTo(String value) {
            addCriterion("deal_goods_station =", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotEqualTo(String value) {
            addCriterion("deal_goods_station <>", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationGreaterThan(String value) {
            addCriterion("deal_goods_station >", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationGreaterThanOrEqualTo(String value) {
            addCriterion("deal_goods_station >=", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationLessThan(String value) {
            addCriterion("deal_goods_station <", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationLessThanOrEqualTo(String value) {
            addCriterion("deal_goods_station <=", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationLike(String value) {
            addCriterion("deal_goods_station like", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotLike(String value) {
            addCriterion("deal_goods_station not like", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationIn(List<String> values) {
            addCriterion("deal_goods_station in", values, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotIn(List<String> values) {
            addCriterion("deal_goods_station not in", values, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationBetween(String value1, String value2) {
            addCriterion("deal_goods_station between", value1, value2, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotBetween(String value1, String value2) {
            addCriterion("deal_goods_station not between", value1, value2, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalIsNull() {
            addCriterion("fact_carriage_total is null");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalIsNotNull() {
            addCriterion("fact_carriage_total is not null");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalEqualTo(Double value) {
            addCriterion("fact_carriage_total =", value, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalNotEqualTo(Double value) {
            addCriterion("fact_carriage_total <>", value, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalGreaterThan(Double value) {
            addCriterion("fact_carriage_total >", value, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("fact_carriage_total >=", value, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalLessThan(Double value) {
            addCriterion("fact_carriage_total <", value, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalLessThanOrEqualTo(Double value) {
            addCriterion("fact_carriage_total <=", value, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalIn(List<Double> values) {
            addCriterion("fact_carriage_total in", values, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalNotIn(List<Double> values) {
            addCriterion("fact_carriage_total not in", values, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalBetween(Double value1, Double value2) {
            addCriterion("fact_carriage_total between", value1, value2, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andFactCarriageTotalNotBetween(Double value1, Double value2) {
            addCriterion("fact_carriage_total not between", value1, value2, "factCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIsNull() {
            addCriterion("goods_height is null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIsNotNull() {
            addCriterion("goods_height is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightEqualTo(String value) {
            addCriterion("goods_height =", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotEqualTo(String value) {
            addCriterion("goods_height <>", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightGreaterThan(String value) {
            addCriterion("goods_height >", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightGreaterThanOrEqualTo(String value) {
            addCriterion("goods_height >=", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLessThan(String value) {
            addCriterion("goods_height <", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLessThanOrEqualTo(String value) {
            addCriterion("goods_height <=", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLike(String value) {
            addCriterion("goods_height like", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotLike(String value) {
            addCriterion("goods_height not like", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIn(List<String> values) {
            addCriterion("goods_height in", values, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotIn(List<String> values) {
            addCriterion("goods_height not in", values, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightBetween(String value1, String value2) {
            addCriterion("goods_height between", value1, value2, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotBetween(String value1, String value2) {
            addCriterion("goods_height not between", value1, value2, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andLoadStationIsNull() {
            addCriterion("load_station is null");
            return (Criteria) this;
        }

        public Criteria andLoadStationIsNotNull() {
            addCriterion("load_station is not null");
            return (Criteria) this;
        }

        public Criteria andLoadStationEqualTo(String value) {
            addCriterion("load_station =", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotEqualTo(String value) {
            addCriterion("load_station <>", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationGreaterThan(String value) {
            addCriterion("load_station >", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationGreaterThanOrEqualTo(String value) {
            addCriterion("load_station >=", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationLessThan(String value) {
            addCriterion("load_station <", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationLessThanOrEqualTo(String value) {
            addCriterion("load_station <=", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationLike(String value) {
            addCriterion("load_station like", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotLike(String value) {
            addCriterion("load_station not like", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationIn(List<String> values) {
            addCriterion("load_station in", values, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotIn(List<String> values) {
            addCriterion("load_station not in", values, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationBetween(String value1, String value2) {
            addCriterion("load_station between", value1, value2, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotBetween(String value1, String value2) {
            addCriterion("load_station not between", value1, value2, "loadStation");
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