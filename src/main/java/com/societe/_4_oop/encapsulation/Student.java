package com.societe._4_oop.encapsulation;

public class Student { //extinde Object

    private String name;

    private byte grade;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(byte grade) {
        if (grade < 1 || grade > 10) {
            System.out.println("Grade should be between 1 and 10");
            return;
        }

        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public byte getGrade() {
        return grade;
    }
}
