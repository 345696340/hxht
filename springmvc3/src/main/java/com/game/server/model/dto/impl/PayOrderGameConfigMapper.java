package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrderGameConfig;
import com.game.server.model.dto.PayOrderGameConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderGameConfigMapper
{
  public abstract int countByExample(PayOrderGameConfigExample paramPayOrderGameConfigExample);

  public abstract int deleteByExample(PayOrderGameConfigExample paramPayOrderGameConfigExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrderGameConfig paramPayOrderGameConfig);

  public abstract int insertSelective(PayOrderGameConfig paramPayOrderGameConfig);

  public abstract List<PayOrderGameConfig> selectByExample(PayOrderGameConfigExample paramPayOrderGameConfigExample);

  public abstract PayOrderGameConfig selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrderGameConfig paramPayOrderGameConfig, @Param("example") PayOrderGameConfigExample paramPayOrderGameConfigExample);

  public abstract int updateByExample(@Param("record") PayOrderGameConfig paramPayOrderGameConfig, @Param("example") PayOrderGameConfigExample paramPayOrderGameConfigExample);

  public abstract int updateByPrimaryKeySelective(PayOrderGameConfig paramPayOrderGameConfig);

  public abstract int updateByPrimaryKey(PayOrderGameConfig paramPayOrderGameConfig);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderGameConfigMapper
 * JD-Core Version:    0.6.2
 */