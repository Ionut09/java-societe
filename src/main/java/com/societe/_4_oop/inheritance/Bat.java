package com.societe._4_oop.inheritance;

public class Bat extends Animal {

    @Override
    public void eat() { //overriding
        super.eat(); //pastram comportamentul existent de la Animal
        System.out.println("Bats suck blood");  //adaugam alta logica
    }

    public void eat(String food) { //overriding
        System.out.println("Bats don't eat regular " + food + " they suck blood");
    }
}