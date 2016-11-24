package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrder;
import com.game.server.model.dto.PayOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderMapper
{
  public abstract int countByExample(PayOrderExample paramPayOrderExample);

  public abstract int deleteByExample(PayOrderExample paramPayOrderExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrder paramPayOrder);

  public abstract int insertSelective(PayOrder paramPayOrder);

  public abstract List<PayOrder> selectByExample(PayOrderExample paramPayOrderExample);

  public abstract PayOrder selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrder paramPayOrder, @Param("example") PayOrderExample paramPayOrderExample);

  public abstract int updateByExample(@Param("record") PayOrder paramPayOrder, @Param("example") PayOrderExample paramPayOrderExample);

  public abstract int updateByPrimaryKeySelective(PayOrder paramPayOrder);

  public abstract int updateByPrimaryKey(PayOrder paramPayOrder);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderMapper
 * JD-Core Version:    0.6.2
 */