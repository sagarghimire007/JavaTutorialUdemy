package com.headfirstjava.inheritance;

public class Wolf extends Canine{
    @Override
    void makeNoise() {
        System.out.println("Wolf making noise");
    }

    @Override
    void eat() {
        System.out.println("wolf Eating");
    }
}
