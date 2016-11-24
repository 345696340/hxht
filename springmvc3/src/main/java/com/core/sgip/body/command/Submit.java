/*     */ package com.core.sgip.body.command;
/*     */ 
/*     */ import com.core.sgip.body.SGIPCommand;
/*     */ import com.core.sgip.constant.ClientConstant;
/*     */ import com.core.sgip.constant.SGIPConstant;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class Submit extends SGIPCommand
/*     */ {
/*  31 */   private static int COMMAND_FIX_LENGTH = 123;
/*     */ 
/*  33 */   private String spNumber = ClientConstant.SP_NUMBER;
/*     */ 
/*  35 */   private String chargeNumber = "000000000000000000000";
/*     */   private int userCount;
/*     */   private List<String> listUserNumber;
/*  41 */   private String corpId = ClientConstant.COMPANY_CODE;
/*     */ 
/*  43 */   private String serviceType = "";
/*     */   private int feeType;
/*  47 */   private String feeValue = "";
/*     */ 
/*  49 */   private String givenValue = "";
/*     */   private int agentFlag;
/*  53 */   private int morelatetoMTFlag = 0;
/*     */ 
/*  55 */   private int priority = 0;
/*     */ 
/*  57 */   private String expireTime = "";
/*     */ 
/*  59 */   private String scheduleTime = "";
/*     */ 
/*  61 */   private int reportFlag = 0;
/*     */   private int tpPid;
/*     */   private int tpUdhi;
/*  67 */   private int messageCoding = SGIPConstant.MESSAGE_CODING;
/*     */ 
/*  69 */   private int messageType = 0;
/*     */   private int messageLength;
/*  73 */   private String messageContent = "";
/*     */ 
/*  75 */   private byte[] reserve = new byte[8];
/*     */ 
/*  77 */   private byte[] spNumberByte = SGIPUtils.convertString2Bytes(this.spNumber, 21);
/*     */ 
/*  79 */   private byte[] chargeNumberByte = SGIPUtils.convertString2Bytes(this.chargeNumber, 21);
/*     */ 
/*  81 */   private byte[] userCountByte = new byte[1];
/*     */ 
/*  83 */   private List<byte[]> listUserNumberByte = new ArrayList();
/*     */ 
/*  85 */   private byte[] corpIdByte = SGIPUtils.convertString2Bytes(ClientConstant.COMPANY_CODE, 5);
/*     */ 
/*  87 */   private byte[] serviceTypeByte = new byte[10];
/*     */ 
/*  89 */   private byte[] feeTypeByte = new byte[1];
/*     */ 
/*  91 */   private byte[] feeValueByte = new byte[6];
/*     */ 
/*  93 */   private byte[] givenValueByte = new byte[6];
/*     */ 
/*  95 */   private byte[] agentFlagByte = new byte[1];
/*     */ 
/*  97 */   private byte[] morelatetoMTFlagByte = new byte[1];
/*     */ 
/*  99 */   private byte[] priorityByte = new byte[1];
/*     */ 
/* 101 */   private byte[] expireTimeByte = new byte[16];
/*     */ 
/* 103 */   private byte[] schedualTimeByte = new byte[16];
/*     */ 
/* 105 */   private byte[] reportFlagByte = new byte[1];
/*     */ 
/* 107 */   private byte[] tpPidByte = new byte[1];
/*     */ 
/* 109 */   private byte[] tpUdhiByte = new byte[1];
/*     */ 
/* 111 */   private byte[] messageCodingByte = { SGIPConstant.MESSAGE_CODING };
/*     */ 
/* 113 */   private byte[] messageTypeByte = new byte[1];
/*     */ 
/* 115 */   private byte[] messageLengthByte = new byte[4];
/*     */   private byte[] messageContentByte;
/*     */ 
/*     */   public String getSpNumber()
/*     */   {
/* 121 */     return this.spNumber;
/*     */   }
/*     */ 
/*     */   public void setSpNumber(String spNumber) {
/* 125 */     this.spNumber = spNumber;
/*     */   }
/*     */ 
/*     */   public String getChargeNumber() {
/* 129 */     return this.chargeNumber;
/*     */   }
/*     */ 
/*     */   public void setChargeNumber(String chargeNumber) {
/* 133 */     this.chargeNumber = chargeNumber;
/*     */   }
/*     */ 
/*     */   public int getUserCount() {
/* 137 */     return this.userCount;
/*     */   }
/*     */ 
/*     */   public void setUserCount(int userCount) {
/* 141 */     this.userCount = userCount;
/*     */   }
/*     */ 
/*     */   public List<String> getListUserNumber() {
/* 145 */     return this.listUserNumber;
/*     */   }
/*     */ 
/*     */   public void setListUserNumber(List<String> listUserNumber) {
/* 149 */     this.listUserNumber = listUserNumber;
/*     */   }
/*     */ 
/*     */   public String getCorpId() {
/* 153 */     return this.corpId;
/*     */   }
/*     */ 
/*     */   public void setCorpId(String corpId) {
/* 157 */     this.corpId = corpId;
/*     */   }
/*     */ 
/*     */   public String getServiceType() {
/* 161 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   public void setServiceType(String serviceType) {
/* 165 */     this.serviceType = serviceType;
/*     */   }
/*     */ 
/*     */   public int getFeeType() {
/* 169 */     return this.feeType;
/*     */   }
/*     */ 
/*     */   public void setFeeType(int feeType) {
/* 173 */     this.feeType = feeType;
/*     */   }
/*     */ 
/*     */   public String getFreeValue() {
/* 177 */     return this.feeValue;
/*     */   }
/*     */ 
/*     */   public void setFeeValue(String feeValue) {
/* 181 */     this.feeValue = feeValue;
/*     */   }
/*     */ 
/*     */   public String getGivenValue() {
/* 185 */     return this.givenValue;
/*     */   }
/*     */ 
/*     */   public void setGivenValue(String givenValue) {
/* 189 */     this.givenValue = givenValue;
/*     */   }
/*     */ 
/*     */   public int getAgentFlag() {
/* 193 */     return this.agentFlag;
/*     */   }
/*     */ 
/*     */   public void setAgentFlag(int agentFlag) {
/* 197 */     this.agentFlag = agentFlag;
/*     */   }
/*     */ 
/*     */   public int getMorelatetoMTFlag() {
/* 201 */     return this.morelatetoMTFlag;
/*     */   }
/*     */ 
/*     */   public void setMorelatetoMTFlag(int morelatetoMTFlag) {
/* 205 */     this.morelatetoMTFlag = morelatetoMTFlag;
/*     */   }
/*     */ 
/*     */   public int getPriority() {
/* 209 */     return this.priority;
/*     */   }
/*     */ 
/*     */   public void setPriority(int priority) {
/* 213 */     this.priority = priority;
/*     */   }
/*     */ 
/*     */   public String getExpireTime() {
/* 217 */     return this.expireTime;
/*     */   }
/*     */ 
/*     */   public void setExpireTime(String expireTime) {
/* 221 */     this.expireTime = expireTime;
/*     */   }
/*     */ 
/*     */   public String getScheduleTime() {
/* 225 */     return this.scheduleTime;
/*     */   }
/*     */ 
/*     */   public void setScheduleTime(String scheduleTime) {
/* 229 */     this.scheduleTime = scheduleTime;
/*     */   }
/*     */ 
/*     */   public int getReportFlag() {
/* 233 */     return this.reportFlag;
/*     */   }
/*     */ 
/*     */   public void setReportFlag(int reportFlag) {
/* 237 */     this.reportFlag = reportFlag;
/*     */   }
/*     */ 
/*     */   public int getTpPid() {
/* 241 */     return this.tpPid;
/*     */   }
/*     */ 
/*     */   public void setTpPid(int tpPid) {
/* 245 */     this.tpPid = tpPid;
/*     */   }
/*     */ 
/*     */   public int getTpUdhi() {
/* 249 */     return this.tpUdhi;
/*     */   }
/*     */ 
/*     */   public void setTpUdhi(int tpUdhi) {
/* 253 */     this.tpUdhi = tpUdhi;
/*     */   }
/*     */ 
/*     */   public int getMessageCoding() {
/* 257 */     return this.messageCoding;
/*     */   }
/*     */ 
/*     */   public void setMessageCoding(int messageCoding) {
/* 261 */     this.messageCoding = messageCoding;
/*     */   }
/*     */ 
/*     */   public int getMessageType() {
/* 265 */     return this.messageType;
/*     */   }
/*     */ 
/*     */   public void setMessageType(int messageType) {
/* 269 */     this.messageType = messageType;
/*     */   }
/*     */ 
/*     */   public int getMessageLength() {
/* 273 */     return this.messageLength;
/*     */   }
/*     */ 
/*     */   public void setMessageLength(int messageLength) {
/* 277 */     this.messageLength = messageLength;
/*     */   }
/*     */ 
/*     */   public String getMessageContent() {
/* 281 */     return this.messageContent;
/*     */   }
/*     */ 
/*     */   public void setMessageContent(String messageContent) {
/* 285 */     this.messageContent = messageContent;
/*     */   }
/*     */ 
/*     */   public byte[] getReserve() {
/* 289 */     return this.reserve;
/*     */   }
/*     */ 
/*     */   public void setReserve(byte[] reserve) {
/* 293 */     this.reserve = reserve;
/*     */   }
/*     */ 
/*     */   public Submit() {
/* 297 */     this(new ArrayList(), "", "");
/*     */   }
/*     */ 
/*     */   public Submit(List<String> listUserNumber, String messageContent, String serviceType)
/*     */   {
/* 302 */     this.listUserNumber = listUserNumber;
/* 303 */     this.messageContent = messageContent;
/* 304 */     if ((null != serviceType) && (!"".equals(serviceType)) && (serviceType.length() > 10)) {
/* 305 */       serviceType = serviceType.substring(0, 10);
/*     */     }
/* 307 */     this.serviceType = serviceType;
/*     */   }
/*     */ 
/*     */   private void calcute() {
/* 311 */     this.expireTimeByte = SGIPUtils.convertString2Bytes(this.expireTime, 16);
/* 312 */     this.schedualTimeByte = SGIPUtils.convertString2Bytes(this.scheduleTime, 16);
/* 313 */     this.feeValueByte = SGIPUtils.convertString2Bytes(this.feeValue, 6);
/* 314 */     this.givenValueByte = SGIPUtils.convertString2Bytes(this.givenValue, 6);
/*     */ 
/* 316 */     if ((null == this.serviceType) || (this.serviceType == "")) {
/* 317 */       this.serviceType = ClientConstant.DEFAULT_SERVICE_TYPE;
/*     */     }
/*     */ 
/* 320 */     this.serviceTypeByte = SGIPUtils.convertString2Bytes(this.serviceType, 10);
/*     */ 
/* 323 */     byte[] mcBytes = null;
/*     */     try {
/* 325 */       mcBytes = this.messageContent.getBytes("UTF-16");
/*     */     } catch (UnsupportedEncodingException e) {
/* 327 */       e.printStackTrace();
/*     */     }
/* 329 */     this.messageContentByte = mcBytes;
/* 330 */     int length = mcBytes.length;
/* 331 */     this.messageLength = length;
/* 332 */     this.messageLengthByte = SGIPUtils.convertLong2FourBytes(this.messageLength);
/*     */ 
/* 334 */     int size = 0;
/* 335 */     if (null != this.listUserNumber) {
/* 336 */       size = this.listUserNumber.size();
/* 337 */       this.userCount = size;
/* 338 */       this.userCountByte = SGIPUtils.convertInt2Bytes(size);
/*     */ 
/* 340 */       if (size > 0) {
/* 341 */         for (String u : this.listUserNumber) {
/* 342 */           byte[] userNumberByte = SGIPUtils.convertString2Bytes(u, 21);
/* 343 */           this.listUserNumberByte.add(userNumberByte);
/*     */         }
/*     */       }
/*     */     }
/* 347 */     this.commandLength = (COMMAND_FIX_LENGTH + size * 21 + length);
/*     */   }
/*     */ 
/*     */   public byte[] getByteData()
/*     */   {
/* 352 */     calcute();
/* 353 */     byte[] listUserNumberBytes = SGIPUtils.mergeBytes(this.listUserNumberByte);
/*     */ 
/* 355 */     byte[] temp_chn = null;
/* 356 */     if (this.messageCoding == 15) {
/*     */       try {
/* 358 */         temp_chn = this.messageContent.getBytes("GBK");
/*     */       } catch (UnsupportedEncodingException e) {
/* 360 */         e.printStackTrace();
/*     */       }
/* 362 */       this.messageLength = temp_chn.length;
/*     */     } else {
/* 364 */       this.messageLength = this.messageContent.length();
/*     */     }
/*     */ 
/* 369 */     return SGIPUtils.mergeBytes(new byte[][] { this.spNumberByte, this.chargeNumberByte, this.userCountByte, listUserNumberBytes, this.corpIdByte, this.serviceTypeByte, this.feeTypeByte, this.feeValueByte, this.givenValueByte, this.agentFlagByte, this.morelatetoMTFlagByte, this.priorityByte, this.expireTimeByte, this.schedualTimeByte, this.reportFlagByte, this.tpPidByte, this.tpUdhiByte, this.messageCodingByte, this.messageTypeByte, this.messageLengthByte, this.messageContentByte, this.reserve });
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 380 */     return "Submit [spNumber=" + this.spNumber + ", chargeNumber=" + this.chargeNumber + ", userCount=" + this.userCount + ", listUserNumber=" + this.listUserNumber + ", corpId=" + this.corpId + ", serviceType=" + this.serviceType + ", feeType=" + this.feeType + ", feeValue=" + this.feeValue + ", givenValue=" + this.givenValue + ", agentFlag=" + this.agentFlag + ", morelatetoMTFlag=" + this.morelatetoMTFlag + ", priority=" + this.priority + ", expireTime=" + this.expireTime + ", scheduleTime=" + this.scheduleTime + ", reportFlag=" + this.reportFlag + ", tpPid=" + this.tpPid + ", tpUdhi=" + this.tpUdhi + ", messageCoding=" + this.messageCoding + ", messageType=" + this.messageType + ", messageLength=" + this.messageLength + ", messageContent=" + this.messageContent + ", linkId=" + this.reserve + "]";
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.Submit
 * JD-Core Version:    0.6.2
 */