package com.JavaTutorial.enumeration_in_java.enumeration_demo_1;

enum Transport {
    CAR, TRUCK, TRAIN, AIRPLANE, BOAT
}

public class EnumerationDemo {
    public static void main(String[] args) {

        Transport tp;
        System.out.println("Here are all transport constants");

        // use values()
        Transport[] allTransport = Transport.values(); // obtain an array of Transport constants
        for (Transport t : allTransport) {
            System.out.println(t);
        }
        System.out.println();

        //use valuesOf()
        tp = Transport.valueOf("AIRPLANE"); // obtain the constant with the name AIRPLANE
        System.out.println("tp contains " + tp);
    }
}
