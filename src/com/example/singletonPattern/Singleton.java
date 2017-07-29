package com.example.singletonPattern;

/**
 * 单例模式：Lazy initialization holder class模式
 *
 * @author pengdh
 * @date: 2017-07-30 2:46
 */
public class Singleton {

  /**
   * 私有构造器
   */
  private Singleton() {
  }

  /**
   * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
   * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
   */
  private static class SingletonHolder {

    /**
     * 静态初始化器，由JVM来保证线程安全
     */
    private static Singleton instance = new Singleton();
  }

  /**
   * 静态工厂方法，获取全局唯一实例
   */
  private static Singleton getInstance() {
    return SingletonHolder.instance;
  }
}
