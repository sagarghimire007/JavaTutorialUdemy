package com.headfirstjava.collections_in_java.array_list.adding_array_list_elements;

import java.util.ArrayList;

public class AddingArrayListElements {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial list of elements : " + al);

        // Adding elements to the end of the list
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        System.out.println("After invoking add(E e) method : " + al);

        // adding an element at the specific position
        al.add(1 , "Sagar");
        System.out.println("After invoking add(int index, E element) method : " + al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Sanoo");
        al2.add("Hanuman");

        // adding second elements  to the first list
        al.addAll(al2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method : " + al);

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("John");
        al3.add("Rahul");
        // adding second list elements to the first list at the specific position
        al.addAll(1 , al3);
        System.out.println("After invoking addAll(int index , Collection<? extends E> c) method :" + al);
    }
}
