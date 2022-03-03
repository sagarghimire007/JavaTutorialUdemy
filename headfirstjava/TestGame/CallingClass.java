package com.headfirstjava.TestGame;

public class CallingClass {
    public static void main(String[] args) {
        ClassToBeCalled cl = new ClassToBeCalled("hello");

        System.out.println(cl.getName());
    }
}
