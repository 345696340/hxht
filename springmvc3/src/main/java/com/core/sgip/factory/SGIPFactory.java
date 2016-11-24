/*    */ package com.core.sgip.factory;
/*    */ 
/*    */ import com.core.sgip.SGIPMsg;
/*    */ import com.core.sgip.body.SGIPCommand;
/*    */ import com.core.sgip.body.command.Bind;
/*    */ import com.core.sgip.body.command.BindResp;
/*    */ import com.core.sgip.body.command.Deliver;
/*    */ import com.core.sgip.body.command.DeliverResp;
/*    */ import com.core.sgip.body.command.Report;
/*    */ import com.core.sgip.body.command.ReportResp;
/*    */ import com.core.sgip.body.command.Submit;
/*    */ import com.core.sgip.body.command.SubmitResp;
/*    */ import com.core.sgip.body.command.UnBind;
/*    */ import com.core.sgip.body.command.UnBindResp;
/*    */ import com.core.sgip.constant.SGIPConstant;
/*    */ import com.core.sgip.head.SGIPMsgHead;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class SGIPFactory
/*    */ {
/*    */   public static SGIPMsg constructSGIPMsg(byte[] source)
/*    */     throws IOException
/*    */   {
/* 40 */     SGIPMsg sgipMsg = new SGIPMsg();
/* 41 */     if ((source != null) && (source.length >= 20))
/*    */     {
/* 43 */       sgipMsg.initPropertiesByBytes(source);
/*    */     }
/* 45 */     return sgipMsg;
/*    */   }
/*    */ 
/*    */   public static SGIPMsg getSGIPMsg(long commandId) throws Exception
/*    */   {
/* 50 */     SGIPMsg sgipMsg = new SGIPMsg();
/* 51 */     SGIPMsgHead head = new SGIPMsgHead(Long.valueOf(commandId));
/* 52 */     sgipMsg.setHead(head);
/* 53 */     SGIPCommand command = getCommandByCommandId(commandId);
/* 54 */     sgipMsg.setCommand(command);
/* 55 */     return sgipMsg;
/*    */   }
/*    */ 
/*    */   public static SGIPCommand getCommandByCommandId(long commandId) throws Exception
/*    */   {
/* 60 */     SGIPCommand command = null;
/* 61 */     if (SGIPConstant.SGIP_BIND == commandId)
/*    */     {
/* 63 */       command = new Bind();
/* 64 */     } else if (SGIPConstant.SGIP_BIND_RESP == commandId)
/*    */     {
/* 66 */       command = new BindResp();
/* 67 */     } else if (SGIPConstant.SGIP_SUBMIT == commandId)
/*    */     {
/* 69 */       command = new Submit();
/* 70 */     } else if (SGIPConstant.SGIP_SUBMIT_RESP == commandId)
/*    */     {
/* 72 */       command = new SubmitResp();
/* 73 */     } else if (SGIPConstant.SGIP_DELIVER == commandId)
/*    */     {
/* 75 */       command = new Deliver();
/* 76 */     } else if (SGIPConstant.SGIP_DELIVER_RESP == commandId)
/*    */     {
/* 78 */       command = new DeliverResp();
/* 79 */     } else if (SGIPConstant.SGIP_REPORT == commandId)
/*    */     {
/* 81 */       command = new Report();
/* 82 */     } else if (SGIPConstant.SGIP_REPORT_RESP == commandId)
/*    */     {
/* 84 */       command = new ReportResp();
/* 85 */     } else if (SGIPConstant.SGIP_UNBIND == commandId)
/*    */     {
/* 87 */       command = new UnBind();
/* 88 */     } else if (SGIPConstant.SGIP_UNBIND_RESP == commandId)
/*    */     {
/* 90 */       command = new UnBindResp();
/*    */     }
/*    */     else {
/* 93 */       throw new Exception("command is not exist ; commandId:" + commandId);
/*    */     }
/* 95 */     return command;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.factory.SGIPFactory
 * JD-Core Version:    0.6.2
 */