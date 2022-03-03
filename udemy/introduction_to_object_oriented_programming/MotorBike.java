package com.udemy.introduction_to_object_oriented_programming;

//class starts with a capital letter
public class MotorBike {
    //state
    // default value for the instance variable for integer is 0
    private int speed; // instance variable / member variable

    // constructor as an argument
    public MotorBike(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) { // local variable
        if (speed > 0) {
            this.speed = speed;
        }
    }

    //behaviour
    void run() {
        System.out.println("Bike Started");
    }

    public void increaseSpeed(int howMuchSpeed) {
        this.speed = this.speed + howMuchSpeed;
    }

    public void decreaseSpeed(int howMuchSpeed) {
        setSpeed(this.speed - howMuchSpeed);
    }
}
