package com.JavaTutorial.generics_in_java.generic_7_interface;

// a generic containment interface.
// this interface implies that an implementing class contains one or more values.

public interface Containment<T> {
    boolean contains(T o);
}
