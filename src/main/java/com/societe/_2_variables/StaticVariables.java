package com.societe._2_variables;

public class StaticVariables {

    public static void main(String... args) {
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(c3.count);
        System.out.println(c2.count);
        System.out.println(c1.count);
        System.out.println(Counter.count);  //toti membrii statici se reocmanda sa fie referentiati cu numele claseo

        System.out.println(c3.countDeInstanta);
        System.out.println(c2.countDeInstanta);
        System.out.println(c1.countDeInstanta);
//        Counter.MAX_COUNT = 17;
    }
}

class Counter {

    static int count;

    int countDeInstanta;  //de instanta

    public static final int MAX_COUNT = 1000; //este o contanta

    public Counter() {
        count++;
    }
}
