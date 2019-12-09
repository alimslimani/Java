package com.highfi.sys.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNumber {

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        List<Integer> numbers = IntStream.rangeClosed(l, r).boxed().collect(Collectors.toList());
        numbers.forEach(i -> System.out.println(i));
        for (Integer i : numbers) {
            if (i % 2 != 0) {
                res.add(i);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int l = 2;
        int k =10;
        System.out.println(oddNumbers(l, k));
    }
}