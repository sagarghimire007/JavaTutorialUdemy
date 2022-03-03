package com.headfirstjava.exception_in_java.exeption_handling_demo;

public class ThrowsException {
    public static void main(String[] args) {

        ThrowsException ex = new ThrowsException();
        try {
            ex.test(10 , 0);
        } catch (Exception e) {
            System.out.println("Division by zero exception occured");
            System.exit(1);
        } finally {
            System.out.println(" Handled all exception");
        }
    }

    public int test(int a , int b) throws Exception {
        int c;
        c = a / b;
        return c;
    }
}
