package com.edureka_java_prerecorded_class.edureka_io;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        File file = new File("src\\com\\edureka_java_prerecorded_class\\edureka_io\\java.txt");
        try {
//            FileInputStream fin = new FileInputStream(file);

//            System.out.println("Number of characters in the file : " + fin.available());
//            System.out.println((char) fin.read());

//            int n = fin.read(); // reads a byte of data from a file
//            while (n != -1) {  // reads until it reaches at the end of the stream. If it reaches end of the stream and no bytes are found it
//                // returns -1
//                System.out.print((char) n); // casting to a character
//                n = fin.read();
////                Thread.sleep(100);
//            }
// 
// 
// read file content completely
//            byte[] b = new byte[fin.available()];
//            fin.read(b);
//            String data = new String(b);
//            System.out.println(data);
//            fin.close();

            // to read file contents line by line
            //convert bytestream to character stream
            InputStreamReader source = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(source);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine(); //checking the next line
            }
            source.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
