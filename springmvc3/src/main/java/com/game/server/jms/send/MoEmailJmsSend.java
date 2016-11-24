/*    */ package com.game.server.jms.send;
/*    */ 
/*    */ import com.game.server.jms.listener.PayOrderMessageConverter;
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.Session;
/*    */ import org.springframework.jms.core.JmsTemplate;
/*    */ import org.springframework.jms.core.MessageCreator;
/*    */ 
/*    */ public class MoEmailJmsSend extends JmsTemplateBase<PayOrderInfo>
/*    */ {
/* 15 */   PayOrderMessageConverter payOrderMessageConverter = new PayOrderMessageConverter();
/*    */ 
/*    */   public boolean send(final PayOrderInfo payOrderInfo)
/*    */   {
/*    */     try {
/* 20 */       this.jmsTemplate.send(this.destination, new MessageCreator()
/*    */       {
/*    */         public Message createMessage(Session session) throws JMSException {
/* 23 */           Message message = session.createObjectMessage(payOrderInfo);
/* 24 */           return message;
/*    */         } } );
/*    */     }
/*    */     catch (Exception e) {
/* 28 */       e.printStackTrace();
/* 29 */       return false;
/*    */     }
/* 31 */     return true;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.send.MoEmailJmsSend
 * JD-Core Version:    0.6.2
 */