package com.societe._6_exceptions;

public class Student {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { //throws MyCustomCheckedException {
        if (age < 5 || age > 90) {
            throw new MyCustomUncheckedException("Students should have age between 5 and 90");
        }
        this.age = age;
    }
}
