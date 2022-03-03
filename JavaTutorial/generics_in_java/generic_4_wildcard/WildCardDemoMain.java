package com.JavaTutorial.generics_in_java.generic_4_wildcard;

public class WildCardDemoMain {
    public static void main(String[] args) {

        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5L);

        if (iOb.absEqual(dOb)) {
            System.out.println("Absolute value are equal");
        } else {
            System.out.println("Absolute Value Differ");
        }

        if (iOb.absEqual(lOb)) {
            System.out.println("Absolute value are equal");
        } else {
            System.out.println("Absolute Value Differ");
        }
    }
}
