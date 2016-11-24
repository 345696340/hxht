/*     */ package com.core.sgip.util;
/*     */ 
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.Calendar;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ 
/*     */ public class SGIPUtils
/*     */ {
/*     */   private static final String CURRENT_DATE_FILL_SIGN = "0";
/*     */ 
/*     */   public static long byte4ToLong(byte[] b)
/*     */   {
/*  33 */     long s = 0L;
/*  34 */     long s0 = b[0] & 0xFF;
/*  35 */     long s1 = b[1] & 0xFF;
/*  36 */     long s2 = b[2] & 0xFF;
/*  37 */     long s3 = b[3] & 0xFF;
/*  38 */     s0 <<= 24;
/*  39 */     s1 <<= 16;
/*  40 */     s2 <<= 8;
/*  41 */     s = (s0 | s1 | s2 | s3) & 0xFFFFFFFF;
/*  42 */     return s;
/*     */   }
/*     */ 
/*     */   public static byte[] convertString2Bytes(String data, String charsetName, int length)
/*     */   {
/*     */     try
/*     */     {
/*  57 */       byte[] bytes = data.getBytes(charsetName);
/*  58 */       int copyLength = bytes.length;
/*  59 */       byte[] result = new byte[length];
/*  60 */       copyBytes(bytes, result, 1, copyLength, 1);
/*  61 */       return result;
/*     */     }
/*     */     catch (UnsupportedEncodingException e) {
/*  64 */       e.printStackTrace();
/*     */     }
/*  66 */     return new byte[length];
/*     */   }
/*     */ 
/*     */   public static byte[] convertString2Bytes(String data, int length)
/*     */   {
/*  71 */     return convertString2Bytes(data, "UTF-8", length);
/*     */   }
/*     */ 
/*     */   public static byte convertInt2Byte(int data)
/*     */   {
/*  81 */     return (byte)(0xFF & data);
/*     */   }
/*     */ 
/*     */   public static byte[] convertInt2Bytes(int data)
/*     */   {
/*  86 */     byte[] bytes = { convertInt2Byte(data) };
/*  87 */     return bytes;
/*     */   }
/*     */ 
/*     */   public static byte[] convertLong2FourBytes(long data)
/*     */   {
/*  98 */     byte[] result = new byte[4];
/*  99 */     result[3] = ((byte)(int)(0xFF & data));
/* 100 */     result[2] = ((byte)(int)((0xFF00 & data) >> 8));
/* 101 */     result[1] = ((byte)(int)((0xFF0000 & data) >> 16));
/* 102 */     result[0] = ((byte)(int)((0xFF000000 & data) >> 24));
/* 103 */     return result;
/*     */   }
/*     */ 
/*     */   public static Long getCurrentDate()
/*     */   {
/* 112 */     Calendar cal = Calendar.getInstance();
/* 113 */     int month = cal.get(2) + 1;
/* 114 */     String monthStr = month + "";
/*     */ 
/* 116 */     int day = cal.get(5);
/* 117 */     String dayStr = day + "";
/* 118 */     int hour = cal.get(11);
/* 119 */     String hourStr = hour + "";
/* 120 */     int minute = cal.get(12);
/* 121 */     String minuteStr = minute + "";
/*     */ 
/* 123 */     int second = cal.get(13);
/* 124 */     String secondStr = second + "";
/*     */ 
/* 126 */     String cur = monthStr + dayStr + hourStr + minuteStr + secondStr;
/* 127 */     return Long.valueOf(cur);
/*     */   }
/*     */ 
/*     */   public static void copyBytes(byte[] source, byte[] dest, int sourceFrom, int copyLength, int destFrom)
/*     */   {
/* 141 */     sourceFrom -= 1;
/* 142 */     destFrom -= 1;
/* 143 */     for (int i = destFrom; i < destFrom + copyLength; i++)
/*     */     {
/* 145 */       dest[i] = source[(sourceFrom++)];
/*     */     }
/*     */   }
/*     */ 
/*     */   public static byte[] mergeBytes(byte[][] bytes)
/*     */   {
/* 151 */     byte[] temp = new byte[0];
/* 152 */     for (int i = 0; i < bytes.length; i++)
/*     */     {
/* 154 */       temp = ArrayUtils.addAll(temp, bytes[i]);
/*     */     }
/* 156 */     return temp;
/*     */   }
/*     */ 
/*     */   public static byte[] mergeBytes(List<byte[]> list)
/*     */   {
/* 161 */     byte[] temp = new byte[0];
/* 162 */     if (null != list)
/*     */     {
/* 164 */       for (byte[] bs : list)
/*     */       {
/* 166 */         temp = ArrayUtils.addAll(temp, bs);
/*     */       }
/*     */     }
/* 169 */     return temp;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */   }
/*     */ 
/*     */   public static int convertUnsignByte2Int(byte b)
/*     */   {
/* 205 */     int i = b & 0xFF;
/* 206 */     return i;
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.util.SGIPUtils
 * JD-Core Version:    0.6.2
 */