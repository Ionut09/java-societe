package com.societe._4_oop.interfaces;

public class DeskPhone implements Phone, Device { //implements functioneaza identic cu extends


    @Override
    public boolean changeBattery() {
        return false;
    }

    @Override
    public void powerOn() {
        System.out.println("Turn on phone");
    }


    @Override
    public void dial(String number) {
        System.out.println("Dialing " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answring phone");
    }
}
