/*    */ package com.game.server.tigger;
/*    */ 
/*    */ import com.game.server.model.dto.*;
/*    */
/*    */
/*    */
/*    */
/*    */ import com.game.server.model.dto.impl.PayOrderGameConfigMapper;
/*    */ import com.game.server.model.dto.impl.SmsPayOrderMonthMapper;
/*    */ import com.game.server.util.JdbCached;
/*    */ import com.tdt.unicom.sgip.svr.SPSender;
/*    */ import com.tdt.unicom.spsvr.MTReq;
/*    */ import com.tdt.unicom.util.SubmitMap;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Calendar;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class SmsMonthTigger
/*    */ {
/*    */   private SmsPayOrderMonthMapper mySmsPayOrderMonthMapper;
/*    */   private PayOrderGameConfigMapper myPayOrderGameConfigMapper;
/* 28 */   private static final Logger logger = Logger.getLogger("A3");
/*    */ 
/* 33 */   public static SPSender sender = SPSender.getInstance(SubmitMap.submitMap);
/*    */ 
/*    */   public void doJob()
/*    */   {
/* 37 */     Calendar calendar = Calendar.getInstance();
/* 38 */     calendar.add(2, -1);
/* 39 */     calendar.set(5, 1);
/* 40 */     SmsPayOrderMonthExample example = new SmsPayOrderMonthExample();
/* 41 */     example.setTableName(new SimpleDateFormat("yyyyMM").format(calendar.getTime()));
/* 42 */     int start = 0;
/* 43 */     example.setStart(start);
/* 44 */     example.setLimit(50);
/* 45 */     List<SmsPayOrderMonth> list = this.mySmsPayOrderMonthMapper.selectByExampleByPage(example);
/* 46 */     while (list != null)
/* 47 */       for (SmsPayOrderMonth smsPayOrderMonth : list)
/*    */       {
/* 49 */         PayOrderGameConfigExample payOrderGameConfigExample = new PayOrderGameConfigExample();
/* 50 */         payOrderGameConfigExample.createCriteria().andCpContentEqualTo(smsPayOrderMonth.getCpContent());
/* 51 */         List payOrderGameConfigs = this.myPayOrderGameConfigMapper.selectByExample(payOrderGameConfigExample);
/* 52 */         if (payOrderGameConfigs.size() > 0)
/*    */         {
/* 55 */           logger.info("包月短信续费开始 userId [" + smsPayOrderMonth.getUserNumber() + "] cpCOntent [" + smsPayOrderMonth.getCpContent() + "]");
/* 56 */           PayOrderGameConfig payOrderGameConfig = (PayOrderGameConfig)payOrderGameConfigs.get(0);
/* 57 */           ArrayList mobiles = new ArrayList();
/* 58 */           mobiles.add(smsPayOrderMonth.getUserNumber());
/* 59 */           MTReq mtReq = new MTReq();
/* 60 */           mtReq.setLinkId(smsPayOrderMonth.getLinkId());
/* 61 */           mtReq.setFeeType(2);
/* 62 */           mtReq.setCharNum(new String[] { smsPayOrderMonth.getUserNumber() });
/* 63 */           mtReq.setFeeValue(smsPayOrderMonth.getFeeValue());
/* 64 */           mtReq.setServiceType(payOrderGameConfig.getServiceType());
/* 65 */           mtReq.setMessageContent(payOrderGameConfig.getSmsReturnContent());
/* 66 */           mtReq.setPhoneList(mobiles);
/* 67 */           mtReq.setReportFlag("1");
/* 68 */           mtReq.setSpNumber(payOrderGameConfig.getSpnumber().toString());
/* 69 */           HashMap value = new HashMap();
/* 70 */           value.put("cpContent", smsPayOrderMonth.getCpContent());
/* 71 */           value.put("limitId", payOrderGameConfig.getLimitId());
/* 72 */           JdbCached.addMap(smsPayOrderMonth.getUserNumber(), value);
/*    */ 
/* 74 */           sender.addTask(mtReq);
/* 75 */           logger.info("包月短信续费结束 ------------------------------------");
/* 76 */           start++;
/* 77 */           start *= 50;
/* 78 */           example.setStart(start);
/* 79 */           example.setLimit(50);
/* 80 */           list = this.mySmsPayOrderMonthMapper.selectByExampleByPage(example);
/*    */         }
/*    */       }
/*    */   }
/*    */ 
/*    */   public SmsPayOrderMonthMapper getMySmsPayOrderMonthMapper() {
/* 86 */     return this.mySmsPayOrderMonthMapper;
/*    */   }
/*    */ 
/*    */   public void setMySmsPayOrderMonthMapper(SmsPayOrderMonthMapper mySmsPayOrderMonthMapper) {
/* 90 */     this.mySmsPayOrderMonthMapper = mySmsPayOrderMonthMapper;
/*    */   }
/*    */ 
/*    */   public PayOrderGameConfigMapper getMyPayOrderGameConfigMapper() {
/* 94 */     return this.myPayOrderGameConfigMapper;
/*    */   }
/*    */ 
/*    */   public void setMyPayOrderGameConfigMapper(PayOrderGameConfigMapper myPayOrderGameConfigMapper) {
/* 98 */     this.myPayOrderGameConfigMapper = myPayOrderGameConfigMapper;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.tigger.SmsMonthTigger
 * JD-Core Version:    0.6.2
 */