package com.udemy.loops_in_java;

// use the menu if you want to run the menu again and again
// if the user enters 5 exit the program and loop again if the menu selection is in the range 1 to 4

import java.util.Scanner;

public class MenuSelectionUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fisrt number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        System.out.println("1 - Add \n"+ "2 - Substract\n" + "3 - Divide\n" + "4 - Multiply\n" + "5 - Exit");
        performOperation(number1, number2);
    }


    public static void performOperation(int number1, int number2){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num != 5){
            System.out.println("Choose Operation : ");
            num = sc.nextInt();
            switch(num){
                case 1:{
                    System.out.println("Sum : " + (number1 + number2));
                    continue;
                }
                case 2 :{
                    System.out.println("Substract : " + (number1 - number2));
                    continue;
                }
                case 3:{
                    System.out.println("Divide : " + (number1 / number2));
                    continue;
                }
                case 4:{
                    System.out.println("Multiply : " + (number1 * number2));
                    continue;
                }
                case 5:{
                    continue;
                }
                default:{
                    System.out.println("Selected number is invalid .... Please Enter Again");
                    continue;
                }
            }
        }
    }
}
