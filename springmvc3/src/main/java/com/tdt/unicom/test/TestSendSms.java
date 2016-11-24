/*    */ package com.tdt.unicom.test;
/*    */ 
/*    */ import java.io.OutputStream;
/*    */ import java.net.Socket;
/*    */ import org.apache.xerces.impl.dv.util.Base64;
/*    */ 
/*    */ public class TestSendSms
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 18 */     String phoneNumber = "15687150282";
/*    */ 
/* 20 */     String spNumber = "10655820";
/*    */ 
/* 22 */     String servcieType = "90860230";
/*    */ 
/* 24 */     String linkId = "MOODDDS";
/*    */ 
/* 26 */     String messageContent = "欢迎使用云南默诚科技有限公司手机增值服务，收到该条短信说明您成功定制我司产品，感谢您的使用！（默诚科技短信平台短信下发测试）";
/*    */ 
/* 29 */     char reportFlag = '1';
/*    */ 
/* 31 */     String xmlbody = "{<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<gwsmip>\n  <message_header>\n    <command_id>0x3</command_id>\n    <sequence_number/>\n  </message_header>\n  <message_body>\n    <pk_total>1</pk_total>\n    <pk_number>1</pk_number>\n    <user_numbers>\n       <user_number>" + phoneNumber + "</user_number>\n" + "    </user_numbers>\n" + "    <sp_number>" + spNumber + "</sp_number>\n" + "    <service_type>" + servcieType + "</service_type>\n" + "    <link_id>" + linkId + "</link_id>\n" + "    <message_content>" + Base64.encode(messageContent.getBytes()) + "</message_content>\n" + "    <report_flag>" + reportFlag + "</report_flag>\n" + "   </message_body>\n" + "</gwsmip>\n}";
/*    */ 
/* 47 */     Socket socket = new Socket("127.0.0.1", 8805);
/* 48 */     OutputStream out = socket.getOutputStream();
/*    */ 
/* 50 */     for (int i = 0; i < 1000; i++) {
/* 51 */       out.write(xmlbody.getBytes());
/* 52 */       out.flush();
/*    */     }
/* 54 */     out.close();
/* 55 */     socket.close();
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.test.TestSendSms
 * JD-Core Version:    0.6.2
 */