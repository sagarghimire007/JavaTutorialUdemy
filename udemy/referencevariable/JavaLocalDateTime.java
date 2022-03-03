package com.udemy.referencevariable;

import java.time.*;

public class JavaLocalDateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today);
        System.out.println(today.plusDays(-1));
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());
    }
}
