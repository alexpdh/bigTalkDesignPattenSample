package com.example.flyweightPattern;

/**
 * 享元模式：非共享具体享元类
 *
 * @author pengdh
 * @date: 2017-08-13 17:15
 */
public class UnSharedConcreteFlyweiht extends Flyweight {

  @Override
  public void operation(int extrinsicstate) {
    System.out.println("非共享的具体 Flyweiht：" + extrinsicstate);
  }
}
