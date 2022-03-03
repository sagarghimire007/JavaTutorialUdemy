package com.headfirstjava.exception_in_java.exeption_handling_demo;

public class TryCatchExceptionHandling {
    public static void main(String[] args) {

//        int a = 10, b = 0;
//        try {
//            int c = a / b;
//            System.out.println("Exception Occured");
//        } catch (Exception e) {
//            System.out.println("Arithmetic Exception Occured");
//        }

        // nested try exception handling in java
        try {
            int a[] = new int[5];
            try {
                int b = 10 / 0;

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
                a[5] = 10;
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Array Index Out of Bound");
        }
    }
}
