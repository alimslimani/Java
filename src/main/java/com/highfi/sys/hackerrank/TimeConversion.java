package com.highfi.sys.hackerrank;

public class TimeConversion {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length() - 2);
        String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());

        String newTimeINString = "";

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((0 <= hour && hour < 12) && period.equalsIgnoreCase("PM")) {
            newTimeINString = (12 + hour) + ":" + min + ":" + sec;

        } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = "00" + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = hour + ":" + min + ":" + sec;
        }
        return newTimeINString;
    }

    public static void main(String[] args) {
        String time = "07:05:45PM";
        String time2 = "12:05:45AM";
        System.out.println(timeConversion(time));
        System.out.println(timeConversion(time2));
    }
}
