package com.highfi.sys.java8;

public class StringReverser {

    public String reverser(String text) {
        int j = text.length();
        char[] result = new char[j];
        for (int i = 0; i < text.length(); i++) {
            result[--j] = text.charAt(i);
        }
        return new String(result);
    }
}
