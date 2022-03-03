package com.udemy.primitive_datatype_and_alternatives.big_decimal.integer_datatype;

import com.udemy.primitive_datatype_and_alternatives.big_decimal.integer_datatype.BiNumber;

public class BiNumberMain {
    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2 , 3);
        System.out.println("Adding of numbers : " + numbers.add());
        System.out.println("Multiplication of numbers  : " + numbers.multiply());

        numbers.doubleNumbers(); //Double both Numbers

        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());
    }
}
