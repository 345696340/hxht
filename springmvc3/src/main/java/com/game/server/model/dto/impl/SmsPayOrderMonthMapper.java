package com.game.server.model.dto.impl;

import com.game.server.model.dto.SmsPayOrderMonth;
import com.game.server.model.dto.SmsPayOrderMonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SmsPayOrderMonthMapper
{
  public abstract int countByExample(SmsPayOrderMonthExample paramSmsPayOrderMonthExample);

  public abstract int deleteByExample(SmsPayOrderMonthExample paramSmsPayOrderMonthExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(SmsPayOrderMonth paramSmsPayOrderMonth);

  public abstract int insertSelective(SmsPayOrderMonth paramSmsPayOrderMonth);

  public abstract List<SmsPayOrderMonth> selectByExample(SmsPayOrderMonthExample paramSmsPayOrderMonthExample);

  public abstract List<SmsPayOrderMonth> selectByExampleByPage(SmsPayOrderMonthExample paramSmsPayOrderMonthExample);

  public abstract SmsPayOrderMonth selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") SmsPayOrderMonth paramSmsPayOrderMonth, @Param("example") SmsPayOrderMonthExample paramSmsPayOrderMonthExample);

  public abstract int updateByExample(@Param("record") SmsPayOrderMonth paramSmsPayOrderMonth, @Param("example") SmsPayOrderMonthExample paramSmsPayOrderMonthExample);

  public abstract int updateByPrimaryKeySelective(SmsPayOrderMonth paramSmsPayOrderMonth);

  public abstract int updateByPrimaryKey(SmsPayOrderMonth paramSmsPayOrderMonth);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.SmsPayOrderMonthMapper
 * JD-Core Version:    0.6.2
 */