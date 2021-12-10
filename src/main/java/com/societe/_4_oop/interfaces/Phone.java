package com.societe._4_oop.interfaces;

public interface Phone { //clase abstracte pure

//    String battery_type = "Lithium"; //constanta

    public static final String[] AGENDA = new String[]{"1234", "2344"}; //constanta

    void dial(String number);

    void answer();

    void powerOn();

    default boolean changeBattery() { //metoda de instanta
        System.out.println("Every phone needs his batery changed");
        return true;
    }
}
