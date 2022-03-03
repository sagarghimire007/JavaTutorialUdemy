package com.headfirstjava.staticsuper;

public class StaticTests extends StaticSuper{
    static int rand;
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Static block " + rand);
    }

    StaticTests(){
        System.out.println("Child Constructor");
    }

}
