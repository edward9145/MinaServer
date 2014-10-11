package net.itrigo.yixing.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadDataExample() {
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

        public Criteria andUserTypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("userType =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("userType <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("userType >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userType >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("userType <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("userType <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("userType in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("userType not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("userType between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("userType not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andSystolicIsNull() {
            addCriterion("systolic is null");
            return (Criteria) this;
        }

        public Criteria andSystolicIsNotNull() {
            addCriterion("systolic is not null");
            return (Criteria) this;
        }

        public Criteria andSystolicEqualTo(Double value) {
            addCriterion("systolic =", value, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicNotEqualTo(Double value) {
            addCriterion("systolic <>", value, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicGreaterThan(Double value) {
            addCriterion("systolic >", value, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicGreaterThanOrEqualTo(Double value) {
            addCriterion("systolic >=", value, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicLessThan(Double value) {
            addCriterion("systolic <", value, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicLessThanOrEqualTo(Double value) {
            addCriterion("systolic <=", value, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicIn(List<Double> values) {
            addCriterion("systolic in", values, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicNotIn(List<Double> values) {
            addCriterion("systolic not in", values, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicBetween(Double value1, Double value2) {
            addCriterion("systolic between", value1, value2, "systolic");
            return (Criteria) this;
        }

        public Criteria andSystolicNotBetween(Double value1, Double value2) {
            addCriterion("systolic not between", value1, value2, "systolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicIsNull() {
            addCriterion("diastolic is null");
            return (Criteria) this;
        }

        public Criteria andDiastolicIsNotNull() {
            addCriterion("diastolic is not null");
            return (Criteria) this;
        }

        public Criteria andDiastolicEqualTo(Double value) {
            addCriterion("diastolic =", value, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicNotEqualTo(Double value) {
            addCriterion("diastolic <>", value, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicGreaterThan(Double value) {
            addCriterion("diastolic >", value, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicGreaterThanOrEqualTo(Double value) {
            addCriterion("diastolic >=", value, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicLessThan(Double value) {
            addCriterion("diastolic <", value, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicLessThanOrEqualTo(Double value) {
            addCriterion("diastolic <=", value, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicIn(List<Double> values) {
            addCriterion("diastolic in", values, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicNotIn(List<Double> values) {
            addCriterion("diastolic not in", values, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicBetween(Double value1, Double value2) {
            addCriterion("diastolic between", value1, value2, "diastolic");
            return (Criteria) this;
        }

        public Criteria andDiastolicNotBetween(Double value1, Double value2) {
            addCriterion("diastolic not between", value1, value2, "diastolic");
            return (Criteria) this;
        }

        public Criteria andPulseIsNull() {
            addCriterion("pulse is null");
            return (Criteria) this;
        }

        public Criteria andPulseIsNotNull() {
            addCriterion("pulse is not null");
            return (Criteria) this;
        }

        public Criteria andPulseEqualTo(Double value) {
            addCriterion("pulse =", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotEqualTo(Double value) {
            addCriterion("pulse <>", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThan(Double value) {
            addCriterion("pulse >", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseGreaterThanOrEqualTo(Double value) {
            addCriterion("pulse >=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThan(Double value) {
            addCriterion("pulse <", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseLessThanOrEqualTo(Double value) {
            addCriterion("pulse <=", value, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseIn(List<Double> values) {
            addCriterion("pulse in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotIn(List<Double> values) {
            addCriterion("pulse not in", values, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseBetween(Double value1, Double value2) {
            addCriterion("pulse between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andPulseNotBetween(Double value1, Double value2) {
            addCriterion("pulse not between", value1, value2, "pulse");
            return (Criteria) this;
        }

        public Criteria andMeasureDateIsNull() {
            addCriterion("measureDate is null");
            return (Criteria) this;
        }

        public Criteria andMeasureDateIsNotNull() {
            addCriterion("measureDate is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureDateEqualTo(Date value) {
            addCriterion("measureDate =", value, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateNotEqualTo(Date value) {
            addCriterion("measureDate <>", value, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateGreaterThan(Date value) {
            addCriterion("measureDate >", value, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateGreaterThanOrEqualTo(Date value) {
            addCriterion("measureDate >=", value, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateLessThan(Date value) {
            addCriterion("measureDate <", value, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateLessThanOrEqualTo(Date value) {
            addCriterion("measureDate <=", value, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateIn(List<Date> values) {
            addCriterion("measureDate in", values, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateNotIn(List<Date> values) {
            addCriterion("measureDate not in", values, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateBetween(Date value1, Date value2) {
            addCriterion("measureDate between", value1, value2, "measureDate");
            return (Criteria) this;
        }

        public Criteria andMeasureDateNotBetween(Date value1, Date value2) {
            addCriterion("measureDate not between", value1, value2, "measureDate");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIsNull() {
            addCriterion("deviceID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIsNotNull() {
            addCriterion("deviceID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIDEqualTo(String value) {
            addCriterion("deviceID =", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotEqualTo(String value) {
            addCriterion("deviceID <>", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDGreaterThan(String value) {
            addCriterion("deviceID >", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDGreaterThanOrEqualTo(String value) {
            addCriterion("deviceID >=", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLessThan(String value) {
            addCriterion("deviceID <", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLessThanOrEqualTo(String value) {
            addCriterion("deviceID <=", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLike(String value) {
            addCriterion("deviceID like", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotLike(String value) {
            addCriterion("deviceID not like", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIn(List<String> values) {
            addCriterion("deviceID in", values, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotIn(List<String> values) {
            addCriterion("deviceID not in", values, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDBetween(String value1, String value2) {
            addCriterion("deviceID between", value1, value2, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotBetween(String value1, String value2) {
            addCriterion("deviceID not between", value1, value2, "deviceID");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andRawIsNull() {
            addCriterion("raw is null");
            return (Criteria) this;
        }

        public Criteria andRawIsNotNull() {
            addCriterion("raw is not null");
            return (Criteria) this;
        }

        public Criteria andRawEqualTo(String value) {
            addCriterion("raw =", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotEqualTo(String value) {
            addCriterion("raw <>", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawGreaterThan(String value) {
            addCriterion("raw >", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawGreaterThanOrEqualTo(String value) {
            addCriterion("raw >=", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawLessThan(String value) {
            addCriterion("raw <", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawLessThanOrEqualTo(String value) {
            addCriterion("raw <=", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawLike(String value) {
            addCriterion("raw like", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotLike(String value) {
            addCriterion("raw not like", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawIn(List<String> values) {
            addCriterion("raw in", values, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotIn(List<String> values) {
            addCriterion("raw not in", values, "raw");
            return (Criteria) this;
        }

        public Criteria andRawBetween(String value1, String value2) {
            addCriterion("raw between", value1, value2, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotBetween(String value1, String value2) {
            addCriterion("raw not between", value1, value2, "raw");
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