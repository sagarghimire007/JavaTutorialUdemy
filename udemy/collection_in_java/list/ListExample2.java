package com.udemy.collection_in_java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ListExample2 {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(100);
//        list.add(100);
//        list.add(100);
//
//        Integer value = null;
//        System.out.println(Objects.hashCode(value));

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Sagar" , "Sandesh" , "Amar" , "Sagar"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Padma" , "Sandesh" , "Haku" , "Jevan"));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 5 , 6 , 7 , 8 , 9 , 10));
        list.retainAll(list2);
        System.out.println(list);

        System.out.println(list3.subList(2 , 6)); // end index will be excluded

        LinkedHashSet<Integer> listWithoutDuplicates = new LinkedHashSet<Integer>(list3);
        System.out.println(listWithoutDuplicates);


    }
}
