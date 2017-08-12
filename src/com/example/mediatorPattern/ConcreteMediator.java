package com.example.mediatorPattern;

/**
 * 中介者模式：具体中介者类
 *
 * @author pengdh
 * @date: 2017-08-13 3:06
 */
public class ConcreteMediator extends Mediator {
  private ConcreteColleagueA colleagueA;
  private ConcreteColleagueB colleagueB;

  public void setColleagueA(ConcreteColleagueA colleagueA) {
    this.colleagueA = colleagueA;
  }

  public void setColleagueB(ConcreteColleagueB colleagueB) {
    this.colleagueB = colleagueB;
  }

  @Override
  protected void send(String messge, Colleague colleague) {
    if (colleague == colleagueA) {
      colleagueB.getMessage(messge);
    } else {
      colleagueA.getMessage(messge);
    }
  }
}
