package com.highfi.sys.hackerrank;

public class DivisibleSumPair {


    static int divisibleSumPairs(int n, int k, int[] ar) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] arr = new int[]{1, 3, 2, 6, 1, 2};
        System.out.println(divisibleSumPairs(n, k, arr));
    }
}
