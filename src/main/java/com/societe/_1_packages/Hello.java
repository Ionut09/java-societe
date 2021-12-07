package com.societe._1_packages;

import com.societe._1_packages.test.PackageVisibleClass;

import java.util.List;

public class Hello {

    public static void main(String... args) {
        System.out.println("Hello Societe");
        Hello2.printMessage("Hi Java");
        //com.test.PackageVisibleClass --> fully qualified name of the class, unique in classpath

        var aClass = PackageVisibleClass.class;
        var aClass2 = PackageVisibleClass.class;
        var aClas3s = PackageVisibleClass.class;
//      var aClass2 = PackageVisibleClass2.class;

        List list;
    }
}
