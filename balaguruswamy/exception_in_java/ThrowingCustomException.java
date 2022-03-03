package com.balaguruswamy.exception_in_java;

class MyException extends Exception {
    MyException(String exceptionMessage) {
        super(exceptionMessage);
    }
}

public class ThrowingCustomException {
    public static void main(String[] args) {

        int x = 5, y = 100;
        try {
            float z = (float) x / (float) y;
            if (z < 0.1) {
                throw new MyException("Number is too small");
            }
        } catch (MyException ex) {
            System.out.println("Caught Exception");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("I am always here.....");
        }
    }
}
