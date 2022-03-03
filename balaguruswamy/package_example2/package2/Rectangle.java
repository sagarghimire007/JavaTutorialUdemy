package com.balaguruswamy.package_example2.package2;

import com.balaguruswamy.package_example2.package1.Square;

// extending super class using a package and calculating the area
public class Rectangle extends Square {

    public Rectangle(int length , int breadth) {
        super(length , breadth);
    }

    public static void main(String[] args) {
        Square s = new Square(10 , 2);
        System.out.println("Square area : " + s.areaCalculation(10 , 2));

        Rectangle r = new Rectangle(10 , 3);
        System.out.println("Area Calculation : " + r.areaCalculation(10 , 3));
    }
}
