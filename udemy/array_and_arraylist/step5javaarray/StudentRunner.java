package com.udemy.array_and_arraylist.step5javaarray;

import java.math.BigDecimal;
import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student("Sagar" , 1,2,3,4,5);
        int number = s.getNumberOfMarks();
        System.out.println(number);
        int sum = s.getTotalSumOfMarks();
        System.out.println("Sum of marks : " + sum);
        int max =  s.getMaximumMark();
        System.out.println("Max Marks : " + max);
        int min = s.getMinimumMark();
        System.out.println("Minimum Marks : " + min);
        BigDecimal average = s.getAverageMark();
        System.out.println("Average Marks : " + average);

        System.out.println(s.toString());
    }
}
