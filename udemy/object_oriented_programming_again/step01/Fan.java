package com.udemy.object_oriented_programming_again.step01;

public class Fan {

    //state
    private String model;
    private String color;
    private int warrantyYears;
    private boolean isOn;
    private byte speed;

    public Fan(String model, String color, int warrantyYears) {
        this.model = model;
        this.color = color;
        this.warrantyYears = warrantyYears;
    }

    //isOn
    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
//        return "model = '" + model + '\'' +
//                ", color = '" + color + '\'' +
//                ", warrantyYears = " + warrantyYears +
//                ", isOn = " + isOn +
//                ", speed =" + speed;
        return String.format("model - %s, color - %s, warranty - %d, isOn - %s, speed - %d", model, color, warrantyYears,isOn,speed); // formatting output
    }
}
