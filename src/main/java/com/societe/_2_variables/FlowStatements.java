package com.societe._2_variables;

import java.time.Month;
import java.util.Scanner;

public class FlowStatements {

    public String statements;

    public static void main(String... args) {
//        forEach();
//        switchStatementAfterJava17();

        System.out.println(sum(23, 7));
        System.out.println(sum(23, 7, 10));
        System.out.println(sum(23, 7, 10, 5, 5));
        System.out.println(sum(new int[]{23, 7, 10, 5, 5}));
    }

    //Print zilele lunii
    static void switchStatementBeforeJava17(int sum, int... vars) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month: ");

        String monthString = scanner.next();
        Month month = Month.valueOf(monthString.toUpperCase());

        int numberOfDays = 0;
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                numberOfDays = 31;
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                numberOfDays = 30;
                break;
            case FEBRUARY:
                numberOfDays = 28;
                break;
        }

        System.out.println(month + " has " + numberOfDays + " days");
    }

    public static void switchStatementAfterJava17() {
        Scanner scanner = new Scanner(System.in);
        //Non-static field 'statements' cannot be referenced from a static context
//        statements = "switch";
        System.out.println("Enter month: ");

        String monthString = scanner.next();
        Month month = Month.valueOf(monthString.toUpperCase());

        int numberOfDays = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> 28;
        };

        System.out.println(month + " has " + numberOfDays + " days");
    }

    public static void forEach() {
        int[] ints = new int[]{32, 43, 33, 44, 65, 78, 17};
        int sum = 0;

        for (int tempInt : ints) {
            if (isPrime(tempInt)) {
                sum += tempInt;
                System.out.print(tempInt + "\n");
            }
        }
        System.out.print("\n\"sum\" = " + sum);
    }

    private static boolean isPrime(int tempInt) {
        for (int i = 2; i < Math.sqrt(tempInt); i++) {
            if (tempInt % i == 0) {
                return false;
            }
        }
        return true;
    }

//    static int sum(int a, int b) {
//        return a + b;
//    }

//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

    static int sum(int... varArgArray) {
        int sum = 0;
        for (int i : varArgArray) {
            sum += i;
        }
        return sum;
    }
}