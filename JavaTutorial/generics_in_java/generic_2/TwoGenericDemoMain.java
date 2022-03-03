package com.JavaTutorial.generics_in_java.generic_2;

public class TwoGenericDemoMain {
    public static void main(String[] args) {

        TwoGeneric<Integer, String> iOb = new TwoGeneric<Integer, String>(1 , "Sagar");
        iOb.showType();

        int v = iOb.getOb1();
        String s = iOb.getOb2();

        System.out.println("Value of v : " + v);
        System.out.println("Value of a : " + s);
    }
}
