package com.edureka.inheritance.has_a_relationship;

public class EmployeeTest {
    public static void main(String[] args) {
        Address ad = new Address("Kathamndu", "Nepal");
        Employee e = new Employee(1,"Sagar", ad);
        e.display();
    }
}
