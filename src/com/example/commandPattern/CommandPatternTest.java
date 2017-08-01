package com.example.commandPattern;

/**
 * 命令模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-08-01 22:29
 */
public class CommandPatternTest {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker(command);
    invoker.action();
  }
}
