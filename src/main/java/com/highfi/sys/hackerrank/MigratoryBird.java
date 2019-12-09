package com.highfi.sys.hackerrank;

import java.util.*;

public class MigratoryBird {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for (Integer i : arr) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            map.put(val.getKey(), val.getValue());
        }

        res = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);
        System.out.println(migratoryBirds(arr));
    }

}
