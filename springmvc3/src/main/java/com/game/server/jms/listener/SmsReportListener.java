/*     */ package com.game.server.jms.listener;
/*     */ 
/*     */ import com.game.server.model.dto.PayOrderGameConfig;
/*     */ import com.game.server.model.dto.PayOrderGameConfigExample;
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.PayOrderLimitDate;
/*     */ import com.game.server.model.dto.SmsPayOrder;
/*     */ import com.game.server.model.dto.SmsPayOrderExample;
/*     */ import com.game.server.model.dto.SmsPayOrderExample.Criteria;
/*     */ import com.game.server.model.dto.SmsPayOrderMonth;
/*     */ import com.game.server.model.dto.SmsPayOrderMonthExample;
/*     */ import com.game.server.model.dto.impl.PayOrderGameConfigMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitDateMapper;
/*     */ import com.game.server.model.dto.impl.SmsPayOrderMapper;
/*     */ import com.game.server.model.dto.impl.SmsPayOrderMonthMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.ReportService;
/*     */ import com.game.server.util.JdbCached;
/*     */ import com.tdt.unicom.domains.Report;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import javax.jms.JMSException;
/*     */ import javax.jms.Message;
/*     */ import javax.jms.MessageListener;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class SmsReportListener
/*     */   implements MessageListener
/*     */ {
/*  26 */   SmsReportMessageConverter smsReportMessageConverter = new SmsReportMessageConverter();
/*     */   private SmsPayOrderMapper mySmsPayOrderMapper;
/*     */   private PayOrderGameConfigMapper myPayOrderGameConfigMapper;
/*  32 */   private static final Logger logger = Logger.getLogger("A1");
/*     */   private PayOrderLimitDateMapper myPayOrderLimitDateMapper;
/*     */   private ReportService myReportService;
/*     */   private SmsPayOrderMonthMapper mySmsPayOrderMonthMapper;
/*     */   private LimitService myLimitService;
/*     */ 
/*     */   public void onMessage(Message message)
/*     */   {
/*  44 */     logger.info("report -------------------report start ------------------------------------- ");
/*     */     try {
/*  46 */       Report report = (Report)this.smsReportMessageConverter.fromMessage(message);
/*     */ 
/*  48 */       Calendar calendar = Calendar.getInstance();
/*  49 */       calendar.set(5, 1);
/*  50 */       SmsPayOrderMonthExample example = new SmsPayOrderMonthExample();
/*  51 */       example.setTableName(new SimpleDateFormat("yyyyMM").format(calendar.getTime()));
/*  52 */       example.createCriteria().andSeqNumberEqualTo(report.getSubmitSequenceNumber());
/*  53 */       List list = this.mySmsPayOrderMonthMapper.selectByExample(example);
/*     */ 
/*  55 */       SmsPayOrderExample smsPayOrderExample = new SmsPayOrderExample();
/*  56 */       smsPayOrderExample.createCriteria().andSeqNumberEqualTo(report.getSubmitSequenceNumber());
/*  57 */       List dianboList = this.mySmsPayOrderMapper.selectByExample(smsPayOrderExample);
/*  58 */       if ((dianboList != null) && (dianboList.size() > 0)) {
/*  59 */         SmsPayOrder smsPayOrder = (SmsPayOrder)dianboList.get(0);
/*  60 */         smsPayOrder.setReprotDate(new Date());
/*  61 */         smsPayOrder.setErrorCode(new Long(report.getErrorCode()));
/*  62 */         if ((new Long(report.getErrorCode()).longValue() == 0L) || ((report.getErrorCode() == 100) && (report.getState() == 2))) {
/*     */           try {
/*  64 */             logger.info("获取JDK 缓存 userNumber [" + smsPayOrder.getUserNumber() + "] ");
/*  65 */             HashMap values = (HashMap)JdbCached.get(smsPayOrder.getUserNumber());
/*  66 */             logger.info("获取JDK 缓存 userNumber [" + smsPayOrder.getUserNumber() + "] massContent [" + values + "]");
/*  67 */             PayOrderGameConfigExample example1 = new PayOrderGameConfigExample();
/*  68 */             example1.createCriteria().andCpContentEqualTo((String)values.get("cpContent"));
/*  69 */             smsPayOrder.setCpContent((String)values.get("cpContent"));
/*  70 */             List payOrderGameConfigs = this.myPayOrderGameConfigMapper.selectByExample(example1);
/*  71 */             logger.info("masscontent [" + (String)values.get("cpContent") + "] userNum [" + smsPayOrder.getUserNumber() + "] content [" + smsPayOrder.getContent() + "] linkid [" + smsPayOrder.getLinkId() + "] payOrderGameConfigs [" + payOrderGameConfigs.size() + "]状态报告成功,开始redis缓存");
/*     */ 
/*  74 */             PayOrderLimitDate payOrderLimitDate = this.myPayOrderLimitDateMapper.selectByPrimaryKey(new Long(((PayOrderGameConfig)payOrderGameConfigs.get(0)).getLimitId()));
/*     */ 
/*  76 */             if ((payOrderGameConfigs != null) && (payOrderGameConfigs.size() > 0)) {
/*  77 */               String feeValue = smsPayOrder.getFeeValue();
/*  78 */               Long fee = Long.valueOf(new Long(feeValue).longValue() / 100L);
/*  79 */               this.myLimitService.addMobile(smsPayOrder.getUserNumber().substring(2, smsPayOrder.getUserNumber().length()), payOrderLimitDate.getId(), fee);
/*     */             }
/*     */           } catch (Exception e) {
/*  82 */             e.printStackTrace();
/*     */           }
/*     */         }
/*     */         else {
/*  86 */           logger.info("userNum [" + smsPayOrder.getUserNumber() + "] content [" + smsPayOrder.getContent() + "] linkid [" + smsPayOrder.getLinkId() + "] MR 状态报告失败");
/*     */         }
/*     */ 
/*  89 */         JdbCached.remove(smsPayOrder.getUserNumber());
/*  90 */         smsPayOrder.setReprotStatus(Integer.valueOf(report.getState()));
/*  91 */         this.mySmsPayOrderMapper.updateByExample(smsPayOrder, smsPayOrderExample);
/*  92 */         PayOrderInfo reportMr = new PayOrderInfo();
/*  93 */         reportMr.setMobileNum(new Long(smsPayOrder.getUserNumber()));
/*  94 */         reportMr.setLinkid(smsPayOrder.getLinkId());
/*  95 */         reportMr.setContent(smsPayOrder.getCpContent());
/*  96 */         if ((report.getState() == 2) && (report.getErrorCode() == 100))
/*  97 */           reportMr.setStatus("0");
/*     */         else {
/*  99 */           reportMr.setStatus(String.valueOf(report.getState()));
/*     */         }
/*     */ 
/* 102 */         this.myReportService.reportMr(reportMr);
/* 103 */         logger.info("report submitSequenceNumber [" + report.getSubmitSequenceNumber() + "] 成功");
/*     */       }
/*     */ 
/* 106 */       if ((list != null) && (list.size() > 0)) {
/* 107 */         SmsPayOrderMonth smsPayOrder = (SmsPayOrderMonth)list.get(0);
/* 108 */         smsPayOrder.setReprotDate(new Date());
/* 109 */         smsPayOrder.setErrorCode(new Long(report.getErrorCode()));
/* 110 */         if ((new Long(report.getErrorCode()).longValue() == 0L) || ((report.getErrorCode() == 100) && (report.getState() == 2))) {
/*     */           try {
/* 112 */             logger.info("获取JDK 缓存 userNumber [" + smsPayOrder.getUserNumber() + "] ");
/* 113 */             HashMap values = (HashMap)JdbCached.get(smsPayOrder.getUserNumber());
/* 114 */             logger.info("获取JDK 缓存 userNumber [" + smsPayOrder.getUserNumber() + "] massContent [" + values + "]");
/* 115 */             PayOrderGameConfigExample example1 = new PayOrderGameConfigExample();
/* 116 */             example1.createCriteria().andCpContentEqualTo((String)values.get("cpContent"));
/* 117 */             smsPayOrder.setCpContent((String)values.get("cpContent"));
/* 118 */             List payOrderGameConfigs = this.myPayOrderGameConfigMapper.selectByExample(example1);
/* 119 */             logger.info("masscontent [" + (String)values.get("cpContent") + "] userNum [" + smsPayOrder.getUserNumber() + "] content [" + smsPayOrder.getContent() + "] linkid [" + smsPayOrder.getLinkId() + "] payOrderGameConfigs [" + payOrderGameConfigs.size() + "]状态报告成功,开始redis缓存");
/*     */ 
/* 122 */             PayOrderLimitDate payOrderLimitDate = this.myPayOrderLimitDateMapper.selectByPrimaryKey(new Long(((PayOrderGameConfig)payOrderGameConfigs.get(0)).getLimitId()));
/*     */ 
/* 124 */             if ((payOrderGameConfigs != null) && (payOrderGameConfigs.size() > 0)) {
/* 125 */               String feeValue = smsPayOrder.getFeeValue();
/* 126 */               Long fee = Long.valueOf(new Long(feeValue).longValue() / 100L);
/* 127 */               this.myLimitService.addMobile(smsPayOrder.getUserNumber().substring(2, smsPayOrder.getUserNumber().length()), payOrderLimitDate.getId(), fee);
/*     */             }
/*     */           } catch (Exception e) {
/* 130 */             e.printStackTrace();
/*     */           }
/*     */         }
/*     */         else {
/* 134 */           logger.info("userNum [" + smsPayOrder.getUserNumber() + "] content [" + smsPayOrder.getContent() + "] linkid [" + smsPayOrder.getLinkId() + "] MR 状态报告失败");
/*     */         }
/*     */ 
/* 137 */         JdbCached.remove(smsPayOrder.getUserNumber());
/* 138 */         smsPayOrder.setReprotStatus(Integer.valueOf(report.getState()));
/* 139 */         smsPayOrder.setTableName(new SimpleDateFormat("yyyyMM").format(calendar.getTime()));
/* 140 */         this.mySmsPayOrderMonthMapper.updateByExample(smsPayOrder, example);
/* 141 */         PayOrderInfo reportMr = new PayOrderInfo();
/* 142 */         reportMr.setMobileNum(new Long(smsPayOrder.getUserNumber()));
/* 143 */         reportMr.setLinkid(smsPayOrder.getLinkId());
/* 144 */         reportMr.setContent(smsPayOrder.getCpContent());
/* 145 */         if ((report.getState() == 2) && (report.getErrorCode() == 100))
/* 146 */           reportMr.setStatus("0");
/*     */         else {
/* 148 */           reportMr.setStatus(String.valueOf(report.getState()));
/*     */         }
/*     */ 
/* 151 */         this.myReportService.reportMr(reportMr);
/* 152 */         logger.info("report submitSequenceNumber [" + report.getSubmitSequenceNumber() + "] 成功");
/*     */       } else {
/* 154 */         logger.info("report submitSequenceNumber [" + report.getSubmitSequenceNumber() + "] 失败，本状态报告没有submit");
/*     */       }
/*     */     } catch (JMSException e) {
/* 157 */       e.printStackTrace();
/*     */     }
/* 159 */     logger.info("report -------------------report end---------------------------------------- ");
/*     */   }
/*     */ 
/*     */   public SmsPayOrderMapper getMySmsPayOrderMapper() {
/* 163 */     return this.mySmsPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public void setMySmsPayOrderMapper(SmsPayOrderMapper mySmsPayOrderMapper) {
/* 167 */     this.mySmsPayOrderMapper = mySmsPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderGameConfigMapper(PayOrderGameConfigMapper myPayOrderGameConfigMapper) {
/* 171 */     this.myPayOrderGameConfigMapper = myPayOrderGameConfigMapper;
/*     */   }
/*     */ 
/*     */   public void setMyLimitService(LimitService myLimitService) {
/* 175 */     this.myLimitService = myLimitService;
/*     */   }
/*     */ 
/*     */   public PayOrderGameConfigMapper getMyPayOrderGameConfigMapper() {
/* 179 */     return this.myPayOrderGameConfigMapper;
/*     */   }
/*     */ 
/*     */   public ReportService getMyReportService() {
/* 183 */     return this.myReportService;
/*     */   }
/*     */ 
/*     */   public PayOrderLimitDateMapper getMyPayOrderLimitDateMapper() {
/* 187 */     return this.myPayOrderLimitDateMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderLimitDateMapper(PayOrderLimitDateMapper myPayOrderLimitDateMapper) {
/* 191 */     this.myPayOrderLimitDateMapper = myPayOrderLimitDateMapper;
/*     */   }
/*     */ 
/*     */   public LimitService getMyLimitService() {
/* 195 */     return this.myLimitService;
/*     */   }
/*     */ 
/*     */   public void setMyReportService(ReportService myReportService) {
/* 199 */     this.myReportService = myReportService;
/*     */   }
/*     */ 
/*     */   public SmsPayOrderMonthMapper getMySmsPayOrderMonthMapper() {
/* 203 */     return this.mySmsPayOrderMonthMapper;
/*     */   }
/*     */ 
/*     */   public void setMySmsPayOrderMonthMapper(SmsPayOrderMonthMapper mySmsPayOrderMonthMapper) {
/* 207 */     this.mySmsPayOrderMonthMapper = mySmsPayOrderMonthMapper;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.SmsReportListener
 * JD-Core Version:    0.6.2
 */