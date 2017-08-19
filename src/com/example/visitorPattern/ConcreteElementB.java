package com.example.visitorPattern;

/**
 * 访问者模式：具体元素类B
 *
 * @author pengdh
 * @date: 2017-08-19 17:29
 */
public class ConcreteElementB extends Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementB(this);
  }

  /**
   * ConcreteElementB 特有方法
   */
  public void operationB() {

  }
}
