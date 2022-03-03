package com.javaEdureka.constructor_in_java.employee;

public class ParameterizedConstructor {
    public static void main(String[] args) {

        Employee e1 = new Employee(1 , "Sagar Ghimire");
        Employee e2 = new Employee(2 , "Nabin Ghimire");

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
    }
}
