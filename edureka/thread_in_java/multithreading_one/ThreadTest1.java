package com.edureka.thread_in_java.multithreading_one;

class MyTask1 implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("No of thread : " + Thread.activeCount());
        Thread t = Thread.currentThread();
        System.out.println(t);

        MyTask1 mt = new MyTask1();
        Thread ct = new Thread(mt);
        ct.start();
        Thread.sleep(500);
        System.out.println("No of Thread : " + Thread.activeCount());
    }
}
