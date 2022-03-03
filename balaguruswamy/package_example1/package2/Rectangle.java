package com.balaguruswamy.package_example1.package2;

import com.balaguruswamy.package_example1.package1.Square;

public class Rectangle extends Square {

    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("Square area : " + s.areaCalculation(10 , 2));

        Rectangle r = new Rectangle();
        System.out.println("Area Calculation : " + r.areaCalculation(10 , 3));
    }
}
