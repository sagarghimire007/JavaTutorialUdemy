package com.headfirstjava.exception_in_java.exeption_handling_demo.custom_exception;

public class TestCustomException {

    public void validate(int age) throws MyException {
        if (age < 18) {
            throw new MyException("age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
