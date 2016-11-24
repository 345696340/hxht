/*    */ package com.core.sgip.body.command;
/*    */ 
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ import com.core.sgip.util.SGIPUtils;
/*    */ 
/*    */ public class DeliverResp extends SGIPCommand
/*    */ {
/*    */   private static final int COMMAND_LENGTH = 9;
/*    */   private int result;
/* 28 */   private byte[] reserve = new byte[8];
/*    */ 
/* 30 */   private byte[] resultByte = new byte[1];
/*    */ 
/*    */   public int getResult()
/*    */   {
/* 34 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void setResult(int result)
/*    */   {
/* 39 */     this.result = result;
/*    */   }
/*    */ 
/*    */   public DeliverResp(int result)
/*    */   {
/* 45 */     this.result = result;
/* 46 */     this.commandLength = 9;
/*    */   }
/*    */ 
/*    */   public DeliverResp()
/*    */   {
/* 51 */     this(0);
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 57 */     this.resultByte = SGIPUtils.convertInt2Bytes(this.result);
/* 58 */     return SGIPUtils.mergeBytes(new byte[][] { this.resultByte, this.reserve });
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.DeliverResp
 * JD-Core Version:    0.6.2
 */