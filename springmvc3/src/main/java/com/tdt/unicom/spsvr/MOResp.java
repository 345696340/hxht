/*     */ package com.tdt.unicom.spsvr;
/*     */ 
/*     */ import java.io.IOException;

/*     */ import java.io.InputStream;
/*     */ import org.jdom.Document;
/*     */ import org.jdom.Element;
/*     */ import org.jdom.JDOMException;
/*     */ import org.jdom.input.SAXBuilder;
/*     */ 
/*     */ public class MOResp
/*     */ {
/*  19 */   private String userNumber = "";
/*  20 */   private int userNumberType = 0;
/*  21 */   private String spNumber = "";
/*  22 */   private int messageCoding = 15;
/*  23 */   private String messageContent = "";
/*  24 */   private String serviceType = "";
/*  25 */   private int reportFlag = 0;
/*  26 */   private String linkId = "";
/*     */ 
/*     */   public void loadFromXmlDoc(Document doc)
/*     */   {
/*  47 */     Element root = doc.getRootElement();
/*  48 */     Element body = root.getChild("message_body");
/*     */ 
/*  50 */     setUserNumber(body.getChildText("user_number"));
/*  51 */     setUserNumberType(Integer.valueOf(body.getChildText("user_number_type")).intValue());
/*  52 */     setSpNumber(body.getChildText("sp_number"));
/*  53 */     setMessageCoding(Integer.valueOf(body.getChildText("message_coding")).intValue());
/*  54 */     setMessageContent(body.getChildText("message_content"));
/*  55 */     setServiceType(body.getChildText("service_type"));
/*  56 */     setReportFlag(Integer.valueOf(body.getChildText("report_flag")).intValue());
/*  57 */     setLinkId(body.getChildText("link_id"));
/*     */   }
/*     */ 
/*     */   public void loadFromInputStream(InputStream in) throws JDOMException, IOException {
/*  61 */     SAXBuilder builder = new SAXBuilder();
/*  62 */     Document doc = null;
/*  63 */     doc = builder.build(in);
/*  64 */     loadFromXmlDoc(doc);
/*     */   }
/*     */ 
/*     */   public void loadFromXmlStr(String xmlStr)
/*     */     throws JDOMException, IOException
/*     */   {
/*  76 */     SAXBuilder builder = new SAXBuilder();
/*  77 */     Document doc = builder.build(xmlStr);
/*  78 */     loadFromXmlDoc(doc);
/*     */   }
/*     */ 
/*     */   public String toXmlStr()
/*     */   {
/*  87 */     StringBuffer xmlstr = new StringBuffer();
/*  88 */     xmlstr.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n").append("<gwsmip>\n  <message_header>\n").append("    <command_id>0x4</command_id>\n").append("    <sequence_number>27</sequence_number>\n").append("  </message_header>\n  <message_body>\n").append("    <user_number>").append(getUserNumber()).append("</user_number>\n").append("    <user_number_type>").append(getUserNumberType()).append("</user_number_type>\n").append("    <sp_number>").append(getSpNumber()).append("</sp_number>\n").append("    <message_coding>").append(getMessageCoding()).append("</message_coding>\n").append("    <message_content>").append(getMessageContent()).append("</message_content>\n").append("    <service_type>").append(getServiceType()).append("</service_type>\n").append("    <report_flag>").append(getReportFlag()).append("</report_flag>\n").append("    <link_id>").append(getLinkId()).append("</link_id>\n").append("</message_body>\n").append("</gwsmip>\n");
/*     */ 
/* 119 */     return xmlstr.toString();
/*     */   }
/*     */ 
/*     */   public String getLinkId()
/*     */   {
/* 126 */     return this.linkId;
/*     */   }
/*     */ 
/*     */   public void setLinkId(String linkId)
/*     */   {
/* 134 */     this.linkId = linkId;
/*     */   }
/*     */ 
/*     */   public int getMessageCoding()
/*     */   {
/* 141 */     return this.messageCoding;
/*     */   }
/*     */ 
/*     */   public void setMessageCoding(int messageCoding)
/*     */   {
/* 149 */     this.messageCoding = messageCoding;
/*     */   }
/*     */ 
/*     */   public String getMessageContent()
/*     */   {
/* 156 */     return this.messageContent;
/*     */   }
/*     */ 
/*     */   public void setMessageContent(String messageContent)
/*     */   {
/* 164 */     this.messageContent = messageContent;
/*     */   }
/*     */ 
/*     */   public int getReportFlag()
/*     */   {
/* 171 */     return this.reportFlag;
/*     */   }
/*     */ 
/*     */   public void setReportFlag(int reportFlag)
/*     */   {
/* 179 */     this.reportFlag = reportFlag;
/*     */   }
/*     */ 
/*     */   public String getServiceType()
/*     */   {
/* 186 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   public void setServiceType(String serviceType)
/*     */   {
/* 194 */     this.serviceType = serviceType;
/*     */   }
/*     */ 
/*     */   public String getSpNumber()
/*     */   {
/* 201 */     return this.spNumber;
/*     */   }
/*     */ 
/*     */   public void setSpNumber(String spNumber)
/*     */   {
/* 209 */     this.spNumber = spNumber;
/*     */   }
/*     */ 
/*     */   public String getUserNumber()
/*     */   {
/* 216 */     return this.userNumber;
/*     */   }
/*     */ 
/*     */   public void setUserNumber(String userNumber)
/*     */   {
/* 224 */     this.userNumber = userNumber;
/*     */   }
/*     */ 
/*     */   public int getUserNumberType()
/*     */   {
/* 231 */     return this.userNumberType;
/*     */   }
/*     */ 
/*     */   public void setUserNumberType(int userNumberType)
/*     */   {
/* 239 */     this.userNumberType = userNumberType;
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.spsvr.MOResp
 * JD-Core Version:    0.6.2
 */