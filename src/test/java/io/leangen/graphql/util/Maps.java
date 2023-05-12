package io.leangen.graphql.util;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Collections.unmodifiableMap;

public class Maps {
  public static <K, V> Map<K, V> of() {
    return unmodifiableMap(new LinkedHashMap<>());
  }

  public static <K, V> Map<K, V> of(K k1, V v1) {
    Map<K, V> map = new LinkedHashMap<>();
    map.put(k1, v1);
    return unmodifiableMap(map);
  }

  public static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2) {
    Map<K, V> map = new LinkedHashMap<>();
    map.put(k1, v1);
    map.put(k2, v2);
    return unmodifiableMap(map);
  }

  public static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    Map<K, V> map = new LinkedHashMap<>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    return unmodifiableMap(map);
  }
}
