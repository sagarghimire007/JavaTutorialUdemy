package com.JavaTutorial.generics_in_java.generic_7_interface;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer[] array = { 2 , 3 , 4 };
        MyClass<Integer> obj = new MyClass<Integer>(array);

        if (obj.contains(2)) {
            System.out.println("2 is in obj");
        } else {
            System.out.println("2 is not in obj");
        }

        if (obj.contains(5)) {
            System.out.println("5 is in obj ");
        } else {
            System.out.println("5 is not in obj");
        }
    }
}
