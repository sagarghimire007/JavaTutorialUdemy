package com.headfirstjava.howobjectbehaves;

public class Dog {
    String name;
    int size;

    Dog(String name, int size){
        this.name = name;
        this.size = size;
    }

    public void bark(){
        if(size > 20){
            System.out.println("Ruff Ruff");
        }else{
            System.out.println("Yuff Yuff");
        }
    }
}
