package com.javaEdureka;

public class HelloWorld {

    public void nonStaticTest() {
        System.out.println("Non Static Method");
    }

    public static void staticTest() {
        System.out.println("Satic Method");
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.nonStaticTest();
        staticTest();
        System.out.println("Hello World ");
    }
}
