package com.example.mediatorPattern;

/**
 * 中介者模式：中介者抽象类
 *
 * @author pengdh
 * @date: 2017-08-13 2:46
 */
public abstract class Mediator {

  /**
   * 同事对象在自身发生改变的时候来通知中介者方法
   * 让中介者来负责与其它同事对象的交互
   *
   * @param messge 消息
   * @param colleague 同事对象
   */
  protected abstract void send(String messge, Colleague colleague);
}
