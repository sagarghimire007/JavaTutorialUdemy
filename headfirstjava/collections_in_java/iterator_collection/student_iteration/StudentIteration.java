package com.headfirstjava.collections_in_java.iterator_collection.student_iteration;


import java.util.ArrayList;
import java.util.Iterator;

public class StudentIteration {
    public static void main(String[] args) {

        ArrayList<Student> studentsList = new ArrayList<Student>();
        Student s1 = new Student("sagar" , 101 , 25);
        Student s2 = new Student("nabin" , 102 , 24);
        Student s3 = new Student("nissan" , 103 , 25);
        Student s4 = new Student("sandesh" , 104 , 14);
        Student s5 = new Student("anu" , 105 , 20);

        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);


        Iterator<Student> itr = studentsList.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.name + " , " + st.age + " , " + st.rollNo);
        }
    }
}
