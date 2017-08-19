package com.example.visitorPattern;

/**
 * 访问者模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-08-19 20:04
 */
public class VisitorPatternTest {

  public static void main(String[] args) {
    // 创建一个结构对象
   ObjectStructure o = new ObjectStructure();
    // 给结构添加元素
   o.attach(new ConcreteElementA());
   o.attach(new ConcreteElementB());

   // 创建访问者
   Visitor v1 = new ConcreteVisitor1();
   Visitor v2 = new ConcreteVisitor2();

   o.accept(v1);
   o.accept(v2);
  }
}
