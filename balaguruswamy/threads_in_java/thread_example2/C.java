package com.balaguruswamy.threads_in_java.thread_example2;

public class C extends Thread {

    public void run() {
        for (int k = 1; k <= 5; k++) {
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (Exception e) {

                }
            }
            System.out.println("\tFrom Thread C : k = " + k);
        }
        System.out.println("Exit From C");
    }
}
