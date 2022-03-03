package com.udemy.collection_in_java.map_in_java;

import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A" , 3 , "B" , 5 , "Z" , 10);
        System.out.println(map.get("A"));
        System.out.println(map);
    }
}
