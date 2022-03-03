package com.edureka.input_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        FileOutputStream fout = new FileOutputStream("src/com/edureka/input_output/java1.txt");
        String str = "edureka is into 24x7 online training";
        byte[] b = str.getBytes(); // convert a string to its ASCII (byte[])
        fout.write(b);
        System.out.println("File created");
        fout.close();
    }
}
