/*     */ package com.game.server.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.security.SecureRandom;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import sun.misc.BASE64Decoder;
/*     */ import sun.misc.BASE64Encoder;
/*     */ 
/*     */ public class DESUtil
/*     */ {
/*     */   private static final String DES = "DES";
/*     */ 
/*     */   public static void main(String[] args)
/*     */     throws Exception
/*     */   {
/*  20 */     String data = "123 456";
/*  21 */     String key = "wang!@#$%";
/*  22 */     System.err.println(encrypt(data, key));
/*  23 */     System.err.println(decrypt(encrypt(data, key), key));
/*     */   }
/*     */ 
/*     */   public static String encrypt(String data, String key)
/*     */     throws Exception
/*     */   {
/*  35 */     byte[] bt = encrypt(data.getBytes(), key.getBytes());
/*  36 */     String strs = new BASE64Encoder().encode(bt);
/*  37 */     return strs;
/*     */   }
/*     */ 
/*     */   public static String decrypt(String data, String key)
/*     */     throws IOException, Exception
/*     */   {
/*  50 */     if (data == null)
/*  51 */       return null;
/*  52 */     BASE64Decoder decoder = new BASE64Decoder();
/*  53 */     byte[] buf = decoder.decodeBuffer(data);
/*  54 */     byte[] bt = decrypt(buf, key.getBytes());
/*  55 */     return new String(bt);
/*     */   }
/*     */ 
/*     */   private static byte[] encrypt(byte[] data, byte[] key)
/*     */     throws Exception
/*     */   {
/*  67 */     SecureRandom sr = new SecureRandom();
/*     */ 
/*  70 */     DESKeySpec dks = new DESKeySpec(key);
/*     */ 
/*  73 */     SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
/*  74 */     SecretKey securekey = keyFactory.generateSecret(dks);
/*     */ 
/*  77 */     Cipher cipher = Cipher.getInstance("DES");
/*     */ 
/*  80 */     cipher.init(1, securekey, sr);
/*     */ 
/*  82 */     return cipher.doFinal(data);
/*     */   }
/*     */ 
/*     */   private static byte[] decrypt(byte[] data, byte[] key)
/*     */     throws Exception
/*     */   {
/*  95 */     SecureRandom sr = new SecureRandom();
/*     */ 
/*  98 */     DESKeySpec dks = new DESKeySpec(key);
/*     */ 
/* 101 */     SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
/* 102 */     SecretKey securekey = keyFactory.generateSecret(dks);
/*     */ 
/* 105 */     Cipher cipher = Cipher.getInstance("DES");
/*     */ 
/* 108 */     cipher.init(2, securekey, sr);
/*     */ 
/* 110 */     return cipher.doFinal(data);
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.DESUtil
 * JD-Core Version:    0.6.2
 */