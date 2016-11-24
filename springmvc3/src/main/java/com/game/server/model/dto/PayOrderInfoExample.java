/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class PayOrderInfoExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public PayOrderInfoExample()
/*      */   {
/*   39 */     this.oredCriteria = new ArrayList();
/*      */   }
/*      */ 
/*      */   public void setOrderByClause(String orderByClause)
/*      */   {
/*   49 */     this.orderByClause = orderByClause;
/*      */   }
/*      */ 
/*      */   public String getOrderByClause()
/*      */   {
/*   59 */     return this.orderByClause;
/*      */   }
/*      */ 
/*      */   public void setDistinct(boolean distinct)
/*      */   {
/*   69 */     this.distinct = distinct;
/*      */   }
/*      */ 
/*      */   public boolean isDistinct()
/*      */   {
/*   79 */     return this.distinct;
/*      */   }
/*      */ 
/*      */   public List<Criteria> getOredCriteria()
/*      */   {
/*   89 */     return this.oredCriteria;
/*      */   }
/*      */ 
/*      */   public void or(Criteria criteria)
/*      */   {
/*   99 */     this.oredCriteria.add(criteria);
/*      */   }
/*      */ 
/*      */   public Criteria or()
/*      */   {
/*  109 */     Criteria criteria = createCriteriaInternal();
/*  110 */     this.oredCriteria.add(criteria);
/*  111 */     return criteria;
/*      */   }
/*      */ 
/*      */   public Criteria createCriteria()
/*      */   {
/*  121 */     Criteria criteria = createCriteriaInternal();
/*  122 */     if (this.oredCriteria.size() == 0) {
/*  123 */       this.oredCriteria.add(criteria);
/*      */     }
/*  125 */     return criteria;
/*      */   }
/*      */ 
/*      */   protected Criteria createCriteriaInternal()
/*      */   {
/*  135 */     Criteria criteria = new Criteria();
/*  136 */     return criteria;
/*      */   }
/*      */ 
/*      */   public void clear()
/*      */   {
/*  146 */     this.oredCriteria.clear();
/*  147 */     this.orderByClause = null;
/*  148 */     this.distinct = false;
/*      */   }
/*      */ 
/*      */   public static class Criterion
/*      */   {
/*      */     private String condition;
/*      */     private Object value;
/*      */     private Object secondValue;
/*      */     private boolean noValue;
/*      */     private boolean singleValue;
/*      */     private boolean betweenValue;
/*      */     private boolean listValue;
/*      */     private String typeHandler;
/*      */ 
/*      */     public String getCondition()
/*      */     {
/* 1746 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1750 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1754 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1758 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1762 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1766 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1770 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1774 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1779 */       this.condition = condition;
/* 1780 */       this.typeHandler = null;
/* 1781 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1786 */       this.condition = condition;
/* 1787 */       this.value = value;
/* 1788 */       this.typeHandler = typeHandler;
/* 1789 */       if ((value instanceof List))
/* 1790 */         this.listValue = true;
/*      */       else
/* 1792 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1797 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1802 */       this.condition = condition;
/* 1803 */       this.value = value;
/* 1804 */       this.secondValue = secondValue;
/* 1805 */       this.typeHandler = typeHandler;
/* 1806 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1810 */       this(condition, value, secondValue, null);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class Criteria extends GeneratedCriteria
/*      */   {
/*      */   }
/*      */ 
/*      */   protected static abstract class GeneratedCriteria
/*      */   {
/*      */     protected List<Criterion> criteria;
/*      */ 
/*      */     protected GeneratedCriteria()
/*      */     {
/*  162 */       this.criteria = new ArrayList();
/*      */     }
/*      */ 
/*      */     public boolean isValid() {
/*  166 */       return this.criteria.size() > 0;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getAllCriteria() {
/*  170 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getCriteria() {
/*  174 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition) {
/*  178 */       if (condition == null) {
/*  179 */         throw new RuntimeException("Value for condition cannot be null");
/*      */       }
/*  181 */       this.criteria.add(new Criterion(condition));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value, String property) {
/*  185 */       if (value == null) {
/*  186 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*      */       }
/*  188 */       this.criteria.add(new Criterion(condition, value));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/*  192 */       if ((value1 == null) || (value2 == null)) {
/*  193 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*      */       }
/*  195 */       this.criteria.add(new Criterion(condition, value1, value2));
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNull() {
/*  199 */       addCriterion("UID is null");
/*  200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNotNull() {
/*  204 */       addCriterion("UID is not null");
/*  205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidEqualTo(Long value) {
/*  209 */       addCriterion("UID =", value, "uid");
/*  210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotEqualTo(Long value) {
/*  214 */       addCriterion("UID <>", value, "uid");
/*  215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThan(Long value) {
/*  219 */       addCriterion("UID >", value, "uid");
/*  220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/*  224 */       addCriterion("UID >=", value, "uid");
/*  225 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThan(Long value) {
/*  229 */       addCriterion("UID <", value, "uid");
/*  230 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThanOrEqualTo(Long value) {
/*  234 */       addCriterion("UID <=", value, "uid");
/*  235 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIn(List<Long> values) {
/*  239 */       addCriterion("UID in", values, "uid");
/*  240 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotIn(List<Long> values) {
/*  244 */       addCriterion("UID not in", values, "uid");
/*  245 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidBetween(Long value1, Long value2) {
/*  249 */       addCriterion("UID between", value1, value2, "uid");
/*  250 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotBetween(Long value1, Long value2) {
/*  254 */       addCriterion("UID not between", value1, value2, "uid");
/*  255 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIsNull() {
/*  259 */       addCriterion("CPID is null");
/*  260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIsNotNull() {
/*  264 */       addCriterion("CPID is not null");
/*  265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidEqualTo(Long value) {
/*  269 */       addCriterion("CPID =", value, "cpid");
/*  270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotEqualTo(Long value) {
/*  274 */       addCriterion("CPID <>", value, "cpid");
/*  275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidGreaterThan(Long value) {
/*  279 */       addCriterion("CPID >", value, "cpid");
/*  280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidGreaterThanOrEqualTo(Long value) {
/*  284 */       addCriterion("CPID >=", value, "cpid");
/*  285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLessThan(Long value) {
/*  289 */       addCriterion("CPID <", value, "cpid");
/*  290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLessThanOrEqualTo(Long value) {
/*  294 */       addCriterion("CPID <=", value, "cpid");
/*  295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIn(List<Long> values) {
/*  299 */       addCriterion("CPID in", values, "cpid");
/*  300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotIn(List<Long> values) {
/*  304 */       addCriterion("CPID not in", values, "cpid");
/*  305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidBetween(Long value1, Long value2) {
/*  309 */       addCriterion("CPID between", value1, value2, "cpid");
/*  310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotBetween(Long value1, Long value2) {
/*  314 */       addCriterion("CPID not between", value1, value2, "cpid");
/*  315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeIsNull() {
/*  319 */       addCriterion("TRADE_TYPE is null");
/*  320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeIsNotNull() {
/*  324 */       addCriterion("TRADE_TYPE is not null");
/*  325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeEqualTo(String value) {
/*  329 */       addCriterion("TRADE_TYPE =", value, "tradeType");
/*  330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotEqualTo(String value) {
/*  334 */       addCriterion("TRADE_TYPE <>", value, "tradeType");
/*  335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeGreaterThan(String value) {
/*  339 */       addCriterion("TRADE_TYPE >", value, "tradeType");
/*  340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
/*  344 */       addCriterion("TRADE_TYPE >=", value, "tradeType");
/*  345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeLessThan(String value) {
/*  349 */       addCriterion("TRADE_TYPE <", value, "tradeType");
/*  350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeLessThanOrEqualTo(String value) {
/*  354 */       addCriterion("TRADE_TYPE <=", value, "tradeType");
/*  355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeLike(String value) {
/*  359 */       addCriterion("TRADE_TYPE like", value, "tradeType");
/*  360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotLike(String value) {
/*  364 */       addCriterion("TRADE_TYPE not like", value, "tradeType");
/*  365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeIn(List<String> values) {
/*  369 */       addCriterion("TRADE_TYPE in", values, "tradeType");
/*  370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotIn(List<String> values) {
/*  374 */       addCriterion("TRADE_TYPE not in", values, "tradeType");
/*  375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeBetween(String value1, String value2) {
/*  379 */       addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
/*  380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotBetween(String value1, String value2) {
/*  384 */       addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
/*  385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorIsNull() {
/*  389 */       addCriterion("OPERATOR is null");
/*  390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorIsNotNull() {
/*  394 */       addCriterion("OPERATOR is not null");
/*  395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorEqualTo(String value) {
/*  399 */       addCriterion("OPERATOR =", value, "operator");
/*  400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotEqualTo(String value) {
/*  404 */       addCriterion("OPERATOR <>", value, "operator");
/*  405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorGreaterThan(String value) {
/*  409 */       addCriterion("OPERATOR >", value, "operator");
/*  410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorGreaterThanOrEqualTo(String value) {
/*  414 */       addCriterion("OPERATOR >=", value, "operator");
/*  415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorLessThan(String value) {
/*  419 */       addCriterion("OPERATOR <", value, "operator");
/*  420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorLessThanOrEqualTo(String value) {
/*  424 */       addCriterion("OPERATOR <=", value, "operator");
/*  425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorLike(String value) {
/*  429 */       addCriterion("OPERATOR like", value, "operator");
/*  430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotLike(String value) {
/*  434 */       addCriterion("OPERATOR not like", value, "operator");
/*  435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorIn(List<String> values) {
/*  439 */       addCriterion("OPERATOR in", values, "operator");
/*  440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotIn(List<String> values) {
/*  444 */       addCriterion("OPERATOR not in", values, "operator");
/*  445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorBetween(String value1, String value2) {
/*  449 */       addCriterion("OPERATOR between", value1, value2, "operator");
/*  450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotBetween(String value1, String value2) {
/*  454 */       addCriterion("OPERATOR not between", value1, value2, "operator");
/*  455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeIsNull() {
/*  459 */       addCriterion("CHARGE_TIME is null");
/*  460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeIsNotNull() {
/*  464 */       addCriterion("CHARGE_TIME is not null");
/*  465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeEqualTo(String value) {
/*  469 */       addCriterion("CHARGE_TIME =", value, "chargeTime");
/*  470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeNotEqualTo(String value) {
/*  474 */       addCriterion("CHARGE_TIME <>", value, "chargeTime");
/*  475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeGreaterThan(String value) {
/*  479 */       addCriterion("CHARGE_TIME >", value, "chargeTime");
/*  480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeGreaterThanOrEqualTo(String value) {
/*  484 */       addCriterion("CHARGE_TIME >=", value, "chargeTime");
/*  485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeLessThan(String value) {
/*  489 */       addCriterion("CHARGE_TIME <", value, "chargeTime");
/*  490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeLessThanOrEqualTo(String value) {
/*  494 */       addCriterion("CHARGE_TIME <=", value, "chargeTime");
/*  495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeLike(String value) {
/*  499 */       addCriterion("CHARGE_TIME like", value, "chargeTime");
/*  500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeNotLike(String value) {
/*  504 */       addCriterion("CHARGE_TIME not like", value, "chargeTime");
/*  505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeIn(List<String> values) {
/*  509 */       addCriterion("CHARGE_TIME in", values, "chargeTime");
/*  510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeNotIn(List<String> values) {
/*  514 */       addCriterion("CHARGE_TIME not in", values, "chargeTime");
/*  515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeBetween(String value1, String value2) {
/*  519 */       addCriterion("CHARGE_TIME between", value1, value2, "chargeTime");
/*  520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargeTimeNotBetween(String value1, String value2) {
/*  524 */       addCriterion("CHARGE_TIME not between", value1, value2, "chargeTime");
/*  525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIsNull() {
/*  529 */       addCriterion("MOBILE_NUM is null");
/*  530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIsNotNull() {
/*  534 */       addCriterion("MOBILE_NUM is not null");
/*  535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumEqualTo(Long value) {
/*  539 */       addCriterion("MOBILE_NUM =", value, "mobileNum");
/*  540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotEqualTo(Long value) {
/*  544 */       addCriterion("MOBILE_NUM <>", value, "mobileNum");
/*  545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumGreaterThan(Long value) {
/*  549 */       addCriterion("MOBILE_NUM >", value, "mobileNum");
/*  550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumGreaterThanOrEqualTo(Long value) {
/*  554 */       addCriterion("MOBILE_NUM >=", value, "mobileNum");
/*  555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLessThan(Long value) {
/*  559 */       addCriterion("MOBILE_NUM <", value, "mobileNum");
/*  560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLessThanOrEqualTo(Long value) {
/*  564 */       addCriterion("MOBILE_NUM <=", value, "mobileNum");
/*  565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIn(List<Long> values) {
/*  569 */       addCriterion("MOBILE_NUM in", values, "mobileNum");
/*  570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotIn(List<Long> values) {
/*  574 */       addCriterion("MOBILE_NUM not in", values, "mobileNum");
/*  575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumBetween(Long value1, Long value2) {
/*  579 */       addCriterion("MOBILE_NUM between", value1, value2, "mobileNum");
/*  580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotBetween(Long value1, Long value2) {
/*  584 */       addCriterion("MOBILE_NUM not between", value1, value2, "mobileNum");
/*  585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoIsNull() {
/*  589 */       addCriterion("ZT_ORDER_NO is null");
/*  590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoIsNotNull() {
/*  594 */       addCriterion("ZT_ORDER_NO is not null");
/*  595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoEqualTo(String value) {
/*  599 */       addCriterion("ZT_ORDER_NO =", value, "ztOrderNo");
/*  600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotEqualTo(String value) {
/*  604 */       addCriterion("ZT_ORDER_NO <>", value, "ztOrderNo");
/*  605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoGreaterThan(String value) {
/*  609 */       addCriterion("ZT_ORDER_NO >", value, "ztOrderNo");
/*  610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoGreaterThanOrEqualTo(String value) {
/*  614 */       addCriterion("ZT_ORDER_NO >=", value, "ztOrderNo");
/*  615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoLessThan(String value) {
/*  619 */       addCriterion("ZT_ORDER_NO <", value, "ztOrderNo");
/*  620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoLessThanOrEqualTo(String value) {
/*  624 */       addCriterion("ZT_ORDER_NO <=", value, "ztOrderNo");
/*  625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoLike(String value) {
/*  629 */       addCriterion("ZT_ORDER_NO like", value, "ztOrderNo");
/*  630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotLike(String value) {
/*  634 */       addCriterion("ZT_ORDER_NO not like", value, "ztOrderNo");
/*  635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoIn(List<String> values) {
/*  639 */       addCriterion("ZT_ORDER_NO in", values, "ztOrderNo");
/*  640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotIn(List<String> values) {
/*  644 */       addCriterion("ZT_ORDER_NO not in", values, "ztOrderNo");
/*  645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoBetween(String value1, String value2) {
/*  649 */       addCriterion("ZT_ORDER_NO between", value1, value2, "ztOrderNo");
/*  650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotBetween(String value1, String value2) {
/*  654 */       addCriterion("ZT_ORDER_NO not between", value1, value2, "ztOrderNo");
/*  655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoIsNull() {
/*  659 */       addCriterion("CP_ORDER_NO is null");
/*  660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoIsNotNull() {
/*  664 */       addCriterion("CP_ORDER_NO is not null");
/*  665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoEqualTo(String value) {
/*  669 */       addCriterion("CP_ORDER_NO =", value, "cpOrderNo");
/*  670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoNotEqualTo(String value) {
/*  674 */       addCriterion("CP_ORDER_NO <>", value, "cpOrderNo");
/*  675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoGreaterThan(String value) {
/*  679 */       addCriterion("CP_ORDER_NO >", value, "cpOrderNo");
/*  680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoGreaterThanOrEqualTo(String value) {
/*  684 */       addCriterion("CP_ORDER_NO >=", value, "cpOrderNo");
/*  685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoLessThan(String value) {
/*  689 */       addCriterion("CP_ORDER_NO <", value, "cpOrderNo");
/*  690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoLessThanOrEqualTo(String value) {
/*  694 */       addCriterion("CP_ORDER_NO <=", value, "cpOrderNo");
/*  695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoLike(String value) {
/*  699 */       addCriterion("CP_ORDER_NO like", value, "cpOrderNo");
/*  700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoNotLike(String value) {
/*  704 */       addCriterion("CP_ORDER_NO not like", value, "cpOrderNo");
/*  705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoIn(List<String> values) {
/*  709 */       addCriterion("CP_ORDER_NO in", values, "cpOrderNo");
/*  710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoNotIn(List<String> values) {
/*  714 */       addCriterion("CP_ORDER_NO not in", values, "cpOrderNo");
/*  715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoBetween(String value1, String value2) {
/*  719 */       addCriterion("CP_ORDER_NO between", value1, value2, "cpOrderNo");
/*  720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderNoNotBetween(String value1, String value2) {
/*  724 */       addCriterion("CP_ORDER_NO not between", value1, value2, "cpOrderNo");
/*  725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountIsNull() {
/*  729 */       addCriterion("AMOUNT is null");
/*  730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountIsNotNull() {
/*  734 */       addCriterion("AMOUNT is not null");
/*  735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountEqualTo(Integer value) {
/*  739 */       addCriterion("AMOUNT =", value, "amount");
/*  740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotEqualTo(Integer value) {
/*  744 */       addCriterion("AMOUNT <>", value, "amount");
/*  745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountGreaterThan(Integer value) {
/*  749 */       addCriterion("AMOUNT >", value, "amount");
/*  750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
/*  754 */       addCriterion("AMOUNT >=", value, "amount");
/*  755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountLessThan(Integer value) {
/*  759 */       addCriterion("AMOUNT <", value, "amount");
/*  760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountLessThanOrEqualTo(Integer value) {
/*  764 */       addCriterion("AMOUNT <=", value, "amount");
/*  765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountIn(List<Integer> values) {
/*  769 */       addCriterion("AMOUNT in", values, "amount");
/*  770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotIn(List<Integer> values) {
/*  774 */       addCriterion("AMOUNT not in", values, "amount");
/*  775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountBetween(Integer value1, Integer value2) {
/*  779 */       addCriterion("AMOUNT between", value1, value2, "amount");
/*  780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotBetween(Integer value1, Integer value2) {
/*  784 */       addCriterion("AMOUNT not between", value1, value2, "amount");
/*  785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIsNull() {
/*  789 */       addCriterion("STATUS is null");
/*  790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIsNotNull() {
/*  794 */       addCriterion("STATUS is not null");
/*  795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusEqualTo(String value) {
/*  799 */       addCriterion("STATUS =", value, "status");
/*  800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotEqualTo(String value) {
/*  804 */       addCriterion("STATUS <>", value, "status");
/*  805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusGreaterThan(String value) {
/*  809 */       addCriterion("STATUS >", value, "status");
/*  810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusGreaterThanOrEqualTo(String value) {
/*  814 */       addCriterion("STATUS >=", value, "status");
/*  815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLessThan(String value) {
/*  819 */       addCriterion("STATUS <", value, "status");
/*  820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLessThanOrEqualTo(String value) {
/*  824 */       addCriterion("STATUS <=", value, "status");
/*  825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLike(String value) {
/*  829 */       addCriterion("STATUS like", value, "status");
/*  830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotLike(String value) {
/*  834 */       addCriterion("STATUS not like", value, "status");
/*  835 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIn(List<String> values) {
/*  839 */       addCriterion("STATUS in", values, "status");
/*  840 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotIn(List<String> values) {
/*  844 */       addCriterion("STATUS not in", values, "status");
/*  845 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusBetween(String value1, String value2) {
/*  849 */       addCriterion("STATUS between", value1, value2, "status");
/*  850 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotBetween(String value1, String value2) {
/*  854 */       addCriterion("STATUS not between", value1, value2, "status");
/*  855 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignIsNull() {
/*  859 */       addCriterion("SIGN is null");
/*  860 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignIsNotNull() {
/*  864 */       addCriterion("SIGN is not null");
/*  865 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignEqualTo(String value) {
/*  869 */       addCriterion("SIGN =", value, "sign");
/*  870 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotEqualTo(String value) {
/*  874 */       addCriterion("SIGN <>", value, "sign");
/*  875 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignGreaterThan(String value) {
/*  879 */       addCriterion("SIGN >", value, "sign");
/*  880 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignGreaterThanOrEqualTo(String value) {
/*  884 */       addCriterion("SIGN >=", value, "sign");
/*  885 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignLessThan(String value) {
/*  889 */       addCriterion("SIGN <", value, "sign");
/*  890 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignLessThanOrEqualTo(String value) {
/*  894 */       addCriterion("SIGN <=", value, "sign");
/*  895 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignLike(String value) {
/*  899 */       addCriterion("SIGN like", value, "sign");
/*  900 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotLike(String value) {
/*  904 */       addCriterion("SIGN not like", value, "sign");
/*  905 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignIn(List<String> values) {
/*  909 */       addCriterion("SIGN in", values, "sign");
/*  910 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotIn(List<String> values) {
/*  914 */       addCriterion("SIGN not in", values, "sign");
/*  915 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignBetween(String value1, String value2) {
/*  919 */       addCriterion("SIGN between", value1, value2, "sign");
/*  920 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotBetween(String value1, String value2) {
/*  924 */       addCriterion("SIGN not between", value1, value2, "sign");
/*  925 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateIsNull() {
/*  929 */       addCriterion("GATE is null");
/*  930 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateIsNotNull() {
/*  934 */       addCriterion("GATE is not null");
/*  935 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateEqualTo(Long value) {
/*  939 */       addCriterion("GATE =", value, "gate");
/*  940 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotEqualTo(Long value) {
/*  944 */       addCriterion("GATE <>", value, "gate");
/*  945 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateGreaterThan(Long value) {
/*  949 */       addCriterion("GATE >", value, "gate");
/*  950 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateGreaterThanOrEqualTo(Long value) {
/*  954 */       addCriterion("GATE >=", value, "gate");
/*  955 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateLessThan(Long value) {
/*  959 */       addCriterion("GATE <", value, "gate");
/*  960 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateLessThanOrEqualTo(Long value) {
/*  964 */       addCriterion("GATE <=", value, "gate");
/*  965 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateIn(List<Long> values) {
/*  969 */       addCriterion("GATE in", values, "gate");
/*  970 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotIn(List<Long> values) {
/*  974 */       addCriterion("GATE not in", values, "gate");
/*  975 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateBetween(Long value1, Long value2) {
/*  979 */       addCriterion("GATE between", value1, value2, "gate");
/*  980 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotBetween(Long value1, Long value2) {
/*  984 */       addCriterion("GATE not between", value1, value2, "gate");
/*  985 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNull() {
/*  989 */       addCriterion("CONTENT is null");
/*  990 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNotNull() {
/*  994 */       addCriterion("CONTENT is not null");
/*  995 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentEqualTo(String value) {
/*  999 */       addCriterion("CONTENT =", value, "content");
/* 1000 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotEqualTo(String value) {
/* 1004 */       addCriterion("CONTENT <>", value, "content");
/* 1005 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThan(String value) {
/* 1009 */       addCriterion("CONTENT >", value, "content");
/* 1010 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThanOrEqualTo(String value) {
/* 1014 */       addCriterion("CONTENT >=", value, "content");
/* 1015 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThan(String value) {
/* 1019 */       addCriterion("CONTENT <", value, "content");
/* 1020 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThanOrEqualTo(String value) {
/* 1024 */       addCriterion("CONTENT <=", value, "content");
/* 1025 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLike(String value) {
/* 1029 */       addCriterion("CONTENT like", value, "content");
/* 1030 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotLike(String value) {
/* 1034 */       addCriterion("CONTENT not like", value, "content");
/* 1035 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIn(List<String> values) {
/* 1039 */       addCriterion("CONTENT in", values, "content");
/* 1040 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotIn(List<String> values) {
/* 1044 */       addCriterion("CONTENT not in", values, "content");
/* 1045 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentBetween(String value1, String value2) {
/* 1049 */       addCriterion("CONTENT between", value1, value2, "content");
/* 1050 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotBetween(String value1, String value2) {
/* 1054 */       addCriterion("CONTENT not between", value1, value2, "content");
/* 1055 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeIsNull() {
/* 1059 */       addCriterion("MOTIME is null");
/* 1060 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeIsNotNull() {
/* 1064 */       addCriterion("MOTIME is not null");
/* 1065 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeEqualTo(String value) {
/* 1069 */       addCriterion("MOTIME =", value, "motime");
/* 1070 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotEqualTo(String value) {
/* 1074 */       addCriterion("MOTIME <>", value, "motime");
/* 1075 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeGreaterThan(String value) {
/* 1079 */       addCriterion("MOTIME >", value, "motime");
/* 1080 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeGreaterThanOrEqualTo(String value) {
/* 1084 */       addCriterion("MOTIME >=", value, "motime");
/* 1085 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeLessThan(String value) {
/* 1089 */       addCriterion("MOTIME <", value, "motime");
/* 1090 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeLessThanOrEqualTo(String value) {
/* 1094 */       addCriterion("MOTIME <=", value, "motime");
/* 1095 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeLike(String value) {
/* 1099 */       addCriterion("MOTIME like", value, "motime");
/* 1100 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotLike(String value) {
/* 1104 */       addCriterion("MOTIME not like", value, "motime");
/* 1105 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeIn(List<String> values) {
/* 1109 */       addCriterion("MOTIME in", values, "motime");
/* 1110 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotIn(List<String> values) {
/* 1114 */       addCriterion("MOTIME not in", values, "motime");
/* 1115 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeBetween(String value1, String value2) {
/* 1119 */       addCriterion("MOTIME between", value1, value2, "motime");
/* 1120 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotBetween(String value1, String value2) {
/* 1124 */       addCriterion("MOTIME not between", value1, value2, "motime");
/* 1125 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidIsNull() {
/* 1129 */       addCriterion("LINKID is null");
/* 1130 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidIsNotNull() {
/* 1134 */       addCriterion("LINKID is not null");
/* 1135 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidEqualTo(String value) {
/* 1139 */       addCriterion("LINKID =", value, "linkid");
/* 1140 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotEqualTo(String value) {
/* 1144 */       addCriterion("LINKID <>", value, "linkid");
/* 1145 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidGreaterThan(String value) {
/* 1149 */       addCriterion("LINKID >", value, "linkid");
/* 1150 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidGreaterThanOrEqualTo(String value) {
/* 1154 */       addCriterion("LINKID >=", value, "linkid");
/* 1155 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidLessThan(String value) {
/* 1159 */       addCriterion("LINKID <", value, "linkid");
/* 1160 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidLessThanOrEqualTo(String value) {
/* 1164 */       addCriterion("LINKID <=", value, "linkid");
/* 1165 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidLike(String value) {
/* 1169 */       addCriterion("LINKID like", value, "linkid");
/* 1170 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotLike(String value) {
/* 1174 */       addCriterion("LINKID not like", value, "linkid");
/* 1175 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidIn(List<String> values) {
/* 1179 */       addCriterion("LINKID in", values, "linkid");
/* 1180 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotIn(List<String> values) {
/* 1184 */       addCriterion("LINKID not in", values, "linkid");
/* 1185 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidBetween(String value1, String value2) {
/* 1189 */       addCriterion("LINKID between", value1, value2, "linkid");
/* 1190 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotBetween(String value1, String value2) {
/* 1194 */       addCriterion("LINKID not between", value1, value2, "linkid");
/* 1195 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoIsNull() {
/* 1199 */       addCriterion("IS_REPORT_MO is null");
/* 1200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoIsNotNull() {
/* 1204 */       addCriterion("IS_REPORT_MO is not null");
/* 1205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoEqualTo(Long value) {
/* 1209 */       addCriterion("IS_REPORT_MO =", value, "isReportMo");
/* 1210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoNotEqualTo(Long value) {
/* 1214 */       addCriterion("IS_REPORT_MO <>", value, "isReportMo");
/* 1215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoGreaterThan(Long value) {
/* 1219 */       addCriterion("IS_REPORT_MO >", value, "isReportMo");
/* 1220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoGreaterThanOrEqualTo(Long value) {
/* 1224 */       addCriterion("IS_REPORT_MO >=", value, "isReportMo");
/* 1225 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoLessThan(Long value) {
/* 1229 */       addCriterion("IS_REPORT_MO <", value, "isReportMo");
/* 1230 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoLessThanOrEqualTo(Long value) {
/* 1234 */       addCriterion("IS_REPORT_MO <=", value, "isReportMo");
/* 1235 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoIn(List<Long> values) {
/* 1239 */       addCriterion("IS_REPORT_MO in", values, "isReportMo");
/* 1240 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoNotIn(List<Long> values) {
/* 1244 */       addCriterion("IS_REPORT_MO not in", values, "isReportMo");
/* 1245 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoBetween(Long value1, Long value2) {
/* 1249 */       addCriterion("IS_REPORT_MO between", value1, value2, "isReportMo");
/* 1250 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMoNotBetween(Long value1, Long value2) {
/* 1254 */       addCriterion("IS_REPORT_MO not between", value1, value2, "isReportMo");
/* 1255 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrIsNull() {
/* 1259 */       addCriterion("IS_REPORT_MR is null");
/* 1260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrIsNotNull() {
/* 1264 */       addCriterion("IS_REPORT_MR is not null");
/* 1265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrEqualTo(Long value) {
/* 1269 */       addCriterion("IS_REPORT_MR =", value, "isReportMr");
/* 1270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrNotEqualTo(Long value) {
/* 1274 */       addCriterion("IS_REPORT_MR <>", value, "isReportMr");
/* 1275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrGreaterThan(Long value) {
/* 1279 */       addCriterion("IS_REPORT_MR >", value, "isReportMr");
/* 1280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrGreaterThanOrEqualTo(Long value) {
/* 1284 */       addCriterion("IS_REPORT_MR >=", value, "isReportMr");
/* 1285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrLessThan(Long value) {
/* 1289 */       addCriterion("IS_REPORT_MR <", value, "isReportMr");
/* 1290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrLessThanOrEqualTo(Long value) {
/* 1294 */       addCriterion("IS_REPORT_MR <=", value, "isReportMr");
/* 1295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrIn(List<Long> values) {
/* 1299 */       addCriterion("IS_REPORT_MR in", values, "isReportMr");
/* 1300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrNotIn(List<Long> values) {
/* 1304 */       addCriterion("IS_REPORT_MR not in", values, "isReportMr");
/* 1305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrBetween(Long value1, Long value2) {
/* 1309 */       addCriterion("IS_REPORT_MR between", value1, value2, "isReportMr");
/* 1310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsReportMrNotBetween(Long value1, Long value2) {
/* 1314 */       addCriterion("IS_REPORT_MR not between", value1, value2, "isReportMr");
/* 1315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNull() {
/* 1319 */       addCriterion("CREATED is null");
/* 1320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNotNull() {
/* 1324 */       addCriterion("CREATED is not null");
/* 1325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedEqualTo(Date value) {
/* 1329 */       addCriterion("CREATED =", value, "created");
/* 1330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotEqualTo(Date value) {
/* 1334 */       addCriterion("CREATED <>", value, "created");
/* 1335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThan(Date value) {
/* 1339 */       addCriterion("CREATED >", value, "created");
/* 1340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
/* 1344 */       addCriterion("CREATED >=", value, "created");
/* 1345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThan(Date value) {
/* 1349 */       addCriterion("CREATED <", value, "created");
/* 1350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThanOrEqualTo(Date value) {
/* 1354 */       addCriterion("CREATED <=", value, "created");
/* 1355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIn(List<Date> values) {
/* 1359 */       addCriterion("CREATED in", values, "created");
/* 1360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotIn(List<Date> values) {
/* 1364 */       addCriterion("CREATED not in", values, "created");
/* 1365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedBetween(Date value1, Date value2) {
/* 1369 */       addCriterion("CREATED between", value1, value2, "created");
/* 1370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotBetween(Date value1, Date value2) {
/* 1374 */       addCriterion("CREATED not between", value1, value2, "created");
/* 1375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameIsNull() {
/* 1379 */       addCriterion("CONTENT_NAME is null");
/* 1380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameIsNotNull() {
/* 1384 */       addCriterion("CONTENT_NAME is not null");
/* 1385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameEqualTo(String value) {
/* 1389 */       addCriterion("CONTENT_NAME =", value, "contentName");
/* 1390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotEqualTo(String value) {
/* 1394 */       addCriterion("CONTENT_NAME <>", value, "contentName");
/* 1395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameGreaterThan(String value) {
/* 1399 */       addCriterion("CONTENT_NAME >", value, "contentName");
/* 1400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameGreaterThanOrEqualTo(String value) {
/* 1404 */       addCriterion("CONTENT_NAME >=", value, "contentName");
/* 1405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameLessThan(String value) {
/* 1409 */       addCriterion("CONTENT_NAME <", value, "contentName");
/* 1410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameLessThanOrEqualTo(String value) {
/* 1414 */       addCriterion("CONTENT_NAME <=", value, "contentName");
/* 1415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameLike(String value) {
/* 1419 */       addCriterion("CONTENT_NAME like", value, "contentName");
/* 1420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotLike(String value) {
/* 1424 */       addCriterion("CONTENT_NAME not like", value, "contentName");
/* 1425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameIn(List<String> values) {
/* 1429 */       addCriterion("CONTENT_NAME in", values, "contentName");
/* 1430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotIn(List<String> values) {
/* 1434 */       addCriterion("CONTENT_NAME not in", values, "contentName");
/* 1435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameBetween(String value1, String value2) {
/* 1439 */       addCriterion("CONTENT_NAME between", value1, value2, "contentName");
/* 1440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotBetween(String value1, String value2) {
/* 1444 */       addCriterion("CONTENT_NAME not between", value1, value2, "contentName");
/* 1445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIsNull() {
/* 1449 */       addCriterion("PROVINCE_ID is null");
/* 1450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIsNotNull() {
/* 1454 */       addCriterion("PROVINCE_ID is not null");
/* 1455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdEqualTo(Long value) {
/* 1459 */       addCriterion("PROVINCE_ID =", value, "provinceId");
/* 1460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotEqualTo(Long value) {
/* 1464 */       addCriterion("PROVINCE_ID <>", value, "provinceId");
/* 1465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdGreaterThan(Long value) {
/* 1469 */       addCriterion("PROVINCE_ID >", value, "provinceId");
/* 1470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
/* 1474 */       addCriterion("PROVINCE_ID >=", value, "provinceId");
/* 1475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdLessThan(Long value) {
/* 1479 */       addCriterion("PROVINCE_ID <", value, "provinceId");
/* 1480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
/* 1484 */       addCriterion("PROVINCE_ID <=", value, "provinceId");
/* 1485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIn(List<Long> values) {
/* 1489 */       addCriterion("PROVINCE_ID in", values, "provinceId");
/* 1490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotIn(List<Long> values) {
/* 1494 */       addCriterion("PROVINCE_ID not in", values, "provinceId");
/* 1495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdBetween(Long value1, Long value2) {
/* 1499 */       addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
/* 1500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
/* 1504 */       addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
/* 1505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIsNull() {
/* 1509 */       addCriterion("PROVINCE_NAME is null");
/* 1510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIsNotNull() {
/* 1514 */       addCriterion("PROVINCE_NAME is not null");
/* 1515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameEqualTo(String value) {
/* 1519 */       addCriterion("PROVINCE_NAME =", value, "provinceName");
/* 1520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotEqualTo(String value) {
/* 1524 */       addCriterion("PROVINCE_NAME <>", value, "provinceName");
/* 1525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameGreaterThan(String value) {
/* 1529 */       addCriterion("PROVINCE_NAME >", value, "provinceName");
/* 1530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
/* 1534 */       addCriterion("PROVINCE_NAME >=", value, "provinceName");
/* 1535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLessThan(String value) {
/* 1539 */       addCriterion("PROVINCE_NAME <", value, "provinceName");
/* 1540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLessThanOrEqualTo(String value) {
/* 1544 */       addCriterion("PROVINCE_NAME <=", value, "provinceName");
/* 1545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLike(String value) {
/* 1549 */       addCriterion("PROVINCE_NAME like", value, "provinceName");
/* 1550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotLike(String value) {
/* 1554 */       addCriterion("PROVINCE_NAME not like", value, "provinceName");
/* 1555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIn(List<String> values) {
/* 1559 */       addCriterion("PROVINCE_NAME in", values, "provinceName");
/* 1560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotIn(List<String> values) {
/* 1564 */       addCriterion("PROVINCE_NAME not in", values, "provinceName");
/* 1565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameBetween(String value1, String value2) {
/* 1569 */       addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
/* 1570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotBetween(String value1, String value2) {
/* 1574 */       addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
/* 1575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIsNull() {
/* 1579 */       addCriterion("CITY_CODE is null");
/* 1580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIsNotNull() {
/* 1584 */       addCriterion("CITY_CODE is not null");
/* 1585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeEqualTo(Long value) {
/* 1589 */       addCriterion("CITY_CODE =", value, "cityCode");
/* 1590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotEqualTo(Long value) {
/* 1594 */       addCriterion("CITY_CODE <>", value, "cityCode");
/* 1595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeGreaterThan(Long value) {
/* 1599 */       addCriterion("CITY_CODE >", value, "cityCode");
/* 1600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeGreaterThanOrEqualTo(Long value) {
/* 1604 */       addCriterion("CITY_CODE >=", value, "cityCode");
/* 1605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeLessThan(Long value) {
/* 1609 */       addCriterion("CITY_CODE <", value, "cityCode");
/* 1610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeLessThanOrEqualTo(Long value) {
/* 1614 */       addCriterion("CITY_CODE <=", value, "cityCode");
/* 1615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIn(List<Long> values) {
/* 1619 */       addCriterion("CITY_CODE in", values, "cityCode");
/* 1620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotIn(List<Long> values) {
/* 1624 */       addCriterion("CITY_CODE not in", values, "cityCode");
/* 1625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeBetween(Long value1, Long value2) {
/* 1629 */       addCriterion("CITY_CODE between", value1, value2, "cityCode");
/* 1630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotBetween(Long value1, Long value2) {
/* 1634 */       addCriterion("CITY_CODE not between", value1, value2, "cityCode");
/* 1635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIsNull() {
/* 1639 */       addCriterion("CITY_NAME is null");
/* 1640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIsNotNull() {
/* 1644 */       addCriterion("CITY_NAME is not null");
/* 1645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameEqualTo(String value) {
/* 1649 */       addCriterion("CITY_NAME =", value, "cityName");
/* 1650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotEqualTo(String value) {
/* 1654 */       addCriterion("CITY_NAME <>", value, "cityName");
/* 1655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameGreaterThan(String value) {
/* 1659 */       addCriterion("CITY_NAME >", value, "cityName");
/* 1660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameGreaterThanOrEqualTo(String value) {
/* 1664 */       addCriterion("CITY_NAME >=", value, "cityName");
/* 1665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLessThan(String value) {
/* 1669 */       addCriterion("CITY_NAME <", value, "cityName");
/* 1670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLessThanOrEqualTo(String value) {
/* 1674 */       addCriterion("CITY_NAME <=", value, "cityName");
/* 1675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLike(String value) {
/* 1679 */       addCriterion("CITY_NAME like", value, "cityName");
/* 1680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotLike(String value) {
/* 1684 */       addCriterion("CITY_NAME not like", value, "cityName");
/* 1685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIn(List<String> values) {
/* 1689 */       addCriterion("CITY_NAME in", values, "cityName");
/* 1690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotIn(List<String> values) {
/* 1694 */       addCriterion("CITY_NAME not in", values, "cityName");
/* 1695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameBetween(String value1, String value2) {
/* 1699 */       addCriterion("CITY_NAME between", value1, value2, "cityName");
/* 1700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotBetween(String value1, String value2) {
/* 1704 */       addCriterion("CITY_NAME not between", value1, value2, "cityName");
/* 1705 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderInfoExample
 * JD-Core Version:    0.6.2
 */