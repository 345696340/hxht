/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ import com.tdt.unicom.util.SGIPCodeHelper;
/*    */ 
/*    */ public class SGIPException extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/* 12 */   private int errorCode = 0;
/*    */ 
/*    */   public SGIPException()
/*    */   {
/*    */   }
/*    */ 
/*    */   public SGIPException(int errorCode) {
/* 19 */     this.errorCode = errorCode;
/*    */   }
/*    */ 
/*    */   public SGIPException(String message, Throwable cause) {
/* 23 */     super(message, cause);
/*    */   }
/*    */ 
/*    */   public SGIPException(String message) {
/* 27 */     super(message);
/*    */   }
/*    */ 
/*    */   public SGIPException(Throwable cause) {
/* 31 */     super(cause);
/*    */   }
/*    */ 
/*    */   public int getSGIPCode() {
/* 35 */     return this.errorCode;
/*    */   }
/*    */ 
/*    */   public String getSGIPCause() {
/* 39 */     return SGIPCodeHelper.getDescription(this.errorCode);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.SGIPException
 * JD-Core Version:    0.6.2
 */