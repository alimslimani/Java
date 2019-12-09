package com.highfi.sys.hackerrank;

import java.util.Arrays;

public class SumArray {
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {

        int[] ar = new int[]{1, 2, 3, 4};
        System.out.println(simpleArraySum(ar));


    }
}

