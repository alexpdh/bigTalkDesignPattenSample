package com.example.bridge;

/**
 * 桥接模式：抽象化类
 *
 * @author pengdh
 * @date: 2017-07-30 23:34
 */
public abstract class Abstraction {
  protected Implementor impl;

  protected Abstraction(Implementor impl) {
    this.impl = impl;
  }

  public abstract  void operation();

}
