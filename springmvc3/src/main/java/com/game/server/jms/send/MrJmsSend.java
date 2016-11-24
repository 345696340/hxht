/*    */ package com.game.server.jms.send;
/*    */ 
/*    */ import com.game.server.model.dto.SkPayOrderInfo;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.Session;
/*    */ import org.springframework.jms.core.JmsTemplate;
/*    */ import org.springframework.jms.core.MessageCreator;
/*    */ 
/*    */ public class MrJmsSend extends JmsTemplateBase<SkPayOrderInfo>
/*    */ {
/*    */   public boolean send(final SkPayOrderInfo payOrderInfo)
/*    */   {
/*    */     try
/*    */     {
/* 17 */       this.jmsTemplate.send(this.destination, new MessageCreator()
/*    */       {
/*    */         public Message createMessage(Session session) throws JMSException {
/* 20 */           Message message = session.createObjectMessage(payOrderInfo);
/* 21 */           return message;
/*    */         } } );
/*    */     }
/*    */     catch (Exception e) {
/* 25 */       e.printStackTrace();
/* 26 */       return false;
/*    */     }
/* 28 */     return true;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.send.MrJmsSend
 * JD-Core Version:    0.6.2
 */