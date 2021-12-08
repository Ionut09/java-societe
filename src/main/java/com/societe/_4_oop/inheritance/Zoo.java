package com.societe._4_oop.inheritance;

public class Zoo {

    public static void main(String... args) {
        Dog azor = new Dog("German sheppard");
        azor.eat();
        azor.bark();

        Cat kitty = new Cat("Kitty", "Siamez");
        System.out.print("Cat: ");
        kitty.eat();

        Tiger tiger = new Tiger();
        System.out.print("tiger: ");
        tiger.eat();

        Bat bat = new Bat();
        bat.eat(); //sucks blood
        bat.eat("leaves");
    }
}
