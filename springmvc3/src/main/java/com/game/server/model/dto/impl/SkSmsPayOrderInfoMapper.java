package com.game.server.model.dto.impl;

import com.game.server.model.dto.SkSmsPayOrderInfo;
import com.game.server.model.dto.SkSmsPayOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SkSmsPayOrderInfoMapper
{
  public abstract int countByExample(SkSmsPayOrderInfoExample paramSkSmsPayOrderInfoExample);

  public abstract int deleteByExample(SkSmsPayOrderInfoExample paramSkSmsPayOrderInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(SkSmsPayOrderInfo paramSkSmsPayOrderInfo);

  public abstract int insertSelective(SkSmsPayOrderInfo paramSkSmsPayOrderInfo);

  public abstract List<SkSmsPayOrderInfo> selectByExample(SkSmsPayOrderInfoExample paramSkSmsPayOrderInfoExample);

  public abstract SkSmsPayOrderInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") SkSmsPayOrderInfo paramSkSmsPayOrderInfo, @Param("example") SkSmsPayOrderInfoExample paramSkSmsPayOrderInfoExample);

  public abstract int updateByExample(@Param("record") SkSmsPayOrderInfo paramSkSmsPayOrderInfo, @Param("example") SkSmsPayOrderInfoExample paramSkSmsPayOrderInfoExample);

  public abstract int updateByPrimaryKeySelective(SkSmsPayOrderInfo paramSkSmsPayOrderInfo);

  public abstract int updateByPrimaryKey(SkSmsPayOrderInfo paramSkSmsPayOrderInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.SkSmsPayOrderInfoMapper
 * JD-Core Version:    0.6.2
 */