package com.societe._3_classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {

    /**
     * Variabilele la nivel de clasa (ne-statice) reprezinta insusirile obiectului
     * Doar variabilele la nivel de clasa ele au valori default, nu si cele locale
     * primitive avem default values: 0, 0.0, false
     */
    String customerName;// "";

    String iban;// "RO11000000000000"; //null default

    BigDecimal balance; //BigDecimal este immutabil

    //constructorul default (e public), care garanteaza ca orice clasa este instatiabila
    public Account() {
        this("", "RO11000000000000"); //tb sa fie primul statement din constructor
    }

    public Account(String customerName, String iban) {
        this.customerName = customerName;
        this.iban = iban;
        this.balance = BigDecimal.ZERO; //new BigDecimal(0)
    }

    public void deposit(BigDecimal amount) {
        if (isLessThanZero(amount)) {
            System.out.println("Negative amount not allowed");
            return;
        }
        balance = balance.add(amount); //alege scala cea mai mare
        balance = balance.setScale(2, RoundingMode.HALF_UP);//2.666666 -> 2.67

        System.out.println("Amount " + amount + " deposited");
        System.out.println("New balance is: " + balance);
    }

    private boolean isLessThanZero(BigDecimal amount) {
        BigDecimal zero = new BigDecimal(0);
        return amount.compareTo(zero) < 0;
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
//            balance -= amount;
            balance = balance.subtract(amount);
            System.out.println("Amount " + amount + " withdrawn");
            System.out.println("New balance is: " + balance);
            return;
        }
//        throw new IllegalArgumentException("Not enough balance");
        System.out.println("not enough balance");
    }

    public void transfer(Account other, BigDecimal amount) {
//        double anotherAmount;
        if (balance.compareTo(amount) >= 0) {
            other.balance = other.balance.add(amount);
            balance = balance.subtract(amount);
            System.out.println("Amount " + amount + " transfered to : " + other.customerName);
            return;
        }
        System.out.println("not enough balance");
    }

    public void transferDelegating(Account other, BigDecimal amount) {
        this.withdraw(amount);
        other.deposit(amount);
    }
}
