package com.javaEdureka.constructor_in_java.employee;

public class Employee {
    int id;
    String name;

    public Employee(int id , String name) {
        this.id = id;
        this.name = name;
    }

    public void displayEmployeeInfo() {
        System.out.println("Id : " + id + " Name : " + name);
    }
}
