package com.udemy.collection_in_java.map_in_java;

import java.util.HashMap;
import java.util.Map;

public class CollectionExercise1 {
    public static void main(String[] args) {

        String str = "This is an awesome occasion. This has never happened before";

//        Map<Character, Integer> occurrence = new HashMap<>();
//        char[] chars = str.toCharArray();
//        for (char character : chars) {
//            // get the character
//            Integer integer = occurrence.get(character);
//            if (integer == null) {
//                occurrence.put(character , 1);
//            } else {
//                occurrence.put(character , integer + 1);
//            }
//        }
//        System.out.println(occurrence);

        Map<String, Integer> stringOccurrence = new HashMap<String, Integer>();
        String[] word = str.split(" ");
        for (String a : word) {
            Integer integer = stringOccurrence.get(a);
            if (integer == null) {
                stringOccurrence.put(a , 1);
            } else {
                stringOccurrence.put(a , integer + 1);
            }
        }
        System.out.println(stringOccurrence);
    }
}
