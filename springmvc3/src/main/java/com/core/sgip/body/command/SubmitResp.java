/*    */ package com.core.sgip.body.command;
/*    */ 
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ import com.core.sgip.util.SGIPUtils;
/*    */ 
/*    */ public class SubmitResp extends SGIPCommand
/*    */ {
/*    */   private static final int COMMAND_LENGTH = 9;
/*    */   private int result;
/* 28 */   private byte[] resultByte = new byte[1];
/*    */ 
/* 31 */   private byte[] reserve = new byte[8];
/*    */ 
/*    */   public int getResult()
/*    */   {
/* 35 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void setResult(int result)
/*    */   {
/* 40 */     this.result = result;
/*    */   }
/*    */ 
/*    */   public SubmitResp(int result)
/*    */   {
/* 46 */     this.result = result;
/* 47 */     this.commandLength = 9;
/*    */   }
/*    */ 
/*    */   public SubmitResp()
/*    */   {
/* 52 */     this(0);
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 58 */     this.resultByte = SGIPUtils.convertInt2Bytes(this.result);
/* 59 */     return SGIPUtils.mergeBytes(new byte[][] { this.resultByte, this.reserve });
/*    */   }
/*    */ 
/*    */   public void initPropertiesByBytes(byte[] source)
/*    */   {
/* 65 */     SGIPUtils.copyBytes(source, this.resultByte, 1, 1, 1);
/* 66 */     this.result = SGIPUtils.convertUnsignByte2Int(this.resultByte[0]);
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 72 */     return "SubmitResp [result=" + this.result + "]";
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.SubmitResp
 * JD-Core Version:    0.6.2
 */