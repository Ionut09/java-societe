package com.societe._3_classes;

import java.math.BigDecimal;

public class BankService {

    public static void main(String... args) {
        Account johnnysAccount = new Account(); //un obiect/instanta din clasa Account
        johnnysAccount.customerName = "Johnny";
        johnnysAccount.iban = "RO18RDIU983293829382";
        johnnysAccount.balance = new BigDecimal(0);
//        johnnysAccount.balance = new BigDecimal(-5);
        boolean b = johnnysAccount instanceof Account; //true

        johnnysAccount.deposit(new BigDecimal("150"));
        johnnysAccount.withdraw(new BigDecimal(150));

        Account bobsAccount = new Account("Bob", "RO16RDIU987237283882");
//        Account bobsAccount = new Account();
//        bobsAccount.customerName = "Bob";
//        bobsAccount.iban = "RO16RDIU987237283882";
//        bobsAccount.balance = 0;

        BigDecimal depositAmount = new BigDecimal(1000);
        johnnysAccount.deposit(depositAmount);
        johnnysAccount.transfer(bobsAccount, BigDecimal.valueOf(100));
    }
}