package com.udemy.object_oriented_programming_again.step20abstractexercise;

abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}


public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = { new Dog() , new Cat() };
        for (Animal a : animals) {
            a.sound();
        }
    }
}
