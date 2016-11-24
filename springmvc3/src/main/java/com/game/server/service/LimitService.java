package com.game.server.service;

import com.game.server.model.dto.MobileInfo;
import com.game.server.model.dto.PayOrderLimitDate;
import java.io.UnsupportedEncodingException;

public abstract interface LimitService
{
  public abstract void addMobile(String paramString1, String paramString2, Long paramLong);

  public abstract MobileInfo getMobileInfo(String paramString);

  public abstract boolean validateDateAmont(PayOrderLimitDate paramPayOrderLimitDate);

  public abstract boolean validateMonthAmont(PayOrderLimitDate paramPayOrderLimitDate);

  public abstract boolean validateEveUserCount(String paramString, int paramInt);

  public abstract boolean validate(String paramString1, String paramString2)
    throws UnsupportedEncodingException;
}

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.LimitService
 * JD-Core Version:    0.6.2
 */