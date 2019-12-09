package com.highfi.sys.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int p = 0;
        int s = 0;
        for (int i = 0; i <= arr.size() - 1; i++) {
            p += arr.get(i).get(i);
            s += arr.get(i).get(arr.size() - i - 1);
        }
        if (p > s) {
            return p - s;
        } else {
            return s - p;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> arr3 = new ArrayList<>();
        arr1.add(11);
        arr1.add(2);
        arr1.add(4);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr3.add(10);
        arr3.add(8);
        arr3.add(-12);

        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        System.out.println(diagonalDifference(arr));
    }
}
