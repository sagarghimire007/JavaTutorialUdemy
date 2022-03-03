package com.JavaTutorial.generics_in_java.generic_8_queue;

// a generic queue interface
public interface InterfaceGenericQueue<T> {
    // put an item into the queue

    void put(T ch) throws QueueFullException;

    // get an item from the queue
    T get() throws QueueEmptyException;
}
