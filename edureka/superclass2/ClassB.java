package com.edureka.superclass2;

public class ClassB extends ClassA{
    int value = 20;

    public void display(){
        System.out.println("This is child class instance variable : "+value);
        System.out.println("This is super class instance variable : "+super.getClassA());
    }
}
