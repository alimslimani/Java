package com.highfi.sys.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumUniqueSum {
    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here
        int res = 0;
        int val = 0;
        List<Integer> numbers = new ArrayList<>(arr.size());
        numbers.add(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            val = arr.get(i);
            while (numbers.contains(val)) {
                val++;
            }
            numbers.add(val);
        }
        System.out.println(numbers.toString());
        for (int i = 0; i < numbers.size(); i++) {
            res += numbers.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                Stream.of(3,1,2,2)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .mapToInt(Map.Entry::getKey)
                        .sum());
    }
}
