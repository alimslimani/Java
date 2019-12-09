package com.highfi.sys.codingame;

import java.util.*;
import java.io.*;

class Temperature {

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        if (ts.length != 0 && ts.length < 10000) {
            int near = ts[0];
            for (int i = 0; i < ts.length; i++) {
                if (Math.abs(ts[i]) <= Math.abs(near)) {
                    if (ts[i] == -near) {
                        near = Math.abs(ts[i]);
                    } else {
                        near = ts[i];
                    }
                }
            }
            return near;
        } else {
            return 0;
        }
    }

    /* Ignore and do not change the code below */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }
}