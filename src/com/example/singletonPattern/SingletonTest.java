package com.example.singletonPattern;

/**
 * 单例模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-07-30 3:20
 */
public class SingletonTest {

  public static void main(String[] args) {
    EagerSingleton eager1 = EagerSingleton.getInstance();
    EagerSingleton eager2 = EagerSingleton.getInstance();
    LazySingleton lazy1 = LazySingleton.getInstance();
    LazySingleton lazy2 = LazySingleton.getInstance();
    DoubleCheckSingleton double1 = DoubleCheckSingleton.getInstance();
    DoubleCheckSingleton double2 = DoubleCheckSingleton.getInstance();
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if (eager1 == eager2) {
      System.out.println("\"饿汉式单例模式\" 的两个对象是相等的！");
    }
    if (lazy1 == lazy2) {
      System.out.println("\"懒汉式单例模式\" 的两个对象是相等的！");
    }
    if (double1 == double2) {
      System.out.println("\"双重检查加锁模式单例模式\" 的两个对象是相等的！");
    }
    if (s1 == s2) {
      System.out.println("\"Lazy initialization holder class模式单例模式\" 的两个对象是相等的！");
    }
  }
}
