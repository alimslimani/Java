package com.highfi.sys.hackerrank;

import java.util.Arrays;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        float posi = 0;
        float nega = 0;
        float zero = 0;
        long pos = Arrays.stream(arr).filter(i -> i > 0).count();
        long neg = Arrays.stream(arr).filter(i -> i < 0).count();
        long zer = Arrays.stream(arr).filter(i -> i == 0).count();
        posi = (float) pos / arr.length;
        nega = (float) neg / arr.length;
        zero = (float) zer / arr.length;
        System.out.println(posi);
        System.out.println(nega);
        System.out.println(zero);
    }

    public static void main(String[] args) {
        int[] list = new int[]{-4, 3, -9, 0, 4, 1};

        plusMinus(list);
    }
}

