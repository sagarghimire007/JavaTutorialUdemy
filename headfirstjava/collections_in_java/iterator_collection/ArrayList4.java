package com.headfirstjava.collections_in_java.iterator_collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Sagar"); //Adding object in arraylist
        list.add("Sandesh");
        list.add("Amar");
        list.add("Anupama");


        System.out.println("Traversing list through List Iterator in reverse order:");
        //Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }

        System.out.println();
        // traversing through loop
        System.out.println("Traversing through for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
