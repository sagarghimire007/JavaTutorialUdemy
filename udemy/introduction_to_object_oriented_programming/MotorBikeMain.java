package com.udemy.introduction_to_object_oriented_programming;

public class MotorBikeMain {
    public static void main(String[] args) {

        // creating instance of a class
        MotorBike ducati = new MotorBike(200);
        MotorBike honda = new MotorBike(100);

        //changing the state of an object
        // so instead of directly setting the value, setting through the methods (Encapsulation concept)
//
//        ducati.start();
//        honda.start();

        //ducati.setSpeed(100);

//        int ducatiSpeed = ducati.getSpeed();//get speed
//        ducatiSpeed = ducatiSpeed + 100;//increase it by 100
//        ducati.setSpeed(ducatiSpeed);//set it to ducati

        // increasing and decreasing Speed

//        ducati.increaseSpeed(100);
//        ducati.decreaseSpeed(200);

        //honda.setSpeed(80);
//
//        int hondaSpeed = honda.getSpeed();//get speed
//        hondaSpeed = hondaSpeed + 100;//increase it by 100
//        honda.setSpeed(hondaSpeed); // set it to honda
//
//        honda.increaseSpeed(100);
//        honda.decreaseSpeed(200);
        System.out.println("Ducati Speed : " + ducati.getSpeed());
        System.out.println("Honda Speed : " + honda.getSpeed());
    }
}



