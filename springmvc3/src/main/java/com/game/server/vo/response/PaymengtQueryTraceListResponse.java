/*     */ package com.game.server.vo.response;
/*     */ 
/*     */ import com.google.gson.annotations.Expose;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class PaymengtQueryTraceListResponse
/*     */ {
/*     */ 
/*     */   @Expose
/*     */   private String resultCode;
/*     */ 
/*     */   @Expose
/*     */   private String resultDescription;
/*     */ 
/*     */   @Expose
/*     */   private String nextStartNote;
/*     */ 
/*     */   @Expose
/*     */   private List<UserIdPaymentInfo> useridPaymentInfos;
/*     */ 
/*     */   public PaymengtQueryTraceListResponse()
/*     */   {
/*  18 */     this.useridPaymentInfos = new ArrayList();
/*     */   }
/*     */ 
/*     */   public void addUserIdPaymentInfo(UserIdPaymentInfo userIdPaymentInfo) {
/*  22 */     this.useridPaymentInfos.add(userIdPaymentInfo);
/*     */   }
/*     */ 
/*     */   public String getResultCode()
/*     */   {
/* 169 */     return this.resultCode;
/*     */   }
/*     */ 
/*     */   public void setResultCode(String resultCode) {
/* 173 */     this.resultCode = resultCode;
/*     */   }
/*     */ 
/*     */   public String getResultDescription() {
/* 177 */     return this.resultDescription;
/*     */   }
/*     */ 
/*     */   public void setResultDescription(String resultDescription) {
/* 181 */     this.resultDescription = resultDescription;
/*     */   }
/*     */ 
/*     */   public String getNextStartNote() {
/* 185 */     return this.nextStartNote;
/*     */   }
/*     */ 
/*     */   public void setNextStartNote(String nextStartNote) {
/* 189 */     this.nextStartNote = nextStartNote;
/*     */   }
/*     */ 
/*     */   public List<UserIdPaymentInfo> getUseridPaymentInfos() {
/* 193 */     return this.useridPaymentInfos;
/*     */   }
/*     */ 
/*     */   public void setUseridPaymentInfos(List<UserIdPaymentInfo> useridPaymentInfos) {
/* 197 */     this.useridPaymentInfos = useridPaymentInfos;
/*     */   }
/*     */ 
/*     */   public class UserIdPaymentInfo
/*     */   {
/*     */ 
/*     */     @Expose
/*     */     private String userId;
/*     */ 
/*     */     @Expose
/*     */     private String transactionId;
/*     */ 
/*     */     @Expose
/*     */     private String province;
/*     */ 
/*     */     @Expose
/*     */     private String city;
/*     */ 
/*     */     @Expose
/*     */     private String fee;
/*     */ 
/*     */     @Expose
/*     */     private String createTime;
/*     */ 
/*     */     @Expose
/*     */     private String subject;
/*     */ 
/*     */     @Expose
/*     */     private String appKey;
/*     */ 
/*     */     @Expose
/*     */     private String appName;
/*     */ 
/*     */     @Expose
/*     */     private String outTradeNo;
/*     */ 
/*     */     @Expose
/*     */     private String profileId;
/*     */ 
/*     */     @Expose
/*     */     private String realName;
/*     */ 
/*     */     @Expose
/*     */     private String paymentType;
/*     */ 
/*     */     @Expose
/*     */     private String customPhone;
/*     */ 
/*     */     public UserIdPaymentInfo()
/*     */     {
/*     */     }
/*     */ 
/*     */     public String getUserId()
/*     */     {
/*  56 */       return this.userId;
/*     */     }
/*     */ 
/*     */     public void setUserId(String userId) {
/*  60 */       this.userId = userId;
/*     */     }
/*     */ 
/*     */     public String getTransactionId() {
/*  64 */       return this.transactionId;
/*     */     }
/*     */ 
/*     */     public void setTransactionId(String transactionId) {
/*  68 */       this.transactionId = transactionId;
/*     */     }
/*     */ 
/*     */     public String getProvince() {
/*  72 */       return this.province;
/*     */     }
/*     */ 
/*     */     public void setProvince(String province) {
/*  76 */       this.province = province;
/*     */     }
/*     */ 
/*     */     public String getCity() {
/*  80 */       return this.city;
/*     */     }
/*     */ 
/*     */     public void setCity(String city) {
/*  84 */       this.city = city;
/*     */     }
/*     */ 
/*     */     public String getFee() {
/*  88 */       return this.fee;
/*     */     }
/*     */ 
/*     */     public void setFee(String fee) {
/*  92 */       this.fee = fee;
/*     */     }
/*     */ 
/*     */     public String getCreateTime() {
/*  96 */       return this.createTime;
/*     */     }
/*     */ 
/*     */     public void setCreateTime(String createTime) {
/* 100 */       this.createTime = createTime;
/*     */     }
/*     */ 
/*     */     public String getSubject() {
/* 104 */       return this.subject;
/*     */     }
/*     */ 
/*     */     public void setSubject(String subject) {
/* 108 */       this.subject = subject;
/*     */     }
/*     */ 
/*     */     public String getAppKey() {
/* 112 */       return this.appKey;
/*     */     }
/*     */ 
/*     */     public void setAppKey(String appKey) {
/* 116 */       this.appKey = appKey;
/*     */     }
/*     */ 
/*     */     public String getAppName() {
/* 120 */       return this.appName;
/*     */     }
/*     */ 
/*     */     public void setAppName(String appName) {
/* 124 */       this.appName = appName;
/*     */     }
/*     */ 
/*     */     public String getOutTradeNo() {
/* 128 */       return this.outTradeNo;
/*     */     }
/*     */ 
/*     */     public void setOutTradeNo(String outTradeNo) {
/* 132 */       this.outTradeNo = outTradeNo;
/*     */     }
/*     */ 
/*     */     public String getProfileId() {
/* 136 */       return this.profileId;
/*     */     }
/*     */ 
/*     */     public void setProfileId(String profileId) {
/* 140 */       this.profileId = profileId;
/*     */     }
/*     */ 
/*     */     public String getRealName() {
/* 144 */       return this.realName;
/*     */     }
/*     */ 
/*     */     public void setRealName(String realName) {
/* 148 */       this.realName = realName;
/*     */     }
/*     */ 
/*     */     public String getPaymentType() {
/* 152 */       return this.paymentType;
/*     */     }
/*     */ 
/*     */     public void setPaymentType(String paymentType) {
/* 156 */       this.paymentType = paymentType;
/*     */     }
/*     */ 
/*     */     public String getCustomPhone() {
/* 160 */       return this.customPhone;
/*     */     }
/*     */ 
/*     */     public void setCustomPhone(String customPhone) {
/* 164 */       this.customPhone = customPhone;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.response.PaymengtQueryTraceListResponse
 * JD-Core Version:    0.6.2
 */