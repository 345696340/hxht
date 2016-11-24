package com.game.server.model.dto.impl;

import com.game.server.model.dto.GamePay;
import com.game.server.model.dto.GamePayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GamePayMapper
{
  public abstract int countByExample(GamePayExample paramGamePayExample);

  public abstract int deleteByExample(GamePayExample paramGamePayExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(GamePay paramGamePay);

  public abstract int insertSelective(GamePay paramGamePay);

  public abstract List<GamePay> selectByExample(GamePayExample paramGamePayExample);

  public abstract GamePay selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") GamePay paramGamePay, @Param("example") GamePayExample paramGamePayExample);

  public abstract int updateByExample(@Param("record") GamePay paramGamePay, @Param("example") GamePayExample paramGamePayExample);

  public abstract int updateByPrimaryKeySelective(GamePay paramGamePay);

  public abstract int updateByPrimaryKey(GamePay paramGamePay);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.GamePayMapper
 * JD-Core Version:    0.6.2
 */