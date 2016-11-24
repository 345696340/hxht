/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.model.dto.SkPayOrderInfo;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.ObjectMessage;
/*    */ import javax.jms.Session;
/*    */ import org.apache.activemq.command.ActiveMQObjectMessage;
/*    */ import org.springframework.jms.support.converter.MessageConversionException;
/*    */ import org.springframework.jms.support.converter.MessageConverter;
/*    */ 
/*    */ public class PayOrderMessageConverter
/*    */   implements MessageConverter
/*    */ {
/*    */   public Message toMessage(Object o, Session session)
/*    */     throws JMSException, MessageConversionException
/*    */   {
/* 21 */     if ((o instanceof PayOrderInfo)) {
/* 22 */       ActiveMQObjectMessage msg = (ActiveMQObjectMessage)session.createObjectMessage();
/* 23 */       msg.setObject((PayOrderInfo)o);
/* 24 */       return msg;
/*    */     }
/* 26 */     return null;
/*    */   }
/*    */ 
/*    */   public Object fromMessage(Message message) throws JMSException, MessageConversionException
/*    */   {
/* 31 */     if ((message instanceof ObjectMessage)) {
/* 32 */       ObjectMessage oMsg = (ObjectMessage)message;
/* 33 */       if ((oMsg instanceof ActiveMQObjectMessage)) {
/* 34 */         ActiveMQObjectMessage aMsg = (ActiveMQObjectMessage)oMsg;
/*    */         try {
/* 36 */           if ((aMsg.getObject() instanceof SkPayOrderInfo)) {
/* 37 */             return (SkPayOrderInfo)aMsg.getObject();
/*    */           }
/*    */ 
/* 40 */           return (PayOrderInfo)aMsg.getObject();
/*    */         }
/*    */         catch (Exception e)
/*    */         {
/* 44 */           throw new JMSException("Message:" + message.toString() + "is not a instance of NoticeInfo." + message.toString());
/*    */         }
/*    */       }
/* 47 */       return null;
/*    */     }
/* 49 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.PayOrderMessageConverter
 * JD-Core Version:    0.6.2
 */