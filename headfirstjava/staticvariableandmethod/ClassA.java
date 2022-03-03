package com.headfirstjava.staticvariableandmethod;

public class ClassA {

    int count = 12;

    public static void printA() {
        System.out.println("This is to print class A");
    }

    public static void displayA() {

        ClassA a = new ClassA();
        printA();
        System.out.println("This is in class A");
    }

    public void go(final int count) {
        System.out.println(count);
    }
}


class ClassC {
    public static int count = 0;
    public int a;

    public ClassC(int a) {
        this.a = a;
        count++;
    }

    public static void display(int a) {
        System.out.println("a : " + a);
        System.out.println(count);
    }

    public void print() {
        display(a);
    }
}
