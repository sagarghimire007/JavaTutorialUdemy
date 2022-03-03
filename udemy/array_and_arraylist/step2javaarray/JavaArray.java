package com.udemy.array_and_arraylist.step2javaarray;

import java.util.Arrays;

/* Exercise
    creating and accessing the array elements
    create an array of marks with 8 elements, and loop around the array and print the value of an array
*/

public class JavaArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {8,1,3,4,5,6,7,2};
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.equals(a,b));
        Arrays.sort(b);
        for(int sort : b){
            System.out.print(sort + " ");
        }
    }
}
