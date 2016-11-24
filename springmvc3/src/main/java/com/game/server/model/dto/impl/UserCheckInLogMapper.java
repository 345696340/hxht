package com.game.server.model.dto.impl;

import com.game.server.model.dto.UserCheckInLog;
import com.game.server.model.dto.UserCheckInLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface UserCheckInLogMapper
{
  public abstract int countByExample(UserCheckInLogExample paramUserCheckInLogExample);

  public abstract int deleteByExample(UserCheckInLogExample paramUserCheckInLogExample);

  public abstract int deleteByPrimaryKey(String paramString);

  public abstract int insert(UserCheckInLog paramUserCheckInLog);

  public abstract int insertSelective(UserCheckInLog paramUserCheckInLog);

  public abstract List<UserCheckInLog> selectByExample(UserCheckInLogExample paramUserCheckInLogExample);

  public abstract UserCheckInLog selectByPrimaryKey(String paramString);

  public abstract int updateByExampleSelective(@Param("record") UserCheckInLog paramUserCheckInLog, @Param("example") UserCheckInLogExample paramUserCheckInLogExample);

  public abstract int updateByExample(@Param("record") UserCheckInLog paramUserCheckInLog, @Param("example") UserCheckInLogExample paramUserCheckInLogExample);

  public abstract int updateByPrimaryKeySelective(UserCheckInLog paramUserCheckInLog);

  public abstract int updateByPrimaryKey(UserCheckInLog paramUserCheckInLog);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.UserCheckInLogMapper
 * JD-Core Version:    0.6.2
 */