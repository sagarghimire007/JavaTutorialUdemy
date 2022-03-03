package com.JavaTutorial.generics_in_java.generic_3_bounded_type;

public class GenericBoundedType {
    public static void main(String[] args) {

        GenericNumeric<Double> obj = new GenericNumeric<Double>(10.0);

        double v = obj.fraction();
        System.out.println("value of V : " + v);
    }
}
