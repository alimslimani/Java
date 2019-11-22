package com.highfi.sys.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Stream {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        Collections.addAll(stringCollection, "ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");

//       Filter
        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
//      Sorted
        stringCollection
                .stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
//      map
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(System.out::println);
//      count
        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println("Count " + startsWithB);

//      Match
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println("anyMatch :");      // true
        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println("allMatch :");      // false
        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println("noneMatch :");      // true
        System.out.println(noneStartsWithZ);      // true

//      Reduce
        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println); // "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
    }
}
