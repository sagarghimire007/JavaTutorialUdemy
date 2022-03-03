package com.JavaTutorial.generics_in_java.generic_3_bounded_type;

public class GenericNumeric<T extends Number> {
    T num;

    GenericNumeric(T n) {
        num = n;
    }

    Double fraction() {
        return num.doubleValue();
    }
}
