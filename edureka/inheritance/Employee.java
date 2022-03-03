package com.edureka.inheritance;

public class Employee extends Manager{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 20000;
        System.out.println("salary of employee : "+emp.salary);

        Manager manager  = new Manager();
        manager.salary = 100000;
        System.out.println("salary of manager : "+manager.salary);
    }
}
