package com.udemy.object_oriented_programming_again.step5objectcomposition;

public class Customer {
    private String name;
    private Address homeAddress; // object composition
    private Address workAddress;

    public Customer(String name){
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("Name - %s, HomeAddress - %s, Work Address - %s", name, homeAddress,workAddress);
    }
}
