package com.societe._3_classes;

public class Account {

    String customerName;// "";

    String iban;// "RO11000000000000"; //null default

    double balance; //primitive avem default values: 0, 0.0, false

    //constructorul default (e public), care garanteaza ca orice clasa este instatiabila
    public Account() {
        this("", "RO11000000000000"); //tb sa fie primul statement din constructor
    }

    public Account(String customerName, String iban) {
        this.customerName = customerName;
        this.iban = iban;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Negative amount not allowed");
            return;
        }
        balance += amount;
        System.out.println("Amount " + amount + " deposited");
        System.out.println("New balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn");
            System.out.println("New balance is: " + balance);
            return;
        }
//        throw new IllegalArgumentException("Not enough balance");
        System.out.println("not enough balance");
    }

    public void transfer(Account other, double amount) {
        if (balance >= amount) {
            other.balance += amount;
            balance -= amount;
            System.out.println("Amount " + amount + " transfered to : " + other.customerName);
            return;
        }
        System.out.println("not enough balance");
    }

    public void transferDelegating(Account other, double amount) {
        this.withdraw(amount);
        other.deposit(amount);
    }
}
