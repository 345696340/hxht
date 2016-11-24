package com.game.server.model.dto.impl;

import com.game.server.model.dto.PaymengtTraceInfo;
import com.game.server.model.dto.PaymengtTraceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PaymengtTraceInfoMapper
{
  public abstract int countByExample(PaymengtTraceInfoExample paramPaymengtTraceInfoExample);

  public abstract int deleteByExample(PaymengtTraceInfoExample paramPaymengtTraceInfoExample);

  public abstract int deleteByPrimaryKey(String paramString);

  public abstract int insert(PaymengtTraceInfo paramPaymengtTraceInfo);

  public abstract int insertSelective(PaymengtTraceInfo paramPaymengtTraceInfo);

  public abstract List<PaymengtTraceInfo> selectByExample(PaymengtTraceInfoExample paramPaymengtTraceInfoExample);

  public abstract List<PaymengtTraceInfo> selectByExampleByPage(PaymengtTraceInfoExample paramPaymengtTraceInfoExample);

  public abstract PaymengtTraceInfo selectByPrimaryKey(String paramString);

  public abstract int updateByExampleSelective(@Param("record") PaymengtTraceInfo paramPaymengtTraceInfo, @Param("example") PaymengtTraceInfoExample paramPaymengtTraceInfoExample);

  public abstract int updateByExample(@Param("record") PaymengtTraceInfo paramPaymengtTraceInfo, @Param("example") PaymengtTraceInfoExample paramPaymengtTraceInfoExample);

  public abstract int updateByPrimaryKeySelective(PaymengtTraceInfo paramPaymengtTraceInfo);

  public abstract int updateByPrimaryKey(PaymengtTraceInfo paramPaymengtTraceInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PaymengtTraceInfoMapper
 * JD-Core Version:    0.6.2
 */