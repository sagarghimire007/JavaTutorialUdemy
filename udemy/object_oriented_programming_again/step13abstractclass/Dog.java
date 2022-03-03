package com.udemy.object_oriented_programming_again.step13abstractclass;

public class Dog extends AbstactAnimal {

    @Override
    public void bark() {
        System.out.println("Bow Bow");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
