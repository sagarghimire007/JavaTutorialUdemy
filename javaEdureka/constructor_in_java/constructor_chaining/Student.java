package com.javaEdureka.constructor_in_java.constructor_chaining;

// chaining of constructor with this keyword
// this keyword refers to the current object

public class Student {
    public String name;
    public int marks;

    // default constructor of the class
    public Student() {
        // this will call the constructor with String parameter
        this("Sagar");
    }

    public Student(String name) {
        // this will call the constructor with (String, int) param
        this(name , 70);
    }

    public Student(String name , int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}
