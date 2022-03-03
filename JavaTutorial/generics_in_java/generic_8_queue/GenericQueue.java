package com.JavaTutorial.generics_in_java.generic_8_queue;

public class GenericQueue<T> {
    private T[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // construct an empty queue with the given array.
    public GenericQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // put an item into the queue
    public void put(T obj) throws QueueFullException {
        if (putloc == q.length) {
            throw new QueueFullException(q.length);
        }
        q[putloc++] = obj;
    }

    // get a character from a queue
    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}
