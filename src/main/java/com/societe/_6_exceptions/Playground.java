package com.societe._6_exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Playground {
  //ResponseStatusException(message, httpCode)
    public static void main(String... args) throws SQLException {
        Student student = new Student();
//        student.setAge(100);
        setAge(student, 100);

        System.out.println(student.getAge());
    }

    static void setAge(Student student, int age) throws SQLException {
//        Connection connection = null;

//        try (Connection connection = DriverManager.getConnection("")) {//try-with-resources

        try {
            student.setAge(age);
            System.out.println("exception throwm");
        } catch (IllegalStateException ex) { // exceptia este instanceof IllegalArgumentException
            System.out.println("Exception while setting student's age");
        } catch (ArithmeticException ex) {
            System.out.println("Math problem");
        }
//        catch (SQLException ex) {
//            ex.printStackTrace();
//        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        //in loc de finally folosim try-with-resources
        finally {
//            if (connection != null) {
//                connection.close();
//            }
            System.out.println("In finally ");
        }
    }
}