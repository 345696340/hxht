package com.game.server.model.dto.impl;

import com.game.server.model.dto.SkPayOrderInfo;
import com.game.server.model.dto.SkPayOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SkPayOrderInfoMapper
{
  public abstract int countByExample(SkPayOrderInfoExample paramSkPayOrderInfoExample);

  public abstract int deleteByExample(SkPayOrderInfoExample paramSkPayOrderInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(SkPayOrderInfo paramSkPayOrderInfo);

  public abstract int insertSelective(SkPayOrderInfo paramSkPayOrderInfo);

  public abstract List<SkPayOrderInfo> selectByExample(SkPayOrderInfoExample paramSkPayOrderInfoExample);

  public abstract SkPayOrderInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") SkPayOrderInfo paramSkPayOrderInfo, @Param("example") SkPayOrderInfoExample paramSkPayOrderInfoExample);

  public abstract int updateByExample(@Param("record") SkPayOrderInfo paramSkPayOrderInfo, @Param("example") SkPayOrderInfoExample paramSkPayOrderInfoExample);

  public abstract int updateByPrimaryKeySelective(SkPayOrderInfo paramSkPayOrderInfo);

  public abstract int updateByPrimaryKey(SkPayOrderInfo paramSkPayOrderInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.SkPayOrderInfoMapper
 * JD-Core Version:    0.6.2
 */