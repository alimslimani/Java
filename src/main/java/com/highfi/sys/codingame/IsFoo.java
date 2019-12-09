package com.highfi.sys.codingame;

public class IsFoo {

    static boolean isFoo(String param) {
        if (param != null && param.equals("foo")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isFoo("foo"));
    }
}
