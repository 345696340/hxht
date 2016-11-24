/*    */ package com.tdt.unicom.test;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.net.ConnectException;
/*    */ import java.net.ServerSocket;
/*    */ import java.net.Socket;
/*    */ import javax.net.ServerSocketFactory;
/*    */ import javax.net.SocketFactory;
/*    */ import org.apache.xerces.impl.dv.util.Base64;
/*    */ 
/*    */ public class TestRecvSms
/*    */ {
/*    */   public static void send()
/*    */   {
/*    */     try
/*    */     {
/* 22 */       String xmlbody = "{<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<gwsmip>\n  <message_header>\n    <command_id>0x3</command_id>\n    <sequence_number/>\n  </message_header>\n  <message_body>\n    <pk_total>1</pk_total>\n    <pk_number>1</pk_number>\n    <user_numbers>\n       <user_number>13075364025</user_number>\n    </user_numbers>\n    <sp_number>1062836516</sp_number>\n    <service_type>DXAC</service_type>\n    <message_content>" + Base64.encode("(CTR,000)".getBytes()) + "</message_content>\n" + "    <report_flag>0</report_flag>\n" + "   </message_body>\n" + "</gwsmip>\n}";
/*    */ 
/* 38 */       Socket socket = SocketFactory.getDefault().createSocket("192.168.0.23", 8805);
/* 39 */       OutputStream out = socket.getOutputStream();
/*    */       while (true) {
/* 41 */         System.out.println(xmlbody);
/* 42 */         out.write(xmlbody.getBytes());
/* 43 */         Thread.currentThread();
/* 44 */         Thread.sleep(30000L);
/*    */       }
/*    */     } catch (ConnectException e) {
/* 47 */       System.err.println("ConnectException:" + e.getMessage());
/*    */     } catch (IOException e) {
/* 49 */       System.err.println(e.getMessage());
/*    */     } catch (InterruptedException e) {
/* 51 */       System.err.println(e.getMessage());
/*    */     }
/*    */   }
/*    */ }

/*    */ 


/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.test.TestRecvSms
 * JD-Core Version:    0.6.2
 */