package com.societe._2_variables;

import java.io.File;

public class Operators {

    public static void main(String... args) {

        //format code

        double d = 12 + 23 * (323 - 32);

        int a = 0;
        a = a + 5; // <==> a+=5;

        if (a % 2 == 1) {
            System.out.println(a + " is odd.");
        }

        // 5 este retinuta si apoi incrementata
        if (a++ % 2 == 1) { //a++ post
            System.out.println(a + " is odd.");
        }

        //a==6
        System.out.println(a++); //6
        System.out.println(a);   //7

        System.out.println(++a); //8
        System.out.println(a);   //8

        //a=8
        System.out.println("++a > 8 -> " + (++a > 8));

        int divide = 5 / 2; //2
        System.out.println("5 / 2 -> " + 5 / 2); //2
        System.out.println("5 / (double)2 -> " + 5 / (double) 2); //2.5
        System.out.println("5 / 2 -> " + 5 / 2.0); //2.5

//        int i = 5 / 0; //java.lang.ArithmeticException

        //short circuiting ||, &&

        int b = 2;
        boolean express = (b < 3) || (b++ > 1);  //--> b<3 e true ==> b++ > 1 nu e evaluat
        System.out.println(express);
        System.out.println(b);

        Object myObject = null;

        if (myObject != null && myObject.equals(new File(""))) {
            //do something
            System.out.println("Is not printed");
        }

        int a1 = 4;
        int b1 = 5;
        String matchResult;

//        if (a1 > b1) {
//            matchResult = "A wins";
//        } else {
//            matchResult = "B wins";
//        }

        matchResult = (a1 > b1) ? "A wins" : "B wins";

//        (a1 > b1) ? System.out.println("jsknbjdbkj") : System.out.println("jsknbjdbkj");
        System.out.println(matchResult);
    }

    static String ternarMethod() {
        int a1 = 4;
        int b1 = 5;
        return (a1 > b1) ? "A wins" : "B wins";
    }
}
