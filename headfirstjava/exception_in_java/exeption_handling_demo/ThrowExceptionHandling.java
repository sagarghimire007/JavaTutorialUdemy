package com.headfirstjava.exception_in_java.exeption_handling_demo;

public class ThrowExceptionHandling {
    public static void main(String[] args) {
        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
