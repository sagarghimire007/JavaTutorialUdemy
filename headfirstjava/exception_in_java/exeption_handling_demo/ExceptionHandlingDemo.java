package com.headfirstjava.exception_in_java.exeption_handling_demo;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        try {
            int a = 20, b = 0;
            int c = a / b;
            System.out.println("Result is : " + c);
        } catch (Exception ex) {
            System.out.println("Number cannot be divide by zero");
        } finally {
            System.out.println("In the finally Block....");
        }
    }
}
