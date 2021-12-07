package com.societe._2_variables;

import java.util.Scanner;

public class Parsing {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

//        String a = scanner.next();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

//        String b = scanner.next();

//        int a1 = Integer.parseInt(a);
//        int a2 = Integer.parseInt(b);

        System.out.println("a+b = " + (a + b));



    }
}
