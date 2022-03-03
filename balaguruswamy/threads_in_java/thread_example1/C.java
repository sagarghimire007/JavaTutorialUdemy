package com.balaguruswamy.threads_in_java.thread_example1;

public class C extends Thread {

    public void run() {
        for (int k = 0; k <= 5; k++) {
            System.out.println("\tFrom Thread C : k = " + k);
        }
        System.out.println("Exit From C");
    }
}
