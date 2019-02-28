package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsbillExample() {
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

        public Criteria andAcceptProcedureRateIsNull() {
            addCriterion("accept_procedure_rate is null");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateIsNotNull() {
            addCriterion("accept_procedure_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateEqualTo(String value) {
            addCriterion("accept_procedure_rate =", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateNotEqualTo(String value) {
            addCriterion("accept_procedure_rate <>", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateGreaterThan(String value) {
            addCriterion("accept_procedure_rate >", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateGreaterThanOrEqualTo(String value) {
            addCriterion("accept_procedure_rate >=", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateLessThan(String value) {
            addCriterion("accept_procedure_rate <", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateLessThanOrEqualTo(String value) {
            addCriterion("accept_procedure_rate <=", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateLike(String value) {
            addCriterion("accept_procedure_rate like", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateNotLike(String value) {
            addCriterion("accept_procedure_rate not like", value, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateIn(List<String> values) {
            addCriterion("accept_procedure_rate in", values, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateNotIn(List<String> values) {
            addCriterion("accept_procedure_rate not in", values, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateBetween(String value1, String value2) {
            addCriterion("accept_procedure_rate between", value1, value2, "acceptProcedureRate");
            return (Criteria) this;
        }

        public Criteria andAcceptProcedureRateNotBetween(String value1, String value2) {
            addCriterion("accept_procedure_rate not between", value1, value2, "acceptProcedureRate");
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

        public Criteria andCarriageIsNull() {
            addCriterion("carriage is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("carriage is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(Double value) {
            addCriterion("carriage =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(Double value) {
            addCriterion("carriage <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(Double value) {
            addCriterion("carriage >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(Double value) {
            addCriterion("carriage >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(Double value) {
            addCriterion("carriage <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(Double value) {
            addCriterion("carriage <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<Double> values) {
            addCriterion("carriage in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<Double> values) {
            addCriterion("carriage not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(Double value1, Double value2) {
            addCriterion("carriage between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(Double value1, Double value2) {
            addCriterion("carriage not between", value1, value2, "carriage");
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

        public Criteria andEmployeeCodeIsNull() {
            addCriterion("employee_code is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("employee_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeEqualTo(String value) {
            addCriterion("employee_code =", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotEqualTo(String value) {
            addCriterion("employee_code <>", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThan(String value) {
            addCriterion("employee_code >", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_code >=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThan(String value) {
            addCriterion("employee_code <", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThanOrEqualTo(String value) {
            addCriterion("employee_code <=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLike(String value) {
            addCriterion("employee_code like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotLike(String value) {
            addCriterion("employee_code not like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIn(List<String> values) {
            addCriterion("employee_code in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotIn(List<String> values) {
            addCriterion("employee_code not in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeBetween(String value1, String value2) {
            addCriterion("employee_code between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotBetween(String value1, String value2) {
            addCriterion("employee_code not between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andFactDealDateIsNull() {
            addCriterion("fact_deal_date is null");
            return (Criteria) this;
        }

        public Criteria andFactDealDateIsNotNull() {
            addCriterion("fact_deal_date is not null");
            return (Criteria) this;
        }

        public Criteria andFactDealDateEqualTo(Date value) {
            addCriterionForJDBCDate("fact_deal_date =", value, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fact_deal_date <>", value, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fact_deal_date >", value, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fact_deal_date >=", value, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateLessThan(Date value) {
            addCriterionForJDBCDate("fact_deal_date <", value, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fact_deal_date <=", value, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateIn(List<Date> values) {
            addCriterionForJDBCDate("fact_deal_date in", values, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fact_deal_date not in", values, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fact_deal_date between", value1, value2, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFactDealDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fact_deal_date not between", value1, value2, "factDealDate");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeIsNull() {
            addCriterion("fetch_goods_mode is null");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeIsNotNull() {
            addCriterion("fetch_goods_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeEqualTo(String value) {
            addCriterion("fetch_goods_mode =", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeNotEqualTo(String value) {
            addCriterion("fetch_goods_mode <>", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeGreaterThan(String value) {
            addCriterion("fetch_goods_mode >", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeGreaterThanOrEqualTo(String value) {
            addCriterion("fetch_goods_mode >=", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeLessThan(String value) {
            addCriterion("fetch_goods_mode <", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeLessThanOrEqualTo(String value) {
            addCriterion("fetch_goods_mode <=", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeLike(String value) {
            addCriterion("fetch_goods_mode like", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeNotLike(String value) {
            addCriterion("fetch_goods_mode not like", value, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeIn(List<String> values) {
            addCriterion("fetch_goods_mode in", values, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeNotIn(List<String> values) {
            addCriterion("fetch_goods_mode not in", values, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeBetween(String value1, String value2) {
            addCriterion("fetch_goods_mode between", value1, value2, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andFetchGoodsModeNotBetween(String value1, String value2) {
            addCriterion("fetch_goods_mode not between", value1, value2, "fetchGoodsMode");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentIsNull() {
            addCriterion("help_accept_payment is null");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentIsNotNull() {
            addCriterion("help_accept_payment is not null");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentEqualTo(Double value) {
            addCriterion("help_accept_payment =", value, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentNotEqualTo(Double value) {
            addCriterion("help_accept_payment <>", value, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentGreaterThan(Double value) {
            addCriterion("help_accept_payment >", value, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("help_accept_payment >=", value, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentLessThan(Double value) {
            addCriterion("help_accept_payment <", value, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentLessThanOrEqualTo(Double value) {
            addCriterion("help_accept_payment <=", value, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentIn(List<Double> values) {
            addCriterion("help_accept_payment in", values, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentNotIn(List<Double> values) {
            addCriterion("help_accept_payment not in", values, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentBetween(Double value1, Double value2) {
            addCriterion("help_accept_payment between", value1, value2, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptPaymentNotBetween(Double value1, Double value2) {
            addCriterion("help_accept_payment not between", value1, value2, "helpAcceptPayment");
            return (Criteria) this;
        }

        public Criteria andIfAuditIsNull() {
            addCriterion("if_audit is null");
            return (Criteria) this;
        }

        public Criteria andIfAuditIsNotNull() {
            addCriterion("if_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIfAuditEqualTo(Boolean value) {
            addCriterion("if_audit =", value, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditNotEqualTo(Boolean value) {
            addCriterion("if_audit <>", value, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditGreaterThan(Boolean value) {
            addCriterion("if_audit >", value, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_audit >=", value, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditLessThan(Boolean value) {
            addCriterion("if_audit <", value, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("if_audit <=", value, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditIn(List<Boolean> values) {
            addCriterion("if_audit in", values, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditNotIn(List<Boolean> values) {
            addCriterion("if_audit not in", values, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("if_audit between", value1, value2, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_audit not between", value1, value2, "ifAudit");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsIsNull() {
            addCriterion("if_settle_accounts is null");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsIsNotNull() {
            addCriterion("if_settle_accounts is not null");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsEqualTo(Boolean value) {
            addCriterion("if_settle_accounts =", value, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsNotEqualTo(Boolean value) {
            addCriterion("if_settle_accounts <>", value, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsGreaterThan(Boolean value) {
            addCriterion("if_settle_accounts >", value, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_settle_accounts >=", value, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsLessThan(Boolean value) {
            addCriterion("if_settle_accounts <", value, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsLessThanOrEqualTo(Boolean value) {
            addCriterion("if_settle_accounts <=", value, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsIn(List<Boolean> values) {
            addCriterion("if_settle_accounts in", values, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsNotIn(List<Boolean> values) {
            addCriterion("if_settle_accounts not in", values, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsBetween(Boolean value1, Boolean value2) {
            addCriterion("if_settle_accounts between", value1, value2, "ifSettleAccounts");
            return (Criteria) this;
        }

        public Criteria andIfSettleAccountsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_settle_accounts not between", value1, value2, "ifSettleAccounts");
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

        public Criteria andMoneyOfChangePayIsNull() {
            addCriterion("money_of_change_pay is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayIsNotNull() {
            addCriterion("money_of_change_pay is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayEqualTo(Double value) {
            addCriterion("money_of_change_pay =", value, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayNotEqualTo(Double value) {
            addCriterion("money_of_change_pay <>", value, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayGreaterThan(Double value) {
            addCriterion("money_of_change_pay >", value, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayGreaterThanOrEqualTo(Double value) {
            addCriterion("money_of_change_pay >=", value, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayLessThan(Double value) {
            addCriterion("money_of_change_pay <", value, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayLessThanOrEqualTo(Double value) {
            addCriterion("money_of_change_pay <=", value, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayIn(List<Double> values) {
            addCriterion("money_of_change_pay in", values, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayNotIn(List<Double> values) {
            addCriterion("money_of_change_pay not in", values, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayBetween(Double value1, Double value2) {
            addCriterion("money_of_change_pay between", value1, value2, "moneyOfChangePay");
            return (Criteria) this;
        }

        public Criteria andMoneyOfChangePayNotBetween(Double value1, Double value2) {
            addCriterion("money_of_change_pay not between", value1, value2, "moneyOfChangePay");
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

        public Criteria andPayModeIsNull() {
            addCriterion("pay_mode is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("pay_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(String value) {
            addCriterion("pay_mode =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(String value) {
            addCriterion("pay_mode <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(String value) {
            addCriterion("pay_mode >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_mode >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(String value) {
            addCriterion("pay_mode <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(String value) {
            addCriterion("pay_mode <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLike(String value) {
            addCriterion("pay_mode like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotLike(String value) {
            addCriterion("pay_mode not like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<String> values) {
            addCriterion("pay_mode in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<String> values) {
            addCriterion("pay_mode not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(String value1, String value2) {
            addCriterion("pay_mode between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(String value1, String value2) {
            addCriterion("pay_mode not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateIsNull() {
            addCriterion("predelivery_date is null");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateIsNotNull() {
            addCriterion("predelivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateEqualTo(Date value) {
            addCriterionForJDBCDate("predelivery_date =", value, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("predelivery_date <>", value, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("predelivery_date >", value, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("predelivery_date >=", value, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateLessThan(Date value) {
            addCriterionForJDBCDate("predelivery_date <", value, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("predelivery_date <=", value, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateIn(List<Date> values) {
            addCriterionForJDBCDate("predelivery_date in", values, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("predelivery_date not in", values, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("predelivery_date between", value1, value2, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPredeliveryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("predelivery_date not between", value1, value2, "predeliveryDate");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrIsNull() {
            addCriterion("receive_goods_addr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrIsNotNull() {
            addCriterion("receive_goods_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrEqualTo(String value) {
            addCriterion("receive_goods_addr =", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotEqualTo(String value) {
            addCriterion("receive_goods_addr <>", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrGreaterThan(String value) {
            addCriterion("receive_goods_addr >", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_addr >=", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrLessThan(String value) {
            addCriterion("receive_goods_addr <", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_addr <=", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrLike(String value) {
            addCriterion("receive_goods_addr like", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotLike(String value) {
            addCriterion("receive_goods_addr not like", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrIn(List<String> values) {
            addCriterion("receive_goods_addr in", values, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotIn(List<String> values) {
            addCriterion("receive_goods_addr not in", values, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrBetween(String value1, String value2) {
            addCriterion("receive_goods_addr between", value1, value2, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotBetween(String value1, String value2) {
            addCriterion("receive_goods_addr not between", value1, value2, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerIsNull() {
            addCriterion("receive_goods_customer is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerIsNotNull() {
            addCriterion("receive_goods_customer is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerEqualTo(String value) {
            addCriterion("receive_goods_customer =", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerNotEqualTo(String value) {
            addCriterion("receive_goods_customer <>", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerGreaterThan(String value) {
            addCriterion("receive_goods_customer >", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer >=", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerLessThan(String value) {
            addCriterion("receive_goods_customer <", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer <=", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerLike(String value) {
            addCriterion("receive_goods_customer like", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerNotLike(String value) {
            addCriterion("receive_goods_customer not like", value, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerIn(List<String> values) {
            addCriterion("receive_goods_customer in", values, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerNotIn(List<String> values) {
            addCriterion("receive_goods_customer not in", values, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerBetween(String value1, String value2) {
            addCriterion("receive_goods_customer between", value1, value2, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerNotBetween(String value1, String value2) {
            addCriterion("receive_goods_customer not between", value1, value2, "receiveGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrIsNull() {
            addCriterion("receive_goods_customer_addr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrIsNotNull() {
            addCriterion("receive_goods_customer_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrEqualTo(String value) {
            addCriterion("receive_goods_customer_addr =", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrNotEqualTo(String value) {
            addCriterion("receive_goods_customer_addr <>", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrGreaterThan(String value) {
            addCriterion("receive_goods_customer_addr >", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer_addr >=", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrLessThan(String value) {
            addCriterion("receive_goods_customer_addr <", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer_addr <=", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrLike(String value) {
            addCriterion("receive_goods_customer_addr like", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrNotLike(String value) {
            addCriterion("receive_goods_customer_addr not like", value, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrIn(List<String> values) {
            addCriterion("receive_goods_customer_addr in", values, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrNotIn(List<String> values) {
            addCriterion("receive_goods_customer_addr not in", values, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrBetween(String value1, String value2) {
            addCriterion("receive_goods_customer_addr between", value1, value2, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerAddrNotBetween(String value1, String value2) {
            addCriterion("receive_goods_customer_addr not between", value1, value2, "receiveGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeIsNull() {
            addCriterion("receive_goods_customer_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeIsNotNull() {
            addCriterion("receive_goods_customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeEqualTo(String value) {
            addCriterion("receive_goods_customer_code =", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeNotEqualTo(String value) {
            addCriterion("receive_goods_customer_code <>", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeGreaterThan(String value) {
            addCriterion("receive_goods_customer_code >", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer_code >=", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeLessThan(String value) {
            addCriterion("receive_goods_customer_code <", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer_code <=", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeLike(String value) {
            addCriterion("receive_goods_customer_code like", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeNotLike(String value) {
            addCriterion("receive_goods_customer_code not like", value, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeIn(List<String> values) {
            addCriterion("receive_goods_customer_code in", values, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeNotIn(List<String> values) {
            addCriterion("receive_goods_customer_code not in", values, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeBetween(String value1, String value2) {
            addCriterion("receive_goods_customer_code between", value1, value2, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("receive_goods_customer_code not between", value1, value2, "receiveGoodsCustomerCode");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelIsNull() {
            addCriterion("receive_goods_customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelIsNotNull() {
            addCriterion("receive_goods_customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelEqualTo(String value) {
            addCriterion("receive_goods_customer_tel =", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelNotEqualTo(String value) {
            addCriterion("receive_goods_customer_tel <>", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelGreaterThan(String value) {
            addCriterion("receive_goods_customer_tel >", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer_tel >=", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelLessThan(String value) {
            addCriterion("receive_goods_customer_tel <", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_customer_tel <=", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelLike(String value) {
            addCriterion("receive_goods_customer_tel like", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelNotLike(String value) {
            addCriterion("receive_goods_customer_tel not like", value, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelIn(List<String> values) {
            addCriterion("receive_goods_customer_tel in", values, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelNotIn(List<String> values) {
            addCriterion("receive_goods_customer_tel not in", values, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelBetween(String value1, String value2) {
            addCriterion("receive_goods_customer_tel between", value1, value2, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsCustomerTelNotBetween(String value1, String value2) {
            addCriterion("receive_goods_customer_tel not between", value1, value2, "receiveGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andReduceFundIsNull() {
            addCriterion("reduce_fund is null");
            return (Criteria) this;
        }

        public Criteria andReduceFundIsNotNull() {
            addCriterion("reduce_fund is not null");
            return (Criteria) this;
        }

        public Criteria andReduceFundEqualTo(Double value) {
            addCriterion("reduce_fund =", value, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundNotEqualTo(Double value) {
            addCriterion("reduce_fund <>", value, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundGreaterThan(Double value) {
            addCriterion("reduce_fund >", value, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundGreaterThanOrEqualTo(Double value) {
            addCriterion("reduce_fund >=", value, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundLessThan(Double value) {
            addCriterion("reduce_fund <", value, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundLessThanOrEqualTo(Double value) {
            addCriterion("reduce_fund <=", value, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundIn(List<Double> values) {
            addCriterion("reduce_fund in", values, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundNotIn(List<Double> values) {
            addCriterion("reduce_fund not in", values, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundBetween(Double value1, Double value2) {
            addCriterion("reduce_fund between", value1, value2, "reduceFund");
            return (Criteria) this;
        }

        public Criteria andReduceFundNotBetween(Double value1, Double value2) {
            addCriterion("reduce_fund not between", value1, value2, "reduceFund");
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

        public Criteria andSendGoodsAddrIsNull() {
            addCriterion("send_goods_addr is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrIsNotNull() {
            addCriterion("send_goods_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrEqualTo(String value) {
            addCriterion("send_goods_addr =", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotEqualTo(String value) {
            addCriterion("send_goods_addr <>", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrGreaterThan(String value) {
            addCriterion("send_goods_addr >", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_addr >=", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrLessThan(String value) {
            addCriterion("send_goods_addr <", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrLessThanOrEqualTo(String value) {
            addCriterion("send_goods_addr <=", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrLike(String value) {
            addCriterion("send_goods_addr like", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotLike(String value) {
            addCriterion("send_goods_addr not like", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrIn(List<String> values) {
            addCriterion("send_goods_addr in", values, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotIn(List<String> values) {
            addCriterion("send_goods_addr not in", values, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrBetween(String value1, String value2) {
            addCriterion("send_goods_addr between", value1, value2, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotBetween(String value1, String value2) {
            addCriterion("send_goods_addr not between", value1, value2, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerIsNull() {
            addCriterion("send_goods_customer is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerIsNotNull() {
            addCriterion("send_goods_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerEqualTo(String value) {
            addCriterion("send_goods_customer =", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotEqualTo(String value) {
            addCriterion("send_goods_customer <>", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerGreaterThan(String value) {
            addCriterion("send_goods_customer >", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_customer >=", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerLessThan(String value) {
            addCriterion("send_goods_customer <", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerLessThanOrEqualTo(String value) {
            addCriterion("send_goods_customer <=", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerLike(String value) {
            addCriterion("send_goods_customer like", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotLike(String value) {
            addCriterion("send_goods_customer not like", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerIn(List<String> values) {
            addCriterion("send_goods_customer in", values, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotIn(List<String> values) {
            addCriterion("send_goods_customer not in", values, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerBetween(String value1, String value2) {
            addCriterion("send_goods_customer between", value1, value2, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotBetween(String value1, String value2) {
            addCriterion("send_goods_customer not between", value1, value2, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrIsNull() {
            addCriterion("send_goods_customer_addr is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrIsNotNull() {
            addCriterion("send_goods_customer_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrEqualTo(String value) {
            addCriterion("send_goods_customer_addr =", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrNotEqualTo(String value) {
            addCriterion("send_goods_customer_addr <>", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrGreaterThan(String value) {
            addCriterion("send_goods_customer_addr >", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_addr >=", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrLessThan(String value) {
            addCriterion("send_goods_customer_addr <", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrLessThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_addr <=", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrLike(String value) {
            addCriterion("send_goods_customer_addr like", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrNotLike(String value) {
            addCriterion("send_goods_customer_addr not like", value, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrIn(List<String> values) {
            addCriterion("send_goods_customer_addr in", values, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrNotIn(List<String> values) {
            addCriterion("send_goods_customer_addr not in", values, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrBetween(String value1, String value2) {
            addCriterion("send_goods_customer_addr between", value1, value2, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerAddrNotBetween(String value1, String value2) {
            addCriterion("send_goods_customer_addr not between", value1, value2, "sendGoodsCustomerAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoIsNull() {
            addCriterion("send_goods_customer_no is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoIsNotNull() {
            addCriterion("send_goods_customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoEqualTo(String value) {
            addCriterion("send_goods_customer_no =", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoNotEqualTo(String value) {
            addCriterion("send_goods_customer_no <>", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoGreaterThan(String value) {
            addCriterion("send_goods_customer_no >", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_no >=", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoLessThan(String value) {
            addCriterion("send_goods_customer_no <", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_no <=", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoLike(String value) {
            addCriterion("send_goods_customer_no like", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoNotLike(String value) {
            addCriterion("send_goods_customer_no not like", value, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoIn(List<String> values) {
            addCriterion("send_goods_customer_no in", values, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoNotIn(List<String> values) {
            addCriterion("send_goods_customer_no not in", values, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoBetween(String value1, String value2) {
            addCriterion("send_goods_customer_no between", value1, value2, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNoNotBetween(String value1, String value2) {
            addCriterion("send_goods_customer_no not between", value1, value2, "sendGoodsCustomerNo");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelIsNull() {
            addCriterion("send_goods_customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelIsNotNull() {
            addCriterion("send_goods_customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelEqualTo(String value) {
            addCriterion("send_goods_customer_tel =", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotEqualTo(String value) {
            addCriterion("send_goods_customer_tel <>", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelGreaterThan(String value) {
            addCriterion("send_goods_customer_tel >", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_tel >=", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelLessThan(String value) {
            addCriterion("send_goods_customer_tel <", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_tel <=", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelLike(String value) {
            addCriterion("send_goods_customer_tel like", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotLike(String value) {
            addCriterion("send_goods_customer_tel not like", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelIn(List<String> values) {
            addCriterion("send_goods_customer_tel in", values, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotIn(List<String> values) {
            addCriterion("send_goods_customer_tel not in", values, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelBetween(String value1, String value2) {
            addCriterion("send_goods_customer_tel between", value1, value2, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotBetween(String value1, String value2) {
            addCriterion("send_goods_customer_tel not between", value1, value2, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateIsNull() {
            addCriterion("send_goods_date is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateIsNotNull() {
            addCriterion("send_goods_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateEqualTo(Date value) {
            addCriterionForJDBCDate("send_goods_date =", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("send_goods_date <>", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("send_goods_date >", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_goods_date >=", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateLessThan(Date value) {
            addCriterionForJDBCDate("send_goods_date <", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_goods_date <=", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateIn(List<Date> values) {
            addCriterionForJDBCDate("send_goods_date in", values, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("send_goods_date not in", values, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_goods_date between", value1, value2, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_goods_date not between", value1, value2, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNull() {
            addCriterion("transfer_fee is null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNotNull() {
            addCriterion("transfer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeEqualTo(Double value) {
            addCriterion("transfer_fee =", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotEqualTo(Double value) {
            addCriterion("transfer_fee <>", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThan(Double value) {
            addCriterion("transfer_fee >", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("transfer_fee >=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThan(Double value) {
            addCriterion("transfer_fee <", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThanOrEqualTo(Double value) {
            addCriterion("transfer_fee <=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIn(List<Double> values) {
            addCriterion("transfer_fee in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotIn(List<Double> values) {
            addCriterion("transfer_fee not in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeBetween(Double value1, Double value2) {
            addCriterion("transfer_fee between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotBetween(Double value1, Double value2) {
            addCriterion("transfer_fee not between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferStationIsNull() {
            addCriterion("transfer_station is null");
            return (Criteria) this;
        }

        public Criteria andTransferStationIsNotNull() {
            addCriterion("transfer_station is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStationEqualTo(String value) {
            addCriterion("transfer_station =", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotEqualTo(String value) {
            addCriterion("transfer_station <>", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationGreaterThan(String value) {
            addCriterion("transfer_station >", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_station >=", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationLessThan(String value) {
            addCriterion("transfer_station <", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationLessThanOrEqualTo(String value) {
            addCriterion("transfer_station <=", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationLike(String value) {
            addCriterion("transfer_station like", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotLike(String value) {
            addCriterion("transfer_station not like", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationIn(List<String> values) {
            addCriterion("transfer_station in", values, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotIn(List<String> values) {
            addCriterion("transfer_station not in", values, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationBetween(String value1, String value2) {
            addCriterion("transfer_station between", value1, value2, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotBetween(String value1, String value2) {
            addCriterion("transfer_station not between", value1, value2, "transferStation");
            return (Criteria) this;
        }

        public Criteria andValidityIsNull() {
            addCriterion("validity is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("validity is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(Boolean value) {
            addCriterion("validity =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(Boolean value) {
            addCriterion("validity <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(Boolean value) {
            addCriterion("validity >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validity >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(Boolean value) {
            addCriterion("validity <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(Boolean value) {
            addCriterion("validity <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<Boolean> values) {
            addCriterion("validity in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<Boolean> values) {
            addCriterion("validity not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(Boolean value1, Boolean value2) {
            addCriterion("validity between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validity not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonIsNull() {
            addCriterion("write_bill_person is null");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonIsNotNull() {
            addCriterion("write_bill_person is not null");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonEqualTo(String value) {
            addCriterion("write_bill_person =", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonNotEqualTo(String value) {
            addCriterion("write_bill_person <>", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonGreaterThan(String value) {
            addCriterion("write_bill_person >", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonGreaterThanOrEqualTo(String value) {
            addCriterion("write_bill_person >=", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonLessThan(String value) {
            addCriterion("write_bill_person <", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonLessThanOrEqualTo(String value) {
            addCriterion("write_bill_person <=", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonLike(String value) {
            addCriterion("write_bill_person like", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonNotLike(String value) {
            addCriterion("write_bill_person not like", value, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonIn(List<String> values) {
            addCriterion("write_bill_person in", values, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonNotIn(List<String> values) {
            addCriterion("write_bill_person not in", values, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonBetween(String value1, String value2) {
            addCriterion("write_bill_person between", value1, value2, "writeBillPerson");
            return (Criteria) this;
        }

        public Criteria andWriteBillPersonNotBetween(String value1, String value2) {
            addCriterion("write_bill_person not between", value1, value2, "writeBillPerson");
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