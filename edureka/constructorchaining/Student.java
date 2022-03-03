package com.edureka.constructorchaining;
//constructor chaining is the process of calling another constructor with respect to current object

public class Student {
    int marks;
    String name;

    Student(){
        this("Megan"); // this constructor call the next constructor of same class having single parameter
    }

    Student(String sname){
        this(sname, 70); // calls constructor of same class having two parameters
    }

    Student (String sname, int marks){
        this.name = sname;
        this.marks = marks;
    }

    void displayStudentInfo(){
        System.out.println("Student Name : "+name);
        System.out.println("Student Mark : "+marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudentInfo();
    }
}
