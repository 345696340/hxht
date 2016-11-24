/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.tdt.unicom.domains.Deliver;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.ObjectMessage;
/*    */ import javax.jms.Session;
/*    */ import org.apache.activemq.command.ActiveMQObjectMessage;
/*    */ import org.springframework.jms.support.converter.MessageConversionException;
/*    */ import org.springframework.jms.support.converter.MessageConverter;
/*    */ 
/*    */ public class SmsDeliverMessageConverter
/*    */   implements MessageConverter
/*    */ {
/*    */   public Message toMessage(Object o, Session session)
/*    */     throws JMSException, MessageConversionException
/*    */   {
/* 20 */     if ((o instanceof Deliver)) {
/* 21 */       ActiveMQObjectMessage msg = (ActiveMQObjectMessage)session.createObjectMessage();
/* 22 */       msg.setObject((Deliver)o);
/* 23 */       return msg;
/*    */     }
/* 25 */     return null;
/*    */   }
/*    */ 
/*    */   public Object fromMessage(Message message) throws JMSException, MessageConversionException
/*    */   {
/* 30 */     if ((message instanceof ObjectMessage)) {
/* 31 */       ObjectMessage oMsg = (ObjectMessage)message;
/* 32 */       if ((oMsg instanceof ActiveMQObjectMessage)) {
/* 33 */         ActiveMQObjectMessage aMsg = (ActiveMQObjectMessage)oMsg;
/*    */         try {
/* 35 */           return (Deliver)aMsg.getObject();
/*    */         }
/*    */         catch (Exception e) {
/* 38 */           throw new JMSException("Message:" + message.toString() + "is not a instance of NoticeInfo." + message.toString());
/*    */         }
/*    */       }
/* 41 */       return null;
/*    */     }
/* 43 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.SmsDeliverMessageConverter
 * JD-Core Version:    0.6.2
 */