package com.balaguruswamy.threads_in_java.thread_example2;

public class B extends Thread {

    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                stop();
            }
            System.out.println("\tFrom Thread B : j = " + j);
        }
        System.out.println("Exit from B");
    }
}
