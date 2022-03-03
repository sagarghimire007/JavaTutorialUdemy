package com.udemy.object_oriented_programming_again.step11superconstructor;

import java.math.BigDecimal;

public class StudentMain {
    public static void main(String[] args) {
        // student info
        /*
        Student student = new Student();
        student.setName("Sagar");
        student.setEmail("sagar@gmail.com");
        student.setPhoneNumber("9860722282");
        student.setCollege("Nepal Engineering College");
        System.out.println(student.toString());
        */

        // employee info
        Employee employee = new Employee("nabin");
        employee.setEmail("nabin@gmail.com");
        employee.setPhoneNumber("9860722282");
        employee.setTitle("Developer");
        employee.setEmployeeGrade("Mid-level");
        employee.setSalary(new BigDecimal(40000));
        System.out.println(employee.toString());

        Employee employee1 = new Employee("Sagar");
        employee1.setEmail("sagar@gmail.com");
        employee1.setPhoneNumber("9860722282");
        employee1.setTitle("Designer");
        employee1.setEmployeeGrade("Senior");
        employee1.setSalary(new BigDecimal(50000));
        System.out.println(employee1.toString());

    }
}
