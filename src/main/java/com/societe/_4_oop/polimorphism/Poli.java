package com.societe._4_oop.polimorphism;

import com.societe._4_oop.inheritance.Animal;
import com.societe._4_oop.inheritance.Bat;
import com.societe._4_oop.inheritance.Dog;

public class Poli {

    public static void main(String... args) {
        Animal animal; //referinta (telecomanda)

        //polimorphismul in actiune
        animal = new Bat(); //obiectul --> Bat (televizorul)

//        animal.fly();

        animal = new Dog("maidanez");

        Object o = animal;

//      animal = new Bat();

        animal.eat();
    }
}
