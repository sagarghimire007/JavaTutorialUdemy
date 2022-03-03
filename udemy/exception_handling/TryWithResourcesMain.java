package com.udemy.exception_handling;

import java.util.Scanner;

public class TryWithResourcesMain {
    public static void main(String[] args) {

        // try with resource... in this a try block will automatically close the scanner resource after using it at the last
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = { 12 , 3 , 4 , 5 };
            int number = numbers[21];
        }
    }
}
