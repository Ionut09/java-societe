package com.societe._2_variables;

public class Variables {

    public static void main(String... args) {

        int i = 5; //un literal simplu intreg, de ex. 5, este int  by default
        i = 40_928_932;
        System.out.println("i = " + i);

        byte b = 6;
        short s = 3;
        char c = 'a';

//        UTF-8 e un fel de dictionar care contine aceste valori
//        49 ->'1'
//        50 ->'2'
        //...
//        97 ->'a'
//        98 ->'b'
//        ...

        System.out.println(c + 0); //rezultatul e int

        c = 'a' + 1;
        System.out.println("c = " + c);

        c = '1';
        System.out.println((int) c);

        long l = 1234567273536741323L;  //1234567273536741323l

        float f = 2.3F; //2.3f
        double d = 2.5; //2.5D/d

        d = i;
        l = 12345;
        i = (int) l;
        i = (int) 1234567273536741323L; //overflow
        l = 2147483646 + 2L; //int
        System.out.println("l = " + l);
//      Integer.MIN_VALUE;

        printChars();

        boolean b1 = true;
        b1 = false;

        System.out.println("\n7/3.0 = "+7/3.0); //2.(3)
    }

    /*
     Afiseaza toate caracterele alfabetice de la A la Z, pe aceeasi linie
     */

    static void printChars() {
        char A = 'A';

        while (A <= 'Z') {
            System.out.print(A + ", ");
            A = (char) (A + 1);
        }

    }
}

//class AltaClasa {
//
//}
