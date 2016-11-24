package com.game.server.service;

public abstract interface ConvertService<T, R>
{
  public abstract R fromTo(T paramT);

  public abstract T toFrom(R paramR);
}

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.ConvertService
 * JD-Core Version:    0.6.2
 */