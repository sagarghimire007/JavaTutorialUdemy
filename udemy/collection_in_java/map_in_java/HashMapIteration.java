package com.udemy.collection_in_java.map_in_java;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1 , "sagar");
        hashMap.put(2 , "Sandesh");
        hashMap.put(3 , "Amar");
        hashMap.put(4 , "Padma");
        hashMap.put(5 , "Anupama");

        System.out.println("Iterating HashMap : ");
        for (Map.Entry map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
