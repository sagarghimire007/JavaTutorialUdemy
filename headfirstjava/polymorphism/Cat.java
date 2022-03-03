package com.headfirstjava.polymorphism;

import com.headfirstjava.polymorphism.polymophismexample1.Pet;

public class Cat extends Animal implements Pet {
    public void catSound(){
        System.out.println("this is cat sound");
    }

    @Override
    public void befriendly() {
        System.out.println("Cat Being Friendly");
    }

    //
//    public void eat(){
//        System.out.println("Cat is Eating");
//    }
}
