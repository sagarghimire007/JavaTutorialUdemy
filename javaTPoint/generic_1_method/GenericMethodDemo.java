package com.javaTPoint.generic_1_method;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {
    public static void main(String[] args) {

        GenericTest t = new GenericTest();
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        
        t.drawShape(list1);
        t.drawShape(list2);
    }
}
