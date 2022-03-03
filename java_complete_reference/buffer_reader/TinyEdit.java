package com.java_complete_reference.buffer_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        // create a buffer reader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equalsIgnoreCase("stop")) {
                break;
            }
        }
        System.out.println("\nHere is your file :");
        //display the lines
        for (int i = 0; i < 100; i++) {
            if (str[i].equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
