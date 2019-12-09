package com.highfi.sys.codingame;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargest {
    static int findLargest(int[] ints) {
        int res = 0;
        if (ints.length > 0) {
            res = Arrays.stream(ints).max().getAsInt();
        } else {
            res = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -28, 88, 200, 7 };
        int result = findLargest(numbers);
        System.out.println(result);

        List<Integer> list = Arrays.asList(5, 2, 3, 4, 1);

        System.out.println(list.get(1)); // 5
        System.out.println(list.get(2)); // 4
        System.out.println(list.get(3)); // 3
        System.out.println(list.get(4)); // 2
        System.out.println(list.get(list.size()-1)); // 2

    }
}
