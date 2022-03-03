package com.balaguruswamy.package_example1.package1;

/*
so whenever a class member data and methods are public, it can be access in another package if it is imported
if the member or methods are protected, it is only accessible within a class or a subclass of another package
 */

public class Square {
    protected int length;
    protected int breadth;
//
//    public Square(int length , int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }

    public int areaCalculation(int a , int b) {
        return a * b;
    }

    public void display() {
        System.out.println("Square Class");
    }
}

