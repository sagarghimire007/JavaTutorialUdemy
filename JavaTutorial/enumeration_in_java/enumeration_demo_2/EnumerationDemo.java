package com.JavaTutorial.enumeration_in_java.enumeration_demo_2;

enum Transport {
    CAR(65), TRUCK(55), TRAIN(70), AIRPLANE(600), BOAT(22); // initialization values

    private int speed; // typical speed of each transport ( Add instance variable )

    Transport(int s) { // Add a constructor
        speed = s;
    }

    int getSpeed() {  // Add a method
        return speed;
    }
}

public class EnumerationDemo {
    public static void main(String[] args) {

        Transport tp;
//        Display Speed of an airplane
        System.out.println("Typical Speed of an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

//        Display all Transport Speed
        System.out.println("All transport speeds : ");
        for (Transport t : Transport.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
        }
    }
}
