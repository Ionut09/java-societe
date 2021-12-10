package com.societe._7_collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String... args) {

        Set<Student> students = new HashSet<>(); //se bazeaza pe contractul dintre equals si hashcode

        students.add(new Student(1, "John", 23));
        students.add(new Student(2, "John", 23));
        students.add(new Student(3, "John", 23));
        students.add(new Student(3, "John", 23));

        System.out.println(students);

        students.forEach(student -> {
            System.out.println(student + ": " + student.hashCode());
        });


    }
}