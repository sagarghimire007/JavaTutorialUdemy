package com.headfirstjava.inheritance.has_a;

public class TestMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        Address a = new Address();
        e.name = "Sagar";
        e.age = 25;
        a.setCity("Chabahil");
        a.setCountry("Nepal");

        e.setAddress(a);

        e.display();
        e.employeeDisplay();
    }
}
