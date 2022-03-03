package com.java_complete_reference.reading_writing_files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Return");
        }

        fin = new FileInputStream("C:\\Users\\sagar\\Desktop\\first.txt");
        int i = 0;
        while (i != -1) {
            i = fin.read();
            System.out.print((char) i);
        }
    }
}
