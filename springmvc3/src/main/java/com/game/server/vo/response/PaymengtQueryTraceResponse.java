/*     */ package com.game.server.vo.response;
/*     */ 
/*     */ import com.google.gson.annotations.Expose;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class PaymengtQueryTraceResponse
/*     */ {
/*     */ 
/*     */   @Expose
/*     */   private String resultCode;
/*     */ 
/*     */   @Expose
/*     */   private String resultDescription;
/*     */ 
/*     */   @Expose
/*     */   private String transactionId;
/*     */ 
/*     */   @Expose
/*     */   private List<TraceInfos> traceInfos;
/*     */ 
/*     */   public PaymengtQueryTraceResponse()
/*     */   {
/*  18 */     this.traceInfos = new ArrayList();
/*     */   }
/*     */ 
/*     */   public void addTraceInfos(TraceInfos t) {
/*  22 */     this.traceInfos.add(t);
/*     */   }
/*     */ 
/*     */   public String getResultCode()
/*     */   {
/*  89 */     return this.resultCode;
/*     */   }
/*     */ 
/*     */   public void setResultCode(String resultCode) {
/*  93 */     this.resultCode = resultCode;
/*     */   }
/*     */ 
/*     */   public String getResultDescription() {
/*  97 */     return this.resultDescription;
/*     */   }
/*     */ 
/*     */   public void setResultDescription(String resultDescription) {
/* 101 */     this.resultDescription = resultDescription;
/*     */   }
/*     */ 
/*     */   public String getTransactionId() {
/* 105 */     return this.transactionId;
/*     */   }
/*     */ 
/*     */   public void setTransactionId(String transactionId) {
/* 109 */     this.transactionId = transactionId;
/*     */   }
/*     */ 
/*     */   public List<TraceInfos> getTraceInfos() {
/* 113 */     return this.traceInfos;
/*     */   }
/*     */ 
/*     */   public void setTraceInfos(List<TraceInfos> traceInfos) {
/* 117 */     this.traceInfos = traceInfos;
/*     */   }
/*     */ 
/*     */   public class TraceInfos
/*     */   {
/*     */ 
/*     */     @Expose
/*     */     private String time;
/*     */ 
/*     */     @Expose
/*     */     private String action;
/*     */ 
/*     */     @Expose
/*     */     private String smsFromTo;
/*     */ 
/*     */     @Expose
/*     */     private String smsContent;
/*     */ 
/*     */     @Expose
/*     */     private String messageContext;
/*     */ 
/*     */     @Expose
/*     */     private String description;
/*     */ 
/*     */     public TraceInfos()
/*     */     {
/*     */     }
/*     */ 
/*     */     public String getTime()
/*     */     {
/*  40 */       return this.time;
/*     */     }
/*     */ 
/*     */     public void setTime(String time) {
/*  44 */       this.time = time;
/*     */     }
/*     */ 
/*     */     public String getAction() {
/*  48 */       return this.action;
/*     */     }
/*     */ 
/*     */     public void setAction(String action) {
/*  52 */       this.action = action;
/*     */     }
/*     */ 
/*     */     public String getSmsFromTo() {
/*  56 */       return this.smsFromTo;
/*     */     }
/*     */ 
/*     */     public void setSmsFromTo(String smsFromTo) {
/*  60 */       this.smsFromTo = smsFromTo;
/*     */     }
/*     */ 
/*     */     public String getSmsContent() {
/*  64 */       return this.smsContent;
/*     */     }
/*     */ 
/*     */     public void setSmsContent(String smsContent) {
/*  68 */       this.smsContent = smsContent;
/*     */     }
/*     */ 
/*     */     public String getMessageContext() {
/*  72 */       return this.messageContext;
/*     */     }
/*     */ 
/*     */     public void setMessageContext(String messageContext) {
/*  76 */       this.messageContext = messageContext;
/*     */     }
/*     */ 
/*     */     public String getDescription() {
/*  80 */       return this.description;
/*     */     }
/*     */ 
/*     */     public void setDescription(String description) {
/*  84 */       this.description = description;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.response.PaymengtQueryTraceResponse
 * JD-Core Version:    0.6.2
 */