package com.balaguruswamy.threads_in_java.pyramid_using_thread;

public class PyramidMain {
    public static void main(String[] args) {

        Pyramid proj = new Pyramid();
        A threadA = new A(proj);
        B threadB = new B(proj);
        threadA.start();
        threadB.start();
    }
}
