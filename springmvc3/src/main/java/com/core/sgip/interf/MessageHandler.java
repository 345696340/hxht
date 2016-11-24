package com.core.sgip.interf;

import com.core.sgip.body.command.Deliver;
import com.core.sgip.body.command.Report;
import com.core.sgip.body.command.Submit;
import com.core.sgip.head.SGIPMsgHead;

public abstract interface MessageHandler
{
  public abstract void handleDeliverMessage(SGIPMsgHead paramSGIPMsgHead, Deliver paramDeliver);

  public abstract void handleReportMessage(SGIPMsgHead paramSGIPMsgHead, Report paramReport);

  public abstract void handleSubmitMessage(SGIPMsgHead paramSGIPMsgHead, Submit paramSubmit);
}

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.interf.MessageHandler
 * JD-Core Version:    0.6.2
 */