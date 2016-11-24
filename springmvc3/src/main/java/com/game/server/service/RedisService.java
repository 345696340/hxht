/*     */ package com.game.server.service;
/*     */ 
/*     */ import java.util.Set;
/*     */ import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
/*     */ import redis.clients.jedis.Jedis;
/*     */ import redis.clients.jedis.JedisShardInfo;
/*     */ 
/*     */ public class RedisService
/*     */ {
/*     */   private static Jedis jedis;
/*     */   private JedisConnectionFactory jedisConnectionFactory;
/*     */ 
/*     */   public void del(byte[] key)
/*     */   {
/*  23 */     getJedis().del(new byte[][] { key });
/*     */   }
/*     */ 
/*     */   public void del(String key)
/*     */   {
/*  32 */     getJedis().del(new String[] { key });
/*     */   }
/*     */ 
/*     */   public void set(byte[] key, byte[] value, int liveTime)
/*     */   {
/*  43 */     set(key, value);
/*  44 */     getJedis().expire(key, liveTime);
/*     */   }
/*     */ 
/*     */   public void set(String key, String value, int liveTime)
/*     */   {
/*  55 */     set(key, value);
/*  56 */     getJedis().expire(key, liveTime);
/*     */   }
/*     */ 
/*     */   public void set(String key, String value)
/*     */   {
/*  67 */     getJedis().set(key, value);
/*     */   }
/*     */ 
/*     */   public void set(byte[] key, byte[] value)
/*     */   {
/*  77 */     getJedis().set(key, value);
/*     */   }
/*     */ 
/*     */   public String get(String key)
/*     */   {
/*  87 */     String value = getJedis().get(key);
/*  88 */     return value;
/*     */   }
/*     */ 
/*     */   public byte[] get(byte[] key)
/*     */   {
/*  98 */     return getJedis().get(key);
/*     */   }
/*     */ 
/*     */   public Set<String> keys(String pattern)
/*     */   {
/* 108 */     return getJedis().keys(pattern);
/*     */   }
/*     */ 
/*     */   public boolean exists(String key)
/*     */   {
/* 118 */     return getJedis().exists(key).booleanValue();
/*     */   }
/*     */ 
/*     */   public String flushDB()
/*     */   {
/* 127 */     return getJedis().flushDB();
/*     */   }
/*     */ 
/*     */   public long dbSize()
/*     */   {
/* 134 */     return getJedis().dbSize().longValue();
/*     */   }
/*     */ 
/*     */   public String ping()
/*     */   {
/* 143 */     return getJedis().ping();
/*     */   }
/*     */ 
/*     */   public Long decr(String key) {
/* 147 */     return getJedis().decr(key);
/*     */   }
/*     */ 
/*     */   public Long incr(String key, int liveTime) {
/* 151 */     Long i = getJedis().incr(key);
/* 152 */     getJedis().expire(key, liveTime);
/* 153 */     return i;
/*     */   }
/*     */ 
/*     */   public Long incr(String key) {
/* 157 */     Long i = getJedis().incr(key);
/* 158 */     return i;
/*     */   }
/*     */ 
/*     */   private Jedis getJedis()
/*     */   {
/* 167 */     if (jedis == null) {
/* 168 */       return this.jedisConnectionFactory.getShardInfo().createResource();
/*     */     }
/* 170 */     return jedis;
/*     */   }
/*     */ 
/*     */   public static void setJedis(Jedis jedis)
/*     */   {
/* 178 */     jedis = jedis;
/*     */   }
/*     */ 
/*     */   public JedisConnectionFactory getJedisConnectionFactory() {
/* 182 */     return this.jedisConnectionFactory;
/*     */   }
/*     */ 
/*     */   public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
/* 186 */     this.jedisConnectionFactory = jedisConnectionFactory;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.RedisService
 * JD-Core Version:    0.6.2
 */