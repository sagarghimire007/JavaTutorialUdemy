package com.udemy.referencevariable;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        int b = 10;
        a = b;
        System.out.println(a);
        modify(a);
        System.out.println(a);
    }

    public static void modify(Integer a){
        a = a + 1;
    }
}
