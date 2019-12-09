package com.highfi.sys.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareArray {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        res.add(1);
        res.set(0, 0);
        res.set(1, 0);

        for (int i = 0; i < 3; i++) {
            if (a.get(i) >= 1 && a.get(i) <= 100 && b.get(i) >= 1 && b.get(i) <= 100) {
                if (a.get(i) < b.get(i)) {
                    res.set(1, res.get(1) + 1);
                }
                if (a.get(i) > b.get(i)) {
                    res.set(0, res.get(0) + 1);

                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();
        alice.add(5);
        alice.add(6);
        alice.add(7);
        bob.add(3);
        bob.add(6);
        bob.add(10);
        System.out.println(compareTriplets(alice, bob));
    }
}
