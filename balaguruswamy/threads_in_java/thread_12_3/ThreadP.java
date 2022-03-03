package com.balaguruswamy.threads_in_java.thread_12_3;

public class ThreadP {
    public static void main(String[] args) {
        t1 t = new t1();
        t2 tt = new t2();

//        t.setPriority(Thread.MIN_PRIORITY);
        tt.setPriority(Thread.MAX_PRIORITY);
        t.run();
        tt.run();
    }
}
