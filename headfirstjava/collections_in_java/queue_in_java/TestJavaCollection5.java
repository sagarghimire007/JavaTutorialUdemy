package com.headfirstjava.collections_in_java.queue_in_java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollection5 {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Sagar Ghimire");
        queue.add("Amar Ghimire");
        queue.add("Amar Sapkota");
        queue.add("Sandesh Sapkota");

        System.out.println("Head : " + queue.element());
        System.out.println("Head : " + queue.peek());

        System.out.println();
        System.out.println("Iterating queue elements :");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        queue.remove();
        queue.poll();

        System.out.println("After removing the elements : ");

        Iterator<String> itr2 = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
