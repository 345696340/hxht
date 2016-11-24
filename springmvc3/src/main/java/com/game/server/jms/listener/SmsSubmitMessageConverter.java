/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.tdt.unicom.domains.Submit;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.ObjectMessage;
/*    */ import javax.jms.Session;
/*    */ import org.apache.activemq.command.ActiveMQObjectMessage;
/*    */ import org.springframework.jms.support.converter.MessageConversionException;
/*    */ import org.springframework.jms.support.converter.MessageConverter;
/*    */ 
/*    */ public class SmsSubmitMessageConverter
/*    */   implements MessageConverter
/*    */ {
/*    */   public Message toMessage(Object o, Session session)
/*    */     throws JMSException, MessageConversionException
/*    */   {
/* 19 */     if ((o instanceof Submit)) {
/* 20 */       ActiveMQObjectMessage msg = (ActiveMQObjectMessage)session.createObjectMessage();
/* 21 */       msg.setObject((Submit)o);
/* 22 */       return msg;
/*    */     }
/* 24 */     return null;
/*    */   }
/*    */ 
/*    */   public Object fromMessage(Message message) throws JMSException, MessageConversionException
/*    */   {
/* 29 */     if ((message instanceof ObjectMessage)) {
/* 30 */       ObjectMessage oMsg = (ObjectMessage)message;
/* 31 */       if ((oMsg instanceof ActiveMQObjectMessage)) {
/* 32 */         ActiveMQObjectMessage aMsg = (ActiveMQObjectMessage)oMsg;
/*    */         try {
/* 34 */           return (Submit)aMsg.getObject();
/*    */         }
/*    */         catch (Exception e) {
/* 37 */           throw new JMSException("Message:" + message.toString() + "is not a instance of NoticeInfo." + message.toString());
/*    */         }
/*    */       }
/* 40 */       return null;
/*    */     }
/* 42 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.SmsSubmitMessageConverter
 * JD-Core Version:    0.6.2
 */