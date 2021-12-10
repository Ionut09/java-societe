package com.societe._4_oop.interfaces;

import com.societe._4_oop.inheritance.Animal;
import com.societe._4_oop.inheritance.Tiger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CallCenter {

    static Phone phone = new DeskPhone();

    static List list = new LinkedList();

    static Animal animal = new Tiger();

    public static void main(String... args) {

        animal.eat();
//      Device
        myMethod(phone);

//      Collection
        list.add("ksnasn");
        list.add("ksnasn");
        list.add("ksnasn");

        list.get(2);
        System.out.println("list = " + list);
    }

    private static void myMethod(Phone phone) {
        System.out.println(phone.getClass().getSimpleName() + " instanceof Device-> " +
                (phone instanceof Device));

//        if (phone instanceof Device device1) { // daca instanceof returneaza true --> e safe pt cast
        if (phone instanceof Device) {
            Device device1 = (Device) phone;
            device1.changeBattery();
            device1.powerOn();
        }

        phone.dial("098765432");
        phone.answer();
    }
}