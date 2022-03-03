package com.JavaTutorial.generics_in_java.generic_1;

public class GenDemo {
    public static void main(String[] args) {

        // create a Gen reference for Integers
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value : " + v);

        Gen<String> strOb = new Gen<String>("Generic Test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value : " + str);
    }
}
