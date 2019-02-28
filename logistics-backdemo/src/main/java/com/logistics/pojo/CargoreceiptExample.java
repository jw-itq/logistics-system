package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CargoreceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CargoreceiptExample() {
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

        public Criteria andGoodsRevertBillCodeIsNull() {
            addCriterion("goods_revert_bill_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeIsNotNull() {
            addCriterion("goods_revert_bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeEqualTo(String value) {
            addCriterion("goods_revert_bill_code =", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotEqualTo(String value) {
            addCriterion("goods_revert_bill_code <>", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeGreaterThan(String value) {
            addCriterion("goods_revert_bill_code >", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_revert_bill_code >=", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeLessThan(String value) {
            addCriterion("goods_revert_bill_code <", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_revert_bill_code <=", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeLike(String value) {
            addCriterion("goods_revert_bill_code like", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotLike(String value) {
            addCriterion("goods_revert_bill_code not like", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeIn(List<String> values) {
            addCriterion("goods_revert_bill_code in", values, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotIn(List<String> values) {
            addCriterion("goods_revert_bill_code not in", values, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeBetween(String value1, String value2) {
            addCriterion("goods_revert_bill_code between", value1, value2, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotBetween(String value1, String value2) {
            addCriterion("goods_revert_bill_code not between", value1, value2, "goodsRevertBillCode");
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

        public Criteria andAllCarriageIsNull() {
            addCriterion("all_carriage is null");
            return (Criteria) this;
        }

        public Criteria andAllCarriageIsNotNull() {
            addCriterion("all_carriage is not null");
            return (Criteria) this;
        }

        public Criteria andAllCarriageEqualTo(Double value) {
            addCriterion("all_carriage =", value, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageNotEqualTo(Double value) {
            addCriterion("all_carriage <>", value, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageGreaterThan(Double value) {
            addCriterion("all_carriage >", value, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageGreaterThanOrEqualTo(Double value) {
            addCriterion("all_carriage >=", value, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageLessThan(Double value) {
            addCriterion("all_carriage <", value, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageLessThanOrEqualTo(Double value) {
            addCriterion("all_carriage <=", value, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageIn(List<Double> values) {
            addCriterion("all_carriage in", values, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageNotIn(List<Double> values) {
            addCriterion("all_carriage not in", values, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageBetween(Double value1, Double value2) {
            addCriterion("all_carriage between", value1, value2, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andAllCarriageNotBetween(Double value1, Double value2) {
            addCriterion("all_carriage not between", value1, value2, "allCarriage");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterionForJDBCDate("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andBackBillStateIsNull() {
            addCriterion("back_bill_state is null");
            return (Criteria) this;
        }

        public Criteria andBackBillStateIsNotNull() {
            addCriterion("back_bill_state is not null");
            return (Criteria) this;
        }

        public Criteria andBackBillStateEqualTo(String value) {
            addCriterion("back_bill_state =", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateNotEqualTo(String value) {
            addCriterion("back_bill_state <>", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateGreaterThan(String value) {
            addCriterion("back_bill_state >", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateGreaterThanOrEqualTo(String value) {
            addCriterion("back_bill_state >=", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateLessThan(String value) {
            addCriterion("back_bill_state <", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateLessThanOrEqualTo(String value) {
            addCriterion("back_bill_state <=", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateLike(String value) {
            addCriterion("back_bill_state like", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateNotLike(String value) {
            addCriterion("back_bill_state not like", value, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateIn(List<String> values) {
            addCriterion("back_bill_state in", values, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateNotIn(List<String> values) {
            addCriterion("back_bill_state not in", values, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateBetween(String value1, String value2) {
            addCriterion("back_bill_state between", value1, value2, "backBillState");
            return (Criteria) this;
        }

        public Criteria andBackBillStateNotBetween(String value1, String value2) {
            addCriterion("back_bill_state not between", value1, value2, "backBillState");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeIsNull() {
            addCriterion("carriage_banlance_mode is null");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeIsNotNull() {
            addCriterion("carriage_banlance_mode is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeEqualTo(String value) {
            addCriterion("carriage_banlance_mode =", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeNotEqualTo(String value) {
            addCriterion("carriage_banlance_mode <>", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeGreaterThan(String value) {
            addCriterion("carriage_banlance_mode >", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeGreaterThanOrEqualTo(String value) {
            addCriterion("carriage_banlance_mode >=", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeLessThan(String value) {
            addCriterion("carriage_banlance_mode <", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeLessThanOrEqualTo(String value) {
            addCriterion("carriage_banlance_mode <=", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeLike(String value) {
            addCriterion("carriage_banlance_mode like", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeNotLike(String value) {
            addCriterion("carriage_banlance_mode not like", value, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeIn(List<String> values) {
            addCriterion("carriage_banlance_mode in", values, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeNotIn(List<String> values) {
            addCriterion("carriage_banlance_mode not in", values, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeBetween(String value1, String value2) {
            addCriterion("carriage_banlance_mode between", value1, value2, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageBanlanceModeNotBetween(String value1, String value2) {
            addCriterion("carriage_banlance_mode not between", value1, value2, "carriageBanlanceMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeIsNull() {
            addCriterion("carriage_mode is null");
            return (Criteria) this;
        }

        public Criteria andCarriageModeIsNotNull() {
            addCriterion("carriage_mode is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageModeEqualTo(String value) {
            addCriterion("carriage_mode =", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeNotEqualTo(String value) {
            addCriterion("carriage_mode <>", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeGreaterThan(String value) {
            addCriterion("carriage_mode >", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeGreaterThanOrEqualTo(String value) {
            addCriterion("carriage_mode >=", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeLessThan(String value) {
            addCriterion("carriage_mode <", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeLessThanOrEqualTo(String value) {
            addCriterion("carriage_mode <=", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeLike(String value) {
            addCriterion("carriage_mode like", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeNotLike(String value) {
            addCriterion("carriage_mode not like", value, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeIn(List<String> values) {
            addCriterion("carriage_mode in", values, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeNotIn(List<String> values) {
            addCriterion("carriage_mode not in", values, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeBetween(String value1, String value2) {
            addCriterion("carriage_mode between", value1, value2, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarriageModeNotBetween(String value1, String value2) {
            addCriterion("carriage_mode not between", value1, value2, "carriageMode");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositIsNull() {
            addCriterion("carry_goods_bill_deposit is null");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositIsNotNull() {
            addCriterion("carry_goods_bill_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositEqualTo(Double value) {
            addCriterion("carry_goods_bill_deposit =", value, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositNotEqualTo(Double value) {
            addCriterion("carry_goods_bill_deposit <>", value, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositGreaterThan(Double value) {
            addCriterion("carry_goods_bill_deposit >", value, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("carry_goods_bill_deposit >=", value, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositLessThan(Double value) {
            addCriterion("carry_goods_bill_deposit <", value, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositLessThanOrEqualTo(Double value) {
            addCriterion("carry_goods_bill_deposit <=", value, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositIn(List<Double> values) {
            addCriterion("carry_goods_bill_deposit in", values, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositNotIn(List<Double> values) {
            addCriterion("carry_goods_bill_deposit not in", values, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositBetween(Double value1, Double value2) {
            addCriterion("carry_goods_bill_deposit between", value1, value2, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsBillDepositNotBetween(Double value1, Double value2) {
            addCriterion("carry_goods_bill_deposit not between", value1, value2, "carryGoodsBillDeposit");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceIsNull() {
            addCriterion("carry_goods_insurance is null");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceIsNotNull() {
            addCriterion("carry_goods_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceEqualTo(Double value) {
            addCriterion("carry_goods_insurance =", value, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceNotEqualTo(Double value) {
            addCriterion("carry_goods_insurance <>", value, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceGreaterThan(Double value) {
            addCriterion("carry_goods_insurance >", value, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceGreaterThanOrEqualTo(Double value) {
            addCriterion("carry_goods_insurance >=", value, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceLessThan(Double value) {
            addCriterion("carry_goods_insurance <", value, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceLessThanOrEqualTo(Double value) {
            addCriterion("carry_goods_insurance <=", value, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceIn(List<Double> values) {
            addCriterion("carry_goods_insurance in", values, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceNotIn(List<Double> values) {
            addCriterion("carry_goods_insurance not in", values, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceBetween(Double value1, Double value2) {
            addCriterion("carry_goods_insurance between", value1, value2, "carryGoodsInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsInsuranceNotBetween(Double value1, Double value2) {
            addCriterion("carry_goods_insurance not between", value1, value2, "carryGoodsInsurance");
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

        public Criteria andDispatchServiceFeeIsNull() {
            addCriterion("dispatch_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeIsNotNull() {
            addCriterion("dispatch_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeEqualTo(Double value) {
            addCriterion("dispatch_service_fee =", value, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeNotEqualTo(Double value) {
            addCriterion("dispatch_service_fee <>", value, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeGreaterThan(Double value) {
            addCriterion("dispatch_service_fee >", value, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("dispatch_service_fee >=", value, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeLessThan(Double value) {
            addCriterion("dispatch_service_fee <", value, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeLessThanOrEqualTo(Double value) {
            addCriterion("dispatch_service_fee <=", value, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeIn(List<Double> values) {
            addCriterion("dispatch_service_fee in", values, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeNotIn(List<Double> values) {
            addCriterion("dispatch_service_fee not in", values, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeBetween(Double value1, Double value2) {
            addCriterion("dispatch_service_fee between", value1, value2, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDispatchServiceFeeNotBetween(Double value1, Double value2) {
            addCriterion("dispatch_service_fee not between", value1, value2, "dispatchServiceFee");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andIfBalanceIsNull() {
            addCriterion("if_balance is null");
            return (Criteria) this;
        }

        public Criteria andIfBalanceIsNotNull() {
            addCriterion("if_balance is not null");
            return (Criteria) this;
        }

        public Criteria andIfBalanceEqualTo(String value) {
            addCriterion("if_balance =", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceNotEqualTo(String value) {
            addCriterion("if_balance <>", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceGreaterThan(String value) {
            addCriterion("if_balance >", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("if_balance >=", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceLessThan(String value) {
            addCriterion("if_balance <", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceLessThanOrEqualTo(String value) {
            addCriterion("if_balance <=", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceLike(String value) {
            addCriterion("if_balance like", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceNotLike(String value) {
            addCriterion("if_balance not like", value, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceIn(List<String> values) {
            addCriterion("if_balance in", values, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceNotIn(List<String> values) {
            addCriterion("if_balance not in", values, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceBetween(String value1, String value2) {
            addCriterion("if_balance between", value1, value2, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andIfBalanceNotBetween(String value1, String value2) {
            addCriterion("if_balance not between", value1, value2, "ifBalance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Double value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Double value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Double value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Double value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Double value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Double> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Double> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Double value1, Double value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Double value1, Double value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNull() {
            addCriterion("linkman_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNotNull() {
            addCriterion("linkman_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneEqualTo(String value) {
            addCriterion("linkman_phone =", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotEqualTo(String value) {
            addCriterion("linkman_phone <>", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThan(String value) {
            addCriterion("linkman_phone >", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_phone >=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThan(String value) {
            addCriterion("linkman_phone <", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("linkman_phone <=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLike(String value) {
            addCriterion("linkman_phone like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotLike(String value) {
            addCriterion("linkman_phone not like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIn(List<String> values) {
            addCriterion("linkman_phone in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotIn(List<String> values) {
            addCriterion("linkman_phone not in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneBetween(String value1, String value2) {
            addCriterion("linkman_phone between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotBetween(String value1, String value2) {
            addCriterion("linkman_phone not between", value1, value2, "linkmanPhone");
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

        public Criteria andReceiveGoodsDetailAddrIsNull() {
            addCriterion("receive_goods_detail_addr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrIsNotNull() {
            addCriterion("receive_goods_detail_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrEqualTo(String value) {
            addCriterion("receive_goods_detail_addr =", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrNotEqualTo(String value) {
            addCriterion("receive_goods_detail_addr <>", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrGreaterThan(String value) {
            addCriterion("receive_goods_detail_addr >", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_detail_addr >=", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrLessThan(String value) {
            addCriterion("receive_goods_detail_addr <", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_detail_addr <=", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrLike(String value) {
            addCriterion("receive_goods_detail_addr like", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrNotLike(String value) {
            addCriterion("receive_goods_detail_addr not like", value, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrIn(List<String> values) {
            addCriterion("receive_goods_detail_addr in", values, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrNotIn(List<String> values) {
            addCriterion("receive_goods_detail_addr not in", values, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrBetween(String value1, String value2) {
            addCriterion("receive_goods_detail_addr between", value1, value2, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsDetailAddrNotBetween(String value1, String value2) {
            addCriterion("receive_goods_detail_addr not between", value1, value2, "receiveGoodsDetailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanIsNull() {
            addCriterion("receive_goods_linkman is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanIsNotNull() {
            addCriterion("receive_goods_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanEqualTo(String value) {
            addCriterion("receive_goods_linkman =", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanNotEqualTo(String value) {
            addCriterion("receive_goods_linkman <>", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanGreaterThan(String value) {
            addCriterion("receive_goods_linkman >", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_linkman >=", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanLessThan(String value) {
            addCriterion("receive_goods_linkman <", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_linkman <=", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanLike(String value) {
            addCriterion("receive_goods_linkman like", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanNotLike(String value) {
            addCriterion("receive_goods_linkman not like", value, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanIn(List<String> values) {
            addCriterion("receive_goods_linkman in", values, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanNotIn(List<String> values) {
            addCriterion("receive_goods_linkman not in", values, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanBetween(String value1, String value2) {
            addCriterion("receive_goods_linkman between", value1, value2, "receiveGoodsLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsLinkmanNotBetween(String value1, String value2) {
            addCriterion("receive_goods_linkman not between", value1, value2, "receiveGoodsLinkman");
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

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterionForJDBCDate("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceIsNull() {
            addCriterion("start_advance is null");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceIsNotNull() {
            addCriterion("start_advance is not null");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceEqualTo(Double value) {
            addCriterion("start_advance =", value, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceNotEqualTo(Double value) {
            addCriterion("start_advance <>", value, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceGreaterThan(Double value) {
            addCriterion("start_advance >", value, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceGreaterThanOrEqualTo(Double value) {
            addCriterion("start_advance >=", value, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceLessThan(Double value) {
            addCriterion("start_advance <", value, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceLessThanOrEqualTo(Double value) {
            addCriterion("start_advance <=", value, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceIn(List<Double> values) {
            addCriterion("start_advance in", values, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceNotIn(List<Double> values) {
            addCriterion("start_advance not in", values, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceBetween(Double value1, Double value2) {
            addCriterion("start_advance between", value1, value2, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartAdvanceNotBetween(Double value1, Double value2) {
            addCriterion("start_advance not between", value1, value2, "startAdvance");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeIsNull() {
            addCriterion("start_carry_time is null");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeIsNotNull() {
            addCriterion("start_carry_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_carry_time =", value, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_carry_time <>", value, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_carry_time >", value, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_carry_time >=", value, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_carry_time <", value, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_carry_time <=", value, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_carry_time in", values, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_carry_time not in", values, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_carry_time between", value1, value2, "startCarryTime");
            return (Criteria) this;
        }

        public Criteria andStartCarryTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_carry_time not between", value1, value2, "startCarryTime");
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