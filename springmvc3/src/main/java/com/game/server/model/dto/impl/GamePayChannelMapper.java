package com.game.server.model.dto.impl;

import com.game.server.model.dto.GamePayChannel;
import com.game.server.model.dto.GamePayChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GamePayChannelMapper
{
  public abstract int countByExample(GamePayChannelExample paramGamePayChannelExample);

  public abstract int deleteByExample(GamePayChannelExample paramGamePayChannelExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(GamePayChannel paramGamePayChannel);

  public abstract int insertSelective(GamePayChannel paramGamePayChannel);

  public abstract List<GamePayChannel> selectByExample(GamePayChannelExample paramGamePayChannelExample);

  public abstract GamePayChannel selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") GamePayChannel paramGamePayChannel, @Param("example") GamePayChannelExample paramGamePayChannelExample);

  public abstract int updateByExample(@Param("record") GamePayChannel paramGamePayChannel, @Param("example") GamePayChannelExample paramGamePayChannelExample);

  public abstract int updateByPrimaryKeySelective(GamePayChannel paramGamePayChannel);

  public abstract int updateByPrimaryKey(GamePayChannel paramGamePayChannel);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.GamePayChannelMapper
 * JD-Core Version:    0.6.2
 */