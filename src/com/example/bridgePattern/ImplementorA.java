package com.example.bridgePattern;

/**
 * 桥接模式：具体实现 A 类
 *
 * @author pengdh
 * @date: 2017-07-30 23:41
 */
public class ImplementorA extends Implementor {

  @Override
  public void operationImpl() {
    System.out.println("具体实现 A 方法执行！");
  }
}
