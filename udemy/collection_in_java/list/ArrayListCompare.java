package com.udemy.collection_in_java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCompare {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>(Arrays.asList("A" , "B" , "C" , "D" , "F"));
        List<String> l2 = new ArrayList<String>(Arrays.asList("A" , "B" , "C" , "D" , "E"));
        List<String> l3 = new ArrayList<String>(Arrays.asList("A" , "B" , "C" , "D" , "F"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }
}
