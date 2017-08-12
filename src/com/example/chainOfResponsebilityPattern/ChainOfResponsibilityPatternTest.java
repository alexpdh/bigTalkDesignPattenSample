package com.example.chainOfResponsebilityPattern;

/**
 * 职责链模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-08-12 14:21
 */
public class ChainOfResponsibilityPatternTest {

  public static void main(String[] args) {
    Handler h1 = new ConcreteHandlerA();
    Handler h2 = new ConcreteHandlerB();
    // 持有一个对后继者的引用
    h1.setSuccessor(h2);

    int[] arrays = {1, 15, 3, 11};
    for (int request : arrays) {
      h1.handlerRequest(request);
    }
  }
}
