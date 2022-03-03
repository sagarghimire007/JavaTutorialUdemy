package com.JavaTutorial.generics_in_java.generic_4_wildcard;

public class NumericFns<T extends Number> {
    T num;

    NumericFns(T n) {
        num = n;
    }

    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}
