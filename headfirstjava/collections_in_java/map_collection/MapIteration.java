package com.headfirstjava.collections_in_java.map_collection;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {

        Map<String, Float> map = new HashMap<String, Float>();

        map.put("Cookies" , 90.87f);
        map.put("Dry Fruits" , 434.23f);
        map.put("Oats" , 220.00f);
        map.put("Chocolate" , 70.89f);

        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
    }
}
