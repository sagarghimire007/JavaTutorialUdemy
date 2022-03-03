package com.balaguruswamy.exception_in_java;

public class MultipleCatchStatement {
    public static void main(String[] args) {

        int a[] = { 2 , 4 , 6 , 8 , 10 };
        int b[] = { 2 , 4 , 0 , 8 };
        try {
            for (int i = 0; i < a.length; i++) {
                int result = a[i] / b[i];
                System.out.println("Result  : " + result);
            }
        } catch (ArithmeticException ex) {
            System.out.println("Number division by zero Exception");
        } catch (ArrayIndexOutOfBoundsException aex) {
            System.out.println("Array Index Out of Bound Exception");
        }
    }
}
