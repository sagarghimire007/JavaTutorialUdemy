package com.balaguruswamy.threads_in_java.thread_example2;

public class A extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                yield();
            }
            System.out.println("\tFrom Thread A : i = " + i);
        }
        System.out.println("Exit From A");
    }
}

