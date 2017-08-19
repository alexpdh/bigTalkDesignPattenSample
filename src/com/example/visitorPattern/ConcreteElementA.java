package com.example.visitorPattern;

/**
 * 访问者模式：具体元素类A
 *
 * @author pengdh
 * @date: 2017-08-19 17:28
 */
public class ConcreteElementA extends Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementA(this);
  }

  /**
   * ConcreteElementA 特有方法
   */
  public void operationA() {

  }
}
