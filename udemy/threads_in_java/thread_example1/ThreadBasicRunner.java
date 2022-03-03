package com.udemy.threads_in_java.thread_example1;

// 2 ways to create thread
/*
1.extending thread class and overriding the run method
2. implement runnable interface and implement run method
 */

//1 . extending a class Thread ( for creating new thread )
class Task1 extends Thread {
    public void run() {
        System.out.println("Task 1 KickedOff");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 1 Done");
    }
}

// 2. implementing runnable interface to create new thread. ( for this a thread instance is to be created )
class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Task 2 KickedOff");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 Done");
    }
}

public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {

//      Task 1
        Task1 t = new Task1();
        t.setPriority(1);
        t.start();


        // Task 2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();
        System.out.println();

        t.join();
        task2Thread.join();

        // Task 3
        System.out.println("Task 3 KickedOff");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3 Done");
        System.out.println();
    }
}
