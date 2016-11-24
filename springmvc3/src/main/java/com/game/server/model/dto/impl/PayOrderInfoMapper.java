package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrderInfo;
import com.game.server.model.dto.PayOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderInfoMapper
{
  public abstract int countByExample(PayOrderInfoExample paramPayOrderInfoExample);

  public abstract int deleteByExample(PayOrderInfoExample paramPayOrderInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrderInfo paramPayOrderInfo);

  public abstract int insertSelective(PayOrderInfo paramPayOrderInfo);

  public abstract List<PayOrderInfo> selectByExample(PayOrderInfoExample paramPayOrderInfoExample);

  public abstract PayOrderInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrderInfo paramPayOrderInfo, @Param("example") PayOrderInfoExample paramPayOrderInfoExample);

  public abstract int updateByExample(@Param("record") PayOrderInfo paramPayOrderInfo, @Param("example") PayOrderInfoExample paramPayOrderInfoExample);

  public abstract int updateByPrimaryKeySelective(PayOrderInfo paramPayOrderInfo);

  public abstract int updateByPrimaryKey(PayOrderInfo paramPayOrderInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderInfoMapper
 * JD-Core Version:    0.6.2
 */