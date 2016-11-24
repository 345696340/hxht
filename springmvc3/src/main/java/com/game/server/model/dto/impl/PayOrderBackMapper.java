package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrderBack;
import com.game.server.model.dto.PayOrderBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderBackMapper
{
  public abstract int countByExample(PayOrderBackExample paramPayOrderBackExample);

  public abstract int deleteByExample(PayOrderBackExample paramPayOrderBackExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrderBack paramPayOrderBack);

  public abstract int insertSelective(PayOrderBack paramPayOrderBack);

  public abstract List<PayOrderBack> selectByExample(PayOrderBackExample paramPayOrderBackExample);

  public abstract PayOrderBack selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrderBack paramPayOrderBack, @Param("example") PayOrderBackExample paramPayOrderBackExample);

  public abstract int updateByExample(@Param("record") PayOrderBack paramPayOrderBack, @Param("example") PayOrderBackExample paramPayOrderBackExample);

  public abstract int updateByPrimaryKeySelective(PayOrderBack paramPayOrderBack);

  public abstract int updateByPrimaryKey(PayOrderBack paramPayOrderBack);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderBackMapper
 * JD-Core Version:    0.6.2
 */