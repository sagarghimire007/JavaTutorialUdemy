package com.udemy.collection_in_java.set_in_java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        List<Character> characters = List.of('A' , 'Z' , 'A' , 'B' , 'Z' , 'F');
        Set<Character> treeSet = new LinkedHashSet<Character>(characters);
        System.out.println(treeSet);
    }
}
