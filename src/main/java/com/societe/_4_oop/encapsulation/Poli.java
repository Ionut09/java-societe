package com.societe._4_oop.encapsulation;

public class Poli {

    public static void main(String... args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setGrade((byte) -2);

        String name = anna.getName();
        System.out.println("name = " + name);
        System.out.println(anna);
    }
}
