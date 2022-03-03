package com.balaguruswamy.threads_in_java.thread_12_2;

public class ThreadOne extends Thread {
    public void start() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\tFrom ThreadOne : i = " + i);
        }
    }
}
