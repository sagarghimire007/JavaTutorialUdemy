package com.udemy.condtional_in_java;

// using if else condition perform the operation
// program to take an integer input from user and perform the operation as mentioned in the menu below
// operation to performed are such as addition, substraction, division and multiplication
// take two integer input from the users


import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2 : ");
        int number2 = sc.nextInt();
        System.out.println("1. Add" + "\n" + "2. Substract" + "\n" + "3. Multiply" + "\n" + "4. Divide");
        System.out.println("Choose Opertation of above Menu : ");
        int choice = sc.nextInt();
        performOperationUsingNestedIfElse(number1, number2, choice);
    }

    private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
        if(choice == 1){
            System.out.println("Sum of two two number is : " + (number1 + number2));
        }else if(choice == 2){
            System.out.println("Difference of two number is : " + (number1 - number2));
        }else if(choice == 3){
            System.out.println("Multiplication of two number is : " + (number1 * number2));
        }else if(choice == 4){
            System.out.println("Division of two number is : " + (number1 / number2));
        }else{
            System.out.println("Invalid Menu Selection");
        }
    }
}
