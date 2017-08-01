package com.example.bridgePattern;

/**
 * 桥接模式：实现化抽象类
 *
 * @author pengdh
 * @date: 2017-07-30 23:32
 */
public abstract class Implementor {

  /**
   * 实现抽象部分需要的某些具体功能
   */
  public abstract void operationImpl();
}
