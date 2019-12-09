package com.highfi.sys.codingame;

public class SolutionComputeMultiplesSum {

    static int sumAP(int n, int d) {
        n /= d;
        return (n) * (1 + n) * d / 2;
    }

    static int sumMultiples(int n) {
        n--;
        int res = 0;
        if (n > 0 && n < 1000) {
            res = sumAP(n, 3) + sumAP(n, 7) + sumAP(n, 5) - sumAP(n, 105);
        }
        return res;
    }


    public static void main(String args[]) {
        int n = 11;
        System.out.println(sumMultiples(n));
    }
}

