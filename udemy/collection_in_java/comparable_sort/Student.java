package com.udemy.collection_in_java.comparable_sort;

public class Student {
    private String name;
    private int age;

    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " : " + age;
    }
}
