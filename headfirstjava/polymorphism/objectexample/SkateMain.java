package com.headfirstjava.polymorphism.objectexample;

public class SkateMain {
    public static void main(String[] args) {
        Snowboard ss = new Snowboard();
        Skate s = ss;
        ((Snowboard)s).display();


    }
}
