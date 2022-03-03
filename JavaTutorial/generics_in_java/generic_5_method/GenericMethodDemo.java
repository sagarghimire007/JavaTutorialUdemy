package com.JavaTutorial.generics_in_java.generic_5_method;

public class GenericMethodDemo {

    //Determine if the contents of two arrays are the same.
    static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x , V[] y) {
        // if array length differ , then the arrays differ
        if (x.length != y.length) {
            return false;
        }

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false; // arrays differ
            }
        }
        return true; // contents of arrays are equivalent
    }

    public static void main(String[] args) {
        Integer num[] = { 1 , 2 , 3 , 4 , 5 };
        Integer num1[] = { 1 , 2 , 3 , 4 , 5 };
        Integer num2[] = { 1 , 2 , 7 , 4 , 5 };
        Integer num3[] = { 1 , 2 , 7 , 4 , 5 , 6 };
        Double dvals[] = { 1.1 , 2.2 , 3.3 , 4.4 , 5.5 };

        if (arrayEqual(num , num1)) {
            System.out.println("num equals num ");
        }

        if (arrayEqual(num , num2)) {
            System.out.println("num1 equals num2 ");
        }

        if (arrayEqual(num , num3)) {
            System.out.println("num1 equals num2 ");
        }

//        if(arrayEqual(num, dvals))  // this wont compile
    }
}
