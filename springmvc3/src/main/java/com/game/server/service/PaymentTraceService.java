package com.game.server.service;

import com.game.server.model.dto.PaymengtTraceInfo;
import com.game.server.model.dto.PaymengtTraceSmsInfo;
import java.util.Date;
import java.util.List;

public abstract interface PaymentTraceService
{
  public abstract String createOrder(PaymengtTraceInfo paramPaymengtTraceInfo);

  public abstract void createSmsTrace(PaymengtTraceSmsInfo paramPaymengtTraceSmsInfo);

  public abstract PaymengtTraceInfo getPaymengtTraceInfo(String paramString);

  public abstract List<PaymengtTraceInfo> listPaymentTraceInfo(String paramString, int paramInt1, Date paramDate1, Date paramDate2, int paramInt2);

  public abstract List<PaymengtTraceSmsInfo> getPaymengtTraceSmsInfo(PaymengtTraceInfo paramPaymengtTraceInfo);
}

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.PaymentTraceService
 * JD-Core Version:    0.6.2
 */