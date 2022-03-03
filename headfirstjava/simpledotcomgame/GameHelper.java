package com.headfirstjava.simpledotcomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameHelper {
    public int getUserInput() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int guess = sn.nextInt();
        return guess;
//        String inputLine = null;
//        System.out.println(prompt + " ");
//        try {
//            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
//            inputLine = is.readLine();
//            if (inputLine.length() == 0) {
//                return null;
//            }
//        } catch (IOException e) {
//            System.out.println("IOException : " + e);
//        }
//        return inputLine;
    }
}
