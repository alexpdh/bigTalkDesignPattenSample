package com.example.flyweightPattern;

/**
 * 享元模式：抽象享元类
 *
 * @author pengdh
 * @date: 2017-08-13 17:09
 */
public abstract class Flyweight {

  /**
   * 外部状态作为参数传入方法中，
   * 改变了方法的行为，但是并不改变对象的内部状态
   * @param extrinsicstate 外部状态
   */
  public abstract void operation(int extrinsicstate);
}
