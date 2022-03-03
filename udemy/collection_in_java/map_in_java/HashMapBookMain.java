package com.udemy.collection_in_java.map_in_java;

import java.util.HashMap;
import java.util.Map;

public class HashMapBookMain {
    public static void main(String[] args) {

        // creating map of books
        Map<Integer, HashMapBook> map = new HashMap<>();
        //Creating Books
        HashMapBook b1 = new HashMapBook(101 , "Let us C" , "Yashwant Kanetkar" , "BPB" , 8);
        HashMapBook b2 = new HashMapBook(102 , "Data Communications & Networking" , "Forouzan" , "Mc Graw Hill" , 4);
        HashMapBook b3 = new HashMapBook(103 , "Operating System" , "Galvin" , "Wiley" , 6);

        //Adding  map of Books
        map.put(b1.getId() , b1);
        map.put(b2.getId() , b2);
        map.put(b3.getId() , b3);

        // Traversing Map

        for (Map.Entry<Integer, HashMapBook> book : map.entrySet()) {
            int key = book.getKey();
            HashMapBook b = book.getValue();
            System.out.println("Id :" + b.getId() + ", Name : " + b.getName() + ", Author :" + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
        }
    }
}
