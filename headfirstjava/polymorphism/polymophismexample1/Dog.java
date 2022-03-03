package com.headfirstjava.polymorphism.polymophismexample1;

public class Dog {
    String name;
    int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Dog(String name, int age){
        this.name = name;
        this.age = age;


    }
}
