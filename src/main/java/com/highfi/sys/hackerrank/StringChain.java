package com.highfi.sys.hackerrank;

import java.util.*;

public class StringChain {

    public static int longestChain(List<String> words) {
        // Write your code here
        int maxChainLength = 0;
        Map<String, Integer> longestChain = new HashMap<>();

        if (null == words || words.size() < 1) {
            return 0;
        }

        Set<String> stringChains = new HashSet<>();
        for (String x : words) {
            stringChains.add(x);
        }

        maxChainLength = getMaxChainLength(words, maxChainLength, longestChain, stringChains);
        return maxChainLength;
    }

    private static int getMaxChainLength(List<String> words, int maxChainLength, Map<String, Integer> longestChain, Set<String> stringChains) {
        for (String word : words) {
            if (maxChainLength > word.length()) {
                continue;
            }
            int currentChainLength = getCurrentChainLength(longestChain, stringChains, word);
            maxChainLength = Math.max(maxChainLength, currentChainLength);
        }
        return maxChainLength;
    }

    private static int getCurrentChainLength(Map<String, Integer> longestChain, Set<String> stringChains, String word) {
        int currentChainLength = findLengthOfChain(word, stringChains, longestChain) + 1;
        longestChain.put(word, currentChainLength);
        return currentChainLength;
    }

    static int findLengthOfChain(String word, Set<String> words, Map<String, Integer> wordToLongestChain) {
        int currentChainLength = 0;
        for (int i = 0; i < word.length(); i++) {
            String nextWord = word.substring(0, i) + word.substring(i + 1);
            if (words.contains(nextWord)) {
                if (wordToLongestChain.containsKey(nextWord)) {
                    currentChainLength = Math.max(currentChainLength, wordToLongestChain.get(nextWord));
                } else {
                    int nextWordChainLen = findLengthOfChain(nextWord, words, wordToLongestChain);
                    currentChainLength = Math.max(currentChainLength, nextWordChainLen + 1);
                }
            }
        }
        return currentChainLength;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "a",
                "b",
                "ba",
                "bca",
                "bda",
                "bdca"
        );

        System.out.println("Longest Chain Length : " + longestChain(words));
    }

}
