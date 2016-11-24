package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrderLimitCity;
import com.game.server.model.dto.PayOrderLimitCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderLimitCityMapper
{
  public abstract int countByExample(PayOrderLimitCityExample paramPayOrderLimitCityExample);

  public abstract int deleteByExample(PayOrderLimitCityExample paramPayOrderLimitCityExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrderLimitCity paramPayOrderLimitCity);

  public abstract int insertSelective(PayOrderLimitCity paramPayOrderLimitCity);

  public abstract List<PayOrderLimitCity> selectByExample(PayOrderLimitCityExample paramPayOrderLimitCityExample);

  public abstract PayOrderLimitCity selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrderLimitCity paramPayOrderLimitCity, @Param("example") PayOrderLimitCityExample paramPayOrderLimitCityExample);

  public abstract int updateByExample(@Param("record") PayOrderLimitCity paramPayOrderLimitCity, @Param("example") PayOrderLimitCityExample paramPayOrderLimitCityExample);

  public abstract int updateByPrimaryKeySelective(PayOrderLimitCity paramPayOrderLimitCity);

  public abstract int updateByPrimaryKey(PayOrderLimitCity paramPayOrderLimitCity);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderLimitCityMapper
 * JD-Core Version:    0.6.2
 */