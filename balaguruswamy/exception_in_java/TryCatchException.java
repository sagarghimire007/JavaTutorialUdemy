package com.balaguruswamy.exception_in_java;

public class TryCatchException {
    public static void main(String[] args) {
        int a = 20, b = 0;
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero exception caught");
        }
        System.out.println("End of main method");
    }
}
