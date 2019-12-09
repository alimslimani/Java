package com.highfi.sys.codingame;


public class PlanetImpl {

    public static void main(String[] args) {
        boolean ok = Planet.MERCURY == Planet.MERCURY;
        boolean ok2 = Planet.MERCURY == Planet.VENUS;
        boolean ok3 = Planet.MERCURY.equals(Planet.MERCURY);

        System.out.println(ok);//true
        System.out.println(ok2);//false
        System.out.println(ok3);//true
    }
}
