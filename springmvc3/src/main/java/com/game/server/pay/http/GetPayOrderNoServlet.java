/*    */ package com.game.server.pay.http;
/*    */ 
/*    */ import com.game.server.jms.listener.SmsListener;

/*    */ import com.game.server.model.dto.PayOrderGameConfig;
/*    */ import com.game.server.model.dto.PayOrderGameConfigExample;
/*    */ import com.game.server.model.dto.PayOrderGameConfigExample.Criteria;
/*    */ import com.game.server.model.dto.impl.PayOrderGameConfigMapper;
/*    */ import com.game.server.util.JsonUtil;
/*    */ import com.game.server.vo.Result;
/*    */ import com.tdt.unicom.sgip.svr.SPSender;
/*    */ import com.tdt.unicom.spsvr.MTReq;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class GetPayOrderNoServlet extends HttpServletBase
/*    */ {
/* 25 */   private static final Logger logger = Logger.getLogger("SK");
/*    */ 
/*    */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 28 */     MTReq req = new MTReq();
/* 29 */     req.setSpNumber("10655598511");
/* 30 */     req.setReportFlag("0");
/* 31 */     req.setCharNum(new String[] { "000000000000000000000" });
/* 32 */     req.setFeeValue("000000");
/* 33 */     req.setFeeType(1);
/* 34 */     ArrayList mobiles = new ArrayList();
/* 35 */     mobiles.add("18515325915");
/* 36 */     req.setPhoneList(mobiles);
/* 37 */     SmsListener.sender.addTask(req);
/* 38 */     String cpid = request.getParameter("cpid");
/* 39 */     Result result = new Result();
/* 40 */     if ((cpid == null) || (cpid.equals(""))) {
/* 41 */       logger.info("请求的CPID不能为空!");
/* 42 */       result.setRet_result("9999");
/* 43 */       wirte(response, result);
/* 44 */       return;
/*    */     }
/* 46 */     PayOrderGameConfigExample example = new PayOrderGameConfigExample();
/* 47 */     example.createCriteria().andCpidEqualTo(new Long(cpid));
/* 48 */     List list = this.myPayOrderGameConfigMapper.selectByExample(example);
/*    */ 
/* 50 */     if ((list == null) || (list.size() < 0)) {
/* 51 */       logger.info("cpid [" + cpid + "] cpid 错误，请联系管理员重新进行配置!");
/* 52 */       result.setRet_result("9999");
/* 53 */       wirte(response, result);
/* 54 */       return;
/*    */     }
/* 56 */     PayOrderGameConfig payOrderGameConfig = (PayOrderGameConfig)list.get(0);
/* 57 */     if (payOrderGameConfig.getType().intValue() != 3) {
/* 58 */       logger.info("cpid [" + cpid + "] cpid 类型错误，请联系管理员重新进行配置!");
/* 59 */       result.setRet_result("9999");
/* 60 */       wirte(response, result);
/* 61 */       return;
/*    */     }
/*    */   }
/*    */ 
/*    */   private void wirte(HttpServletResponse r, Result result)
/*    */   {
/*    */     try
/*    */     {
/* 69 */       r.getWriter().write(JsonUtil.bean2json(result));
/*    */     } catch (IOException e) {
/* 71 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.GetPayOrderNoServlet
 * JD-Core Version:    0.6.2
 */