package com.udemy.object_oriented_programming_again.step5objectcomposition;

public class Address {
    private String city;
    private String zip;

    public Address(String city, String zip){
        this.city = city;
        this.zip = zip;
    }

    public String toString(){
        return city +"," + zip;
    }
}
