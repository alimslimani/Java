package com.highfi.sys.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DayOfProgrammer {
    static String dayOfProgrammer(int year) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        int d = 243;
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                d = 244;
            }
        } else if (year >= 1919 && year <= 2700) {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                d = 244;
            }
        } else if (year == 1918) {
            d = 230;
        }
        int r = 256 - d;
        String date = r + "." + 9 + "." + year;
        return sdf.format(sdf.parse(date));
    }

    public static void main(String[] args) throws ParseException {
        int year = 2017;
        System.out.println(dayOfProgrammer(year));
    }
}
