package com.udemy.primitive_datatype_and_alternatives.big_decimal.big_decimal;

import java.math.BigDecimal;

public class BigDecimalMain {

    public static void main(String[] args) {

        System.out.println(34.56789876 + 34.2234);
        BigDecimal number1 = new BigDecimal("34.56789876");
        BigDecimal number2 = new BigDecimal("34.2234");
        BigDecimal number3 = number1.add(number2);
        System.out.println(number3);

        int i = 5;
        System.out.println(BigDecimal.valueOf(5));
        System.out.println(number3.add(BigDecimal.valueOf(5)));

        BigDecimal number4 = new BigDecimal(3454.456);
        System.out.println(number4);

    }
}
