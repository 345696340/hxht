/*     */ package com.tdt.unicom.util;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class SGIPCodeHelper
/*     */ {
/*  11 */   private static final Map<Integer, String> SGIP_Code_Map = new HashMap();
/*     */ 
/*     */   public static String getDescription(int errorCode)
/*     */   {
/* 108 */     return "未找到错误码" + errorCode + "对应的描述，请联系联通人员查询";
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  15 */     SGIP_Code_Map.put(Integer.valueOf(1), "非法登录，如登录名、口令出错、登录名与口令不符等");
/*  16 */     SGIP_Code_Map.put(Integer.valueOf(2), "重复登录，如在同一TCP/IP连接中连续两次以上请求登录");
/*  17 */     SGIP_Code_Map.put(Integer.valueOf(3), "连接过多，指单个节点要求同时建立的连接数过多");
/*  18 */     SGIP_Code_Map.put(Integer.valueOf(4), "登录类型错，指bind命令中的logintype字段出错");
/*  19 */     SGIP_Code_Map.put(Integer.valueOf(5), "参数格式错，指命令中参数值与参数类型不符或与协议规定的范围不符");
/*  20 */     SGIP_Code_Map.put(Integer.valueOf(6), "非法手机号码，协议中所有手机号码字段出现非86130号码或手机号码前未加“86”时都应报错");
/*  21 */     SGIP_Code_Map.put(Integer.valueOf(7), "消息ID错 ");
/*  22 */     SGIP_Code_Map.put(Integer.valueOf(8), "信息长度错 ");
/*  23 */     SGIP_Code_Map.put(Integer.valueOf(9), "非法序列号，包括序列号重复、序列号格式错误等  ");
/*  24 */     SGIP_Code_Map.put(Integer.valueOf(10), " 非法操作GNS （黑名单用户）  ");
/*  25 */     SGIP_Code_Map.put(Integer.valueOf(11), " 节点忙，指本节点存储队列满或其他原因，暂时不能提供服务的情况   ");
/*  26 */     SGIP_Code_Map.put(Integer.valueOf(21), "  目的地址不可达，指路由表存在路由且消息路由正确但被路由的节点暂时不能提供服务的情况    ");
/*  27 */     SGIP_Code_Map.put(Integer.valueOf(22), "  路由错，指路由表存在路由但消息路由出错的情况，如转错SMG等     ");
/*  28 */     SGIP_Code_Map.put(Integer.valueOf(23), "  路由不存在，指消息路由的节点在路由表中不存在     ");
/*  29 */     SGIP_Code_Map.put(Integer.valueOf(24), "  计费号码无效，鉴权不成功时反馈的错误信息      ");
/*  30 */     SGIP_Code_Map.put(Integer.valueOf(25), "  用户不能通信（如不在服务区、未开机等情况      ");
/*  31 */     SGIP_Code_Map.put(Integer.valueOf(26), "  手机内存不足      ");
/*  32 */     SGIP_Code_Map.put(Integer.valueOf(27), "  手机不支持短消息      ");
/*  33 */     SGIP_Code_Map.put(Integer.valueOf(28), "  手机接收短消息出现错误       ");
/*  34 */     SGIP_Code_Map.put(Integer.valueOf(29), "  不知道的用户       ");
/*  35 */     SGIP_Code_Map.put(Integer.valueOf(30), "  不提供此功能        ");
/*  36 */     SGIP_Code_Map.put(Integer.valueOf(31), "  非法设备        ");
/*  37 */     SGIP_Code_Map.put(Integer.valueOf(32), "   系统失败        ");
/*  38 */     SGIP_Code_Map.put(Integer.valueOf(33), "   短信中心队列满         ");
/*  39 */     SGIP_Code_Map.put(Integer.valueOf(34), "   智能网平台扣费失败         ");
/*  40 */     SGIP_Code_Map.put(Integer.valueOf(57), "   登录ip错误，sp连接网关的ip与sp申请资料中配置的ip不一样         ");
/*  41 */     SGIP_Code_Map.put(Integer.valueOf(93), "   SGIP协议SP节点编号错误，主要是节点编号中企业代码错误SGIP协议提交消息，网关应答错误码说明         ");
/*  42 */     SGIP_Code_Map.put(Integer.valueOf(64), "   消息发送的源地址错误         ");
/*  43 */     SGIP_Code_Map.put(Integer.valueOf(93), "   SGIP协议SP节点编号错误，提交消息中的企业代码错误         ");
/*     */ 
/*  45 */     SGIP_Code_Map.put(Integer.valueOf(101), "   SPNumber与SP企业代码匹配错         ");
/*  46 */     SGIP_Code_Map.put(Integer.valueOf(102), "   SPNumber未分配或不合法         ");
/*  47 */     SGIP_Code_Map.put(Integer.valueOf(103), "   产品代码不存在          ");
/*  48 */     SGIP_Code_Map.put(Integer.valueOf(104), "   业务资费类型填错          ");
/*  49 */     SGIP_Code_Map.put(Integer.valueOf(105), "   业务信息费率填写错误           ");
/*  50 */     SGIP_Code_Map.put(Integer.valueOf(106), "   用户未订制的SP非法下发，即没有订购关系，或临时点播关系            ");
/*  51 */     SGIP_Code_Map.put(Integer.valueOf(107), "   LinkID不匹配（MT与MO）           ");
/*  52 */     SGIP_Code_Map.put(Integer.valueOf(108), "   用户状态不正常,如停机用户鉴权不通过，无法下发           ");
/*  53 */     SGIP_Code_Map.put(Integer.valueOf(109), "   计费号码无效           ");
/*  54 */     SGIP_Code_Map.put(Integer.valueOf(110), "   黑名单用户鉴权不通过，包括未启用状态、预开户状态及销户状态，即除正常通话状态、停机状态以外的所有其他状态           ");
/*  55 */     SGIP_Code_Map.put(Integer.valueOf(111), "   MT消息SPMS鉴权超时           ");
/*  56 */     SGIP_Code_Map.put(Integer.valueOf(112), "   下发的MT超过最大条数，对点播类业务使用同一个LINKID下发的MT条数不能超过申报的数量           ");
/*  57 */     SGIP_Code_Map.put(Integer.valueOf(113), "   下发MT超过允许携带信息费的MT消息上限           ");
/*  58 */     SGIP_Code_Map.put(Integer.valueOf(114), "   USERCOUNT字段不为1，该字段必须填写1           ");
/*  59 */     SGIP_Code_Map.put(Integer.valueOf(115), "   SP不能将MOFLAG填为3，SP下发的MT包（除包月话单）中MOFLAG字段不能填3           ");
/*  60 */     SGIP_Code_Map.put(Integer.valueOf(116), "   将发NOTIUSER包，原流程需要终止。SPMS发通知信息给用户，MO不再上行发送给SP           ");
/*  61 */     SGIP_Code_Map.put(Integer.valueOf(117), "   WEB点播命令字不存在            ");
/*  62 */     SGIP_Code_Map.put(Integer.valueOf(118), "   包月话单被拦截           ");
/*  63 */     SGIP_Code_Map.put(Integer.valueOf(119), "   重复包月话单            ");
/*  64 */     SGIP_Code_Map.put(Integer.valueOf(120), "   订购业务失败            ");
/*  65 */     SGIP_Code_Map.put(Integer.valueOf(121), "   退订业务失败           ");
/*  66 */     SGIP_Code_Map.put(Integer.valueOf(123), "   重复订购            ");
/*  67 */     SGIP_Code_Map.put(Integer.valueOf(124), "   重复点播            ");
/*  68 */     SGIP_Code_Map.put(Integer.valueOf(162), "   超出用户消费限额             ");
/*  69 */     SGIP_Code_Map.put(Integer.valueOf(163), "   未发现用户归属地信息，用于按地市惩罚SP             ");
/*  70 */     SGIP_Code_Map.put(Integer.valueOf(170), "   用户二次确认回复提示语出错              ");
/*  71 */     SGIP_Code_Map.put(Integer.valueOf(171), "   订购关系不存在，退订时用              ");
/*  72 */     SGIP_Code_Map.put(Integer.valueOf(172), "   订购关系不存在，SP不能主动HELP              ");
/*  73 */     SGIP_Code_Map.put(Integer.valueOf(173), "   订购关系处于中间状态(如待生效)，业务不能用               ");
/*  74 */     SGIP_Code_Map.put(Integer.valueOf(175), "   QX分项退订之前没有查询              ");
/*  75 */     SGIP_Code_Map.put(Integer.valueOf(176), "   订购关系处于暂停状态              ");
/*  76 */     SGIP_Code_Map.put(Integer.valueOf(177), "   Sp下发的计费用户和VASP中定购关系的计费用户不一致，用于sp下包月话单。             ");
/*  77 */     SGIP_Code_Map.put(Integer.valueOf(179), "   Sp同步定购关系的产品代码和临时定购关系不一致              ");
/*  78 */     SGIP_Code_Map.put(Integer.valueOf(180), "   定购二次确认成功返回码； 0000，qxn，00000 发送到平台号码的返回码；0000，qxn，00000 发送到sp号码的返回码。 这些情况，网关不计上行通讯费。业务相关               ");
/*  79 */     SGIP_Code_Map.put(Integer.valueOf(181), "   超出业务发送时间段             ");
/*  80 */     SGIP_Code_Map.put(Integer.valueOf(182), "   超出业务当日下发次数              ");
/*  81 */     SGIP_Code_Map.put(Integer.valueOf(183), "   点播类业务不支持主动下行            ");
/*  82 */     SGIP_Code_Map.put(Integer.valueOf(185), "   不支持第三方订购              ");
/*  83 */     SGIP_Code_Map.put(Integer.valueOf(186), "   业务处于测试状态，非测试用户使用测试业务             ");
/*  84 */     SGIP_Code_Map.put(Integer.valueOf(187), "   业务处于异常状态             ");
/*  85 */     SGIP_Code_Map.put(Integer.valueOf(188), "   低信用度业务             ");
/*  86 */     SGIP_Code_Map.put(Integer.valueOf(190), "   用户点播的不是SP下行的业务，即SP点播下行业务代码与点播上行不一致SP相关             ");
/*  87 */     SGIP_Code_Map.put(Integer.valueOf(211), "   SP处于异常状态             ");
/*  88 */     SGIP_Code_Map.put(Integer.valueOf(212), "   SP的企业代码不存在             ");
/*  89 */     SGIP_Code_Map.put(Integer.valueOf(213), "   SP没有权限下发包月扣费消息             ");
/*  90 */     SGIP_Code_Map.put(Integer.valueOf(214), "   Sp没有被授权在该用户所在地市开展业务             ");
/*  91 */     SGIP_Code_Map.put(Integer.valueOf(215), "   Sp在该用户所在地市被暂停端口             ");
/*  92 */     SGIP_Code_Map.put(Integer.valueOf(216), "   Sp在该用户所在地市被暂停业务代收费             ");
/*  93 */     SGIP_Code_Map.put(Integer.valueOf(221), "   SP的IP地址不合法(仅用于HTTP接口反向操作)              ");
/*  94 */     SGIP_Code_Map.put(Integer.valueOf(222), "   SP的密钥无效(仅用于HTTP接口反向操作)               ");
/*  95 */     SGIP_Code_Map.put(Integer.valueOf(225), "   SP模拟mo定购未发现定购指令系统或数据配置错误                ");
/*  96 */     SGIP_Code_Map.put(Integer.valueOf(231), "   东软同步订购字段非法                 ");
/*  97 */     SGIP_Code_Map.put(Integer.valueOf(248), "   系统不支持该服务，没有该系统指令                 ");
/*  98 */     SGIP_Code_Map.put(Integer.valueOf(249), "   系统不支持帮助下发                ");
/*  99 */     SGIP_Code_Map.put(Integer.valueOf(251), "   （东软）捆绑业务不能退订                 ");
/* 100 */     SGIP_Code_Map.put(Integer.valueOf(254), "   系统错误                 ");
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.util.SGIPCodeHelper
 * JD-Core Version:    0.6.2
 */