package com.java_complete_reference.reading_writing_files;

import java.io.FileInputStream;

public class AutomaticallyClosingFile {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\sagar\\Desktop");
        } catch (Exception ex) {
            Throwable[] suppress = ex.getSuppressed();
            System.out.println(suppress[0].toString());
        }
    }
}
