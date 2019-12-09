package com.highfi.sys.codingame;

import java.util.Scanner;

public class ExecuteString {
    static String execute(String s) {
        if (s.contains("java Echo ")) {
            s = s.replace("java Echo ", "");
        }
        s = s.replace(" ", "\n");
        return s;
    }

    public static void main(String[] args) {
        System.out.println(execute("java Echo Hello you !"));
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(execute(input));
    }
}
