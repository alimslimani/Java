package com.highfi.sys.codingame;

import java.util.Arrays;

public class Exists {
    static boolean exists(int[] ints, int k) {

        return Arrays.stream(ints).anyMatch(i -> i == k);
    }

    public static void main(String[] args) {
        int[] ints = {-9, 14, 37, 102};
        System.out.println(exists(ints, 102));
        System.out.println(exists(ints, 36));
        int i = 5;
        int i2 = 2;
        int i3 = i / i2;
        System.out.println(i3);
    }

}
