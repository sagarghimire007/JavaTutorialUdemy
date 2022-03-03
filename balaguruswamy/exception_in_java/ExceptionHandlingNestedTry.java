package com.balaguruswamy.exception_in_java;

public class ExceptionHandlingNestedTry {
    public static void main(String[] args) {
        try {
            int b = 4, a = 2, c = 2, x = 7, z;
            int p[] = { 2 };
            p[0] = 5;
            try {
                z = x / ((b * b) - (4 * a * c));
                System.out.println("The value of z is " + z);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero in Arithmetic Expression");
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Array Index out of Bound Exception");
        }
    }
}
