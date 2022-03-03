package com.udemy.primitive_datatype_and_alternatives.big_decimal.big_decimal;

import java.math.BigDecimal;

public class SimpleInterestCalculatorMain {
    public static void main(String[] args) {

        SimpleInterestCalculator calculator = new SimpleInterestCalculator("5000.00", "9.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println("Total Amount : " + totalValue);
    }
}
