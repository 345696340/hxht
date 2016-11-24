/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.service.ReportService;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.MessageListener;
/*    */ import javax.jms.ObjectMessage;
/*    */ 
/*    */ public class MrCommonJmsListener extends JmsListener
/*    */   implements MessageListener
/*    */ {
/* 15 */   PayOrderMessageConverter payOrderMessageConverter = new PayOrderMessageConverter();
/*    */   ReportService reportService;
/*    */ 
/*    */   public void report()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void onMessage(Message message)
/*    */   {
/* 26 */     ObjectMessage objectMessage = (ObjectMessage)message;
/*    */     try {
/* 28 */       PayOrderInfo payOrderInfo = (PayOrderInfo)this.payOrderMessageConverter.fromMessage(message);
/* 29 */       this.reportService.reportMr(payOrderInfo);
/*    */     } catch (JMSException e) {
/* 31 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public PayOrderMessageConverter getPayOrderMessageConverter() {
/* 36 */     return this.payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public void setPayOrderMessageConverter(PayOrderMessageConverter payOrderMessageConverter) {
/* 40 */     this.payOrderMessageConverter = payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public ReportService getReportService() {
/* 44 */     return this.reportService;
/*    */   }
/*    */ 
/*    */   public void setReportService(ReportService reportService) {
/* 48 */     this.reportService = reportService;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.MrCommonJmsListener
 * JD-Core Version:    0.6.2
 */