package com.headfirstjava.collections_in_java.set_collection.hash_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();
        hs.add("Alpha");
        hs.add("testing");
        hs.add("Gamma");
        hs.add("Beta");

        System.out.println(hs);
    }
}
