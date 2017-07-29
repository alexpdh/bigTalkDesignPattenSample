package com.example.singletonPattern;

/**
 * 单例模式：使用枚举来实现单例模式
 *
 * @author pengdh
 * @date: 2017-07-30 2:58
 */
public enum SingletonEnum {
  /**
   * 定义一个枚举的元素，它就代表了 SingletonEnum 的一个实例。
   */
  uniqueInstance;

  /**
   * 单例可以有自己的操作
   */
  private void singletonOperation() {
    // 功能实现
  }
}
