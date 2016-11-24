package com.game.server.model.dto.impl;

import com.game.server.model.dto.GameUser;
import com.game.server.model.dto.GameUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GameUserMapper
{
  public abstract int countByExample(GameUserExample paramGameUserExample);

  public abstract int deleteByExample(GameUserExample paramGameUserExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(GameUser paramGameUser);

  public abstract int insertSelective(GameUser paramGameUser);

  public abstract List<GameUser> selectByExample(GameUserExample paramGameUserExample);

  public abstract GameUser selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") GameUser paramGameUser, @Param("example") GameUserExample paramGameUserExample);

  public abstract int updateByExample(@Param("record") GameUser paramGameUser, @Param("example") GameUserExample paramGameUserExample);

  public abstract int updateByPrimaryKeySelective(GameUser paramGameUser);

  public abstract int updateByPrimaryKey(GameUser paramGameUser);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.GameUserMapper
 * JD-Core Version:    0.6.2
 */