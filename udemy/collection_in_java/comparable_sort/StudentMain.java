package com.udemy.collection_in_java.comparable_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class nameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1 , Student o2) {
        return Integer.compare(o2.getAge() , o1.getAge());
    }
}

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("Sagar" , 25);
        Student s2 = new Student("Sandesh" , 14);
        Student s3 = new Student("Amar" , 39);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList , new nameComparator());
        System.out.println(studentList);

        System.out.println(Integer.valueOf(10).compareTo(Integer.valueOf(10)));
        System.out.println(String.valueOf("sagar").compareTo(String.valueOf("sagar")));
        System.out.println(String.valueOf("sagar").equals(String.valueOf("sagar")));
        System.out.println(Integer.valueOf(1).equals(Integer.valueOf(1)));

    }
}
