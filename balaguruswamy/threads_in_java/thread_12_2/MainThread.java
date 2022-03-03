package com.balaguruswamy.threads_in_java.thread_12_2;

public class MainThread {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

//        ThreadTwo threadTwo = new ThreadTwo();
//        Thread th = new Thread(threadTwo);
//        th.start();
    }
}
