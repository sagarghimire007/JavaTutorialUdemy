package com.balaguruswamy.exception_in_java.custom_exception;

public class MyException extends Exception {
    public MyException(String noMatchException) {
        super(noMatchException);
    }
}
