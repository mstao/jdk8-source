package me.mingshan.jdk.test;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

  @Test
  public void test1() {
    Map<String, String> map = new HashMap<>();

    map.put("11", "11");
  }
}
