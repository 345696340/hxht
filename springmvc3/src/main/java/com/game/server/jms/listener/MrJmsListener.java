/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.game.server.model.dto.SkPayOrderInfo;
/*    */ import com.game.server.service.ReportService;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.MessageListener;
/*    */ import javax.jms.ObjectMessage;
/*    */ 
/*    */ public class MrJmsListener extends JmsListener
/*    */   implements MessageListener
/*    */ {
/* 16 */   PayOrderMessageConverter payOrderMessageConverter = new PayOrderMessageConverter();
/*    */   ReportService reportService;
/*    */ 
/*    */   public void report()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void onMessage(Message message)
/*    */   {
/* 27 */     ObjectMessage objectMessage = (ObjectMessage)message;
/*    */     try {
/* 29 */       SkPayOrderInfo payOrderInfo = (SkPayOrderInfo)this.payOrderMessageConverter.fromMessage(message);
/* 30 */       this.reportService.reportMr(payOrderInfo);
/*    */     } catch (JMSException e) {
/* 32 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public PayOrderMessageConverter getPayOrderMessageConverter() {
/* 37 */     return this.payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public void setPayOrderMessageConverter(PayOrderMessageConverter payOrderMessageConverter) {
/* 41 */     this.payOrderMessageConverter = payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public ReportService getReportService() {
/* 45 */     return this.reportService;
/*    */   }
/*    */ 
/*    */   public void setReportService(ReportService reportService) {
/* 49 */     this.reportService = reportService;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.MrJmsListener
 * JD-Core Version:    0.6.2
 */