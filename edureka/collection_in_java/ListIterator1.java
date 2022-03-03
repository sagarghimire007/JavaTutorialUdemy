package com.edureka.collection_in_java;

import java.util.*;

public class ListIterator1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Using iterate method : ");
        iterateList(list);

        System.out.println();

        System.out.println("Using iterate1 method : ");
        iterateList1(list);

        System.out.println();

        System.out.println("Using ListIterator : ");
        iterateList2(list);

        System.out.println();
        
        System.out.println("Using Enumerator : ");
        iterate3(list);


    }

    // collection Iteration using extended enhanced for loop
    static void iterateList(List<Integer> list) {
        for (Integer n : list) {
            System.out.print(n + " ");
        }
    }


    // collection Iteration using java.util.Iterator
    // retrieve the element from first to last only (Iterator)

    static void iterateList1(List<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    // collection Iteration using java.util.Iterator
    // retrieve the element from first to last only and also from last to first (ListIterator)

    static void iterateList2(List<Integer> list) {
        ListIterator<Integer> listItr = list.listIterator();
        System.out.println("Iterate from first to last using ListIterator : ");
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }

        System.out.println();
        System.out.println("Iterate from last to first using ListIterator : ");
        while (listItr.hasPrevious()) {
            Integer n = listItr.previous();
            System.out.print(n + " ");
        }
    }

    // collection Iteration using java.util.Enumeration
    static void iterate3(List<Integer> list) {
        Enumeration<Integer> en = Collections.enumeration(list);
        while (en.hasMoreElements()) {
            Integer n = en.nextElement();
            System.out.print(n + " ");
        }
    }
}
