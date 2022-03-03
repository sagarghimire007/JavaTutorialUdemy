package com.JavaTutorial.javatpoint_generics;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sagar");
        list.add("nabin");
        list.add("nissan");

        String s = list.get(1);
        System.out.println("Element is : " + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
