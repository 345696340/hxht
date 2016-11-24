/*     */ package com.tdt.unicom.spsvr;
/*     */ 
/*     */ import java.util.ArrayList;

/*     */ import java.util.List;
/*     */ import org.apache.xerces.impl.dv.util.Base64;
/*     */ import org.jdom.Document;
/*     */ import org.jdom.Element;
/*     */ 
/*     */ public class MTReq
/*     */ {
/*     */   private String spNumber;
/*     */   private String serviceType;
/*     */   private ArrayList<String> phoneList;
/*     */   private String messageContent;
/*     */   private String reportFlag;
/*     */   private String linkId;
/*     */   private String[] charNum;
/*     */   private String feeValue;
/*     */   private int feeType;
/*     */ 
/*     */   public MTReq()
/*     */   {
/*     */   }
/*     */ 
/*     */   public MTReq(Document doc)
/*     */   {
/*  31 */     Element root = doc.getRootElement();
/*  32 */     Element message_body = root.getChild("message_body");
/*     */ 
/*  34 */     setSpNumber(message_body.getChildTextTrim("sp_number"));
/*  35 */     setServiceType(message_body.getChildTextTrim("service_type"));
/*  36 */     setReportFlag(message_body.getChildTextTrim("report_flag"));
/*  37 */     String messageContent = message_body.getChildTextTrim("message_content");
/*  38 */     setMessageContent(new String(Base64.decode(messageContent)));
/*     */ 
/*  40 */     List<Element> list = message_body.getChild("user_numbers").getChildren();
/*  41 */     ArrayList<String> phoneList = new ArrayList();
/*  42 */     for (Element element : list) {
/*  43 */       phoneList.add(new StringBuilder().append("86").append(element.getTextTrim()).toString());
/*     */     }
/*  45 */     setPhoneList(phoneList);
/*  46 */     setLinkId("00000000");
/*  47 */     if (message_body.getChildTextTrim("link_id") != null)
/*  48 */       setLinkId(message_body.getChildTextTrim("link_id"));
/*     */   }
/*     */ 
/*     */   public String getLinkId()
/*     */   {
/*  53 */     return this.linkId;
/*     */   }
/*     */ 
/*     */   public void setLinkId(String linkId) {
/*  57 */     this.linkId = linkId;
/*     */   }
/*     */ 
/*     */   public String getServiceType() {
/*  61 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   public void setServiceType(String serviceType) {
/*  65 */     this.serviceType = serviceType;
/*     */   }
/*     */ 
/*     */   public String getSpNumber() {
/*  69 */     return this.spNumber;
/*     */   }
/*     */ 
/*     */   public void setSpNumber(String spNumber) {
/*  73 */     this.spNumber = spNumber;
/*     */   }
/*     */ 
/*     */   public ArrayList<String> getPhoneList() {
/*  77 */     return this.phoneList;
/*     */   }
/*     */ 
/*     */   public void setPhoneList(ArrayList<String> phoneList) {
/*  81 */     this.phoneList = phoneList;
/*     */   }
/*     */ 
/*     */   public String getMessageContent() {
/*  85 */     return this.messageContent;
/*     */   }
/*     */ 
/*     */   public void setMessageContent(String messageContent) {
/*  89 */     this.messageContent = messageContent;
/*     */   }
/*     */ 
/*     */   public String getReportFlag() {
/*  93 */     return this.reportFlag;
/*     */   }
/*     */ 
/*     */   public void setReportFlag(String reportFlag) {
/*  97 */     if (reportFlag.equals("0"))
/*  98 */       this.reportFlag = "2";
/*  99 */     this.reportFlag = reportFlag;
/*     */   }
/*     */ 
/*     */   public String toXmlstr()
/*     */   {
/* 107 */     String phonexml = "";
/* 108 */     for (int i = 0; i < getPhoneList().size(); i++) {
/* 109 */       phonexml = new StringBuilder().append(phonexml).append("       <user_number>").append((String)getPhoneList().get(i)).append("</user_number>\n").toString();
/*     */     }
/* 111 */     StringBuilder xmlBuilder = new StringBuilder();
/* 112 */     xmlBuilder.append("{<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
/* 113 */     xmlBuilder.append("<gwsmip>\n");
/* 114 */     xmlBuilder.append("  <message_header>\n");
/* 115 */     xmlBuilder.append("    <command_id>0x3</command_id>\n");
/* 116 */     xmlBuilder.append("    <sequence_number/>\n");
/* 117 */     xmlBuilder.append("  </message_header>\n");
/* 118 */     xmlBuilder.append("  <message_body>\n");
/* 119 */     xmlBuilder.append("    <pk_total>1</pk_total>\n");
/* 120 */     xmlBuilder.append("    <pk_number>1</pk_number>\n");
/* 121 */     xmlBuilder.append("    <user_numbers>\n");
/* 122 */     xmlBuilder.append(phonexml);
/* 123 */     xmlBuilder.append("    </user_numbers>\n");
/* 124 */     xmlBuilder.append(new StringBuilder().append("    <sp_number>").append(getSpNumber()).append("</sp_number>\n").toString());
/* 125 */     xmlBuilder.append(new StringBuilder().append("    <service_type>").append(getServiceType()).append("</service_type>\n").toString());
/* 126 */     xmlBuilder.append(getLinkId() != null ? new StringBuilder().append("    <link_id>").append(getLinkId()).append("</link_id>\n").toString() : "");
/* 127 */     xmlBuilder.append(new StringBuilder().append("    <message_content>").append(Base64.encode(getMessageContent().getBytes())).toString());
/* 128 */     xmlBuilder.append("</message_content>\n");
/* 129 */     xmlBuilder.append(new StringBuilder().append("    <report_flag>").append(getReportFlag()).append("</report_flag>\n").toString());
/* 130 */     xmlBuilder.append("   </message_body>\n");
/* 131 */     xmlBuilder.append("</gwsmip>\n}");
/* 132 */     return xmlBuilder.toString();
/*     */   }
/*     */ 
/*     */   public String[] getCharNum() {
/* 136 */     return this.charNum;
/*     */   }
/*     */ 
/*     */   public void setCharNum(String[] charNum) {
/* 140 */     this.charNum = charNum;
/*     */   }
/*     */ 
/*     */   public String getFeeValue() {
/* 144 */     return this.feeValue;
/*     */   }
/*     */ 
/*     */   public void setFeeValue(String feeValue) {
/* 148 */     this.feeValue = feeValue;
/*     */   }
/*     */ 
/*     */   public int getFeeType() {
/* 152 */     return this.feeType;
/*     */   }
/*     */ 
/*     */   public void setFeeType(int feeType) {
/* 156 */     this.feeType = feeType;
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.spsvr.MTReq
 * JD-Core Version:    0.6.2
 */