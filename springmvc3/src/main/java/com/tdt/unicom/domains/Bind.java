/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class Bind extends SGIPCommand
/*    */ {
/* 10 */   private byte loginType = 1;
/*    */   private String loginName;
/*    */   private String loginPassword;
/* 13 */   private String reserve = "";
/*    */ 
/*    */   public Bind()
/*    */   {
/* 17 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_BIND);
/* 18 */     this.bodybytes = new byte[41];
/* 19 */     byte[] reserveByte = new byte[8];
/* 20 */     System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
/* 21 */     System.arraycopy(reserveByte, 0, this.bodybytes, 33, 8);
/*    */   }
/*    */   public Bind(SGIPCommand command) {
/* 24 */     this.header = command.header;
/* 25 */     this.bodybytes = command.bodybytes;
/*    */ 
/* 27 */     this.loginType = command.bodybytes[0];
/*    */ 
/* 29 */     byte[] loginNameBytes = new byte[16];
/* 30 */     System.arraycopy(command.bodybytes, 1, loginNameBytes, 0, 16);
/* 31 */     this.loginName = new String(loginNameBytes).trim();
/*    */ 
/* 33 */     byte[] loginpwdBytes = new byte[16];
/* 34 */     System.arraycopy(command.bodybytes, 17, loginpwdBytes, 0, 16);
/* 35 */     this.loginPassword = new String(loginpwdBytes).trim();
/*    */ 
/* 37 */     byte[] reserveByte = new byte[8];
/* 38 */     System.arraycopy(command.bodybytes, 33, reserveByte, 0, 8);
/* 39 */     this.reserve = new String(reserveByte).trim();
/*    */   }
/*    */ 
/*    */   public byte getLoginType() {
/* 43 */     return this.loginType;
/*    */   }
/*    */   public void setLoginType(byte loginType) {
/* 46 */     this.loginType = loginType;
/* 47 */     this.bodybytes[0] = SGIPCommand.IntToByte(loginType);
/*    */   }
/*    */   public String getLoginName() {
/* 50 */     return this.loginName;
/*    */   }
/*    */   public void setLoginName(String loginName) {
/* 53 */     this.loginName = loginName;
/* 54 */     byte[] loginNameByte = new byte[16];
/* 55 */     System.arraycopy(loginName.getBytes(), 0, loginNameByte, 0, loginName.length());
/* 56 */     System.arraycopy(loginNameByte, 0, this.bodybytes, 1, 16);
/*    */   }
/*    */   public String getLoginPassword() {
/* 59 */     return this.loginPassword;
/*    */   }
/*    */   public void setLoginPassword(String loginPassword) {
/* 62 */     this.loginPassword = loginPassword;
/* 63 */     byte[] loginpwd = new byte[16];
/* 64 */     System.arraycopy(loginPassword.getBytes(), 0, loginpwd, 0, loginPassword.length());
/* 65 */     System.arraycopy(loginpwd, 0, this.bodybytes, 17, 16);
/*    */   }
/*    */ 
/*    */   public String getReserve() {
/* 69 */     return this.reserve;
/*    */   }
/*    */ 
/*    */   /** @deprecated */
/*    */   public void setReserve(String reserve)
/*    */   {
/* 75 */     this.reserve = reserve;
/* 76 */     byte[] reserveByte = new byte[8];
/* 77 */     System.arraycopy(reserve.getBytes(), 0, reserveByte, 0, reserve.length());
/* 78 */     System.arraycopy(reserveByte, 0, this.bodybytes, 33, 8);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.Bind
 * JD-Core Version:    0.6.2
 */