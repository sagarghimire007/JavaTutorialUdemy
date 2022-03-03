package com.headfirstjava.collections_in_java.comparator_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTestSort6 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("sagar ghimire" , 25 , 101));
        list.add(new Student("amar sapkota" , 40 , 102));
        list.add(new Student("sabitri ghimire" , 44 , 103));
        list.add(new Student("sandesh sapkota" , 14 , 104));

        System.out.println("Sorting by name : ");
        Comparator<Student> cm1 = Comparator.comparing(Student::getName);
        Collections.sort(list , cm1);
        System.out.println(list.toString());
        System.out.println();
        System.out.println("Sorting by age : ");
        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        Collections.sort(list , cm2);
        System.out.println(list.toString());
    }
}
