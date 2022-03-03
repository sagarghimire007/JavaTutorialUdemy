package com.udemy.referencevariable;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal(5);
        Animal nothing = cat;
        System.out.println("cat id : "+cat.id);
        //System.out.println("nothing id : "+nothing.id);
    }
}
