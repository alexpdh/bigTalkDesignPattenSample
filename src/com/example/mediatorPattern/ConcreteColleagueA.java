package com.example.mediatorPattern;

/**
 * 中介者模式：具体同事类A
 *
 * @author pengdh
 * @date: 2017-08-13 2:52
 */
public class ConcreteColleagueA extends Colleague {

  public ConcreteColleagueA(Mediator mediator) {
    super(mediator);
  }

  /**
   * 发送消息
   *
   * @param messge
   */
  public void send(String messge) {
    mediator.send(messge,this);
  }

  /**
   * 获取消息
   *
   * @param message
   */
  public void getMessage(String message) {
    System.out.println("同事A得到消息：" + message);
  }

}
