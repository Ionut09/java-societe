package com.societe._3_classes;

public class BankService {

    public static void main(String... args) {
        Account johnnysAccount = new Account(); //function()
        johnnysAccount.customerName = "Johnny";
        johnnysAccount.iban = "RO18RDIU983293829382";
        johnnysAccount.balance = 0;
        boolean b = johnnysAccount instanceof Account; //true

        johnnysAccount.deposit(150);
        johnnysAccount.withdraw(150);

        Account bobsAccount = new Account("Bob", "RO16RDIU987237283882");
//        Account bobsAccount = new Account();
//        bobsAccount.customerName = "Bob";
//        bobsAccount.iban = "RO16RDIU987237283882";
//        bobsAccount.balance = 0;

        johnnysAccount.deposit(1000);
        johnnysAccount.transfer(bobsAccount, 100);
    }
}
