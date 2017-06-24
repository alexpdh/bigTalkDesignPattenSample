package com.example.adapterPattern;

/**
 * 适配器模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-06-24 22:50
 */
public class AdapterTest {

  public static void main(String[] args) {
    Target target = new Adapter();
    target.request();
  }
}
