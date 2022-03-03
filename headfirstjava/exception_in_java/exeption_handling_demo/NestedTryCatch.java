package com.headfirstjava.exception_in_java.exeption_handling_demo;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide");
                int num = 100 / 0;
            } catch (Exception e) {
                System.out.println("Arithmetic Exception Occured");

                System.out.println("Again going to divide");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a value : ");
                int num = 100 / sc.nextInt();
                // the user may enter 0, which will lead to another exception
            }
        } catch (Exception e) {
            System.out.println("Overall Exception Handled");
        }
    }
}
