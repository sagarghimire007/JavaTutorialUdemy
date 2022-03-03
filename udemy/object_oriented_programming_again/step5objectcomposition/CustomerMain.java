package com.udemy.object_oriented_programming_again.step5objectcomposition;

public class CustomerMain {
    public static void main(String[] args) {

        Address homeAddress = new Address("Chabahil","10000");
        Customer customer = new Customer("sagar");
        customer.setHomeAddress(homeAddress);

        Address workAddress = new Address("NewRoad", "20000");
        customer.setWorkAddress(workAddress);

        System.out.println(customer.toString());
        System.out.println(homeAddress.toString());
        System.out.println(workAddress.toString());
    }
}
