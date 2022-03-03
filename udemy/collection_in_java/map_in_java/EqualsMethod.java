package com.udemy.collection_in_java.map_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    int id;

    Employee(String name , int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return id + " : " + name;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Sagar" , 1);
        Employee emp2 = new Employee("Amar" , 2);

        String s1 = new String("Sagar");
        String s2 = new String("Sagar");

        System.out.println(emp1.equals(emp2));
        System.out.println(s1.equals(s2));

        String s3 = "FA";
        String s4 = "Ea";
        System.out.println(s3.hashCode() + " " + s4.hashCode());

        String str1 = "sagarg";
        String str2 = "sagar";
        System.out.println(str1.compareTo(str2));

        Integer int1 = 1;
        Integer int2 = 2;
        System.out.println(int1.compareTo(int2));

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);

        Collections.sort(list);
        System.out.println(list);
    }
}
