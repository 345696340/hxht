/*    */ package com.core.sgip.body;
/*    */ 
/*    */ import com.core.sgip.interf.SGIPByteData;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class SGIPCommand
/*    */   implements SGIPByteData, Serializable
/*    */ {
/*    */   protected int commandLength;
/*    */ 
/*    */   public int getCommandLength()
/*    */   {
/* 26 */     return this.commandLength;
/*    */   }
/*    */ 
/*    */   public void setCommandLength(int commandLength) {
/* 30 */     this.commandLength = commandLength;
/*    */   }
/*    */ 
/*    */   public byte[] getByteData()
/*    */   {
/* 35 */     return new byte[0];
/*    */   }
/*    */ 
/*    */   public void initPropertiesByBytes(byte[] source)
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.SGIPCommand
 * JD-Core Version:    0.6.2
 */