package com.game.server.model.dto.impl;

import com.game.server.model.dto.GameInfo;
import com.game.server.model.dto.GameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GameInfoMapper
{
  public abstract int countByExample(GameInfoExample paramGameInfoExample);

  public abstract int deleteByExample(GameInfoExample paramGameInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(GameInfo paramGameInfo);

  public abstract int insertSelective(GameInfo paramGameInfo);

  public abstract List<GameInfo> selectByExample(GameInfoExample paramGameInfoExample);

  public abstract GameInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") GameInfo paramGameInfo, @Param("example") GameInfoExample paramGameInfoExample);

  public abstract int updateByExample(@Param("record") GameInfo paramGameInfo, @Param("example") GameInfoExample paramGameInfoExample);

  public abstract int updateByPrimaryKeySelective(GameInfo paramGameInfo);

  public abstract int updateByPrimaryKey(GameInfo paramGameInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.GameInfoMapper
 * JD-Core Version:    0.6.2
 */