package com.highfi.sys.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BudgetShopping {
    static int budgetShopping(int n, List<Integer> bundleQuantities, List<Integer> bundleCosts) {

        int[] temp = new int[n + 1];

        int len = bundleCosts.size();
        for (int i = 0; i <= n; i++)
            for (int j = 0; j < len; j++)
                if (bundleCosts.get(j) <= i)
                    temp[i] = Math.max(temp[i], temp[i - bundleCosts.get(j)] + bundleQuantities.get(j));

        return temp[n];
    }

    public static void main(String[] args) {

        List<Integer> quantities = Arrays.asList(20, 19);
        List<Integer> costs = Arrays.asList(24, 20);

        int i = budgetShopping(50, quantities, costs);
        System.out.println("Max shopping " + i);
    }
}