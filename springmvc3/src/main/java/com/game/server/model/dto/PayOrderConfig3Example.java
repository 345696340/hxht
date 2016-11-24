/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ 
/*      */ public class PayOrderConfig3Example
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public PayOrderConfig3Example()
/*      */   {
/*   38 */     this.oredCriteria = new ArrayList();
/*      */   }
/*      */ 
/*      */   public void setOrderByClause(String orderByClause)
/*      */   {
/*   48 */     this.orderByClause = orderByClause;
/*      */   }
/*      */ 
/*      */   public String getOrderByClause()
/*      */   {
/*   58 */     return this.orderByClause;
/*      */   }
/*      */ 
/*      */   public void setDistinct(boolean distinct)
/*      */   {
/*   68 */     this.distinct = distinct;
/*      */   }
/*      */ 
/*      */   public boolean isDistinct()
/*      */   {
/*   78 */     return this.distinct;
/*      */   }
/*      */ 
/*      */   public List<Criteria> getOredCriteria()
/*      */   {
/*   88 */     return this.oredCriteria;
/*      */   }
/*      */ 
/*      */   public void or(Criteria criteria)
/*      */   {
/*   98 */     this.oredCriteria.add(criteria);
/*      */   }
/*      */ 
/*      */   public Criteria or()
/*      */   {
/*  108 */     Criteria criteria = createCriteriaInternal();
/*  109 */     this.oredCriteria.add(criteria);
/*  110 */     return criteria;
/*      */   }
/*      */ 
/*      */   public Criteria createCriteria()
/*      */   {
/*  120 */     Criteria criteria = createCriteriaInternal();
/*  121 */     if (this.oredCriteria.size() == 0) {
/*  122 */       this.oredCriteria.add(criteria);
/*      */     }
/*  124 */     return criteria;
/*      */   }
/*      */ 
/*      */   protected Criteria createCriteriaInternal()
/*      */   {
/*  134 */     Criteria criteria = new Criteria();
/*  135 */     return criteria;
/*      */   }
/*      */ 
/*      */   public void clear()
/*      */   {
/*  145 */     this.oredCriteria.clear();
/*  146 */     this.orderByClause = null;
/*  147 */     this.distinct = false;
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
/* 1055 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1059 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1063 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1067 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1071 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1075 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1079 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1083 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1088 */       this.condition = condition;
/* 1089 */       this.typeHandler = null;
/* 1090 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1095 */       this.condition = condition;
/* 1096 */       this.value = value;
/* 1097 */       this.typeHandler = typeHandler;
/* 1098 */       if ((value instanceof List))
/* 1099 */         this.listValue = true;
/*      */       else
/* 1101 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1106 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1111 */       this.condition = condition;
/* 1112 */       this.value = value;
/* 1113 */       this.secondValue = secondValue;
/* 1114 */       this.typeHandler = typeHandler;
/* 1115 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1119 */       this(condition, value, secondValue, null);
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
/*  161 */       this.criteria = new ArrayList();
/*      */     }
/*      */ 
/*      */     public boolean isValid() {
/*  165 */       return this.criteria.size() > 0;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getAllCriteria() {
/*  169 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getCriteria() {
/*  173 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition) {
/*  177 */       if (condition == null) {
/*  178 */         throw new RuntimeException("Value for condition cannot be null");
/*      */       }
/*  180 */       this.criteria.add(new Criterion(condition));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value, String property) {
/*  184 */       if (value == null) {
/*  185 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*      */       }
/*  187 */       this.criteria.add(new Criterion(condition, value));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/*  191 */       if ((value1 == null) || (value2 == null)) {
/*  192 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*      */       }
/*  194 */       this.criteria.add(new Criterion(condition, value1, value2));
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNull() {
/*  198 */       addCriterion("UID is null");
/*  199 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNotNull() {
/*  203 */       addCriterion("UID is not null");
/*  204 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidEqualTo(Long value) {
/*  208 */       addCriterion("UID =", value, "uid");
/*  209 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotEqualTo(Long value) {
/*  213 */       addCriterion("UID <>", value, "uid");
/*  214 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThan(Long value) {
/*  218 */       addCriterion("UID >", value, "uid");
/*  219 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/*  223 */       addCriterion("UID >=", value, "uid");
/*  224 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThan(Long value) {
/*  228 */       addCriterion("UID <", value, "uid");
/*  229 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThanOrEqualTo(Long value) {
/*  233 */       addCriterion("UID <=", value, "uid");
/*  234 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIn(List<Long> values) {
/*  238 */       addCriterion("UID in", values, "uid");
/*  239 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotIn(List<Long> values) {
/*  243 */       addCriterion("UID not in", values, "uid");
/*  244 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidBetween(Long value1, Long value2) {
/*  248 */       addCriterion("UID between", value1, value2, "uid");
/*  249 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotBetween(Long value1, Long value2) {
/*  253 */       addCriterion("UID not between", value1, value2, "uid");
/*  254 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdIsNull() {
/*  258 */       addCriterion("CHANNEL_ID is null");
/*  259 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdIsNotNull() {
/*  263 */       addCriterion("CHANNEL_ID is not null");
/*  264 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdEqualTo(String value) {
/*  268 */       addCriterion("CHANNEL_ID =", value, "channelId");
/*  269 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotEqualTo(String value) {
/*  273 */       addCriterion("CHANNEL_ID <>", value, "channelId");
/*  274 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdGreaterThan(String value) {
/*  278 */       addCriterion("CHANNEL_ID >", value, "channelId");
/*  279 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
/*  283 */       addCriterion("CHANNEL_ID >=", value, "channelId");
/*  284 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdLessThan(String value) {
/*  288 */       addCriterion("CHANNEL_ID <", value, "channelId");
/*  289 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdLessThanOrEqualTo(String value) {
/*  293 */       addCriterion("CHANNEL_ID <=", value, "channelId");
/*  294 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdLike(String value) {
/*  298 */       addCriterion("CHANNEL_ID like", value, "channelId");
/*  299 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotLike(String value) {
/*  303 */       addCriterion("CHANNEL_ID not like", value, "channelId");
/*  304 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdIn(List<String> values) {
/*  308 */       addCriterion("CHANNEL_ID in", values, "channelId");
/*  309 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotIn(List<String> values) {
/*  313 */       addCriterion("CHANNEL_ID not in", values, "channelId");
/*  314 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdBetween(String value1, String value2) {
/*  318 */       addCriterion("CHANNEL_ID between", value1, value2, "channelId");
/*  319 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotBetween(String value1, String value2) {
/*  323 */       addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
/*  324 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountIsNull() {
/*  328 */       addCriterion("TOTAL_AMOUNT is null");
/*  329 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountIsNotNull() {
/*  333 */       addCriterion("TOTAL_AMOUNT is not null");
/*  334 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountEqualTo(Long value) {
/*  338 */       addCriterion("TOTAL_AMOUNT =", value, "totalAmount");
/*  339 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountNotEqualTo(Long value) {
/*  343 */       addCriterion("TOTAL_AMOUNT <>", value, "totalAmount");
/*  344 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountGreaterThan(Long value) {
/*  348 */       addCriterion("TOTAL_AMOUNT >", value, "totalAmount");
/*  349 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
/*  353 */       addCriterion("TOTAL_AMOUNT >=", value, "totalAmount");
/*  354 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountLessThan(Long value) {
/*  358 */       addCriterion("TOTAL_AMOUNT <", value, "totalAmount");
/*  359 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
/*  363 */       addCriterion("TOTAL_AMOUNT <=", value, "totalAmount");
/*  364 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountIn(List<Long> values) {
/*  368 */       addCriterion("TOTAL_AMOUNT in", values, "totalAmount");
/*  369 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountNotIn(List<Long> values) {
/*  373 */       addCriterion("TOTAL_AMOUNT not in", values, "totalAmount");
/*  374 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountBetween(Long value1, Long value2) {
/*  378 */       addCriterion("TOTAL_AMOUNT between", value1, value2, "totalAmount");
/*  379 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
/*  383 */       addCriterion("TOTAL_AMOUNT not between", value1, value2, "totalAmount");
/*  384 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeIsNull() {
/*  388 */       addCriterion("PARTNER_VERIFY_CODE is null");
/*  389 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeIsNotNull() {
/*  393 */       addCriterion("PARTNER_VERIFY_CODE is not null");
/*  394 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeEqualTo(String value) {
/*  398 */       addCriterion("PARTNER_VERIFY_CODE =", value, "partnerVerifyCode");
/*  399 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeNotEqualTo(String value) {
/*  403 */       addCriterion("PARTNER_VERIFY_CODE <>", value, "partnerVerifyCode");
/*  404 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeGreaterThan(String value) {
/*  408 */       addCriterion("PARTNER_VERIFY_CODE >", value, "partnerVerifyCode");
/*  409 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeGreaterThanOrEqualTo(String value) {
/*  413 */       addCriterion("PARTNER_VERIFY_CODE >=", value, "partnerVerifyCode");
/*  414 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeLessThan(String value) {
/*  418 */       addCriterion("PARTNER_VERIFY_CODE <", value, "partnerVerifyCode");
/*  419 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeLessThanOrEqualTo(String value) {
/*  423 */       addCriterion("PARTNER_VERIFY_CODE <=", value, "partnerVerifyCode");
/*  424 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeLike(String value) {
/*  428 */       addCriterion("PARTNER_VERIFY_CODE like", value, "partnerVerifyCode");
/*  429 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeNotLike(String value) {
/*  433 */       addCriterion("PARTNER_VERIFY_CODE not like", value, "partnerVerifyCode");
/*  434 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeIn(List<String> values) {
/*  438 */       addCriterion("PARTNER_VERIFY_CODE in", values, "partnerVerifyCode");
/*  439 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeNotIn(List<String> values) {
/*  443 */       addCriterion("PARTNER_VERIFY_CODE not in", values, "partnerVerifyCode");
/*  444 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeBetween(String value1, String value2) {
/*  448 */       addCriterion("PARTNER_VERIFY_CODE between", value1, value2, "partnerVerifyCode");
/*  449 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerVerifyCodeNotBetween(String value1, String value2) {
/*  453 */       addCriterion("PARTNER_VERIFY_CODE not between", value1, value2, "partnerVerifyCode");
/*  454 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdIsNull() {
/*  458 */       addCriterion("PARTNER_ID is null");
/*  459 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdIsNotNull() {
/*  463 */       addCriterion("PARTNER_ID is not null");
/*  464 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdEqualTo(String value) {
/*  468 */       addCriterion("PARTNER_ID =", value, "partnerId");
/*  469 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdNotEqualTo(String value) {
/*  473 */       addCriterion("PARTNER_ID <>", value, "partnerId");
/*  474 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdGreaterThan(String value) {
/*  478 */       addCriterion("PARTNER_ID >", value, "partnerId");
/*  479 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdGreaterThanOrEqualTo(String value) {
/*  483 */       addCriterion("PARTNER_ID >=", value, "partnerId");
/*  484 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdLessThan(String value) {
/*  488 */       addCriterion("PARTNER_ID <", value, "partnerId");
/*  489 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdLessThanOrEqualTo(String value) {
/*  493 */       addCriterion("PARTNER_ID <=", value, "partnerId");
/*  494 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdLike(String value) {
/*  498 */       addCriterion("PARTNER_ID like", value, "partnerId");
/*  499 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdNotLike(String value) {
/*  503 */       addCriterion("PARTNER_ID not like", value, "partnerId");
/*  504 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdIn(List<String> values) {
/*  508 */       addCriterion("PARTNER_ID in", values, "partnerId");
/*  509 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdNotIn(List<String> values) {
/*  513 */       addCriterion("PARTNER_ID not in", values, "partnerId");
/*  514 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdBetween(String value1, String value2) {
/*  518 */       addCriterion("PARTNER_ID between", value1, value2, "partnerId");
/*  519 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPartnerIdNotBetween(String value1, String value2) {
/*  523 */       addCriterion("PARTNER_ID not between", value1, value2, "partnerId");
/*  524 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1IsNull() {
/*  528 */       addCriterion("TRADE_RESERVED_FIELD1 is null");
/*  529 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1IsNotNull() {
/*  533 */       addCriterion("TRADE_RESERVED_FIELD1 is not null");
/*  534 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1EqualTo(String value) {
/*  538 */       addCriterion("TRADE_RESERVED_FIELD1 =", value, "tradeReservedField1");
/*  539 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1NotEqualTo(String value) {
/*  543 */       addCriterion("TRADE_RESERVED_FIELD1 <>", value, "tradeReservedField1");
/*  544 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1GreaterThan(String value) {
/*  548 */       addCriterion("TRADE_RESERVED_FIELD1 >", value, "tradeReservedField1");
/*  549 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1GreaterThanOrEqualTo(String value) {
/*  553 */       addCriterion("TRADE_RESERVED_FIELD1 >=", value, "tradeReservedField1");
/*  554 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1LessThan(String value) {
/*  558 */       addCriterion("TRADE_RESERVED_FIELD1 <", value, "tradeReservedField1");
/*  559 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1LessThanOrEqualTo(String value) {
/*  563 */       addCriterion("TRADE_RESERVED_FIELD1 <=", value, "tradeReservedField1");
/*  564 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1Like(String value) {
/*  568 */       addCriterion("TRADE_RESERVED_FIELD1 like", value, "tradeReservedField1");
/*  569 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1NotLike(String value) {
/*  573 */       addCriterion("TRADE_RESERVED_FIELD1 not like", value, "tradeReservedField1");
/*  574 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1In(List<String> values) {
/*  578 */       addCriterion("TRADE_RESERVED_FIELD1 in", values, "tradeReservedField1");
/*  579 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1NotIn(List<String> values) {
/*  583 */       addCriterion("TRADE_RESERVED_FIELD1 not in", values, "tradeReservedField1");
/*  584 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1Between(String value1, String value2) {
/*  588 */       addCriterion("TRADE_RESERVED_FIELD1 between", value1, value2, "tradeReservedField1");
/*  589 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField1NotBetween(String value1, String value2) {
/*  593 */       addCriterion("TRADE_RESERVED_FIELD1 not between", value1, value2, "tradeReservedField1");
/*  594 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2IsNull() {
/*  598 */       addCriterion("TRADE_RESERVED_FIELD2 is null");
/*  599 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2IsNotNull() {
/*  603 */       addCriterion("TRADE_RESERVED_FIELD2 is not null");
/*  604 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2EqualTo(String value) {
/*  608 */       addCriterion("TRADE_RESERVED_FIELD2 =", value, "tradeReservedField2");
/*  609 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2NotEqualTo(String value) {
/*  613 */       addCriterion("TRADE_RESERVED_FIELD2 <>", value, "tradeReservedField2");
/*  614 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2GreaterThan(String value) {
/*  618 */       addCriterion("TRADE_RESERVED_FIELD2 >", value, "tradeReservedField2");
/*  619 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2GreaterThanOrEqualTo(String value) {
/*  623 */       addCriterion("TRADE_RESERVED_FIELD2 >=", value, "tradeReservedField2");
/*  624 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2LessThan(String value) {
/*  628 */       addCriterion("TRADE_RESERVED_FIELD2 <", value, "tradeReservedField2");
/*  629 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2LessThanOrEqualTo(String value) {
/*  633 */       addCriterion("TRADE_RESERVED_FIELD2 <=", value, "tradeReservedField2");
/*  634 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2Like(String value) {
/*  638 */       addCriterion("TRADE_RESERVED_FIELD2 like", value, "tradeReservedField2");
/*  639 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2NotLike(String value) {
/*  643 */       addCriterion("TRADE_RESERVED_FIELD2 not like", value, "tradeReservedField2");
/*  644 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2In(List<String> values) {
/*  648 */       addCriterion("TRADE_RESERVED_FIELD2 in", values, "tradeReservedField2");
/*  649 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2NotIn(List<String> values) {
/*  653 */       addCriterion("TRADE_RESERVED_FIELD2 not in", values, "tradeReservedField2");
/*  654 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2Between(String value1, String value2) {
/*  658 */       addCriterion("TRADE_RESERVED_FIELD2 between", value1, value2, "tradeReservedField2");
/*  659 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField2NotBetween(String value1, String value2) {
/*  663 */       addCriterion("TRADE_RESERVED_FIELD2 not between", value1, value2, "tradeReservedField2");
/*  664 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3IsNull() {
/*  668 */       addCriterion("TRADE_RESERVED_FIELD3 is null");
/*  669 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3IsNotNull() {
/*  673 */       addCriterion("TRADE_RESERVED_FIELD3 is not null");
/*  674 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3EqualTo(String value) {
/*  678 */       addCriterion("TRADE_RESERVED_FIELD3 =", value, "tradeReservedField3");
/*  679 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3NotEqualTo(String value) {
/*  683 */       addCriterion("TRADE_RESERVED_FIELD3 <>", value, "tradeReservedField3");
/*  684 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3GreaterThan(String value) {
/*  688 */       addCriterion("TRADE_RESERVED_FIELD3 >", value, "tradeReservedField3");
/*  689 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3GreaterThanOrEqualTo(String value) {
/*  693 */       addCriterion("TRADE_RESERVED_FIELD3 >=", value, "tradeReservedField3");
/*  694 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3LessThan(String value) {
/*  698 */       addCriterion("TRADE_RESERVED_FIELD3 <", value, "tradeReservedField3");
/*  699 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3LessThanOrEqualTo(String value) {
/*  703 */       addCriterion("TRADE_RESERVED_FIELD3 <=", value, "tradeReservedField3");
/*  704 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3Like(String value) {
/*  708 */       addCriterion("TRADE_RESERVED_FIELD3 like", value, "tradeReservedField3");
/*  709 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3NotLike(String value) {
/*  713 */       addCriterion("TRADE_RESERVED_FIELD3 not like", value, "tradeReservedField3");
/*  714 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3In(List<String> values) {
/*  718 */       addCriterion("TRADE_RESERVED_FIELD3 in", values, "tradeReservedField3");
/*  719 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3NotIn(List<String> values) {
/*  723 */       addCriterion("TRADE_RESERVED_FIELD3 not in", values, "tradeReservedField3");
/*  724 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3Between(String value1, String value2) {
/*  728 */       addCriterion("TRADE_RESERVED_FIELD3 between", value1, value2, "tradeReservedField3");
/*  729 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField3NotBetween(String value1, String value2) {
/*  733 */       addCriterion("TRADE_RESERVED_FIELD3 not between", value1, value2, "tradeReservedField3");
/*  734 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4IsNull() {
/*  738 */       addCriterion("TRADE_RESERVED_FIELD4 is null");
/*  739 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4IsNotNull() {
/*  743 */       addCriterion("TRADE_RESERVED_FIELD4 is not null");
/*  744 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4EqualTo(String value) {
/*  748 */       addCriterion("TRADE_RESERVED_FIELD4 =", value, "tradeReservedField4");
/*  749 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4NotEqualTo(String value) {
/*  753 */       addCriterion("TRADE_RESERVED_FIELD4 <>", value, "tradeReservedField4");
/*  754 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4GreaterThan(String value) {
/*  758 */       addCriterion("TRADE_RESERVED_FIELD4 >", value, "tradeReservedField4");
/*  759 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4GreaterThanOrEqualTo(String value) {
/*  763 */       addCriterion("TRADE_RESERVED_FIELD4 >=", value, "tradeReservedField4");
/*  764 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4LessThan(String value) {
/*  768 */       addCriterion("TRADE_RESERVED_FIELD4 <", value, "tradeReservedField4");
/*  769 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4LessThanOrEqualTo(String value) {
/*  773 */       addCriterion("TRADE_RESERVED_FIELD4 <=", value, "tradeReservedField4");
/*  774 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4Like(String value) {
/*  778 */       addCriterion("TRADE_RESERVED_FIELD4 like", value, "tradeReservedField4");
/*  779 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4NotLike(String value) {
/*  783 */       addCriterion("TRADE_RESERVED_FIELD4 not like", value, "tradeReservedField4");
/*  784 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4In(List<String> values) {
/*  788 */       addCriterion("TRADE_RESERVED_FIELD4 in", values, "tradeReservedField4");
/*  789 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4NotIn(List<String> values) {
/*  793 */       addCriterion("TRADE_RESERVED_FIELD4 not in", values, "tradeReservedField4");
/*  794 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4Between(String value1, String value2) {
/*  798 */       addCriterion("TRADE_RESERVED_FIELD4 between", value1, value2, "tradeReservedField4");
/*  799 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTradeReservedField4NotBetween(String value1, String value2) {
/*  803 */       addCriterion("TRADE_RESERVED_FIELD4 not between", value1, value2, "tradeReservedField4");
/*  804 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathIsNull() {
/*  808 */       addCriterion("PAY_PLACE_ORDER_PATH is null");
/*  809 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathIsNotNull() {
/*  813 */       addCriterion("PAY_PLACE_ORDER_PATH is not null");
/*  814 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathEqualTo(String value) {
/*  818 */       addCriterion("PAY_PLACE_ORDER_PATH =", value, "payPlaceOrderPath");
/*  819 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathNotEqualTo(String value) {
/*  823 */       addCriterion("PAY_PLACE_ORDER_PATH <>", value, "payPlaceOrderPath");
/*  824 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathGreaterThan(String value) {
/*  828 */       addCriterion("PAY_PLACE_ORDER_PATH >", value, "payPlaceOrderPath");
/*  829 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathGreaterThanOrEqualTo(String value) {
/*  833 */       addCriterion("PAY_PLACE_ORDER_PATH >=", value, "payPlaceOrderPath");
/*  834 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathLessThan(String value) {
/*  838 */       addCriterion("PAY_PLACE_ORDER_PATH <", value, "payPlaceOrderPath");
/*  839 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathLessThanOrEqualTo(String value) {
/*  843 */       addCriterion("PAY_PLACE_ORDER_PATH <=", value, "payPlaceOrderPath");
/*  844 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathLike(String value) {
/*  848 */       addCriterion("PAY_PLACE_ORDER_PATH like", value, "payPlaceOrderPath");
/*  849 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathNotLike(String value) {
/*  853 */       addCriterion("PAY_PLACE_ORDER_PATH not like", value, "payPlaceOrderPath");
/*  854 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathIn(List<String> values) {
/*  858 */       addCriterion("PAY_PLACE_ORDER_PATH in", values, "payPlaceOrderPath");
/*  859 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathNotIn(List<String> values) {
/*  863 */       addCriterion("PAY_PLACE_ORDER_PATH not in", values, "payPlaceOrderPath");
/*  864 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathBetween(String value1, String value2) {
/*  868 */       addCriterion("PAY_PLACE_ORDER_PATH between", value1, value2, "payPlaceOrderPath");
/*  869 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayPlaceOrderPathNotBetween(String value1, String value2) {
/*  873 */       addCriterion("PAY_PLACE_ORDER_PATH not between", value1, value2, "payPlaceOrderPath");
/*  874 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathIsNull() {
/*  878 */       addCriterion("PAY_REFUD_ORDER_PATH is null");
/*  879 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathIsNotNull() {
/*  883 */       addCriterion("PAY_REFUD_ORDER_PATH is not null");
/*  884 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathEqualTo(String value) {
/*  888 */       addCriterion("PAY_REFUD_ORDER_PATH =", value, "payRefudOrderPath");
/*  889 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathNotEqualTo(String value) {
/*  893 */       addCriterion("PAY_REFUD_ORDER_PATH <>", value, "payRefudOrderPath");
/*  894 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathGreaterThan(String value) {
/*  898 */       addCriterion("PAY_REFUD_ORDER_PATH >", value, "payRefudOrderPath");
/*  899 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathGreaterThanOrEqualTo(String value) {
/*  903 */       addCriterion("PAY_REFUD_ORDER_PATH >=", value, "payRefudOrderPath");
/*  904 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathLessThan(String value) {
/*  908 */       addCriterion("PAY_REFUD_ORDER_PATH <", value, "payRefudOrderPath");
/*  909 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathLessThanOrEqualTo(String value) {
/*  913 */       addCriterion("PAY_REFUD_ORDER_PATH <=", value, "payRefudOrderPath");
/*  914 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathLike(String value) {
/*  918 */       addCriterion("PAY_REFUD_ORDER_PATH like", value, "payRefudOrderPath");
/*  919 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathNotLike(String value) {
/*  923 */       addCriterion("PAY_REFUD_ORDER_PATH not like", value, "payRefudOrderPath");
/*  924 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathIn(List<String> values) {
/*  928 */       addCriterion("PAY_REFUD_ORDER_PATH in", values, "payRefudOrderPath");
/*  929 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathNotIn(List<String> values) {
/*  933 */       addCriterion("PAY_REFUD_ORDER_PATH not in", values, "payRefudOrderPath");
/*  934 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathBetween(String value1, String value2) {
/*  938 */       addCriterion("PAY_REFUD_ORDER_PATH between", value1, value2, "payRefudOrderPath");
/*  939 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayRefudOrderPathNotBetween(String value1, String value2) {
/*  943 */       addCriterion("PAY_REFUD_ORDER_PATH not between", value1, value2, "payRefudOrderPath");
/*  944 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathIsNull() {
/*  948 */       addCriterion("PAY_QUERY_ORDER_PATH is null");
/*  949 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathIsNotNull() {
/*  953 */       addCriterion("PAY_QUERY_ORDER_PATH is not null");
/*  954 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathEqualTo(String value) {
/*  958 */       addCriterion("PAY_QUERY_ORDER_PATH =", value, "payQueryOrderPath");
/*  959 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathNotEqualTo(String value) {
/*  963 */       addCriterion("PAY_QUERY_ORDER_PATH <>", value, "payQueryOrderPath");
/*  964 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathGreaterThan(String value) {
/*  968 */       addCriterion("PAY_QUERY_ORDER_PATH >", value, "payQueryOrderPath");
/*  969 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathGreaterThanOrEqualTo(String value) {
/*  973 */       addCriterion("PAY_QUERY_ORDER_PATH >=", value, "payQueryOrderPath");
/*  974 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathLessThan(String value) {
/*  978 */       addCriterion("PAY_QUERY_ORDER_PATH <", value, "payQueryOrderPath");
/*  979 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathLessThanOrEqualTo(String value) {
/*  983 */       addCriterion("PAY_QUERY_ORDER_PATH <=", value, "payQueryOrderPath");
/*  984 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathLike(String value) {
/*  988 */       addCriterion("PAY_QUERY_ORDER_PATH like", value, "payQueryOrderPath");
/*  989 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathNotLike(String value) {
/*  993 */       addCriterion("PAY_QUERY_ORDER_PATH not like", value, "payQueryOrderPath");
/*  994 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathIn(List<String> values) {
/*  998 */       addCriterion("PAY_QUERY_ORDER_PATH in", values, "payQueryOrderPath");
/*  999 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathNotIn(List<String> values) {
/* 1003 */       addCriterion("PAY_QUERY_ORDER_PATH not in", values, "payQueryOrderPath");
/* 1004 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathBetween(String value1, String value2) {
/* 1008 */       addCriterion("PAY_QUERY_ORDER_PATH between", value1, value2, "payQueryOrderPath");
/* 1009 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayQueryOrderPathNotBetween(String value1, String value2) {
/* 1013 */       addCriterion("PAY_QUERY_ORDER_PATH not between", value1, value2, "payQueryOrderPath");
/* 1014 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderConfig3Example
 * JD-Core Version:    0.6.2
 */