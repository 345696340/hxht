/*    */ package com.game.server.jms.send;
/*    */ 
/*    */ import com.game.server.jms.listener.PayOrderMessageConverter;
/*    */ import com.game.server.model.dto.SkPayOrderInfo;
/*    */ import javax.jms.JMSException;
/*    */ import javax.jms.Message;
/*    */ import javax.jms.Session;
/*    */ import org.springframework.jms.core.JmsTemplate;
/*    */ import org.springframework.jms.core.MessageCreator;
/*    */ 
/*    */ public class MoJmsSend extends JmsTemplateBase<SkPayOrderInfo>
/*    */ {
/* 14 */   PayOrderMessageConverter payOrderMessageConverter = new PayOrderMessageConverter();
/*    */ 
/*    */   public boolean send(final SkPayOrderInfo payOrderInfo)
/*    */   {
/*    */     try {
/* 19 */       this.jmsTemplate.send(this.destination, new MessageCreator()
/*    */       {
/*    */         public Message createMessage(Session session) throws JMSException {
/* 22 */           Message message = session.createObjectMessage(payOrderInfo);
/* 23 */           return message;
/*    */         } } );
/*    */     }
/*    */     catch (Exception e) {
/* 27 */       e.printStackTrace();
/* 28 */       return false;
/*    */     }
/* 30 */     return true;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.send.MoJmsSend
 * JD-Core Version:    0.6.2
 */