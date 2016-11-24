/*    */ package com.core.sgip.body.command;
/*    */ 
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ 
/*    */ public class UnBind extends SGIPCommand
/*    */ {
/*    */   private static final int COMMAND_LENGTH = 0;
/*    */ 
/*    */   public UnBind()
/*    */   {
/* 28 */     this.commandLength = 0;
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 34 */     return new byte[this.commandLength];
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.UnBind
 * JD-Core Version:    0.6.2
 */