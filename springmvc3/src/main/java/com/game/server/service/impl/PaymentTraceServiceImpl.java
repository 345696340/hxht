/*     */ package com.game.server.service.impl;
/*     */ 
/*     */ import com.game.server.model.dto.PaymengtTraceInfo;
/*     */ import com.game.server.model.dto.PaymengtTraceInfoExample;
/*     */ import com.game.server.model.dto.PaymengtTraceInfoExample.Criteria;
/*     */ import com.game.server.model.dto.PaymengtTraceSmsInfo;
/*     */ import com.game.server.model.dto.PaymengtTraceSmsInfoExample;
/*     */ import com.game.server.model.dto.impl.PaymengtTraceInfoMapper;
/*     */ import com.game.server.model.dto.impl.PaymengtTraceSmsInfoMapper;
/*     */ import com.game.server.service.PaymentTraceService;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ 
/*     */ public class PaymentTraceServiceImpl
/*     */   implements PaymentTraceService
/*     */ {
/*     */   private PaymengtTraceInfoMapper myPaymengtTraceInfoMapper;
/*     */   private PaymengtTraceSmsInfoMapper myPaymengtTraceSmsInfoMapper;
/*     */ 
/*     */   public String createOrder(PaymengtTraceInfo paymengtTraceInfo)
/*     */   {
/*  27 */     String uuid = UUID.randomUUID().toString();
/*  28 */     paymengtTraceInfo.setId(uuid);
/*  29 */     this.myPaymengtTraceInfoMapper.insert(paymengtTraceInfo);
/*  30 */     return uuid;
/*     */   }
/*     */ 
/*     */   public void createSmsTrace(PaymengtTraceSmsInfo paymengtTraceSmsInfo)
/*     */   {
/*  35 */     this.myPaymengtTraceSmsInfoMapper.insert(paymengtTraceSmsInfo);
/*     */   }
/*     */ 
/*     */   public PaymengtTraceInfo getPaymengtTraceInfo(String transactionId)
/*     */   {
/*  40 */     PaymengtTraceInfoExample example = new PaymengtTraceInfoExample();
/*  41 */     example.createCriteria().andTransactionIdEqualTo(transactionId);
/*  42 */     List list = this.myPaymengtTraceInfoMapper.selectByExample(example);
/*  43 */     if ((list == null) || (list.size() <= 0)) {
/*  44 */       return null;
/*     */     }
/*  46 */     return (PaymengtTraceInfo)list.get(0);
/*     */   }
/*     */ 
/*     */   public List<PaymengtTraceInfo> listPaymentTraceInfo(String mobile, int queryType, Date formDate, Date toDate, int start)
/*     */   {
/*  52 */     PaymengtTraceInfoExample example = new PaymengtTraceInfoExample();
/*  53 */     example.setStart(start);
/*  54 */     example.setLimit(100);
/*  55 */     PaymengtTraceInfoExample.Criteria c = example.createCriteria();
/*  56 */     if ((mobile != null) && (!mobile.equals(""))) {
/*  57 */       c.andMobileEqualTo(mobile);
/*     */     }
/*  59 */     if (queryType == 1) {
/*  60 */       Calendar startDate = Calendar.getInstance();
/*  61 */       startDate.set(11, 0);
/*  62 */       startDate.set(13, 0);
/*  63 */       startDate.set(12, 0);
/*  64 */       startDate.set(14, 0);
/*  65 */       Calendar endDate = Calendar.getInstance();
/*  66 */       endDate.set(11, 23);
/*  67 */       endDate.set(13, 59);
/*  68 */       endDate.set(12, 59);
/*  69 */       c.andCreateTimeBetween(startDate.getTime(), endDate.getTime());
/*     */     } else {
/*  71 */       c.andCreateTimeBetween(formDate, toDate);
/*     */     }
/*     */ 
/*  74 */     return this.myPaymengtTraceInfoMapper.selectByExampleByPage(example);
/*     */   }
/*     */ 
/*     */   public static void main(String[] agre) {
/*  78 */     Calendar cal = Calendar.getInstance();
/*  79 */     cal.set(11, 0);
/*  80 */     cal.set(13, 0);
/*  81 */     cal.set(12, 0);
/*  82 */     cal.set(14, 0);
/*  83 */     System.out.println(cal.getTime());
/*     */   }
/*     */ 
/*     */   public List<PaymengtTraceSmsInfo> getPaymengtTraceSmsInfo(PaymengtTraceInfo paymengtTraceInfo)
/*     */   {
/*  88 */     PaymengtTraceSmsInfoExample example = new PaymengtTraceSmsInfoExample();
/*  89 */     example.createCriteria().andTransactionIdEqualTo(paymengtTraceInfo.getId());
/*  90 */     return this.myPaymengtTraceSmsInfoMapper.selectByExample(example);
/*     */   }
/*     */ 
/*     */   public PaymengtTraceInfoMapper getMyPaymengtTraceInfoMapper() {
/*  94 */     return this.myPaymengtTraceInfoMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPaymengtTraceInfoMapper(PaymengtTraceInfoMapper myPaymengtTraceInfoMapper) {
/*  98 */     this.myPaymengtTraceInfoMapper = myPaymengtTraceInfoMapper;
/*     */   }
/*     */ 
/*     */   public PaymengtTraceSmsInfoMapper getMyPaymengtTraceSmsInfoMapper() {
/* 102 */     return this.myPaymengtTraceSmsInfoMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPaymengtTraceSmsInfoMapper(PaymengtTraceSmsInfoMapper myPaymengtTraceSmsInfoMapper) {
/* 106 */     this.myPaymengtTraceSmsInfoMapper = myPaymengtTraceSmsInfoMapper;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.PaymentTraceServiceImpl
 * JD-Core Version:    0.6.2
 */