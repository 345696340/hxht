package com.game.server.model.dto.impl;

import com.game.server.model.dto.PaymengtTraceSmsInfo;
import com.game.server.model.dto.PaymengtTraceSmsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PaymengtTraceSmsInfoMapper
{
  public abstract int countByExample(PaymengtTraceSmsInfoExample paramPaymengtTraceSmsInfoExample);

  public abstract int deleteByExample(PaymengtTraceSmsInfoExample paramPaymengtTraceSmsInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo);

  public abstract int insertSelective(PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo);

  public abstract List<PaymengtTraceSmsInfo> selectByExample(PaymengtTraceSmsInfoExample paramPaymengtTraceSmsInfoExample);

  public abstract PaymengtTraceSmsInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo, @Param("example") PaymengtTraceSmsInfoExample paramPaymengtTraceSmsInfoExample);

  public abstract int updateByExample(@Param("record") PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo, @Param("example") PaymengtTraceSmsInfoExample paramPaymengtTraceSmsInfoExample);

  public abstract int updateByPrimaryKeySelective(PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo);

  public abstract int updateByPrimaryKey(PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PaymengtTraceSmsInfoMapper
 * JD-Core Version:    0.6.2
 */