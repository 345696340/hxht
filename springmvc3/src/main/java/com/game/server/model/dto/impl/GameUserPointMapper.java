package com.game.server.model.dto.impl;

import com.game.server.model.dto.GameUserPoint;
import com.game.server.model.dto.GameUserPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GameUserPointMapper
{
  public abstract int countByExample(GameUserPointExample paramGameUserPointExample);

  public abstract int deleteByExample(GameUserPointExample paramGameUserPointExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(GameUserPoint paramGameUserPoint);

  public abstract int insertSelective(GameUserPoint paramGameUserPoint);

  public abstract List<GameUserPoint> selectByExample(GameUserPointExample paramGameUserPointExample);

  public abstract GameUserPoint selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") GameUserPoint paramGameUserPoint, @Param("example") GameUserPointExample paramGameUserPointExample);

  public abstract int updateByExample(@Param("record") GameUserPoint paramGameUserPoint, @Param("example") GameUserPointExample paramGameUserPointExample);

  public abstract int updateByPrimaryKeySelective(GameUserPoint paramGameUserPoint);

  public abstract int updateByPrimaryKey(GameUserPoint paramGameUserPoint);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.GameUserPointMapper
 * JD-Core Version:    0.6.2
 */