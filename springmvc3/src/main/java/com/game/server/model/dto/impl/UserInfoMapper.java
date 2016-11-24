package com.game.server.model.dto.impl;

import com.game.server.model.dto.UserInfo;
import com.game.server.model.dto.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface UserInfoMapper
{
  public abstract int countByExample(UserInfoExample paramUserInfoExample);

  public abstract int deleteByExample(UserInfoExample paramUserInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(UserInfo paramUserInfo);

  public abstract int insertSelective(UserInfo paramUserInfo);

  public abstract List<UserInfo> selectByExample(UserInfoExample paramUserInfoExample);

  public abstract UserInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") UserInfo paramUserInfo, @Param("example") UserInfoExample paramUserInfoExample);

  public abstract int updateByExample(@Param("record") UserInfo paramUserInfo, @Param("example") UserInfoExample paramUserInfoExample);

  public abstract int updateByPrimaryKeySelective(UserInfo paramUserInfo);

  public abstract int updateByPrimaryKey(UserInfo paramUserInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.UserInfoMapper
 * JD-Core Version:    0.6.2
 */