package com.game.server.model.dto.impl;

import com.game.server.model.dto.MobileInfo;
import com.game.server.model.dto.MobileInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface MobileInfoMapper
{
  public abstract int countByExample(MobileInfoExample paramMobileInfoExample);

  public abstract int deleteByExample(MobileInfoExample paramMobileInfoExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(MobileInfo paramMobileInfo);

  public abstract int insertSelective(MobileInfo paramMobileInfo);

  public abstract List<MobileInfo> selectByExample(MobileInfoExample paramMobileInfoExample);

  public abstract MobileInfo selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") MobileInfo paramMobileInfo, @Param("example") MobileInfoExample paramMobileInfoExample);

  public abstract int updateByExample(@Param("record") MobileInfo paramMobileInfo, @Param("example") MobileInfoExample paramMobileInfoExample);

  public abstract int updateByPrimaryKeySelective(MobileInfo paramMobileInfo);

  public abstract int updateByPrimaryKey(MobileInfo paramMobileInfo);
}

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.impl.MobileInfoMapper
 * JD-Core Version:    0.6.2
 */