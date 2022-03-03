package com.udemy.generic_in_java.generic_1_customList;

import java.util.ArrayList;

public class GenericCustomList<T> {

    ArrayList<T> list = new ArrayList<T>();

    public void addElement(T element) {
        list.add(element);
    }

    public String toString() {
        return list.toString();
    }

    public T getElement(int index) {
        return list.get(index);
    }
}
