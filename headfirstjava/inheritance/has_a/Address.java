package com.headfirstjava.inheritance.has_a;

public class Address {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addressDisplay(){
        System.out.println("This is address block");
    }
}
