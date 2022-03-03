package com.edureka.methodoverloading;

// method overloading... having same method name but different parameters called method overloading...
//  having same parameter but different in data-types also constitute to method overloading
public class MethodDemo {
    public void area(int b, int h){
        System.out.println("Area of Triangle :"+(0.5*b*h));
    }

    public void area(int r){
        System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String[] args) {
        MethodDemo a = new MethodDemo();
        a.area(4,6);
        a.area(5);
    }
}
