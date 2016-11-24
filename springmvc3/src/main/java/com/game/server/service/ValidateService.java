package com.game.server.service;

public abstract interface ValidateService<T, R>
{
  public abstract boolean validate(T paramT, R paramR);
}

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.ValidateService
 * JD-Core Version:    0.6.2
 */