package com.highfi.sys.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStream {

    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

////        Tri séquentiel #
//        long t0 = System.nanoTime();
//
//        long count = values.stream().sorted().count();
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("sequential sort took: %d ms", millis));

//        Tri parallèle #
        long t2 = System.nanoTime();

        long count2 = values.parallelStream().sorted().count();
        System.out.println(count2);

        long t3 = System.nanoTime();

        long millis2 = TimeUnit.NANOSECONDS.toMillis(t3 - t2);
        System.out.println(String.format("parallel sort took: %d ms", millis2));
    }
}
