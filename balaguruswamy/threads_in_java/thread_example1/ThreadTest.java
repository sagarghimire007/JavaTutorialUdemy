package com.balaguruswamy.threads_in_java.thread_example1;

public class ThreadTest {
    public static void main(String[] args) {
        new A().run();
        System.out.println();
        new B().run();
        System.out.println();
        new C().run();
    }
}
