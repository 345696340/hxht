/*     */ package com.game.server.biz;
/*     */ 
/*     */ import com.game.server.domain.Result;

/*     */ import com.game.server.model.dto.GameInfo;
/*     */ import com.game.server.model.dto.GameInfoExample;
/*     */ import com.game.server.model.dto.GamePayChannel;
/*     */ import com.game.server.model.dto.GameUser;
/*     */ import com.game.server.model.dto.GameUserExample;
/*     */
/*     */ import com.game.server.model.dto.GameUserPoint;
/*     */ import com.game.server.model.dto.PayOrder;
/*     */ import com.game.server.model.dto.UserInfo;
/*     */ import com.game.server.model.dto.UserInfoExample;
/*     */ import com.game.server.model.dto.UserInfoExample.Criteria;
/*     */ import com.game.server.model.dto.impl.GameInfoMapper;
/*     */ import com.game.server.model.dto.impl.GamePayChannelMapper;
/*     */ import com.game.server.model.dto.impl.GamePayMapper;
/*     */ import com.game.server.model.dto.impl.GameUserMapper;
/*     */ import com.game.server.model.dto.impl.GameUserPointMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderMapper;
/*     */ import com.game.server.model.dto.impl.UserInfoMapper;
/*     */ import com.game.server.util.MD5;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import org.apache.http.HttpEntity;
/*     */ import org.apache.http.HttpResponse;
/*     */ import org.apache.http.client.methods.HttpPost;
/*     */ import org.apache.http.entity.StringEntity;
/*     */ import org.apache.http.impl.client.DefaultHttpClient;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.util.StringUtils;
/*     */ 
/*     */ public class BizFacade
/*     */ {
/*     */   private PayOrderMapper myPayOrderMapper;
/*     */   private GameUserPointMapper myGameUserPointMapper;
/*     */   private GameUserMapper myGameUserMapper;
/*     */   private UserInfoMapper myUserInfoMapper;
/*     */   private GameInfoMapper myGameInfoMapper;
/*     */   private GamePayMapper myGamePayMapper;
/*     */   private GamePayChannelMapper myGamePayChannelMapper;
/*  33 */   private static final Logger logger = Logger.getLogger(BizFacade.class);
/*     */ 
/*  40 */   String appid = "18244";
/*  41 */   String appkey = "bGpfkvsQ53qEJLCgcIzpb";
/*     */ 
/*     */   public List<GameInfo> getGameList()
/*     */   {
/*  36 */     List gameInfos = this.myGameInfoMapper.selectByExample(new GameInfoExample());
/*  37 */     return gameInfos;
/*     */   }
/*     */ 
/*     */   public boolean egretPay(String orderId, String userId, Long money, String ext, String payUrl)
/*     */   {
/*  44 */     DefaultHttpClient client = new DefaultHttpClient();
/*  45 */     Long time = Long.valueOf(new Date().getTime());
/*  46 */     String url = payUrl + "?orderId=" + orderId + "&userId=" + userId + "&money=" + money + "&time=" + time + "&ext=" + ext;
/*  47 */     String sign = "ext=" + ext + "money=" + money + "orderId=" + orderId + "time=" + time + "userId=" + userId + this.appkey;
/*  48 */     logger.info("游戏计费通知接口返回   " + url);
/*  49 */     String md5Sign = MD5.GetMD5Code(sign);
/*  50 */     url = url + "&sign=" + md5Sign;
/*  51 */     logger.info("游戏计费通知接口请求地址    " + url);
/*  52 */     HttpPost post = new HttpPost(url);
/*  53 */     StringEntity s = null;
/*     */     try {
/*  55 */       s = new StringEntity(sign);
/*  56 */       s.setContentEncoding("UTF-8");
/*  57 */       s.setContentType("text/plain");
/*  58 */       post.setEntity(s);
/*     */ 
/*  60 */       HttpResponse response = client.execute(post);
/*  61 */       HttpEntity entity = response.getEntity();
/*  62 */       BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
/*     */ 
/*  64 */       String result = "";
/*  65 */       String line = null;
/*  66 */       while ((line = reader.readLine()) != null) {
/*  67 */         result = result + line;
/*     */       }
/*  69 */       logger.info("游戏计费通知接口返回   " + result);
/*     */     } catch (Exception e) {
/*  71 */       e.printStackTrace();
/*     */     }
/*  73 */     return true;
/*     */   }
/*     */ 
/*     */   public Result getPayChannel(String channelId) {
/*  77 */     logger.info("获取计费相关信息信息开始 channelId[" + channelId + "]");
/*  78 */     if (StringUtils.isEmpty(channelId)) {
/*  79 */       return new Result("999999", "参数错误");
/*     */     }
/*  81 */     Result result = null;
/*  82 */     GamePayChannel gamePayChannel = this.myGamePayChannelMapper.selectByPrimaryKey(new Long(channelId));
/*  83 */     if (gamePayChannel != null) {
/*  84 */       logger.info("获取计费相关信息信息成功 channelId[" + channelId + "]");
/*  85 */       result = new Result("000000", "成功");
/*  86 */       result.addMap("payChannel", gamePayChannel);
/*  87 */       return result;
/*     */     }
/*  89 */     logger.info("获取计费相关信息信息失败 channelId[" + channelId + "]");
/*  90 */     return new Result("999999", "失败!");
/*     */   }
/*     */ 
/*     */   public Result updateUserPortrait(String userid, String picPath, int sex)
/*     */   {
/*  95 */     logger.info("获取用户信息开始 userid[" + userid + "]");
/*  96 */     Result result = userInfo(userid);
/*  97 */     if (result.getCode().equals("000000")) {
/*  98 */       UserInfo userInfo = (UserInfo)result.getMap("userInfo");
/*  99 */       UserInfoExample example = new UserInfoExample();
/* 100 */       example.createCriteria().andUserIdEqualTo(userid);
/* 101 */       userInfo.setPortrait(picPath);
/* 102 */       userInfo.setSex(new Long(sex));
/*     */ 
/* 104 */       int count = this.myUserInfoMapper.updateByExample(userInfo, example);
/* 105 */       if (count > 0)
/* 106 */         return new Result("000000", "更新头像成功");
/*     */     } else {
/* 108 */       result = new Result("999999", "用户信息不存在!");
/* 109 */       return result;
/*     */     }
/* 111 */     return result;
/*     */   }
/*     */ 
/*     */   public Result userInfo(String userid) {
/* 115 */     logger.info("获取用户信息开始 userid[" + userid + "]");
/* 116 */     UserInfoExample userInfoExample = new UserInfoExample();
/* 117 */     userInfoExample.createCriteria().andUserIdEqualTo(userid);
/* 118 */     List list = this.myUserInfoMapper.selectByExample(userInfoExample);
/* 119 */     if ((list == null) || (list.size() <= 0)) {
/* 120 */       logger.info("用户还没注册，请注册!");
/* 121 */       UserInfo userInfo = new UserInfo();
/* 122 */       userInfo.setUserId(userid);
/* 123 */       userInfo.setCreateDate(new Date());
/* 124 */       userInfo.setLastLoginDate(new Date());
/* 125 */       this.myUserInfoMapper.insert(userInfo);
/* 126 */       Result result = new Result("000000", "成功");
/* 127 */       result.addMap("userInfo", userInfo);
/* 128 */       logger.info("获取用户信息结束 userid[" + userid + "]");
/* 129 */       return result;
/*     */     }
/* 131 */     Result result = new Result("000000", "成功");
/* 132 */     result.addMap("userInfo", list.get(0));
/* 133 */     logger.info("获取用户信息结束 userid[" + userid + "]");
/* 134 */     return result;
/*     */   }
/*     */ 
/*     */   public Result saveUserPoint(String userid, Long point, String gameId) throws Exception {
/* 138 */     logger.info("游戏端上报游戏积分开始 userid[" + userid + "] point [" + point + "] gameId [" + gameId + "]");
/* 139 */     GameUserExample example = new GameUserExample();
/* 140 */     GameUserExample.Criteria c = example.createCriteria();
/* 141 */     c.andUserIdEqualTo(userid);
/* 142 */     c.andGameIdEqualTo(gameId);
/* 143 */     List user = this.myGameUserMapper.selectByExample(example);
/* 144 */     GameUser userInfo = null;
/* 145 */     if ((user == null) || (user.size() == 0)) {
/* 146 */       userInfo = new GameUser();
/* 147 */       userInfo.setGameId(gameId);
/* 148 */       userInfo.setUserId(userid);
/* 149 */       userInfo.setCreatd(new Date());
/* 150 */       userInfo.setUserMaxPoint(point);
/* 151 */       this.myGameUserMapper.insert(userInfo);
/*     */     } else {
/* 153 */       userInfo = (GameUser)user.get(0);
/* 154 */       Long maxPoint = userInfo.getUserMaxPoint();
/* 155 */       if (point.longValue() > maxPoint.longValue()) {
/* 156 */         userInfo.setUserMaxPoint(point);
/*     */       }
/* 158 */       userInfo.setLastdate(new Date());
/* 159 */       this.myGameUserMapper.updateByPrimaryKey(userInfo);
/*     */     }
/* 161 */     GameUserPoint userPoint = new GameUserPoint();
/* 162 */     userPoint.setCreatd(new Date());
/* 163 */     userPoint.setUserId(userid);
/* 164 */     userPoint.setPoint(point);
/* 165 */     userPoint.setGameId(gameId);
/* 166 */     int count = this.myGameUserPointMapper.insert(userPoint);
/* 167 */     logger.info("游戏端上报游戏积分结束 userid[" + userid + "] point [" + point + "]");
/* 168 */     if (count > 0) {
/* 169 */       return new Result("000000", "成功!");
/*     */     }
/* 171 */     return new Result("999999", "失败!");
/*     */   }
/*     */ 
/*     */   public GameUser getGameUserByUid(Long uid)
/*     */   {
/* 176 */     GameUser gameUser = this.myGameUserMapper.selectByPrimaryKey(uid);
/* 177 */     if (gameUser != null)
/* 178 */       return gameUser;
/* 179 */     return null;
/*     */   }
/*     */ 
/*     */   public List<GameUser> getGameUser(String userid, String gameId) {
/* 183 */     GameUserExample example = new GameUserExample();
/* 184 */     GameUserExample.Criteria c = example.createCriteria();
/* 185 */     c.andUserIdEqualTo(userid);
/* 186 */     if (gameId != null)
/* 187 */       c.andGameIdEqualTo(gameId);
/* 188 */     List user = this.myGameUserMapper.selectByExample(example);
/* 189 */     return user;
/*     */   }
/*     */ 
/*     */   public UserInfo getUserInfoByUid(Long uid) {
/* 193 */     return this.myUserInfoMapper.selectByPrimaryKey(uid);
/*     */   }
/*     */ 
/*     */   public int insertPayOrder(PayOrder payOrder) {
/* 197 */     return this.myPayOrderMapper.insert(payOrder);
/*     */   }
/*     */ 
/*     */   public Result getRankGame(String gameId, String userId) {
/* 201 */     Result result = new Result("000000", "锟缴癸拷!");
/* 202 */     List list = getGameUser(userId, gameId);
/* 203 */     if (list == null)
/* 204 */       return new Result("999999", "锟斤拷锟斤拷锟斤拷锟斤拷!");
/* 205 */     GameUser thisGame = (GameUser)list.get(0);
/* 206 */     HashMap map = new HashMap();
/* 207 */     map.put("point", thisGame.getUserMaxPoint().toString());
/* 208 */     map.put("gameId", thisGame.getGameId());
/* 209 */     List rankList = null;
/* 210 */     List returnValue = Lists.newLinkedList();
/*     */ 
/* 252 */     result.setResult(returnValue);
/* 253 */     return result;
/*     */   }
/*     */ 
/*     */   public PayOrderMapper getMyPayOrderMapper() {
/* 257 */     return this.myPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderMapper(PayOrderMapper myPayOrderMapper) {
/* 261 */     this.myPayOrderMapper = myPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public GameUserPointMapper getMyGameUserPointMapper() {
/* 265 */     return this.myGameUserPointMapper;
/*     */   }
/*     */ 
/*     */   public void setMyGameUserPointMapper(GameUserPointMapper myGameUserPointMapper) {
/* 269 */     this.myGameUserPointMapper = myGameUserPointMapper;
/*     */   }
/*     */ 
/*     */   public void setMyGamePayMapper(GamePayMapper myGamePayMapper) {
/* 273 */     this.myGamePayMapper = myGamePayMapper;
/*     */   }
/*     */ 
/*     */   public void setMyGamePayChannelMapper(GamePayChannelMapper myGamePayChannelMapper) {
/* 277 */     this.myGamePayChannelMapper = myGamePayChannelMapper;
/*     */   }
/*     */ 
/*     */   public void setMyUserInfoMapper(UserInfoMapper myUserInfoMapper) {
/* 281 */     this.myUserInfoMapper = myUserInfoMapper;
/*     */   }
/*     */ 
/*     */   public void setMyGameUserMapper(GameUserMapper myGameUserMapper) {
/* 285 */     this.myGameUserMapper = myGameUserMapper;
/*     */   }
/*     */ 
/*     */   public UserInfoMapper getMyUserInfoMapper() {
/* 289 */     return this.myUserInfoMapper;
/*     */   }
/*     */ 
/*     */   public void setMyGameInfoMapper(GameInfoMapper myGameInfoMapper) {
/* 293 */     this.myGameInfoMapper = myGameInfoMapper;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.biz.BizFacade
 * JD-Core Version:    0.6.2
 */