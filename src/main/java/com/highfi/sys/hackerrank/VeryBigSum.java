package com.highfi.sys.hackerrank;

public class VeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long m = 0;
        for (int i = 0; i < ar.length; i++) {
            m += ar[i];
        }
        return m;

    }


    public static void main(String[] args) {
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println(aVeryBigSum(ar));
    }
}
