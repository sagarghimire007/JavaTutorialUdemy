package com.headfirstjava.objectasparameter;

public class TutorialBookMain {
    public static void main(String[] args) {
        TutorialBook t1 = new TutorialBook(10,20);
        TutorialBook t2 = new TutorialBook(30,40);

        t1.display();
        t2.display();

        TutorialBook t4 = new TutorialBook(t1); // passing a object in constructor

        TutorialBook t3 = t2.duplicate();

        System.out.println("T1 and T2 are equal : " + t1.isEqual(t2)); // passing an object as parameter in a method
        System.out.println(t1.equals(t2));

        t3.display();
    }
}
