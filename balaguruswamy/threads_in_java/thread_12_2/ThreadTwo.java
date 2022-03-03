package com.balaguruswamy.threads_in_java.thread_12_2;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("\tFrom ThreadTwo : j = " + j);
        }
    }
}
