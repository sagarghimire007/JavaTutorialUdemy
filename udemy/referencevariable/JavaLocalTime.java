package com.udemy.referencevariable;

import java.time.LocalTime;

public class JavaLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime t1 = LocalTime.of(3, 25);
        System.out.println(t1);
        System.out.println(t1.withHour(7));
        System.out.println(t1 );
        Math.random();
    }
}
