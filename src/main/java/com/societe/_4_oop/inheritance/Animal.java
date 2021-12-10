package com.societe._4_oop.inheritance;

public abstract class Animal {

    private String species;

    private String name;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal() {}

    public void eat() throws RuntimeException {
        System.out.println("Animal eats");
    }

    public abstract void sleep(); //method fara corp
}