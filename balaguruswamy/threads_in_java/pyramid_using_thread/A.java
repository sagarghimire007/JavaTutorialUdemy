package com.balaguruswamy.threads_in_java.pyramid_using_thread;

public class A extends Thread {
    Pyramid p;

    A(Pyramid p) {
        this.p = p;
    }

    public void run() {
        p.drawPyramid('*');
    }
}
