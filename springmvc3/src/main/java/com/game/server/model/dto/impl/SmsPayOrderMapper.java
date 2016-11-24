package com.game.server.model.dto.impl;

import com.game.server.model.dto.SmsPayOrder;
import com.game.server.model.dto.SmsPayOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SmsPayOrderMapper
{
  public abstract int countByExample(SmsPayOrderExample paramSmsPayOrderExample);

  public abstract int deleteByExample(SmsPayOrderExample paramSmsPayOrderExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(SmsPayOrder paramSmsPayOrder);

  public abstract int insertSelective(SmsPayOrder paramSmsPayOrder);

  public abstract List<SmsPayOrder> selectByExample(SmsPayOrderExample paramSmsPayOrderExample);

  public abstract SmsPayOrder selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") SmsPayOrder paramSmsPayOrder, @Param("example") SmsPayOrderExample paramSmsPayOrderExample);

  public abstract int updateByExample(@Param("record") SmsPayOrder paramSmsPayOrder, @Param("example") SmsPayOrderExample paramSmsPayOrderExample);

  public abstract int updateByPrimaryKeySelective(SmsPayOrder paramSmsPayOrder);

  public abstract int updateByPrimaryKey(SmsPayOrder paramSmsPayOrder);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.SmsPayOrderMapper
 * JD-Core Version:    0.6.2
 */