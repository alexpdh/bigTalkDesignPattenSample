package com.example.singletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式：双重检查加锁
 *
 * @author pengdh
 * @date: 2017-07-30 2:36
 */
public class DoubleCheckSingleton {

  private volatile static DoubleCheckSingleton instance = null;

  /**
   * 私有构造器
   */
  private DoubleCheckSingleton() {
  }

  /**
   * 静态工厂方法，获取全局唯一实例
   */
  public static DoubleCheckSingleton getInstance() {
    // 先检查实例是否存在，如果不存在才进入下面的同步块
    if (instance == null) {
      // 加锁，线程安全的创建实例
      Lock lock = new ReentrantLock();
      lock.lock();
      try {
        // 再次检查实例是否存在，如果不存在才真正的创建实例
        if (instance == null) {
          instance = new DoubleCheckSingleton();
        }
      } finally {
        lock.unlock();
      }
    }
    return instance;
  }
}
