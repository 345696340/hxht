/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class SkPayOrderInfoExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public SkPayOrderInfoExample()
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
/* 1876 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1880 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1884 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1888 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1892 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1896 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1900 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1904 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1909 */       this.condition = condition;
/* 1910 */       this.typeHandler = null;
/* 1911 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1916 */       this.condition = condition;
/* 1917 */       this.value = value;
/* 1918 */       this.typeHandler = typeHandler;
/* 1919 */       if ((value instanceof List))
/* 1920 */         this.listValue = true;
/*      */       else
/* 1922 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1927 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1932 */       this.condition = condition;
/* 1933 */       this.value = value;
/* 1934 */       this.secondValue = secondValue;
/* 1935 */       this.typeHandler = typeHandler;
/* 1936 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1940 */       this(condition, value, secondValue, null);
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
/*      */     public Criteria andCpidEqualTo(String value) {
/*  269 */       addCriterion("CPID =", value, "cpid");
/*  270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotEqualTo(String value) {
/*  274 */       addCriterion("CPID <>", value, "cpid");
/*  275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidGreaterThan(String value) {
/*  279 */       addCriterion("CPID >", value, "cpid");
/*  280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidGreaterThanOrEqualTo(String value) {
/*  284 */       addCriterion("CPID >=", value, "cpid");
/*  285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLessThan(String value) {
/*  289 */       addCriterion("CPID <", value, "cpid");
/*  290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLessThanOrEqualTo(String value) {
/*  294 */       addCriterion("CPID <=", value, "cpid");
/*  295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLike(String value) {
/*  299 */       addCriterion("CPID like", value, "cpid");
/*  300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotLike(String value) {
/*  304 */       addCriterion("CPID not like", value, "cpid");
/*  305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIn(List<String> values) {
/*  309 */       addCriterion("CPID in", values, "cpid");
/*  310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotIn(List<String> values) {
/*  314 */       addCriterion("CPID not in", values, "cpid");
/*  315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidBetween(String value1, String value2) {
/*  319 */       addCriterion("CPID between", value1, value2, "cpid");
/*  320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotBetween(String value1, String value2) {
/*  324 */       addCriterion("CPID not between", value1, value2, "cpid");
/*  325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateIsNull() {
/*  329 */       addCriterion("GATE is null");
/*  330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateIsNotNull() {
/*  334 */       addCriterion("GATE is not null");
/*  335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateEqualTo(String value) {
/*  339 */       addCriterion("GATE =", value, "gate");
/*  340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotEqualTo(String value) {
/*  344 */       addCriterion("GATE <>", value, "gate");
/*  345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateGreaterThan(String value) {
/*  349 */       addCriterion("GATE >", value, "gate");
/*  350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateGreaterThanOrEqualTo(String value) {
/*  354 */       addCriterion("GATE >=", value, "gate");
/*  355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateLessThan(String value) {
/*  359 */       addCriterion("GATE <", value, "gate");
/*  360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateLessThanOrEqualTo(String value) {
/*  364 */       addCriterion("GATE <=", value, "gate");
/*  365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateLike(String value) {
/*  369 */       addCriterion("GATE like", value, "gate");
/*  370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotLike(String value) {
/*  374 */       addCriterion("GATE not like", value, "gate");
/*  375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateIn(List<String> values) {
/*  379 */       addCriterion("GATE in", values, "gate");
/*  380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotIn(List<String> values) {
/*  384 */       addCriterion("GATE not in", values, "gate");
/*  385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateBetween(String value1, String value2) {
/*  389 */       addCriterion("GATE between", value1, value2, "gate");
/*  390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGateNotBetween(String value1, String value2) {
/*  394 */       addCriterion("GATE not between", value1, value2, "gate");
/*  395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsIsNull() {
/*  399 */       addCriterion("WO_SMS is null");
/*  400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsIsNotNull() {
/*  404 */       addCriterion("WO_SMS is not null");
/*  405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsEqualTo(String value) {
/*  409 */       addCriterion("WO_SMS =", value, "woSms");
/*  410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsNotEqualTo(String value) {
/*  414 */       addCriterion("WO_SMS <>", value, "woSms");
/*  415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsGreaterThan(String value) {
/*  419 */       addCriterion("WO_SMS >", value, "woSms");
/*  420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsGreaterThanOrEqualTo(String value) {
/*  424 */       addCriterion("WO_SMS >=", value, "woSms");
/*  425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsLessThan(String value) {
/*  429 */       addCriterion("WO_SMS <", value, "woSms");
/*  430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsLessThanOrEqualTo(String value) {
/*  434 */       addCriterion("WO_SMS <=", value, "woSms");
/*  435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsLike(String value) {
/*  439 */       addCriterion("WO_SMS like", value, "woSms");
/*  440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsNotLike(String value) {
/*  444 */       addCriterion("WO_SMS not like", value, "woSms");
/*  445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsIn(List<String> values) {
/*  449 */       addCriterion("WO_SMS in", values, "woSms");
/*  450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsNotIn(List<String> values) {
/*  454 */       addCriterion("WO_SMS not in", values, "woSms");
/*  455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsBetween(String value1, String value2) {
/*  459 */       addCriterion("WO_SMS between", value1, value2, "woSms");
/*  460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoSmsNotBetween(String value1, String value2) {
/*  464 */       addCriterion("WO_SMS not between", value1, value2, "woSms");
/*  465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIsNull() {
/*  469 */       addCriterion("APPKEY is null");
/*  470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIsNotNull() {
/*  474 */       addCriterion("APPKEY is not null");
/*  475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyEqualTo(String value) {
/*  479 */       addCriterion("APPKEY =", value, "appkey");
/*  480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotEqualTo(String value) {
/*  484 */       addCriterion("APPKEY <>", value, "appkey");
/*  485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyGreaterThan(String value) {
/*  489 */       addCriterion("APPKEY >", value, "appkey");
/*  490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
/*  494 */       addCriterion("APPKEY >=", value, "appkey");
/*  495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLessThan(String value) {
/*  499 */       addCriterion("APPKEY <", value, "appkey");
/*  500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLessThanOrEqualTo(String value) {
/*  504 */       addCriterion("APPKEY <=", value, "appkey");
/*  505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLike(String value) {
/*  509 */       addCriterion("APPKEY like", value, "appkey");
/*  510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotLike(String value) {
/*  514 */       addCriterion("APPKEY not like", value, "appkey");
/*  515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIn(List<String> values) {
/*  519 */       addCriterion("APPKEY in", values, "appkey");
/*  520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotIn(List<String> values) {
/*  524 */       addCriterion("APPKEY not in", values, "appkey");
/*  525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyBetween(String value1, String value2) {
/*  529 */       addCriterion("APPKEY between", value1, value2, "appkey");
/*  530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotBetween(String value1, String value2) {
/*  534 */       addCriterion("APPKEY not between", value1, value2, "appkey");
/*  535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeIsNull() {
/*  539 */       addCriterion("TRADE_TYPE is null");
/*  540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeIsNotNull() {
/*  544 */       addCriterion("TRADE_TYPE is not null");
/*  545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeEqualTo(String value) {
/*  549 */       addCriterion("TRADE_TYPE =", value, "tradeType");
/*  550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotEqualTo(String value) {
/*  554 */       addCriterion("TRADE_TYPE <>", value, "tradeType");
/*  555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeGreaterThan(String value) {
/*  559 */       addCriterion("TRADE_TYPE >", value, "tradeType");
/*  560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
/*  564 */       addCriterion("TRADE_TYPE >=", value, "tradeType");
/*  565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeLessThan(String value) {
/*  569 */       addCriterion("TRADE_TYPE <", value, "tradeType");
/*  570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeLessThanOrEqualTo(String value) {
/*  574 */       addCriterion("TRADE_TYPE <=", value, "tradeType");
/*  575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeLike(String value) {
/*  579 */       addCriterion("TRADE_TYPE like", value, "tradeType");
/*  580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotLike(String value) {
/*  584 */       addCriterion("TRADE_TYPE not like", value, "tradeType");
/*  585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeIn(List<String> values) {
/*  589 */       addCriterion("TRADE_TYPE in", values, "tradeType");
/*  590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotIn(List<String> values) {
/*  594 */       addCriterion("TRADE_TYPE not in", values, "tradeType");
/*  595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeBetween(String value1, String value2) {
/*  599 */       addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
/*  600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeTypeNotBetween(String value1, String value2) {
/*  604 */       addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
/*  605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorIsNull() {
/*  609 */       addCriterion("OPERATOR is null");
/*  610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorIsNotNull() {
/*  614 */       addCriterion("OPERATOR is not null");
/*  615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorEqualTo(String value) {
/*  619 */       addCriterion("OPERATOR =", value, "operator");
/*  620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotEqualTo(String value) {
/*  624 */       addCriterion("OPERATOR <>", value, "operator");
/*  625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorGreaterThan(String value) {
/*  629 */       addCriterion("OPERATOR >", value, "operator");
/*  630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorGreaterThanOrEqualTo(String value) {
/*  634 */       addCriterion("OPERATOR >=", value, "operator");
/*  635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorLessThan(String value) {
/*  639 */       addCriterion("OPERATOR <", value, "operator");
/*  640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorLessThanOrEqualTo(String value) {
/*  644 */       addCriterion("OPERATOR <=", value, "operator");
/*  645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorLike(String value) {
/*  649 */       addCriterion("OPERATOR like", value, "operator");
/*  650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotLike(String value) {
/*  654 */       addCriterion("OPERATOR not like", value, "operator");
/*  655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorIn(List<String> values) {
/*  659 */       addCriterion("OPERATOR in", values, "operator");
/*  660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotIn(List<String> values) {
/*  664 */       addCriterion("OPERATOR not in", values, "operator");
/*  665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorBetween(String value1, String value2) {
/*  669 */       addCriterion("OPERATOR between", value1, value2, "operator");
/*  670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOperatorNotBetween(String value1, String value2) {
/*  674 */       addCriterion("OPERATOR not between", value1, value2, "operator");
/*  675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIsNull() {
/*  679 */       addCriterion("MOBILE_NUM is null");
/*  680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIsNotNull() {
/*  684 */       addCriterion("MOBILE_NUM is not null");
/*  685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumEqualTo(String value) {
/*  689 */       addCriterion("MOBILE_NUM =", value, "mobileNum");
/*  690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotEqualTo(String value) {
/*  694 */       addCriterion("MOBILE_NUM <>", value, "mobileNum");
/*  695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumGreaterThan(String value) {
/*  699 */       addCriterion("MOBILE_NUM >", value, "mobileNum");
/*  700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumGreaterThanOrEqualTo(String value) {
/*  704 */       addCriterion("MOBILE_NUM >=", value, "mobileNum");
/*  705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLessThan(String value) {
/*  709 */       addCriterion("MOBILE_NUM <", value, "mobileNum");
/*  710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLessThanOrEqualTo(String value) {
/*  714 */       addCriterion("MOBILE_NUM <=", value, "mobileNum");
/*  715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLike(String value) {
/*  719 */       addCriterion("MOBILE_NUM like", value, "mobileNum");
/*  720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotLike(String value) {
/*  724 */       addCriterion("MOBILE_NUM not like", value, "mobileNum");
/*  725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIn(List<String> values) {
/*  729 */       addCriterion("MOBILE_NUM in", values, "mobileNum");
/*  730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotIn(List<String> values) {
/*  734 */       addCriterion("MOBILE_NUM not in", values, "mobileNum");
/*  735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumBetween(String value1, String value2) {
/*  739 */       addCriterion("MOBILE_NUM between", value1, value2, "mobileNum");
/*  740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotBetween(String value1, String value2) {
/*  744 */       addCriterion("MOBILE_NUM not between", value1, value2, "mobileNum");
/*  745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNull() {
/*  749 */       addCriterion("CONTENT is null");
/*  750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNotNull() {
/*  754 */       addCriterion("CONTENT is not null");
/*  755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentEqualTo(String value) {
/*  759 */       addCriterion("CONTENT =", value, "content");
/*  760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotEqualTo(String value) {
/*  764 */       addCriterion("CONTENT <>", value, "content");
/*  765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThan(String value) {
/*  769 */       addCriterion("CONTENT >", value, "content");
/*  770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThanOrEqualTo(String value) {
/*  774 */       addCriterion("CONTENT >=", value, "content");
/*  775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThan(String value) {
/*  779 */       addCriterion("CONTENT <", value, "content");
/*  780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThanOrEqualTo(String value) {
/*  784 */       addCriterion("CONTENT <=", value, "content");
/*  785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLike(String value) {
/*  789 */       addCriterion("CONTENT like", value, "content");
/*  790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotLike(String value) {
/*  794 */       addCriterion("CONTENT not like", value, "content");
/*  795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIn(List<String> values) {
/*  799 */       addCriterion("CONTENT in", values, "content");
/*  800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotIn(List<String> values) {
/*  804 */       addCriterion("CONTENT not in", values, "content");
/*  805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentBetween(String value1, String value2) {
/*  809 */       addCriterion("CONTENT between", value1, value2, "content");
/*  810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotBetween(String value1, String value2) {
/*  814 */       addCriterion("CONTENT not between", value1, value2, "content");
/*  815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeIsNull() {
/*  819 */       addCriterion("MOTIME is null");
/*  820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeIsNotNull() {
/*  824 */       addCriterion("MOTIME is not null");
/*  825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeEqualTo(String value) {
/*  829 */       addCriterion("MOTIME =", value, "motime");
/*  830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotEqualTo(String value) {
/*  834 */       addCriterion("MOTIME <>", value, "motime");
/*  835 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeGreaterThan(String value) {
/*  839 */       addCriterion("MOTIME >", value, "motime");
/*  840 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeGreaterThanOrEqualTo(String value) {
/*  844 */       addCriterion("MOTIME >=", value, "motime");
/*  845 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeLessThan(String value) {
/*  849 */       addCriterion("MOTIME <", value, "motime");
/*  850 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeLessThanOrEqualTo(String value) {
/*  854 */       addCriterion("MOTIME <=", value, "motime");
/*  855 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeLike(String value) {
/*  859 */       addCriterion("MOTIME like", value, "motime");
/*  860 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotLike(String value) {
/*  864 */       addCriterion("MOTIME not like", value, "motime");
/*  865 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeIn(List<String> values) {
/*  869 */       addCriterion("MOTIME in", values, "motime");
/*  870 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotIn(List<String> values) {
/*  874 */       addCriterion("MOTIME not in", values, "motime");
/*  875 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeBetween(String value1, String value2) {
/*  879 */       addCriterion("MOTIME between", value1, value2, "motime");
/*  880 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMotimeNotBetween(String value1, String value2) {
/*  884 */       addCriterion("MOTIME not between", value1, value2, "motime");
/*  885 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountIsNull() {
/*  889 */       addCriterion("AMOUNT is null");
/*  890 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountIsNotNull() {
/*  894 */       addCriterion("AMOUNT is not null");
/*  895 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountEqualTo(String value) {
/*  899 */       addCriterion("AMOUNT =", value, "amount");
/*  900 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotEqualTo(String value) {
/*  904 */       addCriterion("AMOUNT <>", value, "amount");
/*  905 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountGreaterThan(String value) {
/*  909 */       addCriterion("AMOUNT >", value, "amount");
/*  910 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountGreaterThanOrEqualTo(String value) {
/*  914 */       addCriterion("AMOUNT >=", value, "amount");
/*  915 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountLessThan(String value) {
/*  919 */       addCriterion("AMOUNT <", value, "amount");
/*  920 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountLessThanOrEqualTo(String value) {
/*  924 */       addCriterion("AMOUNT <=", value, "amount");
/*  925 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountLike(String value) {
/*  929 */       addCriterion("AMOUNT like", value, "amount");
/*  930 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotLike(String value) {
/*  934 */       addCriterion("AMOUNT not like", value, "amount");
/*  935 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountIn(List<String> values) {
/*  939 */       addCriterion("AMOUNT in", values, "amount");
/*  940 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotIn(List<String> values) {
/*  944 */       addCriterion("AMOUNT not in", values, "amount");
/*  945 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountBetween(String value1, String value2) {
/*  949 */       addCriterion("AMOUNT between", value1, value2, "amount");
/*  950 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmountNotBetween(String value1, String value2) {
/*  954 */       addCriterion("AMOUNT not between", value1, value2, "amount");
/*  955 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdIsNull() {
/*  959 */       addCriterion("CP_ORDER_ID is null");
/*  960 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdIsNotNull() {
/*  964 */       addCriterion("CP_ORDER_ID is not null");
/*  965 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdEqualTo(String value) {
/*  969 */       addCriterion("CP_ORDER_ID =", value, "cpOrderId");
/*  970 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdNotEqualTo(String value) {
/*  974 */       addCriterion("CP_ORDER_ID <>", value, "cpOrderId");
/*  975 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdGreaterThan(String value) {
/*  979 */       addCriterion("CP_ORDER_ID >", value, "cpOrderId");
/*  980 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdGreaterThanOrEqualTo(String value) {
/*  984 */       addCriterion("CP_ORDER_ID >=", value, "cpOrderId");
/*  985 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdLessThan(String value) {
/*  989 */       addCriterion("CP_ORDER_ID <", value, "cpOrderId");
/*  990 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdLessThanOrEqualTo(String value) {
/*  994 */       addCriterion("CP_ORDER_ID <=", value, "cpOrderId");
/*  995 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdLike(String value) {
/*  999 */       addCriterion("CP_ORDER_ID like", value, "cpOrderId");
/* 1000 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdNotLike(String value) {
/* 1004 */       addCriterion("CP_ORDER_ID not like", value, "cpOrderId");
/* 1005 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdIn(List<String> values) {
/* 1009 */       addCriterion("CP_ORDER_ID in", values, "cpOrderId");
/* 1010 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdNotIn(List<String> values) {
/* 1014 */       addCriterion("CP_ORDER_ID not in", values, "cpOrderId");
/* 1015 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdBetween(String value1, String value2) {
/* 1019 */       addCriterion("CP_ORDER_ID between", value1, value2, "cpOrderId");
/* 1020 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpOrderIdNotBetween(String value1, String value2) {
/* 1024 */       addCriterion("CP_ORDER_ID not between", value1, value2, "cpOrderId");
/* 1025 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignIsNull() {
/* 1029 */       addCriterion("SIGN is null");
/* 1030 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignIsNotNull() {
/* 1034 */       addCriterion("SIGN is not null");
/* 1035 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignEqualTo(String value) {
/* 1039 */       addCriterion("SIGN =", value, "sign");
/* 1040 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotEqualTo(String value) {
/* 1044 */       addCriterion("SIGN <>", value, "sign");
/* 1045 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignGreaterThan(String value) {
/* 1049 */       addCriterion("SIGN >", value, "sign");
/* 1050 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignGreaterThanOrEqualTo(String value) {
/* 1054 */       addCriterion("SIGN >=", value, "sign");
/* 1055 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignLessThan(String value) {
/* 1059 */       addCriterion("SIGN <", value, "sign");
/* 1060 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignLessThanOrEqualTo(String value) {
/* 1064 */       addCriterion("SIGN <=", value, "sign");
/* 1065 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignLike(String value) {
/* 1069 */       addCriterion("SIGN like", value, "sign");
/* 1070 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotLike(String value) {
/* 1074 */       addCriterion("SIGN not like", value, "sign");
/* 1075 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignIn(List<String> values) {
/* 1079 */       addCriterion("SIGN in", values, "sign");
/* 1080 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotIn(List<String> values) {
/* 1084 */       addCriterion("SIGN not in", values, "sign");
/* 1085 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignBetween(String value1, String value2) {
/* 1089 */       addCriterion("SIGN between", value1, value2, "sign");
/* 1090 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSignNotBetween(String value1, String value2) {
/* 1094 */       addCriterion("SIGN not between", value1, value2, "sign");
/* 1095 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNull() {
/* 1099 */       addCriterion("LIMIT_ID is null");
/* 1100 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNotNull() {
/* 1104 */       addCriterion("LIMIT_ID is not null");
/* 1105 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdEqualTo(String value) {
/* 1109 */       addCriterion("LIMIT_ID =", value, "limitId");
/* 1110 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotEqualTo(String value) {
/* 1114 */       addCriterion("LIMIT_ID <>", value, "limitId");
/* 1115 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThan(String value) {
/* 1119 */       addCriterion("LIMIT_ID >", value, "limitId");
/* 1120 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
/* 1124 */       addCriterion("LIMIT_ID >=", value, "limitId");
/* 1125 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThan(String value) {
/* 1129 */       addCriterion("LIMIT_ID <", value, "limitId");
/* 1130 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThanOrEqualTo(String value) {
/* 1134 */       addCriterion("LIMIT_ID <=", value, "limitId");
/* 1135 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLike(String value) {
/* 1139 */       addCriterion("LIMIT_ID like", value, "limitId");
/* 1140 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotLike(String value) {
/* 1144 */       addCriterion("LIMIT_ID not like", value, "limitId");
/* 1145 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIn(List<String> values) {
/* 1149 */       addCriterion("LIMIT_ID in", values, "limitId");
/* 1150 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotIn(List<String> values) {
/* 1154 */       addCriterion("LIMIT_ID not in", values, "limitId");
/* 1155 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdBetween(String value1, String value2) {
/* 1159 */       addCriterion("LIMIT_ID between", value1, value2, "limitId");
/* 1160 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotBetween(String value1, String value2) {
/* 1164 */       addCriterion("LIMIT_ID not between", value1, value2, "limitId");
/* 1165 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultIsNull() {
/* 1169 */       addCriterion("IS_VAIL_RESULT is null");
/* 1170 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultIsNotNull() {
/* 1174 */       addCriterion("IS_VAIL_RESULT is not null");
/* 1175 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultEqualTo(String value) {
/* 1179 */       addCriterion("IS_VAIL_RESULT =", value, "isVailResult");
/* 1180 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultNotEqualTo(String value) {
/* 1184 */       addCriterion("IS_VAIL_RESULT <>", value, "isVailResult");
/* 1185 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultGreaterThan(String value) {
/* 1189 */       addCriterion("IS_VAIL_RESULT >", value, "isVailResult");
/* 1190 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultGreaterThanOrEqualTo(String value) {
/* 1194 */       addCriterion("IS_VAIL_RESULT >=", value, "isVailResult");
/* 1195 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultLessThan(String value) {
/* 1199 */       addCriterion("IS_VAIL_RESULT <", value, "isVailResult");
/* 1200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultLessThanOrEqualTo(String value) {
/* 1204 */       addCriterion("IS_VAIL_RESULT <=", value, "isVailResult");
/* 1205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultLike(String value) {
/* 1209 */       addCriterion("IS_VAIL_RESULT like", value, "isVailResult");
/* 1210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultNotLike(String value) {
/* 1214 */       addCriterion("IS_VAIL_RESULT not like", value, "isVailResult");
/* 1215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultIn(List<String> values) {
/* 1219 */       addCriterion("IS_VAIL_RESULT in", values, "isVailResult");
/* 1220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultNotIn(List<String> values) {
/* 1224 */       addCriterion("IS_VAIL_RESULT not in", values, "isVailResult");
/* 1225 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultBetween(String value1, String value2) {
/* 1229 */       addCriterion("IS_VAIL_RESULT between", value1, value2, "isVailResult");
/* 1230 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsVailResultNotBetween(String value1, String value2) {
/* 1234 */       addCriterion("IS_VAIL_RESULT not between", value1, value2, "isVailResult");
/* 1235 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoIsNull() {
/* 1239 */       addCriterion("IS_UP_MO is null");
/* 1240 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoIsNotNull() {
/* 1244 */       addCriterion("IS_UP_MO is not null");
/* 1245 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoEqualTo(String value) {
/* 1249 */       addCriterion("IS_UP_MO =", value, "isUpMo");
/* 1250 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoNotEqualTo(String value) {
/* 1254 */       addCriterion("IS_UP_MO <>", value, "isUpMo");
/* 1255 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoGreaterThan(String value) {
/* 1259 */       addCriterion("IS_UP_MO >", value, "isUpMo");
/* 1260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoGreaterThanOrEqualTo(String value) {
/* 1264 */       addCriterion("IS_UP_MO >=", value, "isUpMo");
/* 1265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoLessThan(String value) {
/* 1269 */       addCriterion("IS_UP_MO <", value, "isUpMo");
/* 1270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoLessThanOrEqualTo(String value) {
/* 1274 */       addCriterion("IS_UP_MO <=", value, "isUpMo");
/* 1275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoLike(String value) {
/* 1279 */       addCriterion("IS_UP_MO like", value, "isUpMo");
/* 1280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoNotLike(String value) {
/* 1284 */       addCriterion("IS_UP_MO not like", value, "isUpMo");
/* 1285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoIn(List<String> values) {
/* 1289 */       addCriterion("IS_UP_MO in", values, "isUpMo");
/* 1290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoNotIn(List<String> values) {
/* 1294 */       addCriterion("IS_UP_MO not in", values, "isUpMo");
/* 1295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoBetween(String value1, String value2) {
/* 1299 */       addCriterion("IS_UP_MO between", value1, value2, "isUpMo");
/* 1300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMoNotBetween(String value1, String value2) {
/* 1304 */       addCriterion("IS_UP_MO not between", value1, value2, "isUpMo");
/* 1305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateIsNull() {
/* 1309 */       addCriterion("UP_MO_DATE is null");
/* 1310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateIsNotNull() {
/* 1314 */       addCriterion("UP_MO_DATE is not null");
/* 1315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateEqualTo(Date value) {
/* 1319 */       addCriterion("UP_MO_DATE =", value, "upMoDate");
/* 1320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateNotEqualTo(Date value) {
/* 1324 */       addCriterion("UP_MO_DATE <>", value, "upMoDate");
/* 1325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateGreaterThan(Date value) {
/* 1329 */       addCriterion("UP_MO_DATE >", value, "upMoDate");
/* 1330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateGreaterThanOrEqualTo(Date value) {
/* 1334 */       addCriterion("UP_MO_DATE >=", value, "upMoDate");
/* 1335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateLessThan(Date value) {
/* 1339 */       addCriterion("UP_MO_DATE <", value, "upMoDate");
/* 1340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateLessThanOrEqualTo(Date value) {
/* 1344 */       addCriterion("UP_MO_DATE <=", value, "upMoDate");
/* 1345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateIn(List<Date> values) {
/* 1349 */       addCriterion("UP_MO_DATE in", values, "upMoDate");
/* 1350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateNotIn(List<Date> values) {
/* 1354 */       addCriterion("UP_MO_DATE not in", values, "upMoDate");
/* 1355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateBetween(Date value1, Date value2) {
/* 1359 */       addCriterion("UP_MO_DATE between", value1, value2, "upMoDate");
/* 1360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMoDateNotBetween(Date value1, Date value2) {
/* 1364 */       addCriterion("UP_MO_DATE not between", value1, value2, "upMoDate");
/* 1365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrIsNull() {
/* 1369 */       addCriterion("IS_UP_MR is null");
/* 1370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrIsNotNull() {
/* 1374 */       addCriterion("IS_UP_MR is not null");
/* 1375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrEqualTo(String value) {
/* 1379 */       addCriterion("IS_UP_MR =", value, "isUpMr");
/* 1380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrNotEqualTo(String value) {
/* 1384 */       addCriterion("IS_UP_MR <>", value, "isUpMr");
/* 1385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrGreaterThan(String value) {
/* 1389 */       addCriterion("IS_UP_MR >", value, "isUpMr");
/* 1390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrGreaterThanOrEqualTo(String value) {
/* 1394 */       addCriterion("IS_UP_MR >=", value, "isUpMr");
/* 1395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrLessThan(String value) {
/* 1399 */       addCriterion("IS_UP_MR <", value, "isUpMr");
/* 1400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrLessThanOrEqualTo(String value) {
/* 1404 */       addCriterion("IS_UP_MR <=", value, "isUpMr");
/* 1405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrLike(String value) {
/* 1409 */       addCriterion("IS_UP_MR like", value, "isUpMr");
/* 1410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrNotLike(String value) {
/* 1414 */       addCriterion("IS_UP_MR not like", value, "isUpMr");
/* 1415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrIn(List<String> values) {
/* 1419 */       addCriterion("IS_UP_MR in", values, "isUpMr");
/* 1420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrNotIn(List<String> values) {
/* 1424 */       addCriterion("IS_UP_MR not in", values, "isUpMr");
/* 1425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrBetween(String value1, String value2) {
/* 1429 */       addCriterion("IS_UP_MR between", value1, value2, "isUpMr");
/* 1430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsUpMrNotBetween(String value1, String value2) {
/* 1434 */       addCriterion("IS_UP_MR not between", value1, value2, "isUpMr");
/* 1435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateIsNull() {
/* 1439 */       addCriterion("UP_MR_DATE is null");
/* 1440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateIsNotNull() {
/* 1444 */       addCriterion("UP_MR_DATE is not null");
/* 1445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateEqualTo(Date value) {
/* 1449 */       addCriterion("UP_MR_DATE =", value, "upMrDate");
/* 1450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateNotEqualTo(Date value) {
/* 1454 */       addCriterion("UP_MR_DATE <>", value, "upMrDate");
/* 1455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateGreaterThan(Date value) {
/* 1459 */       addCriterion("UP_MR_DATE >", value, "upMrDate");
/* 1460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateGreaterThanOrEqualTo(Date value) {
/* 1464 */       addCriterion("UP_MR_DATE >=", value, "upMrDate");
/* 1465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateLessThan(Date value) {
/* 1469 */       addCriterion("UP_MR_DATE <", value, "upMrDate");
/* 1470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateLessThanOrEqualTo(Date value) {
/* 1474 */       addCriterion("UP_MR_DATE <=", value, "upMrDate");
/* 1475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateIn(List<Date> values) {
/* 1479 */       addCriterion("UP_MR_DATE in", values, "upMrDate");
/* 1480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateNotIn(List<Date> values) {
/* 1484 */       addCriterion("UP_MR_DATE not in", values, "upMrDate");
/* 1485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateBetween(Date value1, Date value2) {
/* 1489 */       addCriterion("UP_MR_DATE between", value1, value2, "upMrDate");
/* 1490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUpMrDateNotBetween(Date value1, Date value2) {
/* 1494 */       addCriterion("UP_MR_DATE not between", value1, value2, "upMrDate");
/* 1495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdIsNull() {
/* 1499 */       addCriterion("ID is null");
/* 1500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdIsNotNull() {
/* 1504 */       addCriterion("ID is not null");
/* 1505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdEqualTo(String value) {
/* 1509 */       addCriterion("ID =", value, "id");
/* 1510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotEqualTo(String value) {
/* 1514 */       addCriterion("ID <>", value, "id");
/* 1515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdGreaterThan(String value) {
/* 1519 */       addCriterion("ID >", value, "id");
/* 1520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdGreaterThanOrEqualTo(String value) {
/* 1524 */       addCriterion("ID >=", value, "id");
/* 1525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdLessThan(String value) {
/* 1529 */       addCriterion("ID <", value, "id");
/* 1530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdLessThanOrEqualTo(String value) {
/* 1534 */       addCriterion("ID <=", value, "id");
/* 1535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdLike(String value) {
/* 1539 */       addCriterion("ID like", value, "id");
/* 1540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotLike(String value) {
/* 1544 */       addCriterion("ID not like", value, "id");
/* 1545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdIn(List<String> values) {
/* 1549 */       addCriterion("ID in", values, "id");
/* 1550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotIn(List<String> values) {
/* 1554 */       addCriterion("ID not in", values, "id");
/* 1555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdBetween(String value1, String value2) {
/* 1559 */       addCriterion("ID between", value1, value2, "id");
/* 1560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotBetween(String value1, String value2) {
/* 1564 */       addCriterion("ID not between", value1, value2, "id");
/* 1565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIsNull() {
/* 1569 */       addCriterion("STATUS is null");
/* 1570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIsNotNull() {
/* 1574 */       addCriterion("STATUS is not null");
/* 1575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusEqualTo(String value) {
/* 1579 */       addCriterion("STATUS =", value, "status");
/* 1580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotEqualTo(String value) {
/* 1584 */       addCriterion("STATUS <>", value, "status");
/* 1585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusGreaterThan(String value) {
/* 1589 */       addCriterion("STATUS >", value, "status");
/* 1590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusGreaterThanOrEqualTo(String value) {
/* 1594 */       addCriterion("STATUS >=", value, "status");
/* 1595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLessThan(String value) {
/* 1599 */       addCriterion("STATUS <", value, "status");
/* 1600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLessThanOrEqualTo(String value) {
/* 1604 */       addCriterion("STATUS <=", value, "status");
/* 1605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLike(String value) {
/* 1609 */       addCriterion("STATUS like", value, "status");
/* 1610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotLike(String value) {
/* 1614 */       addCriterion("STATUS not like", value, "status");
/* 1615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIn(List<String> values) {
/* 1619 */       addCriterion("STATUS in", values, "status");
/* 1620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotIn(List<String> values) {
/* 1624 */       addCriterion("STATUS not in", values, "status");
/* 1625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusBetween(String value1, String value2) {
/* 1629 */       addCriterion("STATUS between", value1, value2, "status");
/* 1630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotBetween(String value1, String value2) {
/* 1634 */       addCriterion("STATUS not between", value1, value2, "status");
/* 1635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNull() {
/* 1639 */       addCriterion("CREATED is null");
/* 1640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNotNull() {
/* 1644 */       addCriterion("CREATED is not null");
/* 1645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedEqualTo(Date value) {
/* 1649 */       addCriterion("CREATED =", value, "created");
/* 1650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotEqualTo(Date value) {
/* 1654 */       addCriterion("CREATED <>", value, "created");
/* 1655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThan(Date value) {
/* 1659 */       addCriterion("CREATED >", value, "created");
/* 1660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
/* 1664 */       addCriterion("CREATED >=", value, "created");
/* 1665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThan(Date value) {
/* 1669 */       addCriterion("CREATED <", value, "created");
/* 1670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThanOrEqualTo(Date value) {
/* 1674 */       addCriterion("CREATED <=", value, "created");
/* 1675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIn(List<Date> values) {
/* 1679 */       addCriterion("CREATED in", values, "created");
/* 1680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotIn(List<Date> values) {
/* 1684 */       addCriterion("CREATED not in", values, "created");
/* 1685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedBetween(Date value1, Date value2) {
/* 1689 */       addCriterion("CREATED between", value1, value2, "created");
/* 1690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotBetween(Date value1, Date value2) {
/* 1694 */       addCriterion("CREATED not between", value1, value2, "created");
/* 1695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeIsNull() {
/* 1699 */       addCriterion("CHARGETIME is null");
/* 1700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeIsNotNull() {
/* 1704 */       addCriterion("CHARGETIME is not null");
/* 1705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeEqualTo(String value) {
/* 1709 */       addCriterion("CHARGETIME =", value, "chargetime");
/* 1710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeNotEqualTo(String value) {
/* 1714 */       addCriterion("CHARGETIME <>", value, "chargetime");
/* 1715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeGreaterThan(String value) {
/* 1719 */       addCriterion("CHARGETIME >", value, "chargetime");
/* 1720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeGreaterThanOrEqualTo(String value) {
/* 1724 */       addCriterion("CHARGETIME >=", value, "chargetime");
/* 1725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeLessThan(String value) {
/* 1729 */       addCriterion("CHARGETIME <", value, "chargetime");
/* 1730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeLessThanOrEqualTo(String value) {
/* 1734 */       addCriterion("CHARGETIME <=", value, "chargetime");
/* 1735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeLike(String value) {
/* 1739 */       addCriterion("CHARGETIME like", value, "chargetime");
/* 1740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeNotLike(String value) {
/* 1744 */       addCriterion("CHARGETIME not like", value, "chargetime");
/* 1745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeIn(List<String> values) {
/* 1749 */       addCriterion("CHARGETIME in", values, "chargetime");
/* 1750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeNotIn(List<String> values) {
/* 1754 */       addCriterion("CHARGETIME not in", values, "chargetime");
/* 1755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeBetween(String value1, String value2) {
/* 1759 */       addCriterion("CHARGETIME between", value1, value2, "chargetime");
/* 1760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChargetimeNotBetween(String value1, String value2) {
/* 1764 */       addCriterion("CHARGETIME not between", value1, value2, "chargetime");
/* 1765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoIsNull() {
/* 1769 */       addCriterion("ZT_ORDER_NO is null");
/* 1770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoIsNotNull() {
/* 1774 */       addCriterion("ZT_ORDER_NO is not null");
/* 1775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoEqualTo(String value) {
/* 1779 */       addCriterion("ZT_ORDER_NO =", value, "ztOrderNo");
/* 1780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotEqualTo(String value) {
/* 1784 */       addCriterion("ZT_ORDER_NO <>", value, "ztOrderNo");
/* 1785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoGreaterThan(String value) {
/* 1789 */       addCriterion("ZT_ORDER_NO >", value, "ztOrderNo");
/* 1790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoGreaterThanOrEqualTo(String value) {
/* 1794 */       addCriterion("ZT_ORDER_NO >=", value, "ztOrderNo");
/* 1795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoLessThan(String value) {
/* 1799 */       addCriterion("ZT_ORDER_NO <", value, "ztOrderNo");
/* 1800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoLessThanOrEqualTo(String value) {
/* 1804 */       addCriterion("ZT_ORDER_NO <=", value, "ztOrderNo");
/* 1805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoLike(String value) {
/* 1809 */       addCriterion("ZT_ORDER_NO like", value, "ztOrderNo");
/* 1810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotLike(String value) {
/* 1814 */       addCriterion("ZT_ORDER_NO not like", value, "ztOrderNo");
/* 1815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoIn(List<String> values) {
/* 1819 */       addCriterion("ZT_ORDER_NO in", values, "ztOrderNo");
/* 1820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotIn(List<String> values) {
/* 1824 */       addCriterion("ZT_ORDER_NO not in", values, "ztOrderNo");
/* 1825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoBetween(String value1, String value2) {
/* 1829 */       addCriterion("ZT_ORDER_NO between", value1, value2, "ztOrderNo");
/* 1830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andZtOrderNoNotBetween(String value1, String value2) {
/* 1834 */       addCriterion("ZT_ORDER_NO not between", value1, value2, "ztOrderNo");
/* 1835 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SkPayOrderInfoExample
 * JD-Core Version:    0.6.2
 */