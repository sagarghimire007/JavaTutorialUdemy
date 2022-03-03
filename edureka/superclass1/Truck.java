package com.edureka.superclass1;

public class Truck extends Vehicle{
    int numberOfWheels;

    public void printNumberOfWheels(){
        numberOfWheels = 2;
        System.out.println(numberOfWheels);
        System.out.println(super.numberOfWheels);
    }

    public static void main(String[] args) {
        Truck t = new Truck();
        t.printNumberOfWheels();
    }
}
