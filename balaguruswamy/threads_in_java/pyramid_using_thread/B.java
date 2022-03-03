package com.balaguruswamy.threads_in_java.pyramid_using_thread;

public class B extends Thread {
    Pyramid p;

    B(Pyramid p) {
        this.p = p;
    }

    public void run() {
        p.drawPyramid('#');
    }
}
