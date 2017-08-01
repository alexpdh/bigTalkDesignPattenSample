package com.example.commandPattern;

/**
 * 命令模式：具体命令类
 * @author pengdh
 * @date: 2017-08-01 22:25
 */
public class ConcreteCommand implements Command {

  /**
   * 持有相应的接收者对象
   */
  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    //通常会转调接收者对象的相应方法，让接收者来真正执行功能
    receiver.action();
  }
}
