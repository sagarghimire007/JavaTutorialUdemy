package com.udemy.condtional_in_java.switch_case;

/* puzzle 1 determines the name of the month....
    Enter the number and determine the name of the month
*/

/*
puzzle 2 determines the whether its a week day or a weekend

*/

import java.util.Scanner;

public class NameOfMonthUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to determine the name of month : ");
        int numberOfMonth = sc.nextInt();
        System.out.println(determineNameOfMonth(numberOfMonth));

        int numberForWeekDay = sc.nextInt();
        System.out.println(isWeekDay(numberForWeekDay));
    }

    // puzzle 1
    public static String determineNameOfMonth(int numberOfMonth){
        switch (numberOfMonth){
            case 1 : return "January";
            case 2 : return "February";
            case 3 : return "March";
            case 4 : return "April";
            case 5 : return "May";
            case 6 : return "June";
            case 7 : return "July";
            case 8 : return "August";
            case 9 : return "September";
            case 10 : return "October";
            case 11 : return "November";
            case 12 : return "December";
        }
        return "Invlaid_month";
    }

    // puzzle 2
    public static boolean isWeekDay(int dayNumber){
        switch(dayNumber){
            case 0 : return false;
            case 1 : return true;
            case 2 : return true;
            case 3 : return true;
            case 4 : return true;
            case 5 : return true;
            case 6 : return false;
        }
        return  false;
    }
}
