package com.headfirstjava.inheritance.has_a;

public class Employee {
    String name;
    int age;
    Address address;


    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Name : "+name+ " , Age : "+age+ " , City : "+ address.getCity()+ " , Country : "+address.getCountry());
    }

    public void employeeDisplay(){
        address = new Address();
        address.addressDisplay();
    }
}
