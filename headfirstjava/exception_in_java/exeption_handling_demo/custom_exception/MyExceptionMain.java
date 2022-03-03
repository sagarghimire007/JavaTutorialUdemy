package com.headfirstjava.exception_in_java.exeption_handling_demo.custom_exception;


public class MyExceptionMain {
    public static void main(String[] args) {

        TestCustomException te = new TestCustomException();
        try {
            te.validate(13);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
