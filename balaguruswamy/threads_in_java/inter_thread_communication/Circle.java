package com.balaguruswamy.threads_in_java.inter_thread_communication;

public class Circle {
    float radius = 0.0f;

    synchronized void output() {
        System.out.println("Output method invoked for displaying area of circle.....");
        if (radius == 0.0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Area  of circle = " + (3.14 * radius * radius));
    }

    synchronized void input(float r) {
        System.out.println("Inputting radius .....");
        radius = r;
        System.out.println("Radius value Recieved....");
        notify();
    }
}
