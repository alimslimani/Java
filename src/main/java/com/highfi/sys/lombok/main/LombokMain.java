package com.highfi.sys.lombok.main;

import com.highfi.sys.lombok.model.Person;

import java.util.ArrayList;
import java.util.List;

public class LombokMain {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setFirstName("SLM");
        p1.setLastName("ALM");
        p1.setAddress("01 rue du paradis 75018");
        p1.setMail("slmalim@alm.sl");

        p2.setFirstName("BET");
        p2.setLastName("FET");
        p2.setAddress("01 rue de l'ange 75018");
        p2.setMail("betfet@alm.sl");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        persons.stream().forEach(person -> System.out.println(person));
    }
}
