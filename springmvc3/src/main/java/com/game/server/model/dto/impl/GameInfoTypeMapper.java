package com.game.server.model.dto.impl;

import com.game.server.model.dto.GameInfoType;
import com.game.server.model.dto.GameInfoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GameInfoTypeMapper
{
  public abstract int countByExample(GameInfoTypeExample paramGameInfoTypeExample);

  public abstract int deleteByExample(GameInfoTypeExample paramGameInfoTypeExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(GameInfoType paramGameInfoType);

  public abstract int insertSelective(GameInfoType paramGameInfoType);

  public abstract List<GameInfoType> selectByExample(GameInfoTypeExample paramGameInfoTypeExample);

  public abstract GameInfoType selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") GameInfoType paramGameInfoType, @Param("example") GameInfoTypeExample paramGameInfoTypeExample);

  public abstract int updateByExample(@Param("record") GameInfoType paramGameInfoType, @Param("example") GameInfoTypeExample paramGameInfoTypeExample);

  public abstract int updateByPrimaryKeySelective(GameInfoType paramGameInfoType);

  public abstract int updateByPrimaryKey(GameInfoType paramGameInfoType);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.GameInfoTypeMapper
 * JD-Core Version:    0.6.2
 */