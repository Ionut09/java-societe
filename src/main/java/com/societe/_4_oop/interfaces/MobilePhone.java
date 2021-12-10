package com.societe._4_oop.interfaces;

public class MobilePhone implements Phone, MobileDevice {

    //rezolvam ambiguitatea de a avea 2 metode cu acelasi nume si implementare
    @Override
    public boolean changeBattery() {
        return false;
    }

    public void powerOn() {
        System.out.println("Turn on mobile  phone");
    }

    @Override
    public void dial(String number) {
        System.out.println("Dialing " + number + " on my smart phone");
    }

    @Override
    public void answer() {
        System.out.println("Answring mobile phone");
    }
}
