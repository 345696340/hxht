/*    */ package com.core.sgip.body.command;
/*    */ 
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ import com.core.sgip.util.SGIPUtils;
/*    */ 
/*    */ public class ReportResp extends SGIPCommand
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
/*    */   private void calcute()
/*    */   {
/* 44 */     this.resultByte = SGIPUtils.convertInt2Bytes(this.result);
/*    */   }
/*    */ 
/*    */   public ReportResp()
/*    */   {
/* 49 */     this(0);
/*    */   }
/*    */ 
/*    */   public ReportResp(int result)
/*    */   {
/* 55 */     this.result = result;
/* 56 */     this.commandLength = 9;
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 62 */     calcute();
/*    */ 
/* 64 */     return SGIPUtils.mergeBytes(new byte[][] { this.resultByte, this.reserve });
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.ReportResp
 * JD-Core Version:    0.6.2
 */