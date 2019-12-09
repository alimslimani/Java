package com.highfi.sys.codingame;

public class Factorial {

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
