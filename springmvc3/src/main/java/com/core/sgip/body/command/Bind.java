/*     */ package com.core.sgip.body.command;
/*     */ 
/*     */ import com.core.sgip.body.SGIPCommand;
/*     */ import com.core.sgip.constant.ClientConstant;
/*     */ import com.core.sgip.constant.SGIPConstant;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ 
/*     */ public class Bind extends SGIPCommand
/*     */ {
/*     */   private static final int COMMAND_LENGTH = 41;
/*     */   private int loginType;
/*  30 */   private String loginName = ClientConstant.LOGIN_NAME;
/*     */ 
/*  32 */   private String loginPassWord = ClientConstant.LOGIN_PWD;
/*     */ 
/*  34 */   private byte[] loginTypeByte = new byte[1];
/*     */ 
/*  36 */   private byte[] loginNameByte = new byte[16];
/*     */ 
/*  38 */   private byte[] loginPwdByte = new byte[16];
/*     */ 
/*  41 */   private byte[] reserve = new byte[8];
/*     */ 
/*     */   public int getLoginType()
/*     */   {
/*  45 */     return this.loginType;
/*     */   }
/*     */ 
/*     */   public void setLoginType(int loginType)
/*     */   {
/*  50 */     this.loginType = loginType;
/*     */   }
/*     */ 
/*     */   public String getLoginName()
/*     */   {
/*  55 */     return this.loginName;
/*     */   }
/*     */ 
/*     */   public void setLoginName(String loginName)
/*     */   {
/*  60 */     this.loginName = loginName;
/*     */   }
/*     */ 
/*     */   public String getLoginPassWord()
/*     */   {
/*  65 */     return this.loginPassWord;
/*     */   }
/*     */ 
/*     */   public void setLoginPassWord(String loginPassWord)
/*     */   {
/*  70 */     this.loginPassWord = loginPassWord;
/*     */   }
/*     */ 
/*     */   public Bind()
/*     */   {
/*  75 */     this(SGIPConstant.LOGIN_TYPE_SP_SMG);
/*     */   }
/*     */ 
/*     */   public Bind(int loginType)
/*     */   {
/*  81 */     this.loginType = loginType;
/*  82 */     this.commandLength = 41;
/*     */   }
/*     */ 
/*     */   public byte[] getByteData()
/*     */   {
/*  88 */     convertProperties2bytes();
/*  89 */     return SGIPUtils.mergeBytes(new byte[][] { this.loginTypeByte, this.loginNameByte, this.loginPwdByte, this.reserve });
/*     */   }
/*     */ 
/*     */   private void convertProperties2bytes()
/*     */   {
/*  94 */     byte[] source = this.loginName.getBytes();
/*  95 */     int length = source.length;
/*  96 */     SGIPUtils.copyBytes(source, this.loginNameByte, 1, length, 1);
/*  97 */     byte[] pwdSource = this.loginPassWord.getBytes();
/*  98 */     int pwdLength = pwdSource.length;
/*  99 */     SGIPUtils.copyBytes(pwdSource, this.loginPwdByte, 1, pwdLength, 1);
/*     */ 
/* 101 */     this.loginTypeByte[0] = SGIPUtils.convertInt2Byte(this.loginType);
/*     */   }
/*     */ 
/*     */   public void initPropertiesByBytes(byte[] source)
/*     */   {
/* 108 */     super.initPropertiesByBytes(source);
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.Bind
 * JD-Core Version:    0.6.2
 */