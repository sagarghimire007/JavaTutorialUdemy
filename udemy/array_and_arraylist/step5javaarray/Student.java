package com.udemy.array_and_arraylist.step5javaarray;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        int max = marks[0];
        for(int mark : marks){
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }

    public int getMinimumMark(){
        int min = marks[0];
        for(int mark : marks){
            if(mark < min){
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMark(){
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
