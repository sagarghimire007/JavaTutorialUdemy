package com.edureka.synchronized_thread;

class MTable {

    synchronized public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("-----------------------");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("----------------------");
    }
}

class MThread1 extends Thread {
    MTable table;

    MThread1(MTable t) {
        table = t;
    }

    public void run() {
        table.printTable(5);
    }
}

class MThread2 extends Thread {
    MTable table;

    MThread2(MTable t) {
        table = t;
    }

    public void run() {
        table.printTable(6);
    }
}

public class SynchronizedThread {
    public static void main(String[] args) {

        MTable t = new MTable();
        MThread1 mt1 = new MThread1(t);
        MThread2 mt2 = new MThread2(t);
        mt1.start();
        mt2.start();

    }
}
