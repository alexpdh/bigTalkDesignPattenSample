package com.example.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：结构对象类
 *
 * @author pengdh
 * @date: 2017-08-19 20:05
 */
public class ObjectStructure {
  private List<Element> elements = new ArrayList<Element>();

  /**
   * 添加元素
   *
   * @param element
   */
  public void attach(Element element) {
    elements.add(element);
  }

  /**
   * 移除元素
   * @param element
   */
  public void deatch(Element element) {
    elements.remove(element);
  }

  /**
   * 执行方法
   *
   * @param visitor
   */
  public void accept(Visitor visitor) {
    for (Element e : elements) {
      e.accept(visitor);
    }
  }
}
