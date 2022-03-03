package com.JavaTutorial.generics_in_java.generic_8_queue;

// an exception for queue - full errors.
public class QueueFullException extends Exception {
    private int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "Queue is Full. Max size is " + size;
    }
}
