package com.java_complete_reference.reading_writing_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RWFiles {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;

        // first confirm that both files have been specified
//        if (args.length != 2) {
//            System.out.println("Usage : CopyFile From to ");
//            return;
//        }

        // copy a file
        try {
            fin = new FileInputStream("C:\\Users\\sagar\\Desktop\\first.txt");
            fout = new FileOutputStream("C:\\Users\\sagar\\Desktop\\second.txt");
            int i = 0;
            while (i != -1) {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println("Error closing input file");
                }
                try {
                    if (fout != null) {
                        fout.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing output file");
                }
            }
        }
    }
}