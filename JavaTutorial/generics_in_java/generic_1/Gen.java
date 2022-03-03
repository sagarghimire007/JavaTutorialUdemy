package com.JavaTutorial.generics_in_java.generic_1;

/*
A Simple generic class. Here, T is a type parameter that will be replaced by a real type when an object of type Gen is created
 */
public class Gen<T> {
    T ob;

    //pass the constructor a reference to an object of type T
    Gen(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
