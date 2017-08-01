package com.example.bridgePattern;

/**
 * 桥接模式：被提炼的抽象化类
 *
 * @author pengdh
 * @date: 2017-07-30 23:36
 */
public class RefinedAbstraction extends Abstraction {

  protected RefinedAbstraction(Implementor impl) {
    super(impl);
  }

  @Override
  public void operation() {
    impl.operationImpl();
  }
}
