/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.game.server.model.dto.SkPayOrderInfo;
/*    */ import com.game.server.service.ReportService;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.MessageListener;
/*    */ import javax.jms.ObjectMessage;
/*    */ 
/*    */ public class MoJmsListener extends JmsListener
/*    */   implements MessageListener
/*    */ {
/* 17 */   PayOrderMessageConverter payOrderMessageConverter = new PayOrderMessageConverter();
/*    */   ReportService reportService;
/*    */ 
/*    */   public void report()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void onMessage(Message message)
/*    */   {
/* 28 */     ObjectMessage objectMessage = (ObjectMessage)message;
/*    */     try {
/* 30 */       SkPayOrderInfo payOrderInfo = (SkPayOrderInfo)this.payOrderMessageConverter.fromMessage(message);
/* 31 */       this.reportService.reportMo(payOrderInfo);
/*    */     } catch (JMSException e) {
/* 33 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public PayOrderMessageConverter getPayOrderMessageConverter() {
/* 38 */     return this.payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public void setPayOrderMessageConverter(PayOrderMessageConverter payOrderMessageConverter) {
/* 42 */     this.payOrderMessageConverter = payOrderMessageConverter;
/*    */   }
/*    */ 
/*    */   public ReportService getReportService() {
/* 46 */     return this.reportService;
/*    */   }
/*    */ 
/*    */   public void setReportService(ReportService reportService) {
/* 50 */     this.reportService = reportService;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.MoJmsListener
 * JD-Core Version:    0.6.2
 */