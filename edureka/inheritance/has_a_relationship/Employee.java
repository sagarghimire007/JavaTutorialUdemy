package com.edureka.inheritance.has_a_relationship;

public class Employee {
    int id;
    String name;
    Address address;

    Employee(int id,String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Empployee Id : "+id);
        System.out.println("Name of Employee : "+name);
        System.out.println("City : "+address.city);
        System.out.println("Country : "+address.country);
    }
}
