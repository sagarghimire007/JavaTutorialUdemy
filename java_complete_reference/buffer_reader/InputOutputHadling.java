package com.java_complete_reference.buffer_reader;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputHadling {
    public static void main(String[] args) {

        byte[] name = { 'S' , 'A' , 'G' , 'A' , 'R' , '\n' , 'G' , 'H' , 'I' , 'M' , 'I' , 'R' , 'E' }; // byte array characters

        FileOutputStream fis = null;
        try {
            fis = new FileOutputStream("C:\\Users\\sagar\\Desktop\\first.txt");
            fis.write(name);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
