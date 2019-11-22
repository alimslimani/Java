package com.highfi.sys.java8;

import java.util.HashMap;
import java.util.Map;

public class MapNews {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(val));

        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println(map.get(3));             // val33

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));     // false

        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println(map.containsKey(23));    // true

        map.computeIfAbsent(3, num -> "bam");
        System.out.println(map.get(3));             // val33

        map.remove(3, "val3");
        map.get(3);             // val33
        System.out.println(map.get(3));
        map.remove(3, "val33");
        map.get(3);             // null
        System.out.println(map.get(3));
        map.getOrDefault(42, "not found");  // not found
    }
}
