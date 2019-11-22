package com.highfi.sys.exception;

public class CatchExceptionExample {

    public static void main(String[] args) {
        int value;
        try {
            value = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("no comment");
            e.printStackTrace();
            return;
        }
        System.out.println(value);
    }
}
