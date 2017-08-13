package com.example.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式：享元工厂类
 *
 * @author pengdh
 * @date: 2017-08-13 17:17
 */
public class FlyweihtFactory {
  private Map<String, Flyweight> map = new HashMap<String, Flyweight>();

  public Flyweight create(String intrinsicstate) {
    if (!map.containsKey(intrinsicstate)) {
      map.put(intrinsicstate, new ConcreteFlyweight(intrinsicstate));
    }
    return map.get(intrinsicstate);
  }

}
