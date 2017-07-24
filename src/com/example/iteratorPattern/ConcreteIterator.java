package com.example.iteratorPattern;

/**
 * 迭代器模式：具体迭代器类
 *
 * @author pengdh
 * @date: 2017-07-24 23:16
 */
public class ConcreteIterator extends Iterator {

  //持有被迭代的具体的聚合对象
  private ConcreteAggregate agg;
  //内部索引，记录当前迭代到的索引位置
  private int index = 0;
  //记录当前聚集对象的大小
  private int size = 0;

  public ConcreteIterator(ConcreteAggregate agg) {
    this.agg = agg;
    this.size = agg.size();
    index = 0;
  }

  @Override
  public void first() {
    index = 0;
  }

  @Override
  public void next() {
    if (index < size) {
      index++;
    }
  }

  @Override
  public boolean isDone() {
    return (index >= size);
  }

  @Override
  public Object currentItem() {
    return agg.getElement(index);
  }
}
