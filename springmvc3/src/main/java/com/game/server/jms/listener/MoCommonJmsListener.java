/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.service.ReportService;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.MessageListener;
/*    */ import javax.jms.ObjectMessage;
/*    */ 
/*    */ public class MoCommonJmsListener extends JmsListener
/*    */   implements MessageListener
/*    */ {
/* 19 */   PayOrderMessageConverter payOrderMessageConverter = new PayOrderMessageConverter();
/*    */   ReportService reportService;
/*    */ 
/*    */   public void report()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void onMessage(Message message)
/*    */   {
/* 30 */     ObjectMessage objectMessage = (ObjectMessage)message;
/*    */     try {
/* 32 */       PayOrderInfo payOrderInfo = (PayOrderInfo)this.payOrderMessageConverter.fromMessage(message);
/* 33 */       this.reportService.reportMo(payOrderInfo);
/*    */     } catch (JMSException e) {
/* 35 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public PayOrderMessageConverter getPayOrderMessageConverter() {
/* 40 */     return this.payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public void setPayOrderMessageConverter(PayOrderMessageConverter payOrderMessageConverter) {
/* 44 */     this.payOrderMessageConverter = payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public ReportService getReportService() {
/* 48 */     return this.reportService;
/*    */   }
/*    */ 
/*    */   public void setReportService(ReportService reportService) {
/* 52 */     this.reportService = reportService;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.MoCommonJmsListener
 * JD-Core Version:    0.6.2
 */