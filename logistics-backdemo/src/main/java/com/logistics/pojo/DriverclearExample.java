package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DriverclearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverclearExample() {
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

        public Criteria andAddCarriageIsNull() {
            addCriterion("add_carriage is null");
            return (Criteria) this;
        }

        public Criteria andAddCarriageIsNotNull() {
            addCriterion("add_carriage is not null");
            return (Criteria) this;
        }

        public Criteria andAddCarriageEqualTo(Double value) {
            addCriterion("add_carriage =", value, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageNotEqualTo(Double value) {
            addCriterion("add_carriage <>", value, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageGreaterThan(Double value) {
            addCriterion("add_carriage >", value, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageGreaterThanOrEqualTo(Double value) {
            addCriterion("add_carriage >=", value, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageLessThan(Double value) {
            addCriterion("add_carriage <", value, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageLessThanOrEqualTo(Double value) {
            addCriterion("add_carriage <=", value, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageIn(List<Double> values) {
            addCriterion("add_carriage in", values, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageNotIn(List<Double> values) {
            addCriterion("add_carriage not in", values, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageBetween(Double value1, Double value2) {
            addCriterion("add_carriage between", value1, value2, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andAddCarriageNotBetween(Double value1, Double value2) {
            addCriterion("add_carriage not between", value1, value2, "addCarriage");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
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
            addCriterionForJDBCDate("balance_time =", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("balance_time <>", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("balance_time >", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("balance_time >=", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeLessThan(Date value) {
            addCriterionForJDBCDate("balance_time <", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("balance_time <=", value, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("balance_time in", values, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("balance_time not in", values, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("balance_time between", value1, value2, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("balance_time not between", value1, value2, "balanceTime");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIsNull() {
            addCriterion("balance_type is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIsNotNull() {
            addCriterion("balance_type is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeEqualTo(String value) {
            addCriterion("balance_type =", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotEqualTo(String value) {
            addCriterion("balance_type <>", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeGreaterThan(String value) {
            addCriterion("balance_type >", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("balance_type >=", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLessThan(String value) {
            addCriterion("balance_type <", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLessThanOrEqualTo(String value) {
            addCriterion("balance_type <=", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLike(String value) {
            addCriterion("balance_type like", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotLike(String value) {
            addCriterion("balance_type not like", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIn(List<String> values) {
            addCriterion("balance_type in", values, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotIn(List<String> values) {
            addCriterion("balance_type not in", values, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeBetween(String value1, String value2) {
            addCriterion("balance_type between", value1, value2, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotBetween(String value1, String value2) {
            addCriterion("balance_type not between", value1, value2, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceIsNull() {
            addCriterion("bind_insurance is null");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceIsNotNull() {
            addCriterion("bind_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceEqualTo(Double value) {
            addCriterion("bind_insurance =", value, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceNotEqualTo(Double value) {
            addCriterion("bind_insurance <>", value, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceGreaterThan(Double value) {
            addCriterion("bind_insurance >", value, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceGreaterThanOrEqualTo(Double value) {
            addCriterion("bind_insurance >=", value, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceLessThan(Double value) {
            addCriterion("bind_insurance <", value, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceLessThanOrEqualTo(Double value) {
            addCriterion("bind_insurance <=", value, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceIn(List<Double> values) {
            addCriterion("bind_insurance in", values, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceNotIn(List<Double> values) {
            addCriterion("bind_insurance not in", values, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceBetween(Double value1, Double value2) {
            addCriterion("bind_insurance between", value1, value2, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andBindInsuranceNotBetween(Double value1, Double value2) {
            addCriterion("bind_insurance not between", value1, value2, "bindInsurance");
            return (Criteria) this;
        }

        public Criteria andCarryFeeIsNull() {
            addCriterion("carry_fee is null");
            return (Criteria) this;
        }

        public Criteria andCarryFeeIsNotNull() {
            addCriterion("carry_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCarryFeeEqualTo(Double value) {
            addCriterion("carry_fee =", value, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeNotEqualTo(Double value) {
            addCriterion("carry_fee <>", value, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeGreaterThan(Double value) {
            addCriterion("carry_fee >", value, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("carry_fee >=", value, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeLessThan(Double value) {
            addCriterion("carry_fee <", value, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeLessThanOrEqualTo(Double value) {
            addCriterion("carry_fee <=", value, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeIn(List<Double> values) {
            addCriterion("carry_fee in", values, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeNotIn(List<Double> values) {
            addCriterion("carry_fee not in", values, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeBetween(Double value1, Double value2) {
            addCriterion("carry_fee between", value1, value2, "carryFee");
            return (Criteria) this;
        }

        public Criteria andCarryFeeNotBetween(Double value1, Double value2) {
            addCriterion("carry_fee not between", value1, value2, "carryFee");
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

        public Criteria andNeedPaymentIsNull() {
            addCriterion("need_payment is null");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentIsNotNull() {
            addCriterion("need_payment is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentEqualTo(Double value) {
            addCriterion("need_payment =", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotEqualTo(Double value) {
            addCriterion("need_payment <>", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentGreaterThan(Double value) {
            addCriterion("need_payment >", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("need_payment >=", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentLessThan(Double value) {
            addCriterion("need_payment <", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentLessThanOrEqualTo(Double value) {
            addCriterion("need_payment <=", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentIn(List<Double> values) {
            addCriterion("need_payment in", values, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotIn(List<Double> values) {
            addCriterion("need_payment not in", values, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentBetween(Double value1, Double value2) {
            addCriterion("need_payment between", value1, value2, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotBetween(Double value1, Double value2) {
            addCriterion("need_payment not between", value1, value2, "needPayment");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyIsNull() {
            addCriterion("payed_money is null");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyIsNotNull() {
            addCriterion("payed_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyEqualTo(Double value) {
            addCriterion("payed_money =", value, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyNotEqualTo(Double value) {
            addCriterion("payed_money <>", value, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyGreaterThan(Double value) {
            addCriterion("payed_money >", value, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("payed_money >=", value, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyLessThan(Double value) {
            addCriterion("payed_money <", value, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("payed_money <=", value, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyIn(List<Double> values) {
            addCriterion("payed_money in", values, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyNotIn(List<Double> values) {
            addCriterion("payed_money not in", values, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyBetween(Double value1, Double value2) {
            addCriterion("payed_money between", value1, value2, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPayedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("payed_money not between", value1, value2, "payedMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyIsNull() {
            addCriterion("prepay_money is null");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyIsNotNull() {
            addCriterion("prepay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyEqualTo(Double value) {
            addCriterion("prepay_money =", value, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyNotEqualTo(Double value) {
            addCriterion("prepay_money <>", value, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyGreaterThan(Double value) {
            addCriterion("prepay_money >", value, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("prepay_money >=", value, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyLessThan(Double value) {
            addCriterion("prepay_money <", value, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("prepay_money <=", value, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyIn(List<Double> values) {
            addCriterion("prepay_money in", values, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyNotIn(List<Double> values) {
            addCriterion("prepay_money not in", values, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyBetween(Double value1, Double value2) {
            addCriterion("prepay_money between", value1, value2, "prepayMoney");
            return (Criteria) this;
        }

        public Criteria andPrepayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("prepay_money not between", value1, value2, "prepayMoney");
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