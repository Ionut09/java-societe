package com.societe._5_strings;

public class StringImmutability {

    public static void main(String... args) {
        String s2 = "Hello World"; //thread-safe
        String s = s2.toUpperCase();
        System.out.println(s2);
        System.out.println(s);

        Class<StringImmutability> stringimmutabilityClass = StringImmutability.class;
        stringimmutabilityClass.getDeclaredFields();
        stringimmutabilityClass.getDeclaredMethods();
        stringimmutabilityClass.getDeclaredAnnotations();
    }
}
