package com.udemy.array_and_arraylist.step7variableargument;

import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        int sum = print(1,2,3,4,5 );
        System.out.println(sum);
    }

    public static int print(int... values){
        int sum = 0;
        for(int a : values){
            sum += a;
        }
        return sum;
//        System.out.println(Arrays.toString(values));
    }
}
