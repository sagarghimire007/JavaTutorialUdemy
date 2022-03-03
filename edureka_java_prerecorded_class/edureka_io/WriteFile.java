package com.edureka_java_prerecorded_class.edureka_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fout = new FileOutputStream("src/edureka.txt");
        FileOutputStream fout = new FileOutputStream("src/edureka.txt" , true); //appending mode

        String str = "Java is one of the best programming language.";
        byte[] b = str.getBytes();
        fout.write(b);
        System.out.println("file created");
        fout.close();
    }
}
