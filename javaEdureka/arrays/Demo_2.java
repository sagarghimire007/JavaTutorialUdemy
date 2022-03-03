package com.javaEdureka.arrays;

// copying an array element from one array to another array
// deleting an element from an array

public class Demo_2 {
    public static void main(String[] args) {
        char[] source = { 'H' , 'A' , 'P' , 'P' , 'Y' , 'N' , 'E' , 'W' , 'Y' , 'E' , 'A' , 'R' };
        char[] name = { 's' , 'a' , 'g' , 'a' , 'r' };
        int length = source.length;
        char[] destination = new char[length];

        // copying elements from one array to another
        System.arraycopy(source , 0 , destination , 0 , length);
        System.out.println(new String(destination));


        // deleting an element from array
        int flag = 3; // element to be deleted
        for (int i = 0; i < length; i++) {
            if(flag == i) {
                for (int j = i + 1; i < (length - 1); j++) {
                    source[i] = source[j];
                    i++;
                }
                System.out.println(source);
            }
        }
    }

}
