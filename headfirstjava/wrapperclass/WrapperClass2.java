package com.headfirstjava.wrapperclass;

public class WrapperClass2 {
    Integer i;
    int j;

    public static void main(String[] args) {
        WrapperClass2 wp = new WrapperClass2();
        wp.go();
    }

    public void go(){
        i = j;
        System.out.println("i : " + i);
        System.out.println("j : " + j);
    }
}
