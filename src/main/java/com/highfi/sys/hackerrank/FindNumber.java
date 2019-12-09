package com.highfi.sys.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumber {
    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here

        String res = "";
        List<Integer> integers = arr.stream()
                .filter(p -> p == k)
                .collect(Collectors.toList());
        if (integers.size() == 0) {
            res = "NO";
        } else {
            res = "YES";
        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 1, 2, 3, 4, 5, 1);
        System.out.println(findNumber(integers, 5));
    }
}
