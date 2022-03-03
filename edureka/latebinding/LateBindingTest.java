package com.edureka.latebinding;

public class LateBindingTest {
    public static void main(String[] args) {
        Car mercedes = new Car();
        Vehicle v = mercedes;
        v.move();
    }
}
