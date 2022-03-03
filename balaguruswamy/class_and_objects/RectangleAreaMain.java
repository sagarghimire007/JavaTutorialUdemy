package com.balaguruswamy.class_and_objects;

public class RectangleAreaMain {
    public static void main(String[] args) {

        // 1 st approach for printing area of rectangle
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;
        int area = r1.length * r1.breadth;
        System.out.println("1 st approach to calculate area : "+area);

        // 2nd approach
        r1.getData(10, 20);
        int area1 = r1.calculateArea();
        System.out.println("2nd Approach to calculate area of rectangle : "+area1);
//        r1.calculateArea();

    }
}
