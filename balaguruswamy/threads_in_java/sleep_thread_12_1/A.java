package com.balaguruswamy.threads_in_java.sleep_thread_12_1;

public class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\tFrom Thread A : i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
