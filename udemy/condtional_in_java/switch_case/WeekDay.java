package com.udemy.condtional_in_java.switch_case;

// input a number from 0 to 6 and return the name of the weekday

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of day : ");
        int dayNumber = sc.nextInt();
        System.out.println(determineNameOfDay(dayNumber));
    }

    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 1 : {
                result = "Sunday";
                break;
            }
            case 2 : {
                result = "Monday";
                break;
            }
            case 3 : {
                result = "Tuesday";
                break;
            }
            case 4 :{
                result =  "Wednesday";
                break;
            }
            case 5 :{
                result = "Thursday";
                break;
            }
            case 6 : {
                result =  "Friday";
                break;
            }
            case 7 :{
                result =  "Saturday";
                break;
            }
            default : {
                result =  "Invalid number for a week";
                break;
            }
        }
        return result;
    }
}
