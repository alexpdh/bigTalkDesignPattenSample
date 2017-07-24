package com.example.iteratorPattern;

/**
 * 迭代器模式：聚集抽象类
 *
 * @author pengdh
 * @date: 2017-07-24 23:17
 */
public abstract class Aggregate {

  /**
   * 工厂方法，创建相应迭代器对象的
   */
  public abstract Iterator createIterator();
}
