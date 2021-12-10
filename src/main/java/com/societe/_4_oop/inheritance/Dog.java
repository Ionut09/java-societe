package com.societe._4_oop.inheritance;

public class Dog extends Animal {

    private String breed;

//    public Dog(){
//        super();
//    }

    public Dog(String breed) {
//        super();
        super("", "Dog");
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

}
