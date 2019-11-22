package com.highfi.sys.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);

        int num =1;
        Converter<Integer,String> stringConverter = (from)-> String.valueOf(from+num);
        System.out.println(stringConverter.convert(2));
    }
}
