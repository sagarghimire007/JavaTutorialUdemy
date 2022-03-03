package com.edureka.input_output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {

        // 1. to read data from files in bytes use FileInputStream
        FileInputStream inputStream = new FileInputStream("src/com/edureka/input_output/java.txt");
//        System.out.println("NO of Characters to read : " + inputStream.available());
//
//        int n = inputStream.read();
//        while (n != -1) {
//            System.out.print((char) n);
//            n = inputStream.read();
//            Thread.sleep(100);
//        }

        // 2. read file content completely
//        byte[] b = new byte[inputStream.available()];
//        inputStream.read(b);
//        String data = new String(b);
//        System.out.println(data);

        // 3. to read file contents line-by-line
        // convert byteStream to character Stream
        InputStreamReader source = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(source);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
            Thread.sleep(200);
        }

        inputStream.close();
        br.close();
    }
}
