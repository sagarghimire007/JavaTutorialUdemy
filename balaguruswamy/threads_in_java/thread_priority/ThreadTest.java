package com.balaguruswamy.threads_in_java.thread_priority;

public class ThreadTest {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread A");
        threadA.start();

        System.out.println("Start Thread B");
        threadB.start();

        System.out.println("Start Thread C");
        threadC.start();

        System.out.println("End of Main Thread");
    }
}
