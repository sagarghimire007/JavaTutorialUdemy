package com.udemy.loops_in_java;

/* Exercise 1
    check whether a given number is prime or not, if its prime return true else return false

    Exercise 2
    get the number from user and sum the number upto its nth term

    Exercise 3
    sum of Divisiors excluding 1 and number itself

    Exercise 4
    print a number triangle
    for eg:
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */


public class MyNumber {

    private int number;

    public void setNumber(int number) {
        this.number = number;
        
    }

    // Exercise 1
    public boolean isPrime() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    // Exercise 2
    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    //Exercise 3
    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Exercise 4
    public void printANumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
