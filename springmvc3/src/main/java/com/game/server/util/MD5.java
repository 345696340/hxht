/*    */ package com.game.server.util;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.security.MessageDigest;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ 
/*    */ public class MD5
/*    */ {
/* 11 */   private static final String[] strDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
/*    */ 
/*    */   private static String byteToArrayString(byte bByte)
/*    */   {
/* 19 */     int iRet = bByte;
/*    */ 
/* 21 */     if (iRet < 0) {
/* 22 */       iRet += 256;
/*    */     }
/* 24 */     int iD1 = iRet / 16;
/* 25 */     int iD2 = iRet % 16;
/* 26 */     return strDigits[iD1] + strDigits[iD2];
/*    */   }
/*    */ 
/*    */   private static String byteToNum(byte bByte)
/*    */   {
/* 31 */     int iRet = bByte;
/* 32 */     System.out.println("iRet1=" + iRet);
/* 33 */     if (iRet < 0) {
/* 34 */       iRet += 256;
/*    */     }
/* 36 */     return String.valueOf(iRet);
/*    */   }
/*    */ 
/*    */   private static String byteToString(byte[] bByte)
/*    */   {
/* 41 */     StringBuffer sBuffer = new StringBuffer();
/* 42 */     for (int i = 0; i < bByte.length; i++) {
/* 43 */       sBuffer.append(byteToArrayString(bByte[i]));
/*    */     }
/* 45 */     return sBuffer.toString();
/*    */   }
/*    */ 
/*    */   public static String GetMD5Code(String strObj) {
/* 49 */     String resultString = null;
/*    */     try {
/* 51 */       resultString = new String(strObj);
/* 52 */       MessageDigest md = MessageDigest.getInstance("MD5");
/*    */ 
/* 54 */       resultString = byteToString(md.digest(strObj.getBytes()));
/*    */     } catch (NoSuchAlgorithmException ex) {
/* 56 */       ex.printStackTrace();
/*    */     }
/* 58 */     return resultString;
/*    */   }
/*    */ 
/*    */   public static void main(String[] agre) {
/* 62 */     String appid = "18244";
/* 63 */     String appkey = "bGpfkvsQ53qEJLCgcIzpb";
/* 64 */     String sign = "appId=" + appid + "userId=1" + appkey;
/* 65 */     System.out.println(GetMD5Code(sign));
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.MD5
 * JD-Core Version:    0.6.2
 */