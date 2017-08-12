package com.example.chainOfResponsebilityPattern;

/**
 * 职责链模式：具体处理者类 B
 *
 * 处理它所负责的请求，由于持有对下家的引用，所以可以访问它的后继者，
 * 如果可以处理该请求，就处理之，否则将该请求转发给它的后继者。
 *
 * @author pengdh
 * @date: 2017-08-12 14:17
 */
public class ConcreteHandlerB extends Handler {

  @Override
  protected void handlerRequest(int request) {
    if (request >= 10 && request < 20) {
      System.out.println("处理 10-20 的请求");
    } else {
      successor.handlerRequest(request); // 转移到后继者类处理
    }
  }
}
