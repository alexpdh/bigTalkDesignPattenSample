package com.example.flyweightPattern;

/**
 * 享元模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-08-13 17:24
 */
public class FlyweightPatternTest {

  public static void main(String[] args) {
    int extrinsicstate = 22;

    FlyweihtFactory factory = new FlyweihtFactory();

    Flyweight f1 = factory.create("X");
    f1.operation(21);

    Flyweight f2 = factory.create("Y");
    f2.operation(20);

    Flyweight f3 = factory.create("X");
    f3.operation(19);

    boolean flag = false;
    if (f1 == f3) {
      flag = true;
    }
    System.out.println("内部状态是否可以共享：" + flag);

    Flyweight uf1 = new UnSharedConcreteFlyweiht();
    uf1.operation(18);

  }
}
