package com.game.server.service;

import com.game.server.vo.request.PayOrderAiPayTradeRequest;
import com.game.server.vo.response.PayOrderAiPayTradeResponse;

public abstract interface PayOrderWo3Service
{
  public abstract PayOrderAiPayTradeResponse webPay(PayOrderAiPayTradeRequest paramPayOrderAiPayTradeRequest);
}

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.PayOrderWo3Service
 * JD-Core Version:    0.6.2
 */