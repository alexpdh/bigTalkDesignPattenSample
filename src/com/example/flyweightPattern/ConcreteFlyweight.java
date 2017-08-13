package com.example.flyweightPattern;

/**
 * 享元模式：具体享元类
 *
 * @author pengdh
 * @date: 2017-08-13 17:12
 */
public class ConcreteFlyweight extends Flyweight {

  /**
   * 持有一个内部状态
   */
  private String intrinsicstate;

  /**
   * 构造函数，内部状态作为参数传入
   * @param intrinsicstate
   */
  public ConcreteFlyweight(String intrinsicstate) {
    this.intrinsicstate = intrinsicstate;
  }

  /**
   * 外部状态作为参数传入方法中，
   * 改变了方法的行为，但是并不改变对象的内部状态
   * @param extrinsicstate 外部状态
   */
  @Override
  public void operation(int extrinsicstate) {
    System.out.println("Intrinsic State：" + intrinsicstate);
    System.out.println("Extrinsic State：" + extrinsicstate);
  }
}
