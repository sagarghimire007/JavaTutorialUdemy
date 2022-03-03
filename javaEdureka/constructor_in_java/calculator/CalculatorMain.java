package com.javaEdureka.constructor_in_java.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // default constructor
        Calculator normalCalculator = new Calculator(30); // parameterized constructor
        Calculator scientificCalculator = new Calculator(40);

        System.out.println("Dfefault Constructor Calculator : " + cal.insatanceVariable);
        System.out.println("Normal Calculator : " + normalCalculator.insatanceVariable);
        System.out.println("Scientific Calculator : " + scientificCalculator.insatanceVariable);
    }
}
