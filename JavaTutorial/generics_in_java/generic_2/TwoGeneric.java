package com.JavaTutorial.generics_in_java.generic_2;

public class TwoGeneric<T, V> {
    T ob1;
    V ob2;

    //pass the constructor a reference to an object of type T
    TwoGeneric(T o , V a) {
        ob1 = o;
        ob2 = a;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void showType() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
}
