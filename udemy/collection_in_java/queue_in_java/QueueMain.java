package com.udemy.collection_in_java.queue_in_java;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1 , String o2) {
        return Integer.compare(o1.length() , o2.length());
    }
}

public class QueueMain {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<String>(new StringLengthComparator());
        queue.addAll(List.of("Zebra" , "Monkey" , "Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
