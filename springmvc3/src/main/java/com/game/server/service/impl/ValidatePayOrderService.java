/*    */ package com.game.server.service.impl;
/*    */ 
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.service.ValidateService;
/*    */ import com.game.server.util.MD5;
/*    */ 
/*    */ public class ValidatePayOrderService
/*    */   implements ValidateService<PayOrderInfo, String>
/*    */ {
/*    */   public boolean validate(PayOrderInfo payOrderInfo, String key)
/*    */   {
/* 15 */     String a = MD5.GetMD5Code(key);
/* 16 */     if (a.equals(payOrderInfo.getSign())) {
/* 17 */       return true;
/*    */     }
/* 19 */     return false;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.ValidatePayOrderService
 * JD-Core Version:    0.6.2
 */