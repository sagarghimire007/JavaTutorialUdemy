package com.edureka.collection_in_java.set_in_java;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Sanjay");
        System.out.println(names.add("Anil"));
        System.out.println(names.add("Anil"));
        names.add("Pankaj");
        names.add("Naveen");
        names.add("rahul");
        names.add("Benjamin");
        System.out.println(names);
    }
}
