package com.example.commandPattern;

/**
 * 命令模式：接收者类
 *
 * @author pengdh
 * @date: 2017-08-01 22:19
 */
public class Receiver {

  /**
   * 真正执行命令相应的操作
   */
  public void action() {
    System.out.println("执行请求操作！");
  }
}
