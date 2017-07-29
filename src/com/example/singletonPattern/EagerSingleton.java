package com.example.singletonPattern;

/**
 * 单例模式：饿汉式
 *
 * @author pengdh
 * @date: 2017-07-30 1:58
 */
public class EagerSingleton {

  private static EagerSingleton instance = new EagerSingleton();

  /**
   * 私有构造器
   */
  private EagerSingleton() {
  }

  /**
   * 静态工厂方法，获取全局唯一实例
   */
  public static EagerSingleton getInstance() {
    return instance;
  }
}
