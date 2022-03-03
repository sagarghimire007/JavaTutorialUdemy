package com.udemy.loops_in_java;

/* get an input from a user and calculate its cube
   loop when a user input is positive and end the loop when the entered number is negative and give output
   message to the user if the entered number is negative
*/

import java.util.Scanner;

public class DoWhileLoop {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    Scanner sc = new Scanner(System.in);
    public void getUserInput(){
        System.out.println("Enter a number to get it's cube : ");
        setNumber(sc.nextInt());
    }

    public void printCubeNumber(){
        do{
            getUserInput();
            if(number < 0){
                System.out.println("Thank You! Have Fun!");
                break;
            }
            System.out.println((int) Math.pow(number, 3));
        }while(number > 0);
    }

    public void printEvenNumberWithContinue(){
        for(int  i = 1; i <= 10; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
