package com.example.iteratorPattern;

/**
 * 迭代器模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-07-24 23:26
 */
public class IteratorPatternTest {

  public static void main(String[] args) {
    Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
    //创建聚合对象
    Aggregate agg = new ConcreteAggregate(objArray);
    //循环输出聚合对象中的值
    Iterator it = agg.createIterator();
    while (!it.isDone()) {
      System.out.println(it.currentItem());
      it.next();
    }
  }
}
