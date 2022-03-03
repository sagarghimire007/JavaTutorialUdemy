package com.udemy.collection_in_java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Mango");
        list1.add("Banana");

        List<String> list2 = new ArrayList<String>();
        list1.add("Tiger");
        list1.add("Lion");
        list1.add("Monkey");
        list1.addAll(list2);

        List<String> list3 = new ArrayList<String>();
        list1.add("Pizza");
        list1.add("Burger");
        list1.add("MoMo");

        List<String> merge = new ArrayList<String>();
        merge.addAll(list1);
        merge.addAll(list2);
        merge.addAll(list3);

        System.out.println("Simple for Loop :");
        for (int i = 0; i < merge.size(); i++) {
            System.out.println(merge.get(i));
        }

        System.out.println();
        System.out.println("Enhanced For Loop:");
        for (String list : merge) {
            System.out.println(list);
        }
        System.out.println();

        System.out.println("Using Iterator:");
        Iterator<String> words = merge.iterator();
        while (words.hasNext()) {
            String a = words.next();
            if (a.endsWith("le")) {
                System.out.println(a);
            }
        }

        System.out.println("Removing element from the list :");
        Iterator<String> itr = merge.iterator();
        while (itr.hasNext()) {
            if (itr.next().endsWith("le")) {
                itr.remove();
            }
        }
        System.out.println(merge);

        System.out.println();
        System.out.println("List sorted : ");
        Collections.sort(merge);
        System.out.println(merge);
    }
}
