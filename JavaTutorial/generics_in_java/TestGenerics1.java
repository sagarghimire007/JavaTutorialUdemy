package com.JavaTutorial.generics_in_java;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Sagar Ghimire");
        list.add("Sabitri Ghimire");
        list.add("Anupama Sapkota");
//        list.add(32);   compile time error
        String s = list.get(1);
        System.out.println("Element is : " + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
