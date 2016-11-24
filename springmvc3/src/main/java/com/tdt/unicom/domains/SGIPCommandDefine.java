/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class SGIPCommandDefine
/*    */ {
/* 10 */   public static final byte[] SGIP_BIND = { 0, 0, 0, 1 };
/* 11 */   public static final byte[] SGIP_BIND_RESP = { -128, 0, 0, 1 };
/* 12 */   public static final byte[] SGIP_UNBIND = { 0, 0, 0, 2 };
/* 13 */   public static final byte[] SGIP_UNBIND_RESP = { -128, 0, 0, 2 };
/* 14 */   public static final byte[] SGIP_SUBMIT = { 0, 0, 0, 3 };
/* 15 */   public static final byte[] SGIP_SUBMIT_RESP = { -128, 0, 0, 3 };
/* 16 */   public static final byte[] SGIP_DELIVER = { 0, 0, 0, 4 };
/* 17 */   public static final byte[] SGIP_DELIVER_RESP = { -128, 0, 0, 4 };
/* 18 */   public static final byte[] SGIP_REPORT = { 0, 0, 0, 5 };
/* 19 */   public static final byte[] SGIP_REPORT_RESP = { -128, 0, 0, 5 };
/* 20 */   public static final byte[] SGIP_ADDSP = { 0, 0, 0, 6 };
/* 21 */   public static final byte[] SGIP_ADDSP_RESP = { -128, 0, 0, 6 };
/* 22 */   public static final byte[] SGIP_MODIFYSP = { 0, 0, 0, 7 };
/* 23 */   public static final byte[] SGIP_MODIFYSP_RESP = { -128, 0, 0, 7 };
/* 24 */   public static final byte[] SGIP_DELETESP = { 0, 0, 0, 8 };
/* 25 */   public static final byte[] SGIP_DELETESP_RESP = { -128, 0, 0, 8 };
/* 26 */   public static final byte[] SGIP_QUERYROUTE = { 0, 0, 0, 9 };
/* 27 */   public static final byte[] SGIP_QUERYROUTE_RESP = { -128, 0, 0, 9 };
/* 28 */   public static final byte[] SGIP_ADDTELESEG = { 0, 0, 0, 10 };
/* 29 */   public static final byte[] SGIP_ADDTELESEG_RESP = { -128, 0, 0, 10 };
/* 30 */   public static final byte[] SGIP_MODIFYTELESEG = { 0, 0, 0, 11 };
/* 31 */   public static final byte[] SGIP_MODIFYTELESEG_RESP = { -128, 0, 0, 11 };
/* 32 */   public static final byte[] SGIP_DELETETELESEG = { 0, 0, 0, 12 };
/* 33 */   public static final byte[] SGIP_DELETETELESEG_RESP = { -128, 0, 0, 12 };
/* 34 */   public static final byte[] SGIP_ADDSMG = { 0, 0, 0, 13 };
/* 35 */   public static final byte[] SGIP_ADDSMG_RESP = { -128, 0, 0, 13 };
/* 36 */   public static final byte[] SGIP_MODIFYSMG = { 0, 0, 0, 14 };
/* 37 */   public static final byte[] SGIP_MODIFYSMG_RESP = { -128, 0, 0, 14 };
/* 38 */   public static final byte[] SGIP_DELETESMG = { 0, 0, 0, 15 };
/* 39 */   public static final byte[] SGIP_DELETESMG_RESP = { -128, 0, 0, 15 };
/* 40 */   public static final byte[] SGIP_CHECKUSER = { 0, 0, 0, 16 };
/* 41 */   public static final byte[] SGIP_CHECKUSER_RESP = { -128, 0, 0, 16 };
/* 42 */   public static final byte[] SGIP_USERRPT = { 0, 0, 0, 17 };
/* 43 */   public static final byte[] SGIP_USERRPT_RESP = { -128, 0, 0, 17 };
/* 44 */   public static final byte[] SGIP_TRACE = { 0, 0, 16, 0 };
/* 45 */   public static final byte[] SGIP_TRACE_RESP = { -128, 0, 16, 0 };
/*    */   public static final int LEN_SGIP_HEADER = 20;
/*    */   public static final int LEN_SGIP_BIND = 41;
/*    */   public static final int LEN_SGIP_BIND_RESP = 9;
/*    */   public static final int LEN_SGIP_UNBIND = 0;
/*    */   public static final int LEN_SGIP_UNBIND_RESP = 0;
/*    */   public static final int LEN_SGIP_SUBMIT = 123;
/*    */   public static final int LEN_SGIP_SUBMIT_RESP = 9;
/*    */   public static final int LEN_SGIP_DELIVER = 57;
/*    */   public static final int LEN_SGIP_DELIVER_RESP = 9;
/*    */   public static final int LEN_SGIP_REPORT = 44;
/*    */   public static final int LEN_SGIP_REPORT_RESP = 9;
/*    */   public static final int LEN_SGIP_USERRPT = 51;
/*    */   public static final int LEN_SGIP_USERRPT_RESP = 9;
/*    */   public static final int LEN_SGIP_TRACE = 41;
/*    */   public static final int LEN_SGIP_TRACE_RESP = 48;
/*    */ 
/*    */   public static final String getCommandName(byte[] commandId)
/*    */   {
/* 69 */     switch (SGIPCommand.Bytes4ToInt(commandId)) {
/*    */     case 1:
/* 71 */       return "Bind";
/*    */     case -2147483647:
/* 73 */       return "Bind_Resp";
/*    */     case 2:
/* 75 */       return "Unbind";
/*    */     case -2147483646:
/* 77 */       return "Unbind_Resp";
/*    */     case 3:
/* 79 */       return "Submit";
/*    */     case -2147483645:
/* 81 */       return "Submit_Resp";
/*    */     case 4:
/* 83 */       return "Deliver";
/*    */     case -2147483644:
/* 85 */       return "Deliver_Resp";
/*    */     case 5:
/* 87 */       return "Report";
/*    */     case -2147483643:
/* 89 */       return "Report_Resp";
/*    */     case 17:
/* 91 */       return "UserRpt";
/*    */     case -2147483631:
/* 93 */       return "UserRpt_Resp";
/*    */     }
/* 95 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.SGIPCommandDefine
 * JD-Core Version:    0.6.2
 */