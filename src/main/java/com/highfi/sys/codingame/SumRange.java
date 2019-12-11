package com.highfi.sys.codingame;

import java.util.Arrays;

public class SumRange {

    public static void main(String[] args) {
        int[] ints = {1, 20, 3, 10, -2, 100};
        System.out.println("Result: " + sumRange(ints));
        System.out.println("Expected result: 130");
    }

    private static int sumRange(int[] ints) {
        int sum = 0;
        sum = Arrays.stream(ints).filter(value -> value >= 10 && value <= 100).sum();
        return sum;
    }
}
