package com.udemy.collection_in_java.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {

        List<String> words = List.of("Apple" , "Mangoes" , "Banana");

        System.out.println(words); // printing the list present in the list
        System.out.println(words.size()); // gives the number of element present in the list
        System.out.println(words.isEmpty()); // checks whether the list is empty or not
        System.out.println(words.indexOf("Apple")); // get the index of the element in the list
        System.out.println(words.contains("Mango")); // checks whether the element is present in the list or not
        System.out.println(words.contains("Mangoes")); // checks whether the element is present in the list or not

        List<String> wordsArrayList = new ArrayList<String>(words);
        System.out.println(wordsArrayList);
        wordsArrayList.add("Guava");

        System.out.println(wordsArrayList);

        wordsArrayList.add("Elephant");
        System.out.println(wordsArrayList);

        wordsArrayList.add(1 , "Monkey");
        System.out.println(wordsArrayList);

    }
}
