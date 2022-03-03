package com.balaguruswamy.threads_in_java.thread_example1;

public class A extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread A : i = " + i);
        }
        System.out.println("Exit From A");
    }
}

