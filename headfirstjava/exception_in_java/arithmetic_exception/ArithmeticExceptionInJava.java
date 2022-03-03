package com.headfirstjava.exception_in_java.arithmetic_exception;

public class ArithmeticExceptionInJava {
    public static void main(String[] args) {
        ArithmeticExceptionInJava obj = new ArithmeticExceptionInJava();
        try {
            obj.calculation();
        } catch (Exception ex) {
            System.out.println("Number is not divisible by zero");
        }
//        System.out.println(obj.calculation());
    }

    public int calculation() throws ArithmeticException {
        int a = 5;
        return (a / 4);
    }
}
