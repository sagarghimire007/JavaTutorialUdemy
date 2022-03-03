package com.java_complete_reference.buffer_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReadString {
    public static void main(String[] args) throws IOException {

        String text;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lines of text");
        System.out.println("Enter 'stop' to quit.");
        do {
            text = br.readLine();
            System.out.println(text);
        } while (!text.equals("stop"));
    }
}
