/*     */ package com.tdt.unicom.domains;
/*     */ 
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ public class Submit extends SGIPCommand
/*     */ {
/*     */   private String SPNumber;
/*     */   private String ChargeNumber;
/*     */   private byte userCoun;
/*     */   private String[] userNumber;
/*     */   private String corpId;
/*     */   private String serviceType;
/*     */   private byte feeType;
/*     */   private String feeValue;
/*     */   private String givenValue;
/*     */   private byte agentFlag;
/*     */   private byte morelatetoMTFlag;
/*     */   private byte priority;
/*     */   private String expireTime;
/*     */   private String scheduleTime;
/*     */   private byte reportFlag;
/*     */   private byte TP_pid;
/*     */   private byte TP_udhi;
/*     */   private byte messageCoding;
/*     */   private byte messageType;
/*     */   private int messageLength;
/*     */   private String messageContent;
/*     */   private String linkID;
/*     */ 
/*     */   public Submit()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Submit(int contentLen)
/*     */   {
/*     */   }
/*     */ 
/*     */   public String getSPNumber()
/*     */   {
/*  61 */     return this.SPNumber;
/*     */   }
/*     */   public void setSPNumber(String sPNumber) {
/*  64 */     this.SPNumber = sPNumber;
/*     */   }
/*     */   public String getChargeNumber() {
/*  67 */     return this.ChargeNumber;
/*     */   }
/*     */   public void setChargeNumber(String chargeNumber) {
/*  70 */     this.ChargeNumber = chargeNumber;
/*     */   }
/*     */   public byte getUserCoun() {
/*  73 */     return this.userCoun;
/*     */   }
/*     */   public void setUserCoun(byte userCoun) {
/*  76 */     this.userCoun = userCoun;
/*     */   }
/*     */   public String[] getUserNumber() {
/*  79 */     return this.userNumber;
/*     */   }
/*     */   public void setUserNumber(String[] userNumber) {
/*  82 */     this.userNumber = userNumber;
/*     */   }
/*     */   public String getCorpId() {
/*  85 */     return this.corpId;
/*     */   }
/*     */   public void setCorpId(String corpId) {
/*  88 */     this.corpId = corpId;
/*     */   }
/*     */   public String getServiceType() {
/*  91 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   public void setServiceType(String serviceType) {
/*  95 */     this.serviceType = serviceType;
/*     */   }
/*     */   public byte getFeeType() {
/*  98 */     return this.feeType;
/*     */   }
/*     */ 
/*     */   public void setFeeType(byte feeType) {
/* 102 */     this.feeType = feeType;
/*     */   }
/*     */   public String getFeeValue() {
/* 105 */     return this.feeValue;
/*     */   }
/*     */ 
/*     */   public void setFeeValue(String feeValue) {
/* 109 */     this.feeValue = feeValue;
/*     */   }
/*     */ 
/*     */   public String getGivenValue() {
/* 113 */     return this.givenValue;
/*     */   }
/*     */ 
/*     */   public void setGivenValue(String givenValue) {
/* 117 */     this.givenValue = givenValue;
/*     */   }
/*     */   public byte getAgentFlag() {
/* 120 */     return this.agentFlag;
/*     */   }
/*     */ 
/*     */   public void setAgentFlag(byte agentFlag) {
/* 124 */     this.agentFlag = agentFlag;
/*     */   }
/*     */   public byte getMorelatetoMTFlag() {
/* 127 */     return this.morelatetoMTFlag;
/*     */   }
/*     */ 
/*     */   public void setMorelatetoMTFlag(byte morelatetoMTFlag) {
/* 131 */     this.morelatetoMTFlag = morelatetoMTFlag;
/*     */   }
/*     */   public byte getPriority() {
/* 134 */     return this.priority;
/*     */   }
/*     */ 
/*     */   public void setPriority(byte priority) {
/* 138 */     this.priority = priority;
/*     */   }
/*     */   public String getExpireTime() {
/* 141 */     return this.expireTime;
/*     */   }
/*     */ 
/*     */   public void setExpireTime(String expireTime) {
/* 145 */     this.expireTime = expireTime;
/*     */   }
/*     */   public String getScheduleTime() {
/* 148 */     return this.scheduleTime;
/*     */   }
/*     */ 
/*     */   public void setScheduleTime(String scheduleTime) {
/* 152 */     this.scheduleTime = scheduleTime;
/*     */   }
/*     */   public byte getReportFlag() {
/* 155 */     return this.reportFlag;
/*     */   }
/*     */ 
/*     */   public void setReportFlag(byte reportFlag) {
/* 159 */     this.reportFlag = reportFlag;
/*     */   }
/*     */   public byte getTP_pid() {
/* 162 */     return this.TP_pid;
/*     */   }
/*     */   public void setTP_pid(byte tPPid) {
/* 165 */     this.TP_pid = tPPid;
/*     */   }
/*     */   public byte getTP_udhi() {
/* 168 */     return this.TP_udhi;
/*     */   }
/*     */   public void setTP_udhi(byte tPUdhi) {
/* 171 */     this.TP_udhi = tPUdhi;
/*     */   }
/*     */   public byte getMessageCoding() {
/* 174 */     return this.messageCoding;
/*     */   }
/*     */ 
/*     */   public void setMessageCoding(byte messageCoding) {
/* 178 */     this.messageCoding = messageCoding;
/*     */   }
/*     */   public byte getMessageType() {
/* 181 */     return this.messageType;
/*     */   }
/*     */ 
/*     */   public void setMessageType(byte messageType) {
/* 185 */     this.messageType = messageType;
/*     */   }
/*     */   public int getMessageLength() {
/* 188 */     return this.messageLength;
/*     */   }
/*     */   public String getMessageContent() {
/* 191 */     return this.messageContent;
/*     */   }
/*     */ 
/*     */   public void setMessageContent(String messageContent) {
/* 195 */     this.messageContent = messageContent;
/*     */   }
/*     */   public String getLinkID() {
/* 198 */     return this.linkID;
/*     */   }
/*     */   public void setLinkID(String linkID) {
/* 201 */     this.linkID = linkID;
/*     */   }
/*     */ 
/*     */   public byte[] getCommandBodybytes() {
/* 205 */     byte[] temp_chn = null;
/* 206 */     if (this.messageCoding == 15) {
/*     */       try {
/* 208 */         temp_chn = this.messageContent.getBytes("GBK"); } catch (UnsupportedEncodingException e) {
/* 209 */         e.printStackTrace();
/* 210 */       }this.messageLength = temp_chn.length;
/*     */     } else {
/* 212 */       this.messageLength = this.messageContent.length();
/*     */     }
/*     */ 
/* 215 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_SUBMIT);
/* 216 */     this.header.setTotalmsglen(143 + 21 * this.userCoun + this.messageLength);
/* 217 */     this.bodybytes = new byte[this.header.getTotalmsglen() - 20];
/*     */ 
/* 219 */     byte[] tempbytes = new byte[21];
/* 220 */     if (this.SPNumber.length() > 21)
/* 221 */       throw new SGIPException(String.valueOf("SPNumber Longer than 21 bytes:").concat(String.valueOf(this.SPNumber)));
/* 222 */     this.SPNumber.getBytes(0, this.SPNumber.length(), tempbytes, 0);
/* 223 */     BytesCopy(tempbytes, this.bodybytes, 0, 20, 0);
/*     */ 
/* 225 */     tempbytes = new byte[21];
/* 226 */     if (this.ChargeNumber.length() > 21)
/* 227 */       throw new SGIPException(String.valueOf("ChargeNumber longer than 21 bytes:").concat(String.valueOf(this.ChargeNumber)));
/* 228 */     this.ChargeNumber.getBytes(0, this.ChargeNumber.length(), tempbytes, 0);
/* 229 */     BytesCopy(tempbytes, this.bodybytes, 0, 20, 21);
/*     */ 
/* 231 */     this.bodybytes[42] = this.userCoun;
/*     */ 
/* 233 */     int current_pos = 43;
/* 234 */     for (int i = 0; i < this.userCoun; i++) {
/* 235 */       tempbytes = new byte[21];
/* 236 */       String mobile = String.valueOf(this.userNumber[i]);
/* 237 */       if (mobile.length() > 21)
/* 238 */         throw new SGIPException(String.valueOf("UserNumber longer than 21 bytes:").concat(String.valueOf(mobile)));
/* 239 */       mobile.getBytes(0, mobile.length(), tempbytes, 0);
/* 240 */       BytesCopy(tempbytes, this.bodybytes, 0, 20, current_pos);
/* 241 */       current_pos += 21;
/*     */     }
/*     */ 
/* 244 */     tempbytes = new byte[5];
/* 245 */     if (this.corpId.length() > 5)
/* 246 */       throw new SGIPException(String.valueOf("CorpId longer than 5 bytes:").concat(String.valueOf(this.corpId)));
/* 247 */     this.corpId.getBytes(0, this.corpId.length(), tempbytes, 0);
/* 248 */     BytesCopy(tempbytes, this.bodybytes, 0, 4, current_pos);
/* 249 */     current_pos += 5;
/*     */ 
/* 251 */     tempbytes = new byte[10];
/* 252 */     if (this.serviceType.length() > 10)
/* 253 */       throw new SGIPException(String.valueOf("ServiceType longer than 10 bytes:").concat(String.valueOf(this.serviceType)));
/* 254 */     this.serviceType.getBytes(0, this.serviceType.length(), tempbytes, 0);
/* 255 */     BytesCopy(tempbytes, this.bodybytes, 0, 9, current_pos);
/* 256 */     current_pos += 10;
/*     */ 
/* 258 */     this.bodybytes[current_pos] = this.feeType;
/* 259 */     current_pos++;
/*     */ 
/* 261 */     tempbytes = new byte[6];
/* 262 */     if (this.feeValue.length() > 6)
/* 263 */       throw new SGIPException(String.valueOf("feeValue longer than 6 bytes:").concat(String.valueOf(this.feeValue)));
/* 264 */     this.feeValue.getBytes(0, this.feeValue.length(), tempbytes, 0);
/* 265 */     BytesCopy(tempbytes, this.bodybytes, 0, 5, current_pos);
/* 266 */     current_pos += 6;
/*     */ 
/* 268 */     tempbytes = new byte[6];
/* 269 */     if (this.givenValue.length() > 6)
/* 270 */       throw new SGIPException(String.valueOf("GivenValue longer than 6 bytes:").concat(String.valueOf(this.givenValue)));
/* 271 */     this.givenValue.getBytes(0, this.givenValue.length(), tempbytes, 0);
/* 272 */     BytesCopy(tempbytes, this.bodybytes, 0, 5, current_pos);
/* 273 */     current_pos += 6;
/*     */ 
/* 275 */     this.bodybytes[current_pos] = this.agentFlag;
/* 276 */     current_pos++;
/*     */ 
/* 278 */     this.bodybytes[current_pos] = this.morelatetoMTFlag;
/* 279 */     current_pos++;
/*     */ 
/* 281 */     this.bodybytes[current_pos] = this.priority;
/* 282 */     current_pos++;
/*     */ 
/* 284 */     tempbytes = new byte[16];
/* 285 */     if (this.expireTime.length() > 16)
/* 286 */       throw new SGIPException(String.valueOf("EXpireTime longer than 16 bytes:").concat(String.valueOf(this.expireTime)));
/* 287 */     this.expireTime.getBytes(0, this.expireTime.length(), tempbytes, 0);
/* 288 */     BytesCopy(tempbytes, this.bodybytes, 0, 15, current_pos);
/* 289 */     current_pos += 16;
/*     */ 
/* 291 */     tempbytes = new byte[16];
/* 292 */     if (this.scheduleTime.length() > 16)
/* 293 */       throw new SGIPException(String.valueOf("ScheduleTime longer than 16 bytes:").concat(String.valueOf(this.scheduleTime)));
/* 294 */     BytesCopy(tempbytes, this.bodybytes, 0, 15, current_pos);
/* 295 */     current_pos += 16;
/*     */ 
/* 297 */     this.bodybytes[current_pos] = this.reportFlag;
/* 298 */     current_pos++;
/*     */ 
/* 300 */     this.bodybytes[current_pos] = this.TP_pid;
/* 301 */     current_pos++;
/*     */ 
/* 303 */     this.bodybytes[current_pos] = this.TP_udhi;
/* 304 */     current_pos++;
/*     */ 
/* 306 */     this.bodybytes[current_pos] = this.messageCoding;
/* 307 */     current_pos++;
/*     */ 
/* 309 */     this.bodybytes[current_pos] = this.messageType;
/* 310 */     current_pos++;
/*     */ 
/* 312 */     BytesCopy(IntToBytes4(this.messageLength), this.bodybytes, 0, 3, current_pos);
/* 313 */     current_pos += 4;
/*     */ 
/* 315 */     if (this.messageCoding == 15)
/* 316 */       BytesCopy(temp_chn, this.bodybytes, 0, this.messageLength - 1, current_pos);
/*     */     else {
/* 318 */       this.messageContent.getBytes(0, this.messageLength, this.bodybytes, current_pos);
/*     */     }
/* 320 */     current_pos += this.messageLength;
/*     */ 
/* 322 */     tempbytes = new byte[8];
/* 323 */     if (this.linkID.length() > 8)
/* 324 */       throw new SGIPException(String.valueOf("linkid longer than 8 bytes:").concat(String.valueOf(this.linkID)));
/* 325 */     this.linkID.getBytes(0, this.linkID.length(), tempbytes, 0);
/* 326 */     BytesCopy(tempbytes, this.bodybytes, 0, 7, current_pos);
/*     */ 
/* 328 */     return super.getCommandBodybytes();
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.Submit
 * JD-Core Version:    0.6.2
 */