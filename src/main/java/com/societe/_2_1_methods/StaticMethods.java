package com.societe._2_1_methods;

import com.societe._2_variables.FlowStatements;

public class StaticMethods {

    public static void main(String... args) {
        FlowStatements.switchStatementAfterJava17();
        FlowStatements flowStatements = new FlowStatements();
        flowStatements.statements = "switch";

        System.out.println(Counter.count);
        Counter counter = new Counter();
        counter.printCount();
    }
}

class Counter {

    static int count;
    int countDeInstanta;  //de instanta
    public static final int MAX_COUNT = 1000; //este o contanta

    public Counter() {
        count++;
    }

    public void printCount() {
        FlowStatements.switchStatementAfterJava17();
        System.out.println(count);
    }
}
