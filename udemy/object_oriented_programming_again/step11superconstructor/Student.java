package com.udemy.object_oriented_programming_again.step11superconstructor;

public class Student extends Person {
    private String college;
    private int year;

    public Student(String name) {
        super(name);
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Student Name - " + getName() + ", Email - " + getEmail() + ", Phone Number - " + getPhoneNumber() +
                ", College - " + college;
    }
}
