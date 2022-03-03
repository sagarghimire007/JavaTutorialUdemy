package com.java_complete_reference.buffer_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderIO {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        System.out.println("Enters characters,  'q' to quit.");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
