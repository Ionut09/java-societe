package com.societe._7_collections;

import com.societe._4_oop.inheritance.Animal;
import com.societe._4_oop.inheritance.Cat;
import com.societe._4_oop.inheritance.Dog;
import com.societe._4_oop.inheritance.Tiger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String... args) {
        //Creating lists
        List<CharSequence> languages = new LinkedList<>(); //<> e din Java 5
        languages.add("Java");
        languages.add("PHP");
//        langs.add(20);

        Object obj = languages.get(1);
        if (obj instanceof String) {
            String upperCaseJava = ((String) obj).toUpperCase();
            System.out.println("upperCaseObj = " + upperCaseJava);
        }

        int s = languages.get(1).length();
        System.out.println("s = " + s);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Doberman"));
        animals.add(new Tiger());
        animals.add(new Cat("Kitty", ""));

        Animal animal = animals.get(1);

        List<Integer> integers = List.of(1, 2, 3, 4);//util pt teste

        List<String> langs = new LinkedList<>(); //<> e din Java 5
        //CRUD: Create, Read, Update, Delete

        //CREATE
        langs.add("Java");
        langs.add("Javascript");
        langs.add("PHP");
        boolean add = langs.add("C++");

        langs.add(0, "SQL");

        //READ
        langs.get(1);//Java
        langs.contains("PHP"); //true
        langs.size(); //5
        langs.isEmpty(); //if size == 0
//      langs.clear();   // sterge tot ==> size va fi 0

        //UPDATE
        langs.set(0, "Python");

        //REMOVE
        String element = "C+";
        boolean removed = langs.remove(element);
        System.out.println("removed  " + element + " -> " + removed);

//        langs.remove(7);    --> java.lang.IndexOutOfBoundsException

        langs.removeIf((String language) -> {
            return language.length() > 6;
        });

//      Collections.sort(langs);
        langs.sort(null);

        System.out.println(langs);
    }
}
