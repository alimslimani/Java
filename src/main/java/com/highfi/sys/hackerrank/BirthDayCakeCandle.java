package com.highfi.sys.hackerrank;

public class BirthDayCakeCandle {
    static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        int nb = 0;
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] == max) {
                nb++;
            }
        }
        return nb;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(arr));
    }
}
