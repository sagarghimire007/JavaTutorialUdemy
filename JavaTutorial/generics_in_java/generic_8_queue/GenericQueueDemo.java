package com.JavaTutorial.generics_in_java.generic_8_queue;

public class GenericQueueDemo {
    public static void main(String[] args) {
        // create an integer queue
        Integer[] iStore = new Integer[10];
        GenericQueue<Integer> q = new GenericQueue<Integer>(iStore);

        Integer iVal;
        System.out.println("Demonstrate a queue of Intgers.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i); // add an integer value to q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next integer from q :");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException ex) {
            System.out.println(ex);
        }
        System.out.println();
    }
}
