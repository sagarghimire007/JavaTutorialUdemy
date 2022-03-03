package com.headfirstjava.collections_in_java.song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Java");
        list.add("Advance Java");
        System.out.println("Initial Collection Value : " + list);
        Collections.addAll(list , "Servlet" , "JSP");
        System.out.println("After adding elements collection value : " + list);
        String[] str = { "C#" , ".Net" };
        Collections.addAll(list , str);
        System.out.println("Ater adding array collection value : " + list);
    }
}
