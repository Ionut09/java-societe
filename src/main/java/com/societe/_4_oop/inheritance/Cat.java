package com.societe._4_oop.inheritance;

public class Cat extends Animal {

    private String breed;

    public Cat(String name, String breed) {
        super(name, "Cat");
        this.breed = breed;
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }


}
