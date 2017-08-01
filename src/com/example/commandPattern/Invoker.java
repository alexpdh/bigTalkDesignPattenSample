package com.example.commandPattern;

/**
 * 命令模式：请求者类
 *
 * @author pengdh
 * @date: 2017-08-01 22:27
 */
public class Invoker {

  /**
   * 命令对象
   */
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  /**
   * 行动方法
   */
  public void action() {
    command.execute();
  }
}
