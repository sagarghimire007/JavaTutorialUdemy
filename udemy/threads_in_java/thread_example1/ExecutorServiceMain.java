package com.udemy.threads_in_java.thread_example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));
        System.out.println();

        // Task 3
        System.out.println("Task 3 KickedOff");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3 Done");
        System.out.println();

        executorService.shutdown();
    }
}

