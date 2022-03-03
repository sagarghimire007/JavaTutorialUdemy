package com.balaguruswamy.package_example2.package1;

public class Square {
    private int length;
    private int breadth;

    public Square(int length , int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int areaCalculation(int a , int b) {
        return a * b;
    }

    public void display() {
        System.out.println("Square Class");
    }
}

