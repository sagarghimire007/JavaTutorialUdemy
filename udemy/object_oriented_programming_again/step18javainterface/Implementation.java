package com.udemy.object_oriented_programming_again.step18javainterface;

public class Implementation implements Interface4 {
    public static void main(String[] args) {
        Implementation test = new Implementation();
        test.print();
    }

    public void print() {
        System.out.println("Hello Sagar");
    }
}
