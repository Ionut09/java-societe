package com.societe._4_oop.interfaces;

public interface Device {

    void powerOn();

    /**
     * Orice metoda dintr-o interfata este public by default
     * Cu exceptia celor private
     */
    default boolean changeBattery() { //metoda de instanta
        helperBatterChange();
        return true;
    }

    static void doMaintenance() { //metoda de instanta
        System.out.println("Do maintenance");
    }

    private void helperBatterChange() {
        System.out.println("Change battery of the device");
    }
}
