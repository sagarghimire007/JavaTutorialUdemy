package com.headfirstjava.polymorphism;

import com.headfirstjava.polymorphism.polymophismexample1.Pet;

public class Dog extends Animal implements Pet {
    String name = "Lucy";
    public String character;

    public void dogSound(){
        System.out.println("this is Dog Sound");
    }

    public void displayInfo(){
        System.out.println("Dog Name : " +name+ ", Age : " + age + ", Character : "+character );
    }


    void info(){
        Dog d = new Dog();
        System.out.println(d instanceof Animal);
    }

    public void befriendly(){
        System.out.println("Dog being friendly");
    }

    //    @Override
//    public void eat() {
//        System.out.println("Dog is Eating");
//    }
}
