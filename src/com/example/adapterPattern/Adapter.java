package com.example.adapterPattern;

/**
 * 适配器模式：适配器类
 *
 * @author pengdh
 * @date: 2017-06-24 22:49
 */
public class Adapter implements Target {
  private Adaptee adaptee;

  @Override
  public void request() {
    adaptee = new Adaptee();
    adaptee.specificRequest();
  }
}
