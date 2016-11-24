/*    */ package com.core.sgip.body.command;
/*    */ 
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ 
/*    */ public class UnBindResp extends SGIPCommand
/*    */ {
/*    */   private static final int COMMAND_LENGTH = 0;
/*    */ 
/*    */   public UnBindResp()
/*    */   {
/* 28 */     this.commandLength = 0;
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 34 */     return new byte[this.commandLength];
/*    */   }
/*    */ 
/*    */   public void initPropertiesByBytes(byte[] source)
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.UnBindResp
 * JD-Core Version:    0.6.2
 */