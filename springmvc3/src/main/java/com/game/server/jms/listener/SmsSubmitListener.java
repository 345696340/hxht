/*     */ package com.game.server.jms.listener;
/*     */ 
/*     */ import com.game.server.model.dto.MobileInfo;
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.SmsPayOrder;
/*     */ import com.game.server.model.dto.SmsPayOrderMonth;
/*     */ import com.game.server.model.dto.impl.SmsPayOrderMapper;
/*     */ import com.game.server.model.dto.impl.SmsPayOrderMonthMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.ReportService;
/*     */ import com.game.server.util.JdbCached;
/*     */ import com.tdt.unicom.domains.SGIPHeader;
/*     */ import com.tdt.unicom.domains.Submit;
/*     */ import java.io.PrintStream;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import javax.jms.JMSException;
/*     */ import javax.jms.Message;
/*     */ import javax.jms.MessageListener;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class SmsSubmitListener
/*     */   implements MessageListener
/*     */ {
/*  26 */   SmsSubmitMessageConverter smsSubmitMessageConverter = new SmsSubmitMessageConverter();
/*     */   private SmsPayOrderMapper mySmsPayOrderMapper;
/*     */   private SmsPayOrderMonthMapper mySmsPayOrderMonthMapper;
/*     */   private LimitService myLimitService;
/*  35 */   private static final Logger logger = Logger.getLogger("A1");
/*     */   private ReportService myReportService;
/*     */ 
/*     */   public void onMessage(Message message)
/*     */   {
/*  41 */     logger.info("submit -------------------submit start ------------------------------------- ");
/*     */     try {
/*  43 */       Submit submit = (Submit)this.smsSubmitMessageConverter.fromMessage(message);
/*     */ 
/*  45 */       SmsPayOrder payOrder = new SmsPayOrder();
/*  46 */       payOrder.setLinkId(submit.getLinkID());
/*  47 */       payOrder.setContent(submit.getMessageContent());
/*  48 */       payOrder.setSeqNumber(submit.header.getSequenceNumber());
/*  49 */       payOrder.setFeeValue(submit.getFeeValue());
/*  50 */       payOrder.setFeeType(new Integer(submit.getFeeType()));
/*  51 */       payOrder.setReprotDate(new Date());
/*  52 */       payOrder.setUserNumber(submit.getChargeNumber());
/*  53 */       String mobile = "";
/*  54 */       if (submit.getChargeNumber().substring(0, 2).equals("86"))
/*  55 */         mobile = submit.getChargeNumber().substring(2, submit.getChargeNumber().length());
/*     */       else {
/*  57 */         mobile = submit.getChargeNumber();
/*     */       }
/*  59 */       MobileInfo mobileInfo = this.myLimitService.getMobileInfo(mobile.substring(0, 7));
/*  60 */       HashMap massContent = (HashMap)JdbCached.get(submit.getChargeNumber());
/*  61 */       payOrder.setCpContent((String)massContent.get("cpContent"));
/*  62 */       payOrder.setLimitId((String)massContent.get("limitId"));
/*  63 */       payOrder.setProvinceName(mobileInfo.getProvinceName());
/*  64 */       payOrder.setProvinceId(mobileInfo.getProvinceId());
/*  65 */       payOrder.setCityCode(mobileInfo.getCityId());
/*  66 */       payOrder.setCityName(mobileInfo.getCityName());
/*     */ 
/*  68 */       if ((massContent != null) && (massContent.get("cpContent") != null) && (massContent.get("cpContent").toString().indexOf("by") > 0)) {
/*  69 */         SmsPayOrderMonth smsPayOrderMonth = new SmsPayOrderMonth();
/*  70 */         smsPayOrderMonth.setCityCode(mobileInfo.getCityId());
/*  71 */         smsPayOrderMonth.setLinkId(submit.getLinkID());
/*  72 */         smsPayOrderMonth.setContent(submit.getMessageContent());
/*  73 */         smsPayOrderMonth.setSeqNumber(submit.header.getSequenceNumber());
/*  74 */         smsPayOrderMonth.setFeeValue(submit.getFeeValue());
/*  75 */         smsPayOrderMonth.setFeeType(new Integer(submit.getFeeType()));
/*  76 */         smsPayOrderMonth.setReprotDate(new Date());
/*  77 */         smsPayOrderMonth.setUserNumber(submit.getChargeNumber());
/*  78 */         smsPayOrderMonth.setCpContent((String)massContent.get("cpContent"));
/*  79 */         smsPayOrderMonth.setLimitId((String)massContent.get("limitId"));
/*  80 */         smsPayOrderMonth.setProvinceName(mobileInfo.getProvinceName());
/*  81 */         smsPayOrderMonth.setProvinceId(mobileInfo.getProvinceId());
/*  82 */         smsPayOrderMonth.setCityCode(mobileInfo.getCityId());
/*  83 */         smsPayOrderMonth.setCityName(mobileInfo.getCityName());
/*  84 */         smsPayOrderMonth.setTableName(new SimpleDateFormat("yyyyMM").format(new Date()));
/*  85 */         this.mySmsPayOrderMonthMapper.insert(smsPayOrderMonth);
/*     */       } else {
/*  87 */         this.mySmsPayOrderMapper.insert(payOrder);
/*     */       }
/*  89 */       logger.info("report submitSequenceNumber [" + submit.header.getSequenceNumber() + "] 成功");
/*  90 */       PayOrderInfo reportMo = new PayOrderInfo();
/*  91 */       logger.info("获取JDK 缓存 userNumber [" + submit.getChargeNumber() + "] ");
/*     */ 
/*  93 */       logger.info("获取JDK 缓存 userNumber [" + submit.getUserNumber() + "] massContent [" + massContent + "]");
/*  94 */       reportMo.setContent(payOrder.getCpContent());
/*  95 */       reportMo.setLinkid(submit.getLinkID());
/*  96 */       reportMo.setMobileNum(new Long(submit.getChargeNumber()));
/*  97 */       reportMo.setAmount(new Integer(submit.getFeeValue()));
/*  98 */       this.myReportService.reportMo(reportMo);
/*     */     } catch (JMSException e) {
/* 100 */       e.printStackTrace();
/*     */     }
/* 102 */     logger.info("submit -------------------submit end---------------------------------------- ");
/*     */   }
/*     */ 
/*     */   public SmsPayOrderMapper getMySmsPayOrderMapper() {
/* 106 */     return this.mySmsPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public void setMySmsPayOrderMapper(SmsPayOrderMapper mySmsPayOrderMapper) {
/* 110 */     this.mySmsPayOrderMapper = mySmsPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public ReportService getMyReportService() {
/* 114 */     return this.myReportService;
/*     */   }
/*     */ 
/*     */   public void setMyReportService(ReportService myReportService) {
/* 118 */     this.myReportService = myReportService;
/*     */   }
/*     */ 
/*     */   public LimitService getMyLimitService() {
/* 122 */     return this.myLimitService;
/*     */   }
/*     */ 
/*     */   public void setMyLimitService(LimitService myLimitService) {
/* 126 */     this.myLimitService = myLimitService;
/*     */   }
/*     */ 
/*     */   public SmsPayOrderMonthMapper getMySmsPayOrderMonthMapper() {
/* 130 */     return this.mySmsPayOrderMonthMapper;
/*     */   }
/*     */ 
/*     */   public void setMySmsPayOrderMonthMapper(SmsPayOrderMonthMapper mySmsPayOrderMonthMapper) {
/* 134 */     this.mySmsPayOrderMonthMapper = mySmsPayOrderMonthMapper;
/*     */   }
/*     */ 
/*     */   public static void main(String[] agre) {
/* 138 */     String phone = "13701312791";
/* 139 */     String mobile = "";
/* 140 */     if (phone.substring(0, 2).equals("86"))
/* 141 */       mobile = phone.substring(2, phone.length());
/*     */     else {
/* 143 */       mobile = phone;
/*     */     }
/* 145 */     System.out.println(mobile);
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.SmsSubmitListener
 * JD-Core Version:    0.6.2
 */