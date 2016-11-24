package com.game.server.model.dto.impl;

import com.game.server.model.dto.PayOrderConfig3;
import com.game.server.model.dto.PayOrderConfig3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PayOrderConfig3Mapper
{
  public abstract int countByExample(PayOrderConfig3Example paramPayOrderConfig3Example);

  public abstract int deleteByExample(PayOrderConfig3Example paramPayOrderConfig3Example);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(PayOrderConfig3 paramPayOrderConfig3);

  public abstract int insertSelective(PayOrderConfig3 paramPayOrderConfig3);

  public abstract List<PayOrderConfig3> selectByExample(PayOrderConfig3Example paramPayOrderConfig3Example);

  public abstract PayOrderConfig3 selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") PayOrderConfig3 paramPayOrderConfig3, @Param("example") PayOrderConfig3Example paramPayOrderConfig3Example);

  public abstract int updateByExample(@Param("record") PayOrderConfig3 paramPayOrderConfig3, @Param("example") PayOrderConfig3Example paramPayOrderConfig3Example);

  public abstract int updateByPrimaryKeySelective(PayOrderConfig3 paramPayOrderConfig3);

  public abstract int updateByPrimaryKey(PayOrderConfig3 paramPayOrderConfig3);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.PayOrderConfig3Mapper
 * JD-Core Version:    0.6.2
 */