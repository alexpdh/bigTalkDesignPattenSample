package com.example.bridgePattern;

/**
 * 桥接模式：具体实现 B 类
 *
 * @author pengdh
 * @date: 2017-07-30 23:42
 */
public class ImplementorB extends Implementor {

  @Override
  public void operationImpl() {
    System.out.println("具体实现 B 方法执行！");
  }
}
