package com.example.bridge;

/**
 * 桥接模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-07-30 23:43
 */
public class BridgePatternTest {

  public static void main(String[] args) {
    Abstraction ab1 = new RefinedAbstraction(new ImplementorA());
    ab1.operation();
    Abstraction ab2 = new RefinedAbstraction(new ImplementorB());
    ab2.operation();
  }
}
