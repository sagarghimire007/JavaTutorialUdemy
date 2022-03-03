package com.javaEdureka;

public class Calculator {

    public Integer add(Integer a , Integer b) {
        Integer result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Integer a = 10, b = 20;
        Calculator cal = new Calculator();
        System.out.println("Result of addition is : " + cal.add(a , b));
    }
}
