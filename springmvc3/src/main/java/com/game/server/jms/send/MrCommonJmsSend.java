/*    */ package com.game.server.jms.send;
/*    */ 
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.Session;
/*    */ import org.springframework.jms.core.JmsTemplate;
/*    */ import org.springframework.jms.core.MessageCreator;
/*    */ 
/*    */ public class MrCommonJmsSend extends JmsTemplateBase<PayOrderInfo>
/*    */ {
/*    */   public boolean send(final PayOrderInfo payOrderInfo)
/*    */   {
/*    */     try
/*    */     {
/* 16 */       this.jmsTemplate.send(this.destination, new MessageCreator()
/*    */       {
/*    */         public Message createMessage(Session session) throws JMSException {
/* 19 */           Message message = session.createObjectMessage(payOrderInfo);
/* 20 */           return message;
/*    */         } } );
/*    */     }
/*    */     catch (Exception e) {
/* 24 */       e.printStackTrace();
/* 25 */       return false;
/*    */     }
/* 27 */     return true;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.send.MrCommonJmsSend
 * JD-Core Version:    0.6.2
 */