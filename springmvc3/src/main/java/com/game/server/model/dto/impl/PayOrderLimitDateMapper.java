package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrderLimitDate;
import com.game.server.model.dto.PayOrderLimitDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderLimitDateMapper
{
  public abstract int countByExample(PayOrderLimitDateExample paramPayOrderLimitDateExample);

  public abstract int deleteByExample(PayOrderLimitDateExample paramPayOrderLimitDateExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrderLimitDate paramPayOrderLimitDate);

  public abstract int insertSelective(PayOrderLimitDate paramPayOrderLimitDate);

  public abstract List<PayOrderLimitDate> selectByExample(PayOrderLimitDateExample paramPayOrderLimitDateExample);

  public abstract PayOrderLimitDate selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrderLimitDate paramPayOrderLimitDate, @Param("example") PayOrderLimitDateExample paramPayOrderLimitDateExample);

  public abstract int updateByExample(@Param("record") PayOrderLimitDate paramPayOrderLimitDate, @Param("example") PayOrderLimitDateExample paramPayOrderLimitDateExample);

  public abstract int updateByPrimaryKeySelective(PayOrderLimitDate paramPayOrderLimitDate);

  public abstract int updateByPrimaryKey(PayOrderLimitDate paramPayOrderLimitDate);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderLimitDateMapper
 * JD-Core Version:    0.6.2
 */