package com.balaguruswamy.exception_in_java;

public class TryCatchFinally {
    public static void main(String[] args) {

        int a = 10, b = 0;
//        try {
//            try {
//                int result = a / b;
//                System.out.println("result : " + result);
//            } finally {
//                System.out.println("Finally Block executed");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception Handled");
//        }
        try {
            int result = a / b;
            System.out.println("result : " + result);
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
