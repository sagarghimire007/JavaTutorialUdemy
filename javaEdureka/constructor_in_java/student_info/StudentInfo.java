package com.javaEdureka.constructor_in_java.student_info;

// instance variable are default initialized
// for int = 0, float = 0.0, string = null
public class StudentInfo {
    int roll;
    String name;

    public void display() {
        System.out.println(roll + " " + name);
    }
}
