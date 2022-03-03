package com.headfirstjava.collections_in_java.TestSort4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;
    int rollNo;

    Student(String name , int age , int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String toString() {
        return name + " : " + age;
    }

    static class NameComperator implements Comparator<Student> {

        @Override
        public int compare(Student o1 , Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    static class AgeComperator implements Comparator<Student> {

        @Override
        public int compare(Student o1 , Student o2) {
            return o1.age - o2.age;
        }
    }

}

public class TestSort4 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Sagar Ghimire" , 25 , 101));
        list.add(new Student("Amar Sapkota" , 40 , 102));
        list.add(new Student("Sandesh Sapkota" , 14 , 103));

        Collections.sort(list , new Student.NameComperator());
        System.out.println(list.toString());
        Collections.sort(list , new Student.AgeComperator());
        System.out.println(list.toString());
    }
}
