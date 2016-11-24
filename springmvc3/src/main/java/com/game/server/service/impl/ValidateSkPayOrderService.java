/*    */ package com.game.server.service.impl;
/*    */ 
/*    */ import com.game.server.model.dto.SkPayOrderInfo;
/*    */ import com.game.server.service.ValidateService;
/*    */ import com.game.server.util.MD5;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ValidateSkPayOrderService
/*    */   implements ValidateService<SkPayOrderInfo, String>
/*    */ {
/*    */   public boolean validate(SkPayOrderInfo payOrderInfo, String key)
/*    */   {
/* 16 */     String a = MD5.GetMD5Code(key);
/* 17 */     System.out.println("key : " + key);
/* 18 */     System.out.println("key value : " + a);
/* 19 */     System.out.println("sign : " + payOrderInfo.getSign());
/* 20 */     if (a.equals(payOrderInfo.getSign())) {
/* 21 */       return true;
/*    */     }
/* 23 */     return false;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.ValidateSkPayOrderService
 * JD-Core Version:    0.6.2
 */