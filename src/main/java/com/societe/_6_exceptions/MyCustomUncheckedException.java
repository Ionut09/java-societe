package com.societe._6_exceptions;

public class MyCustomUncheckedException extends RuntimeException{

    public MyCustomUncheckedException(String message) {
        super(message);
    }
}
