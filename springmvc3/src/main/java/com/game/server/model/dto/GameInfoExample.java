/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ 
/*      */ public class GameInfoExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public GameInfoExample()
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
/* 1175 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1179 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1183 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1187 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1191 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1195 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1199 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1203 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1208 */       this.condition = condition;
/* 1209 */       this.typeHandler = null;
/* 1210 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1215 */       this.condition = condition;
/* 1216 */       this.value = value;
/* 1217 */       this.typeHandler = typeHandler;
/* 1218 */       if ((value instanceof List))
/* 1219 */         this.listValue = true;
/*      */       else
/* 1221 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1226 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1231 */       this.condition = condition;
/* 1232 */       this.value = value;
/* 1233 */       this.secondValue = secondValue;
/* 1234 */       this.typeHandler = typeHandler;
/* 1235 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1239 */       this(condition, value, secondValue, null);
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
/*      */     public Criteria andGameNameIsNull() {
/*  258 */       addCriterion("GAME_NAME is null");
/*  259 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameIsNotNull() {
/*  263 */       addCriterion("GAME_NAME is not null");
/*  264 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameEqualTo(String value) {
/*  268 */       addCriterion("GAME_NAME =", value, "gameName");
/*  269 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameNotEqualTo(String value) {
/*  273 */       addCriterion("GAME_NAME <>", value, "gameName");
/*  274 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameGreaterThan(String value) {
/*  278 */       addCriterion("GAME_NAME >", value, "gameName");
/*  279 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameGreaterThanOrEqualTo(String value) {
/*  283 */       addCriterion("GAME_NAME >=", value, "gameName");
/*  284 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameLessThan(String value) {
/*  288 */       addCriterion("GAME_NAME <", value, "gameName");
/*  289 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameLessThanOrEqualTo(String value) {
/*  293 */       addCriterion("GAME_NAME <=", value, "gameName");
/*  294 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameLike(String value) {
/*  298 */       addCriterion("GAME_NAME like", value, "gameName");
/*  299 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameNotLike(String value) {
/*  303 */       addCriterion("GAME_NAME not like", value, "gameName");
/*  304 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameIn(List<String> values) {
/*  308 */       addCriterion("GAME_NAME in", values, "gameName");
/*  309 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameNotIn(List<String> values) {
/*  313 */       addCriterion("GAME_NAME not in", values, "gameName");
/*  314 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameBetween(String value1, String value2) {
/*  318 */       addCriterion("GAME_NAME between", value1, value2, "gameName");
/*  319 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameNameNotBetween(String value1, String value2) {
/*  323 */       addCriterion("GAME_NAME not between", value1, value2, "gameName");
/*  324 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSIsNull() {
/*  328 */       addCriterion("IMG_S is null");
/*  329 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSIsNotNull() {
/*  333 */       addCriterion("IMG_S is not null");
/*  334 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSEqualTo(String value) {
/*  338 */       addCriterion("IMG_S =", value, "imgS");
/*  339 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSNotEqualTo(String value) {
/*  343 */       addCriterion("IMG_S <>", value, "imgS");
/*  344 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSGreaterThan(String value) {
/*  348 */       addCriterion("IMG_S >", value, "imgS");
/*  349 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSGreaterThanOrEqualTo(String value) {
/*  353 */       addCriterion("IMG_S >=", value, "imgS");
/*  354 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSLessThan(String value) {
/*  358 */       addCriterion("IMG_S <", value, "imgS");
/*  359 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSLessThanOrEqualTo(String value) {
/*  363 */       addCriterion("IMG_S <=", value, "imgS");
/*  364 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSLike(String value) {
/*  368 */       addCriterion("IMG_S like", value, "imgS");
/*  369 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSNotLike(String value) {
/*  373 */       addCriterion("IMG_S not like", value, "imgS");
/*  374 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSIn(List<String> values) {
/*  378 */       addCriterion("IMG_S in", values, "imgS");
/*  379 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSNotIn(List<String> values) {
/*  383 */       addCriterion("IMG_S not in", values, "imgS");
/*  384 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSBetween(String value1, String value2) {
/*  388 */       addCriterion("IMG_S between", value1, value2, "imgS");
/*  389 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgSNotBetween(String value1, String value2) {
/*  393 */       addCriterion("IMG_S not between", value1, value2, "imgS");
/*  394 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZIsNull() {
/*  398 */       addCriterion("IMG_Z is null");
/*  399 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZIsNotNull() {
/*  403 */       addCriterion("IMG_Z is not null");
/*  404 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZEqualTo(String value) {
/*  408 */       addCriterion("IMG_Z =", value, "imgZ");
/*  409 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZNotEqualTo(String value) {
/*  413 */       addCriterion("IMG_Z <>", value, "imgZ");
/*  414 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZGreaterThan(String value) {
/*  418 */       addCriterion("IMG_Z >", value, "imgZ");
/*  419 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZGreaterThanOrEqualTo(String value) {
/*  423 */       addCriterion("IMG_Z >=", value, "imgZ");
/*  424 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZLessThan(String value) {
/*  428 */       addCriterion("IMG_Z <", value, "imgZ");
/*  429 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZLessThanOrEqualTo(String value) {
/*  433 */       addCriterion("IMG_Z <=", value, "imgZ");
/*  434 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZLike(String value) {
/*  438 */       addCriterion("IMG_Z like", value, "imgZ");
/*  439 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZNotLike(String value) {
/*  443 */       addCriterion("IMG_Z not like", value, "imgZ");
/*  444 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZIn(List<String> values) {
/*  448 */       addCriterion("IMG_Z in", values, "imgZ");
/*  449 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZNotIn(List<String> values) {
/*  453 */       addCriterion("IMG_Z not in", values, "imgZ");
/*  454 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZBetween(String value1, String value2) {
/*  458 */       addCriterion("IMG_Z between", value1, value2, "imgZ");
/*  459 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgZNotBetween(String value1, String value2) {
/*  463 */       addCriterion("IMG_Z not between", value1, value2, "imgZ");
/*  464 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDIsNull() {
/*  468 */       addCriterion("IMG_D is null");
/*  469 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDIsNotNull() {
/*  473 */       addCriterion("IMG_D is not null");
/*  474 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDEqualTo(String value) {
/*  478 */       addCriterion("IMG_D =", value, "imgD");
/*  479 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDNotEqualTo(String value) {
/*  483 */       addCriterion("IMG_D <>", value, "imgD");
/*  484 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDGreaterThan(String value) {
/*  488 */       addCriterion("IMG_D >", value, "imgD");
/*  489 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDGreaterThanOrEqualTo(String value) {
/*  493 */       addCriterion("IMG_D >=", value, "imgD");
/*  494 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDLessThan(String value) {
/*  498 */       addCriterion("IMG_D <", value, "imgD");
/*  499 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDLessThanOrEqualTo(String value) {
/*  503 */       addCriterion("IMG_D <=", value, "imgD");
/*  504 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDLike(String value) {
/*  508 */       addCriterion("IMG_D like", value, "imgD");
/*  509 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDNotLike(String value) {
/*  513 */       addCriterion("IMG_D not like", value, "imgD");
/*  514 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDIn(List<String> values) {
/*  518 */       addCriterion("IMG_D in", values, "imgD");
/*  519 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDNotIn(List<String> values) {
/*  523 */       addCriterion("IMG_D not in", values, "imgD");
/*  524 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDBetween(String value1, String value2) {
/*  528 */       addCriterion("IMG_D between", value1, value2, "imgD");
/*  529 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgDNotBetween(String value1, String value2) {
/*  533 */       addCriterion("IMG_D not between", value1, value2, "imgD");
/*  534 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathIsNull() {
/*  538 */       addCriterion("GAME_PATH is null");
/*  539 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathIsNotNull() {
/*  543 */       addCriterion("GAME_PATH is not null");
/*  544 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathEqualTo(String value) {
/*  548 */       addCriterion("GAME_PATH =", value, "gamePath");
/*  549 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathNotEqualTo(String value) {
/*  553 */       addCriterion("GAME_PATH <>", value, "gamePath");
/*  554 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathGreaterThan(String value) {
/*  558 */       addCriterion("GAME_PATH >", value, "gamePath");
/*  559 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathGreaterThanOrEqualTo(String value) {
/*  563 */       addCriterion("GAME_PATH >=", value, "gamePath");
/*  564 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathLessThan(String value) {
/*  568 */       addCriterion("GAME_PATH <", value, "gamePath");
/*  569 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathLessThanOrEqualTo(String value) {
/*  573 */       addCriterion("GAME_PATH <=", value, "gamePath");
/*  574 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathLike(String value) {
/*  578 */       addCriterion("GAME_PATH like", value, "gamePath");
/*  579 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathNotLike(String value) {
/*  583 */       addCriterion("GAME_PATH not like", value, "gamePath");
/*  584 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathIn(List<String> values) {
/*  588 */       addCriterion("GAME_PATH in", values, "gamePath");
/*  589 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathNotIn(List<String> values) {
/*  593 */       addCriterion("GAME_PATH not in", values, "gamePath");
/*  594 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathBetween(String value1, String value2) {
/*  598 */       addCriterion("GAME_PATH between", value1, value2, "gamePath");
/*  599 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePathNotBetween(String value1, String value2) {
/*  603 */       addCriterion("GAME_PATH not between", value1, value2, "gamePath");
/*  604 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1IsNull() {
/*  608 */       addCriterion("IMG_HENG_1 is null");
/*  609 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1IsNotNull() {
/*  613 */       addCriterion("IMG_HENG_1 is not null");
/*  614 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1EqualTo(String value) {
/*  618 */       addCriterion("IMG_HENG_1 =", value, "imgHeng1");
/*  619 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1NotEqualTo(String value) {
/*  623 */       addCriterion("IMG_HENG_1 <>", value, "imgHeng1");
/*  624 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1GreaterThan(String value) {
/*  628 */       addCriterion("IMG_HENG_1 >", value, "imgHeng1");
/*  629 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1GreaterThanOrEqualTo(String value) {
/*  633 */       addCriterion("IMG_HENG_1 >=", value, "imgHeng1");
/*  634 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1LessThan(String value) {
/*  638 */       addCriterion("IMG_HENG_1 <", value, "imgHeng1");
/*  639 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1LessThanOrEqualTo(String value) {
/*  643 */       addCriterion("IMG_HENG_1 <=", value, "imgHeng1");
/*  644 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1Like(String value) {
/*  648 */       addCriterion("IMG_HENG_1 like", value, "imgHeng1");
/*  649 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1NotLike(String value) {
/*  653 */       addCriterion("IMG_HENG_1 not like", value, "imgHeng1");
/*  654 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1In(List<String> values) {
/*  658 */       addCriterion("IMG_HENG_1 in", values, "imgHeng1");
/*  659 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1NotIn(List<String> values) {
/*  663 */       addCriterion("IMG_HENG_1 not in", values, "imgHeng1");
/*  664 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1Between(String value1, String value2) {
/*  668 */       addCriterion("IMG_HENG_1 between", value1, value2, "imgHeng1");
/*  669 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng1NotBetween(String value1, String value2) {
/*  673 */       addCriterion("IMG_HENG_1 not between", value1, value2, "imgHeng1");
/*  674 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2IsNull() {
/*  678 */       addCriterion("IMG_HENG_2 is null");
/*  679 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2IsNotNull() {
/*  683 */       addCriterion("IMG_HENG_2 is not null");
/*  684 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2EqualTo(String value) {
/*  688 */       addCriterion("IMG_HENG_2 =", value, "imgHeng2");
/*  689 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2NotEqualTo(String value) {
/*  693 */       addCriterion("IMG_HENG_2 <>", value, "imgHeng2");
/*  694 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2GreaterThan(String value) {
/*  698 */       addCriterion("IMG_HENG_2 >", value, "imgHeng2");
/*  699 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2GreaterThanOrEqualTo(String value) {
/*  703 */       addCriterion("IMG_HENG_2 >=", value, "imgHeng2");
/*  704 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2LessThan(String value) {
/*  708 */       addCriterion("IMG_HENG_2 <", value, "imgHeng2");
/*  709 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2LessThanOrEqualTo(String value) {
/*  713 */       addCriterion("IMG_HENG_2 <=", value, "imgHeng2");
/*  714 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2Like(String value) {
/*  718 */       addCriterion("IMG_HENG_2 like", value, "imgHeng2");
/*  719 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2NotLike(String value) {
/*  723 */       addCriterion("IMG_HENG_2 not like", value, "imgHeng2");
/*  724 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2In(List<String> values) {
/*  728 */       addCriterion("IMG_HENG_2 in", values, "imgHeng2");
/*  729 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2NotIn(List<String> values) {
/*  733 */       addCriterion("IMG_HENG_2 not in", values, "imgHeng2");
/*  734 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2Between(String value1, String value2) {
/*  738 */       addCriterion("IMG_HENG_2 between", value1, value2, "imgHeng2");
/*  739 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImgHeng2NotBetween(String value1, String value2) {
/*  743 */       addCriterion("IMG_HENG_2 not between", value1, value2, "imgHeng2");
/*  744 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescIsNull() {
/*  748 */       addCriterion("GAME_DESC is null");
/*  749 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescIsNotNull() {
/*  753 */       addCriterion("GAME_DESC is not null");
/*  754 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescEqualTo(String value) {
/*  758 */       addCriterion("GAME_DESC =", value, "gameDesc");
/*  759 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescNotEqualTo(String value) {
/*  763 */       addCriterion("GAME_DESC <>", value, "gameDesc");
/*  764 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescGreaterThan(String value) {
/*  768 */       addCriterion("GAME_DESC >", value, "gameDesc");
/*  769 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescGreaterThanOrEqualTo(String value) {
/*  773 */       addCriterion("GAME_DESC >=", value, "gameDesc");
/*  774 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescLessThan(String value) {
/*  778 */       addCriterion("GAME_DESC <", value, "gameDesc");
/*  779 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescLessThanOrEqualTo(String value) {
/*  783 */       addCriterion("GAME_DESC <=", value, "gameDesc");
/*  784 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescLike(String value) {
/*  788 */       addCriterion("GAME_DESC like", value, "gameDesc");
/*  789 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescNotLike(String value) {
/*  793 */       addCriterion("GAME_DESC not like", value, "gameDesc");
/*  794 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescIn(List<String> values) {
/*  798 */       addCriterion("GAME_DESC in", values, "gameDesc");
/*  799 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescNotIn(List<String> values) {
/*  803 */       addCriterion("GAME_DESC not in", values, "gameDesc");
/*  804 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescBetween(String value1, String value2) {
/*  808 */       addCriterion("GAME_DESC between", value1, value2, "gameDesc");
/*  809 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameDescNotBetween(String value1, String value2) {
/*  813 */       addCriterion("GAME_DESC not between", value1, value2, "gameDesc");
/*  814 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinIsNull() {
/*  818 */       addCriterion("IS_JINGPIN is null");
/*  819 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinIsNotNull() {
/*  823 */       addCriterion("IS_JINGPIN is not null");
/*  824 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinEqualTo(Long value) {
/*  828 */       addCriterion("IS_JINGPIN =", value, "isJingpin");
/*  829 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinNotEqualTo(Long value) {
/*  833 */       addCriterion("IS_JINGPIN <>", value, "isJingpin");
/*  834 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinGreaterThan(Long value) {
/*  838 */       addCriterion("IS_JINGPIN >", value, "isJingpin");
/*  839 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinGreaterThanOrEqualTo(Long value) {
/*  843 */       addCriterion("IS_JINGPIN >=", value, "isJingpin");
/*  844 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinLessThan(Long value) {
/*  848 */       addCriterion("IS_JINGPIN <", value, "isJingpin");
/*  849 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinLessThanOrEqualTo(Long value) {
/*  853 */       addCriterion("IS_JINGPIN <=", value, "isJingpin");
/*  854 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinIn(List<Long> values) {
/*  858 */       addCriterion("IS_JINGPIN in", values, "isJingpin");
/*  859 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinNotIn(List<Long> values) {
/*  863 */       addCriterion("IS_JINGPIN not in", values, "isJingpin");
/*  864 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinBetween(Long value1, Long value2) {
/*  868 */       addCriterion("IS_JINGPIN between", value1, value2, "isJingpin");
/*  869 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsJingpinNotBetween(Long value1, Long value2) {
/*  873 */       addCriterion("IS_JINGPIN not between", value1, value2, "isJingpin");
/*  874 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlIsNull() {
/*  878 */       addCriterion("PAY_CALLBACK_URL is null");
/*  879 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlIsNotNull() {
/*  883 */       addCriterion("PAY_CALLBACK_URL is not null");
/*  884 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlEqualTo(String value) {
/*  888 */       addCriterion("PAY_CALLBACK_URL =", value, "payCallbackUrl");
/*  889 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlNotEqualTo(String value) {
/*  893 */       addCriterion("PAY_CALLBACK_URL <>", value, "payCallbackUrl");
/*  894 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlGreaterThan(String value) {
/*  898 */       addCriterion("PAY_CALLBACK_URL >", value, "payCallbackUrl");
/*  899 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlGreaterThanOrEqualTo(String value) {
/*  903 */       addCriterion("PAY_CALLBACK_URL >=", value, "payCallbackUrl");
/*  904 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlLessThan(String value) {
/*  908 */       addCriterion("PAY_CALLBACK_URL <", value, "payCallbackUrl");
/*  909 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlLessThanOrEqualTo(String value) {
/*  913 */       addCriterion("PAY_CALLBACK_URL <=", value, "payCallbackUrl");
/*  914 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlLike(String value) {
/*  918 */       addCriterion("PAY_CALLBACK_URL like", value, "payCallbackUrl");
/*  919 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlNotLike(String value) {
/*  923 */       addCriterion("PAY_CALLBACK_URL not like", value, "payCallbackUrl");
/*  924 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlIn(List<String> values) {
/*  928 */       addCriterion("PAY_CALLBACK_URL in", values, "payCallbackUrl");
/*  929 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlNotIn(List<String> values) {
/*  933 */       addCriterion("PAY_CALLBACK_URL not in", values, "payCallbackUrl");
/*  934 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlBetween(String value1, String value2) {
/*  938 */       addCriterion("PAY_CALLBACK_URL between", value1, value2, "payCallbackUrl");
/*  939 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayCallbackUrlNotBetween(String value1, String value2) {
/*  943 */       addCriterion("PAY_CALLBACK_URL not between", value1, value2, "payCallbackUrl");
/*  944 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIsNull() {
/*  948 */       addCriterion("APPKEY is null");
/*  949 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIsNotNull() {
/*  953 */       addCriterion("APPKEY is not null");
/*  954 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyEqualTo(String value) {
/*  958 */       addCriterion("APPKEY =", value, "appkey");
/*  959 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotEqualTo(String value) {
/*  963 */       addCriterion("APPKEY <>", value, "appkey");
/*  964 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyGreaterThan(String value) {
/*  968 */       addCriterion("APPKEY >", value, "appkey");
/*  969 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
/*  973 */       addCriterion("APPKEY >=", value, "appkey");
/*  974 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLessThan(String value) {
/*  978 */       addCriterion("APPKEY <", value, "appkey");
/*  979 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLessThanOrEqualTo(String value) {
/*  983 */       addCriterion("APPKEY <=", value, "appkey");
/*  984 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLike(String value) {
/*  988 */       addCriterion("APPKEY like", value, "appkey");
/*  989 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotLike(String value) {
/*  993 */       addCriterion("APPKEY not like", value, "appkey");
/*  994 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIn(List<String> values) {
/*  998 */       addCriterion("APPKEY in", values, "appkey");
/*  999 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotIn(List<String> values) {
/* 1003 */       addCriterion("APPKEY not in", values, "appkey");
/* 1004 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyBetween(String value1, String value2) {
/* 1008 */       addCriterion("APPKEY between", value1, value2, "appkey");
/* 1009 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotBetween(String value1, String value2) {
/* 1013 */       addCriterion("APPKEY not between", value1, value2, "appkey");
/* 1014 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumIsNull() {
/* 1018 */       addCriterion("ORDER_NUM is null");
/* 1019 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumIsNotNull() {
/* 1023 */       addCriterion("ORDER_NUM is not null");
/* 1024 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumEqualTo(Integer value) {
/* 1028 */       addCriterion("ORDER_NUM =", value, "orderNum");
/* 1029 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumNotEqualTo(Integer value) {
/* 1033 */       addCriterion("ORDER_NUM <>", value, "orderNum");
/* 1034 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumGreaterThan(Integer value) {
/* 1038 */       addCriterion("ORDER_NUM >", value, "orderNum");
/* 1039 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
/* 1043 */       addCriterion("ORDER_NUM >=", value, "orderNum");
/* 1044 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumLessThan(Integer value) {
/* 1048 */       addCriterion("ORDER_NUM <", value, "orderNum");
/* 1049 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
/* 1053 */       addCriterion("ORDER_NUM <=", value, "orderNum");
/* 1054 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumIn(List<Integer> values) {
/* 1058 */       addCriterion("ORDER_NUM in", values, "orderNum");
/* 1059 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumNotIn(List<Integer> values) {
/* 1063 */       addCriterion("ORDER_NUM not in", values, "orderNum");
/* 1064 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumBetween(Integer value1, Integer value2) {
/* 1068 */       addCriterion("ORDER_NUM between", value1, value2, "orderNum");
/* 1069 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
/* 1073 */       addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
/* 1074 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerIsNull() {
/* 1078 */       addCriterion("IS_BANNER is null");
/* 1079 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerIsNotNull() {
/* 1083 */       addCriterion("IS_BANNER is not null");
/* 1084 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerEqualTo(Integer value) {
/* 1088 */       addCriterion("IS_BANNER =", value, "isBanner");
/* 1089 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerNotEqualTo(Integer value) {
/* 1093 */       addCriterion("IS_BANNER <>", value, "isBanner");
/* 1094 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerGreaterThan(Integer value) {
/* 1098 */       addCriterion("IS_BANNER >", value, "isBanner");
/* 1099 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerGreaterThanOrEqualTo(Integer value) {
/* 1103 */       addCriterion("IS_BANNER >=", value, "isBanner");
/* 1104 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerLessThan(Integer value) {
/* 1108 */       addCriterion("IS_BANNER <", value, "isBanner");
/* 1109 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerLessThanOrEqualTo(Integer value) {
/* 1113 */       addCriterion("IS_BANNER <=", value, "isBanner");
/* 1114 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerIn(List<Integer> values) {
/* 1118 */       addCriterion("IS_BANNER in", values, "isBanner");
/* 1119 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerNotIn(List<Integer> values) {
/* 1123 */       addCriterion("IS_BANNER not in", values, "isBanner");
/* 1124 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerBetween(Integer value1, Integer value2) {
/* 1128 */       addCriterion("IS_BANNER between", value1, value2, "isBanner");
/* 1129 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsBannerNotBetween(Integer value1, Integer value2) {
/* 1133 */       addCriterion("IS_BANNER not between", value1, value2, "isBanner");
/* 1134 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameInfoExample
 * JD-Core Version:    0.6.2
 */