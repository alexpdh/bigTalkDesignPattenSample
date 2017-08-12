package com.example.mediatorPattern;

/**
 * 中介者模式：抽象同事类
 *
 * @author pengdh
 * @date: 2017-08-13 2:48
 */
public abstract class Colleague {

  // 持有一个中介者对象
  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }
}
