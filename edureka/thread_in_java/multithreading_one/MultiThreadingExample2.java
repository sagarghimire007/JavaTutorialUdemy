package com.edureka.thread_in_java.multithreading_one;

class MyTask2 extends Thread {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}

public class MultiThreadingExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("No of thread : " + Thread.activeCount());
        Thread t = Thread.currentThread();
        System.out.println(t);

        MyTask2 ct = new MyTask2();
        ct.start();
        Thread.sleep(500);
        System.out.println("No of Thread : " + Thread.activeCount());
    }
}