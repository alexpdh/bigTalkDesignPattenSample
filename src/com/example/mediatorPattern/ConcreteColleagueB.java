package com.example.mediatorPattern;

/**
 * 中介者模式：具体同事类B
 *
 * @author pengdh
 * @date: 2017-08-13 3:04
 */
public class ConcreteColleagueB extends Colleague {

  public ConcreteColleagueB(Mediator mediator) {
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
    System.out.println("同事B得到消息：" + message);
  }
}
