package com.balaguruswamy.threads_in_java.inter_thread_communication;

public class ThreadMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        new Thread() {
            public void run() {
                c.output();
            }
        }.start();

        new Thread() {
            public void run() {
                c.input(2.5f);
            }
        }.start();
    }
}
