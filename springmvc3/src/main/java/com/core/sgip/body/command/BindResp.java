/*    */ package com.core.sgip.body.command;
/*    */ 
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ import com.core.sgip.util.SGIPUtils;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class BindResp extends SGIPCommand
/*    */ {
/* 27 */   private static Logger logger = Logger.getLogger(BindResp.class);
/*    */   private static final int COMMAND_LENGTH = 9;
/*    */   private int result;
/* 33 */   private byte[] resultByte = new byte[1];
/*    */ 
/* 35 */   private byte[] reserve = new byte[8];
/*    */ 
/*    */   public int getResult()
/*    */   {
/* 39 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void setResult(int result)
/*    */   {
/* 44 */     this.result = result;
/*    */   }
/*    */ 
/*    */   public BindResp()
/*    */   {
/* 50 */     this.commandLength = 9;
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 56 */     this.resultByte[0] = SGIPUtils.convertInt2Byte(this.result);
/* 57 */     return SGIPUtils.mergeBytes(new byte[][] { this.resultByte, this.reserve });
/*    */   }
/*    */ 
/*    */   public void initPropertiesByBytes(byte[] source)
/*    */   {
/* 63 */     if ((source != null) && (source.length >= 9))
/*    */     {
/* 65 */       SGIPUtils.copyBytes(source, this.resultByte, 1, 1, 1);
/* 66 */       this.result = SGIPUtils.convertUnsignByte2Int(this.resultByte[0]);
/*    */     }
/*    */     else {
/* 69 */       logger.error("init bindResp properties from bytes error: the bytes not enough");
/*    */     }
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 76 */     return "BindResp [result=" + this.result + "]";
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.BindResp
 * JD-Core Version:    0.6.2
 */