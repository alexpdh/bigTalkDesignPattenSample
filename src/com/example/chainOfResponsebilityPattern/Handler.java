package com.example.chainOfResponsebilityPattern;

/**
 * 职责链模式：抽象处理者
 *
 * 定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。
 * 这个角色通常由一个Java抽象类或者Java接口实现。上图中Handler类的聚合关系给出了具体子类对下家的引用，
 * 抽象方法handleRequest()规范了子类处理请求的操作。
 *
 * @author pengdh
 * @date: 2017-08-12 14:05
 */
public abstract class Handler {

  protected Handler successor;

  /**
   * 持有对下家的引用
   */
  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  /**
   * 请求处理
   */
  protected abstract void handlerRequest(int request);
}
