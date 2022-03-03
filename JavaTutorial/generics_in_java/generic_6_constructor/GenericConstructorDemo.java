package com.JavaTutorial.generics_in_java.generic_6_constructor;

class Summation {
    private int sum;

    <T extends Number> Summation(T arg) {
        sum = 0;
        for (int i = arg.intValue(); i >= 1; i--) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

public class GenericConstructorDemo {
    public static void main(String[] args) {
        Summation obj = new Summation(5);
        System.out.println("Summation of 5 is : " + obj.getSum());
    }
}
