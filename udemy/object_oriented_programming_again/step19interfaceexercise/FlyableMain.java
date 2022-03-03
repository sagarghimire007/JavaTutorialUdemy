package com.udemy.object_oriented_programming_again.step19interfaceexercise;

interface Flyable {
    public void fly();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("With Wings");
    }
}

class Aeroplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("With Fuel");
    }
}

public class FlyableMain {
    public static void main(String[] args) {
        Flyable[] flyableObject = { new Bird() , new Aeroplane() };
        for (Flyable object : flyableObject) {
            object.fly();
        }
    }
}
