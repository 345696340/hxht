/*     */ package com.tdt.unicom.domains;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.Serializable;
/*     */ import org.apache.commons.logging.impl.Log4JLogger;
/*     */ 
/*     */ public class SGIPCommand
/*     */   implements Serializable
/*     */ {
/*  18 */   public SGIPHeader header = new SGIPHeader();
/*  19 */   public byte[] bodybytes = new byte[0];
/*  20 */   private static final Log4JLogger log = new Log4JLogger("A1");
/*     */ 
/*     */   public byte[] getCommandBodybytes()
/*     */   {
/*  28 */     byte[] commandbytes = new byte[20 + this.bodybytes.length];
/*     */ 
/*  30 */     System.arraycopy(this.header.getCommandHeadBytes(), 0, commandbytes, 0, 20);
/*     */ 
/*  32 */     System.arraycopy(this.bodybytes, 0, commandbytes, 20, this.header.getTotalmsglen() - 20);
/*  33 */     return commandbytes;
/*     */   }
/*     */ 
/*     */   public void write(OutputStream out)
/*     */     throws IOException
/*     */   {
/*  44 */     byte[] commandBytes = getCommandBodybytes();
/*  45 */     out.write(commandBytes);
/*  46 */     out.flush();
/*     */ 
/*  48 */     log.info("【" + Thread.currentThread().getName() + "发送SP " + SGIPCommandDefine.getCommandName(this.header.getCommandId()) + "命令】,{长度=" + this.header.getTotalmsglen() + ",序列号=" + this.header.getSequenceNumber() + "}");
/*     */   }
/*     */ 
/*     */   public SGIPCommand read(InputStream in)
/*     */     throws IOException
/*     */   {
/*  54 */     this.header.readHead(in);
/*  55 */     readDataIntoBody(in);
/*     */ 
/*  57 */     switch (Bytes4ToInt(this.header.getCommandId())) {
/*     */     case 1:
/*  59 */       return new Bind(this);
/*     */     case -2147483647:
/*  61 */       return new BindResp(this);
/*     */     case 2:
/*  63 */       return new Unbind(this);
/*     */     case -2147483646:
/*  65 */       return new UnbindResp(this);
/*     */     case -2147483645:
/*  67 */       return new SubmitResp(this);
/*     */     case 4:
/*  69 */       return new Deliver(this);
/*     */     case 5:
/*  71 */       return new Report(this);
/*     */     case -2147479552:
/*     */     case 17:
/*  75 */       return new UserRpt(this);
/*     */     }
/*  77 */     return null;
/*     */   }
/*     */ 
/*     */   public void readDataIntoBody(InputStream in)
/*     */     throws IOException
/*     */   {
/*  87 */     this.bodybytes = new byte[this.header.getTotalmsglen() - 20];
/*  88 */     in.read(this.bodybytes);
/*     */   }
/*     */ 
/*     */   public static int ByteToInt(byte mybyte) {
/*  92 */     return mybyte;
/*     */   }
/*     */ 
/*     */   public static byte IntToByte(int i) {
/*  96 */     return (byte)i;
/*     */   }
/*     */ 
/*     */   public static int BytesToInt(byte[] mybytes) {
/* 100 */     return ((0xFF & mybytes[0]) << 8) + mybytes[1];
/*     */   }
/*     */ 
/*     */   public static byte[] IntToBytes(int i) {
/* 104 */     byte[] mybytes = new byte[2];
/* 105 */     mybytes[1] = ((byte)(0xFF & i));
/* 106 */     mybytes[0] = ((byte)((0xFF00 & i) >> 8));
/* 107 */     return mybytes;
/*     */   }
/*     */ 
/*     */   public static byte[] IntToBytes4(int i)
/*     */   {
/* 117 */     byte[] mybytes = new byte[4];
/* 118 */     mybytes[3] = ((byte)(0xFF & i));
/* 119 */     mybytes[2] = ((byte)((0xFF00 & i) >> 8));
/* 120 */     mybytes[1] = ((byte)((0xFF0000 & i) >> 16));
/* 121 */     mybytes[0] = ((byte)((0xFF000000 & i) >> 24));
/* 122 */     return mybytes;
/*     */   }
/*     */ 
/*     */   public static byte[] LongToBytes4(long i) {
/* 126 */     byte[] mybytes = new byte[4];
/* 127 */     mybytes[3] = ((byte)(int)(0xFF & i));
/* 128 */     mybytes[2] = ((byte)(int)((0xFF00 & i) >> 8));
/* 129 */     mybytes[1] = ((byte)(int)((0xFF0000 & i) >> 16));
/* 130 */     mybytes[0] = ((byte)(int)((0xFF000000 & i) >> 24));
/* 131 */     return mybytes;
/*     */   }
/*     */ 
/*     */   public static void LongToBytes4(long i, byte[] mybytes) {
/* 135 */     mybytes[3] = ((byte)(int)(0xFF & i));
/* 136 */     mybytes[2] = ((byte)(int)((0xFF00 & i) >> 8));
/* 137 */     mybytes[1] = ((byte)(int)((0xFF0000 & i) >> 16));
/* 138 */     mybytes[0] = ((byte)(int)((0xFF000000 & i) >> 24));
/*     */   }
/*     */ 
/*     */   public static void IntToBytes(int i, byte[] mybytes) {
/* 142 */     mybytes[1] = ((byte)(0xFF & i));
/* 143 */     mybytes[0] = ((byte)((0xFF00 & i) >> 8));
/*     */   }
/*     */ 
/*     */   public static final String BytesToHexString(byte[] byteArray)
/*     */   {
/* 153 */     StringBuffer sBuffer = new StringBuffer(byteArray.length);
/* 154 */     String sTemp = "";
/* 155 */     for (int i = 0; i < byteArray.length; i++) {
/* 156 */       sTemp = Integer.toHexString(0xFF & byteArray[i]);
/* 157 */       if (sTemp.length() < 2)
/* 158 */         sBuffer.append(0);
/* 159 */       sBuffer.append(sTemp.toUpperCase());
/*     */     }
/* 161 */     return sBuffer.toString();
/*     */   }
/*     */ 
/*     */   public static void IntToBytes4(int i, byte[] mybytes)
/*     */   {
/* 171 */     mybytes[3] = ((byte)(0xFF & i));
/* 172 */     mybytes[2] = ((byte)((0xFF00 & i) >> 8));
/* 173 */     mybytes[1] = ((byte)((0xFF0000 & i) >> 16));
/* 174 */     mybytes[0] = ((byte)((0xFF000000 & i) >> 24));
/*     */   }
/*     */ 
/*     */   public static int Bytes4ToInt(byte[] mybytes)
/*     */   {
/* 184 */     return (0xFF & mybytes[0]) << 24 | (0xFF & mybytes[1]) << 16 | (0xFF & mybytes[2]) << 8 | 0xFF & mybytes[3];
/*     */   }
/*     */ 
/*     */   public static long Bytes4ToLong(byte[] mybytes)
/*     */   {
/* 195 */     return (0xFF & mybytes[0]) << 24 | (0xFF & mybytes[1]) << 16 | (0xFF & mybytes[2]) << 8 | 0xFF & mybytes[3];
/*     */   }
/*     */ 
/*     */   public static void BytesCopy(byte[] source, byte[] dest, int sourceBegin, int sourceEnd, int destBegin)
/*     */   {
/* 210 */     int index = 0;
/* 211 */     for (int i = sourceBegin; i <= sourceEnd; i++) {
/* 212 */       dest[(destBegin + index)] = source[i];
/* 213 */       index++;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.SGIPCommand
 * JD-Core Version:    0.6.2
 */