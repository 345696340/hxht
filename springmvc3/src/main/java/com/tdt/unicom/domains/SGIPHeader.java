/*     */ package com.tdt.unicom.domains;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Serializable;
/*     */ import java.math.BigInteger;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.logging.impl.Log4JLogger;
/*     */ 
/*     */ public class SGIPHeader
/*     */   implements Serializable
/*     */ {
/*  20 */   private static final Log4JLogger log = new Log4JLogger("A1");
/*     */   private byte[] commandId;
/*  23 */   private int totalmsglen = 0;
/*     */ 
/*  25 */   private static volatile int SN = 0;
/*     */   private String sequenceNumber;
/*     */   public static String srcNodeId;
/*  30 */   private byte[] unicomSN = null;
/*     */ 
/*     */   public SGIPHeader() {
/*     */   }
/*     */ 
/*     */   public void setTotalmsglen(int totalmsglen) {
/*  36 */     this.totalmsglen = totalmsglen;
/*     */   }
/*     */ 
/*     */   public void setSequenceNumber(String sequenceNumber) {
/*  40 */     this.sequenceNumber = sequenceNumber;
/*     */   }
/*     */ 
/*     */   public String getSequenceNumber() {
/*  44 */     return this.sequenceNumber;
/*     */   }
/*     */ 
/*     */   public int getTotalmsglen() {
/*  48 */     return this.totalmsglen;
/*     */   }
/*     */ 
/*     */   public void setUnicomSN(byte[] unicomSN) {
/*  52 */     this.unicomSN = unicomSN;
/*     */   }
/*     */ 
/*     */   public byte[] getUnicomSN() {
/*  56 */     return this.unicomSN;
/*     */   }
/*     */ 
/*     */   public static void setSrcNodeId(String srcNodeId) {
/*  60 */     srcNodeId = srcNodeId;
/*     */   }
/*     */ 
/*     */   public String getSrcNodeId() {
/*  64 */     return this.srcNodeId;
/*     */   }
/*     */ 
/*     */   public SGIPHeader(byte[] commandId) {
/*  68 */     this.commandId = commandId;
/*  69 */     int HEAD_LEN = 20;
/*  70 */     switch (SGIPCommand.Bytes4ToInt(commandId)) {
/*     */     case 1:
/*  72 */       this.totalmsglen = 61;
/*  73 */       break;
/*     */     case -2147483647:
/*  75 */       this.totalmsglen = 29;
/*  76 */       break;
/*     */     case 2:
/*  78 */       this.totalmsglen = 20;
/*  79 */       break;
/*     */     case -2147483646:
/*  81 */       this.totalmsglen = 20;
/*  82 */       break;
/*     */     case 3:
/*  84 */       this.totalmsglen = 143;
/*  85 */       break;
/*     */     case -2147483645:
/*  87 */       this.totalmsglen = 29;
/*  88 */       break;
/*     */     case 4:
/*  90 */       this.totalmsglen = 77;
/*  91 */       break;
/*     */     case -2147483644:
/*  93 */       this.totalmsglen = 29;
/*  94 */       break;
/*     */     case 5:
/*  96 */       this.totalmsglen = 64;
/*  97 */       break;
/*     */     case -2147483643:
/*  99 */       this.totalmsglen = 29;
/* 100 */       break;
/*     */     default:
/* 102 */       this.totalmsglen = -1;
/*     */     }
/*     */   }
/*     */ 
/*     */   public byte[] getCommandId()
/*     */   {
/* 108 */     return this.commandId;
/*     */   }
/*     */ 
/*     */   public void setCommandId(byte[] commandId) {
/* 112 */     this.commandId = commandId;
/*     */   }
/*     */ 
/*     */   public byte[] getCommandHeadBytes() {
/* 116 */     int srcnode = new BigInteger(srcNodeId).intValue();
/* 117 */     byte[] spsrc = SGIPCommand.IntToBytes4(srcnode);
/* 118 */     byte[] datecmd = SGIPCommand.IntToBytes4(getDateCmd());
/* 119 */     byte[] seqnum = SGIPCommand.IntToBytes4(getSeqNumber());
/* 120 */     byte[] messageLength = SGIPCommand.IntToBytes4(this.totalmsglen);
/*     */ 
/* 122 */     this.sequenceNumber = (srcNodeId + SGIPCommand.Bytes4ToInt(datecmd) + SGIPCommand.Bytes4ToInt(seqnum));
/*     */ 
/* 124 */     byte[] commandHeadbytes = new byte[20];
/* 125 */     byte[] cmdseq = new byte[12];
/* 126 */     System.arraycopy(messageLength, 0, commandHeadbytes, 0, 4);
/* 127 */     System.arraycopy(this.commandId, 0, commandHeadbytes, 4, 4);
/*     */ 
/* 129 */     if (this.unicomSN != null) {
/* 130 */       System.arraycopy(this.unicomSN, 0, cmdseq, 0, 12);
/* 131 */       byte[] tempbytes = new byte[4];
/* 132 */       System.arraycopy(this.unicomSN, 0, tempbytes, 0, 4);
/* 133 */       byte[] srcnodeByte = new byte[5];
/* 134 */       System.arraycopy(tempbytes, 0, srcnodeByte, 1, 4);
/* 135 */       BigInteger src = new BigInteger(srcnodeByte);
/* 136 */       System.arraycopy(this.unicomSN, 4, tempbytes, 0, 4);
/* 137 */       String date = SGIPCommand.Bytes4ToInt(tempbytes) + "";
/* 138 */       System.arraycopy(this.unicomSN, 8, tempbytes, 0, 4);
/* 139 */       String num = SGIPCommand.Bytes4ToInt(tempbytes) + "";
/* 140 */       this.sequenceNumber = (src + date + num);
/*     */     } else {
/* 142 */       System.arraycopy(spsrc, 0, cmdseq, 0, 4);
/* 143 */       System.arraycopy(datecmd, 0, cmdseq, 4, 4);
/* 144 */       System.arraycopy(seqnum, 0, cmdseq, 8, 4);
/*     */     }
/*     */ 
/* 147 */     System.arraycopy(cmdseq, 0, commandHeadbytes, 8, 12);
/*     */ 
/* 149 */     return commandHeadbytes;
/*     */   }
/*     */ 
/*     */   public void readHead(InputStream in)
/*     */     throws IOException
/*     */   {
/* 157 */     byte[] tempbytes = new byte[4];
/* 158 */     in.read(tempbytes);
/* 159 */     this.totalmsglen = SGIPCommand.Bytes4ToInt(tempbytes);
/*     */ 
/* 161 */     byte[] commandIdByte = new byte[4];
/* 162 */     in.read(commandIdByte);
/* 163 */     this.commandId = commandIdByte;
/*     */ 
/* 165 */     this.unicomSN = new byte[12];
/* 166 */     in.read(tempbytes);
/* 167 */     byte[] srcnodeByte = new byte[5];
/* 168 */     System.arraycopy(tempbytes, 0, srcnodeByte, 1, 4);
/* 169 */     BigInteger src = new BigInteger(srcnodeByte);
/* 170 */     System.arraycopy(tempbytes, 0, this.unicomSN, 0, 4);
/* 171 */     in.read(tempbytes);
/* 172 */     String date = SGIPCommand.Bytes4ToInt(tempbytes) + "";
/* 173 */     System.arraycopy(tempbytes, 0, this.unicomSN, 4, 4);
/* 174 */     in.read(tempbytes);
/* 175 */     String seqnum = SGIPCommand.Bytes4ToInt(tempbytes) + "";
/* 176 */     this.sequenceNumber = (src + date + seqnum);
/* 177 */     System.arraycopy(tempbytes, 0, this.unicomSN, 8, 4);
/*     */   }
/*     */ 
/*     */   private int getDateCmd()
/*     */   {
/* 187 */     SimpleDateFormat formate = new SimpleDateFormat("MMddHHmmss");
/* 188 */     String currTime = formate.format(new Date());
/* 189 */     int cmd = new BigInteger(currTime).intValue();
/* 190 */     return cmd;
/*     */   }
/*     */ 
/*     */   private synchronized int getSeqNumber()
/*     */   {
/* 199 */     if (SN == 2147483647)
/* 200 */       SN = 0;
/* 201 */     return ++SN;
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.SGIPHeader
 * JD-Core Version:    0.6.2
 */