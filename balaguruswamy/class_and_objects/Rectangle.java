package com.balaguruswamy.class_and_objects;

public class Rectangle {
    int length, breadth;

    void getData(int x, int y){
        length = x;
        breadth = y;
    }

    int calculateArea(){
        return (length * breadth);
        //System.out.println(length * breadth);
    }
}
