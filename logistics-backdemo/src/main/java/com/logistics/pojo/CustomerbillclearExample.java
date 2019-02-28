package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerbillclearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerbillclearExample() {
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

        public Criteria andGoodsBillCodeIsNull() {
            addCriterion("goods_bill_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeIsNotNull() {
            addCriterion("goods_bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeEqualTo(String value) {
            addCriterion("goods_bill_code =", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotEqualTo(String value) {
            addCriterion("goods_bill_code <>", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeGreaterThan(String value) {
            addCriterion("goods_bill_code >", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_bill_code >=", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeLessThan(String value) {
            addCriterion("goods_bill_code <", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_bill_code <=", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeLike(String value) {
            addCriterion("goods_bill_code like", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotLike(String value) {
            addCriterion("goods_bill_code not like", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeIn(List<String> values) {
            addCriterion("goods_bill_code in", values, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotIn(List<String> values) {
            addCriterion("goods_bill_code not in", values, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeBetween(String value1, String value2) {
            addCriterion("goods_bill_code between", value1, value2, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotBetween(String value1, String value2) {
            addCriterion("goods_bill_code not between", value1, value2, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
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

        public Criteria andBillMoneyIsNull() {
            addCriterion("bill_money is null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNotNull() {
            addCriterion("bill_money is not null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyEqualTo(Double value) {
            addCriterion("bill_money =", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotEqualTo(Double value) {
            addCriterion("bill_money <>", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThan(Double value) {
            addCriterion("bill_money >", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bill_money >=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThan(Double value) {
            addCriterion("bill_money <", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bill_money <=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIn(List<Double> values) {
            addCriterion("bill_money in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotIn(List<Double> values) {
            addCriterion("bill_money not in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyBetween(Double value1, Double value2) {
            addCriterion("bill_money between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bill_money not between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundIsNull() {
            addCriterion("carriage_reduce_fund is null");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundIsNotNull() {
            addCriterion("carriage_reduce_fund is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundEqualTo(Double value) {
            addCriterion("carriage_reduce_fund =", value, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundNotEqualTo(Double value) {
            addCriterion("carriage_reduce_fund <>", value, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundGreaterThan(Double value) {
            addCriterion("carriage_reduce_fund >", value, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundGreaterThanOrEqualTo(Double value) {
            addCriterion("carriage_reduce_fund >=", value, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundLessThan(Double value) {
            addCriterion("carriage_reduce_fund <", value, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundLessThanOrEqualTo(Double value) {
            addCriterion("carriage_reduce_fund <=", value, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundIn(List<Double> values) {
            addCriterion("carriage_reduce_fund in", values, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundNotIn(List<Double> values) {
            addCriterion("carriage_reduce_fund not in", values, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundBetween(Double value1, Double value2) {
            addCriterion("carriage_reduce_fund between", value1, value2, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarriageReduceFundNotBetween(Double value1, Double value2) {
            addCriterion("carriage_reduce_fund not between", value1, value2, "carriageReduceFund");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeIsNull() {
            addCriterion("carry_goods_fee is null");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeIsNotNull() {
            addCriterion("carry_goods_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeEqualTo(Double value) {
            addCriterion("carry_goods_fee =", value, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeNotEqualTo(Double value) {
            addCriterion("carry_goods_fee <>", value, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeGreaterThan(Double value) {
            addCriterion("carry_goods_fee >", value, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("carry_goods_fee >=", value, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeLessThan(Double value) {
            addCriterion("carry_goods_fee <", value, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeLessThanOrEqualTo(Double value) {
            addCriterion("carry_goods_fee <=", value, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeIn(List<Double> values) {
            addCriterion("carry_goods_fee in", values, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeNotIn(List<Double> values) {
            addCriterion("carry_goods_fee not in", values, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeBetween(Double value1, Double value2) {
            addCriterion("carry_goods_fee between", value1, value2, "carryGoodsFee");
            return (Criteria) this;
        }

        public Criteria andCarryGoodsFeeNotBetween(Double value1, Double value2) {
            addCriterion("carry_goods_fee not between", value1, value2, "carryGoodsFee");
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

        public Criteria andMoneyReceivableIsNull() {
            addCriterion("money_receivable is null");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableIsNotNull() {
            addCriterion("money_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableEqualTo(Double value) {
            addCriterion("money_receivable =", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableNotEqualTo(Double value) {
            addCriterion("money_receivable <>", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableGreaterThan(Double value) {
            addCriterion("money_receivable >", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("money_receivable >=", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableLessThan(Double value) {
            addCriterion("money_receivable <", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableLessThanOrEqualTo(Double value) {
            addCriterion("money_receivable <=", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableIn(List<Double> values) {
            addCriterion("money_receivable in", values, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableNotIn(List<Double> values) {
            addCriterion("money_receivable not in", values, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableBetween(Double value1, Double value2) {
            addCriterion("money_receivable between", value1, value2, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableNotBetween(Double value1, Double value2) {
            addCriterion("money_receivable not between", value1, value2, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andPayKickbackIsNull() {
            addCriterion("pay_kickback is null");
            return (Criteria) this;
        }

        public Criteria andPayKickbackIsNotNull() {
            addCriterion("pay_kickback is not null");
            return (Criteria) this;
        }

        public Criteria andPayKickbackEqualTo(Double value) {
            addCriterion("pay_kickback =", value, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackNotEqualTo(Double value) {
            addCriterion("pay_kickback <>", value, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackGreaterThan(Double value) {
            addCriterion("pay_kickback >", value, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_kickback >=", value, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackLessThan(Double value) {
            addCriterion("pay_kickback <", value, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackLessThanOrEqualTo(Double value) {
            addCriterion("pay_kickback <=", value, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackIn(List<Double> values) {
            addCriterion("pay_kickback in", values, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackNotIn(List<Double> values) {
            addCriterion("pay_kickback not in", values, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackBetween(Double value1, Double value2) {
            addCriterion("pay_kickback between", value1, value2, "payKickback");
            return (Criteria) this;
        }

        public Criteria andPayKickbackNotBetween(Double value1, Double value2) {
            addCriterion("pay_kickback not between", value1, value2, "payKickback");
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

        public Criteria andReceivedMoneyIsNull() {
            addCriterion("received_money is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNotNull() {
            addCriterion("received_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyEqualTo(Double value) {
            addCriterion("received_money =", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotEqualTo(Double value) {
            addCriterion("received_money <>", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThan(Double value) {
            addCriterion("received_money >", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("received_money >=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThan(Double value) {
            addCriterion("received_money <", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("received_money <=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIn(List<Double> values) {
            addCriterion("received_money in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotIn(List<Double> values) {
            addCriterion("received_money not in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyBetween(Double value1, Double value2) {
            addCriterion("received_money between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("received_money not between", value1, value2, "receivedMoney");
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