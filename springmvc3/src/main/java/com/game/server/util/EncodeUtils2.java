/*    */ package com.game.server.util;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class EncodeUtils2
/*    */ {
/* 84 */   private static int[] m_s1 = { 18, 46, 52, 22, 39, 0, 58, 54, 23, 37, 38, 25, 42, 36, 62, 30, 41, 14, 7, 50, 8, 9, 51, 59, 21, 15, 34, 45, 56, 3, 55, 28, 49, 32, 35, 20, 24, 53, 33, 40, 11, 17, 26, 31, 48, 5, 43, 29, 44, 12, 1, 19, 4, 13, 16, 27, 57, 47, 2, 6, 63, 10, 61, 60 };
/*    */ 
/* 89 */   private static int[] m_s2 = { 5, 50, 58, 29, 52, 45, 59, 18, 20, 21, 61, 40, 49, 53, 17, 25, 54, 41, 0, 51, 35, 24, 3, 8, 36, 11, 42, 55, 31, 47, 15, 43, 33, 38, 26, 34, 13, 9, 10, 4, 39, 16, 12, 46, 48, 27, 1, 57, 44, 32, 19, 22, 2, 37, 7, 30, 28, 56, 6, 23, 63, 62, 14, 60 };
/*    */ 
/* 94 */   private static byte[] m = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
/*    */ 
/*    */   public static String encode(String s, String s1)
/*    */   {
/*  9 */     byte[] abyte0 = new byte[64];
/* 10 */     new Random(System.currentTimeMillis()).nextBytes(abyte0);
/* 11 */     byte[] abyte1 = s1.getBytes();
/* 12 */     for (int i = 0; (i < abyte1.length) && (i < 64); i++)
/* 13 */       abyte0[i] = abyte1[i];
/* 14 */     if (abyte1.length < 64)
/* 15 */       abyte0[abyte1.length] = 0;
/* 16 */     byte[] abyte2 = s.getBytes();
/* 17 */     for (int j = 0; j < abyte0.length; j++)
/*    */     {
/*    */       int tmp86_84 = j;
/*    */       byte[] tmp86_83 = abyte0; tmp86_83[tmp86_84] = ((byte)(tmp86_83[tmp86_84] + abyte2[(j % abyte2.length)]));
/* 19 */     }return byteToString(switchArray(abyte0, m_s1));
/*    */   }
/*    */ 
/*    */   public static String decode(String s, String s1) {
/* 23 */     byte[] abyte0 = switchArray(stringToByte(s1), m_s2);
/* 24 */     byte[] abyte1 = s.getBytes();
/* 25 */     for (int i = 0; i < abyte0.length; i++)
/*    */     {
/*    */       int tmp29_27 = i;
/*    */       byte[] tmp29_26 = abyte0; tmp29_26[tmp29_27] = ((byte)(tmp29_26[tmp29_27] - abyte1[(i % abyte1.length)]));
/* 27 */     }int j = 64;
/* 28 */     int k = 0;
/*    */ 
/* 30 */     while (k < 64)
/*    */     {
/* 32 */       if (abyte0[k] == 0) {
/* 33 */         j = k;
/* 34 */         break;
/*    */       }
/* 36 */       k++;
/*    */     }
/* 38 */     return new String(abyte0, 0, j);
/*    */   }
/*    */ 
/*    */   private static byte[] switchArray(byte[] abyte0, int[] ai) {
/* 42 */     byte[] abyte1 = new byte[abyte0.length];
/* 43 */     for (int i = 0; i < abyte1.length; i++)
/* 44 */       abyte1[i] = abyte0[ai[i]];
/* 45 */     return abyte1;
/*    */   }
/*    */ 
/*    */   private static String byteToString(byte[] abyte0) {
/* 49 */     if ((abyte0 == null) || (abyte0.length == 0))
/* 50 */       return "";
/* 51 */     byte[] abyte1 = new byte[2 * abyte0.length];
/* 52 */     for (int i = 0; i < abyte0.length; i++) {
/* 53 */       abyte1[(2 * i + 0)] = m[(abyte0[i] & 0xF)];
/* 54 */       abyte1[(2 * i + 1)] = m[((abyte0[i] & 0xF0) >> 4)];
/*    */     }
/* 56 */     return new String(abyte1);
/*    */   }
/*    */ 
/*    */   private static byte[] stringToByte(String s) {
/* 60 */     if ((s == null) || (s.length() != 128))
/* 61 */       throw new IllegalArgumentException();
/* 62 */     byte[] abyte0 = new byte[64];
/* 63 */     for (int i = 0; i < 64; i++) {
/* 64 */       byte byte0 = 0;
/* 65 */       char c = s.charAt(2 * i + 0);
/* 66 */       char c1 = s.charAt(2 * i + 1);
/* 67 */       if ((c >= '0') && (c <= '9'))
/* 68 */         byte0 = (byte)(byte0 + (c - '0'));
/* 69 */       else if ((c >= 'A') && (c <= 'F'))
/* 70 */         byte0 = (byte)(byte0 + (c - 'A' + 10));
/*    */       else
/* 72 */         throw new IllegalArgumentException();
/* 73 */       if ((c1 >= '0') && (c1 <= '9'))
/* 74 */         byte0 = (byte)(byte0 + (c1 - '0') * 16);
/* 75 */       else if ((c1 >= 'A') && (c1 <= 'F'))
/* 76 */         byte0 = (byte)(byte0 + (c1 - 'A' + 10) * 16);
/*    */       else
/* 78 */         throw new IllegalArgumentException();
/* 79 */       abyte0[i] = byte0;
/*    */     }
/* 81 */     return abyte0;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.EncodeUtils2
 * JD-Core Version:    0.6.2
 */