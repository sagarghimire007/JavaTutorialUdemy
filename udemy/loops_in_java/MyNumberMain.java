package com.udemy.loops_in_java;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class MyNumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyNumber number = new MyNumber();
        System.out.println("Enter a number to check whether it is prime or not : ");
        int num = sc.nextInt();
        number.setNumber(num);
        System.out.println("is Prime : " + number.isPrime());
        System.out.println("Sum of number upto " + num + " : " + number.sumUptoN());
        System.out.println("Sum of Divisors : " + number.sumOfDivisors());
        System.out.println();
        number.printANumberTriangle();

    }
}
