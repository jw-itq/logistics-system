package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class IncomemonthlytempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomemonthlytempExample() {
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

        public Criteria andBizFeeIsNull() {
            addCriterion("biz_fee is null");
            return (Criteria) this;
        }

        public Criteria andBizFeeIsNotNull() {
            addCriterion("biz_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBizFeeEqualTo(Double value) {
            addCriterion("biz_fee =", value, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeNotEqualTo(Double value) {
            addCriterion("biz_fee <>", value, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeGreaterThan(Double value) {
            addCriterion("biz_fee >", value, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("biz_fee >=", value, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeLessThan(Double value) {
            addCriterion("biz_fee <", value, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeLessThanOrEqualTo(Double value) {
            addCriterion("biz_fee <=", value, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeIn(List<Double> values) {
            addCriterion("biz_fee in", values, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeNotIn(List<Double> values) {
            addCriterion("biz_fee not in", values, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeBetween(Double value1, Double value2) {
            addCriterion("biz_fee between", value1, value2, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizFeeNotBetween(Double value1, Double value2) {
            addCriterion("biz_fee not between", value1, value2, "bizFee");
            return (Criteria) this;
        }

        public Criteria andBizIncomeIsNull() {
            addCriterion("biz_income is null");
            return (Criteria) this;
        }

        public Criteria andBizIncomeIsNotNull() {
            addCriterion("biz_income is not null");
            return (Criteria) this;
        }

        public Criteria andBizIncomeEqualTo(Double value) {
            addCriterion("biz_income =", value, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeNotEqualTo(Double value) {
            addCriterion("biz_income <>", value, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeGreaterThan(Double value) {
            addCriterion("biz_income >", value, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("biz_income >=", value, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeLessThan(Double value) {
            addCriterion("biz_income <", value, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeLessThanOrEqualTo(Double value) {
            addCriterion("biz_income <=", value, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeIn(List<Double> values) {
            addCriterion("biz_income in", values, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeNotIn(List<Double> values) {
            addCriterion("biz_income not in", values, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeBetween(Double value1, Double value2) {
            addCriterion("biz_income between", value1, value2, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andBizIncomeNotBetween(Double value1, Double value2) {
            addCriterion("biz_income not between", value1, value2, "bizIncome");
            return (Criteria) this;
        }

        public Criteria andCarCarriageIsNull() {
            addCriterion("car_carriage is null");
            return (Criteria) this;
        }

        public Criteria andCarCarriageIsNotNull() {
            addCriterion("car_carriage is not null");
            return (Criteria) this;
        }

        public Criteria andCarCarriageEqualTo(Double value) {
            addCriterion("car_carriage =", value, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageNotEqualTo(Double value) {
            addCriterion("car_carriage <>", value, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageGreaterThan(Double value) {
            addCriterion("car_carriage >", value, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageGreaterThanOrEqualTo(Double value) {
            addCriterion("car_carriage >=", value, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageLessThan(Double value) {
            addCriterion("car_carriage <", value, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageLessThanOrEqualTo(Double value) {
            addCriterion("car_carriage <=", value, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageIn(List<Double> values) {
            addCriterion("car_carriage in", values, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageNotIn(List<Double> values) {
            addCriterion("car_carriage not in", values, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageBetween(Double value1, Double value2) {
            addCriterion("car_carriage between", value1, value2, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarCarriageNotBetween(Double value1, Double value2) {
            addCriterion("car_carriage not between", value1, value2, "carCarriage");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyIsNull() {
            addCriterion("carriage_money is null");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyIsNotNull() {
            addCriterion("carriage_money is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyEqualTo(Double value) {
            addCriterion("carriage_money =", value, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyNotEqualTo(Double value) {
            addCriterion("carriage_money <>", value, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyGreaterThan(Double value) {
            addCriterion("carriage_money >", value, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("carriage_money >=", value, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyLessThan(Double value) {
            addCriterion("carriage_money <", value, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyLessThanOrEqualTo(Double value) {
            addCriterion("carriage_money <=", value, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyIn(List<Double> values) {
            addCriterion("carriage_money in", values, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyNotIn(List<Double> values) {
            addCriterion("carriage_money not in", values, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyBetween(Double value1, Double value2) {
            addCriterion("carriage_money between", value1, value2, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageMoneyNotBetween(Double value1, Double value2) {
            addCriterion("carriage_money not between", value1, value2, "carriageMoney");
            return (Criteria) this;
        }

        public Criteria andConveyWageIsNull() {
            addCriterion("convey_wage is null");
            return (Criteria) this;
        }

        public Criteria andConveyWageIsNotNull() {
            addCriterion("convey_wage is not null");
            return (Criteria) this;
        }

        public Criteria andConveyWageEqualTo(Double value) {
            addCriterion("convey_wage =", value, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageNotEqualTo(Double value) {
            addCriterion("convey_wage <>", value, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageGreaterThan(Double value) {
            addCriterion("convey_wage >", value, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageGreaterThanOrEqualTo(Double value) {
            addCriterion("convey_wage >=", value, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageLessThan(Double value) {
            addCriterion("convey_wage <", value, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageLessThanOrEqualTo(Double value) {
            addCriterion("convey_wage <=", value, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageIn(List<Double> values) {
            addCriterion("convey_wage in", values, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageNotIn(List<Double> values) {
            addCriterion("convey_wage not in", values, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageBetween(Double value1, Double value2) {
            addCriterion("convey_wage between", value1, value2, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andConveyWageNotBetween(Double value1, Double value2) {
            addCriterion("convey_wage not between", value1, value2, "conveyWage");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeIsNull() {
            addCriterion("finance_fee is null");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeIsNotNull() {
            addCriterion("finance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeEqualTo(Double value) {
            addCriterion("finance_fee =", value, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeNotEqualTo(Double value) {
            addCriterion("finance_fee <>", value, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeGreaterThan(Double value) {
            addCriterion("finance_fee >", value, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("finance_fee >=", value, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeLessThan(Double value) {
            addCriterion("finance_fee <", value, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeLessThanOrEqualTo(Double value) {
            addCriterion("finance_fee <=", value, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeIn(List<Double> values) {
            addCriterion("finance_fee in", values, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeNotIn(List<Double> values) {
            addCriterion("finance_fee not in", values, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeBetween(Double value1, Double value2) {
            addCriterion("finance_fee between", value1, value2, "financeFee");
            return (Criteria) this;
        }

        public Criteria andFinanceFeeNotBetween(Double value1, Double value2) {
            addCriterion("finance_fee not between", value1, value2, "financeFee");
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

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Double value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Double value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Double value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Double value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Double value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Double> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Double> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Double value1, Double value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Double value1, Double value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyIsNull() {
            addCriterion("insurance_money is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyIsNotNull() {
            addCriterion("insurance_money is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyEqualTo(Double value) {
            addCriterion("insurance_money =", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyNotEqualTo(Double value) {
            addCriterion("insurance_money <>", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyGreaterThan(Double value) {
            addCriterion("insurance_money >", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance_money >=", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyLessThan(Double value) {
            addCriterion("insurance_money <", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyLessThanOrEqualTo(Double value) {
            addCriterion("insurance_money <=", value, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyIn(List<Double> values) {
            addCriterion("insurance_money in", values, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyNotIn(List<Double> values) {
            addCriterion("insurance_money not in", values, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyBetween(Double value1, Double value2) {
            addCriterion("insurance_money between", value1, value2, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceMoneyNotBetween(Double value1, Double value2) {
            addCriterion("insurance_money not between", value1, value2, "insuranceMoney");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNull() {
            addCriterion("manage_fee is null");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNotNull() {
            addCriterion("manage_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManageFeeEqualTo(Double value) {
            addCriterion("manage_fee =", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotEqualTo(Double value) {
            addCriterion("manage_fee <>", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThan(Double value) {
            addCriterion("manage_fee >", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("manage_fee >=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThan(Double value) {
            addCriterion("manage_fee <", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThanOrEqualTo(Double value) {
            addCriterion("manage_fee <=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeIn(List<Double> values) {
            addCriterion("manage_fee in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotIn(List<Double> values) {
            addCriterion("manage_fee not in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeBetween(Double value1, Double value2) {
            addCriterion("manage_fee between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotBetween(Double value1, Double value2) {
            addCriterion("manage_fee not between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
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

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(Double value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Double value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Double value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Double value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Double value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Double> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Double> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Double value1, Double value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Double value1, Double value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andPayoutIsNull() {
            addCriterion("payout is null");
            return (Criteria) this;
        }

        public Criteria andPayoutIsNotNull() {
            addCriterion("payout is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutEqualTo(Double value) {
            addCriterion("payout =", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotEqualTo(Double value) {
            addCriterion("payout <>", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutGreaterThan(Double value) {
            addCriterion("payout >", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutGreaterThanOrEqualTo(Double value) {
            addCriterion("payout >=", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLessThan(Double value) {
            addCriterion("payout <", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLessThanOrEqualTo(Double value) {
            addCriterion("payout <=", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutIn(List<Double> values) {
            addCriterion("payout in", values, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotIn(List<Double> values) {
            addCriterion("payout not in", values, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutBetween(Double value1, Double value2) {
            addCriterion("payout between", value1, value2, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotBetween(Double value1, Double value2) {
            addCriterion("payout not between", value1, value2, "payout");
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

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Double value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Double value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Double value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Double value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Double value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Double> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Double> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Double value1, Double value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Double value1, Double value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeIsNull() {
            addCriterion("unbiz_income is null");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeIsNotNull() {
            addCriterion("unbiz_income is not null");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeEqualTo(Double value) {
            addCriterion("unbiz_income =", value, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeNotEqualTo(Double value) {
            addCriterion("unbiz_income <>", value, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeGreaterThan(Double value) {
            addCriterion("unbiz_income >", value, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("unbiz_income >=", value, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeLessThan(Double value) {
            addCriterion("unbiz_income <", value, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeLessThanOrEqualTo(Double value) {
            addCriterion("unbiz_income <=", value, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeIn(List<Double> values) {
            addCriterion("unbiz_income in", values, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeNotIn(List<Double> values) {
            addCriterion("unbiz_income not in", values, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeBetween(Double value1, Double value2) {
            addCriterion("unbiz_income between", value1, value2, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andUnbizIncomeNotBetween(Double value1, Double value2) {
            addCriterion("unbiz_income not between", value1, value2, "unbizIncome");
            return (Criteria) this;
        }

        public Criteria andWageIsNull() {
            addCriterion("wage is null");
            return (Criteria) this;
        }

        public Criteria andWageIsNotNull() {
            addCriterion("wage is not null");
            return (Criteria) this;
        }

        public Criteria andWageEqualTo(Double value) {
            addCriterion("wage =", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotEqualTo(Double value) {
            addCriterion("wage <>", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThan(Double value) {
            addCriterion("wage >", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThanOrEqualTo(Double value) {
            addCriterion("wage >=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThan(Double value) {
            addCriterion("wage <", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThanOrEqualTo(Double value) {
            addCriterion("wage <=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageIn(List<Double> values) {
            addCriterion("wage in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotIn(List<Double> values) {
            addCriterion("wage not in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageBetween(Double value1, Double value2) {
            addCriterion("wage between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotBetween(Double value1, Double value2) {
            addCriterion("wage not between", value1, value2, "wage");
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