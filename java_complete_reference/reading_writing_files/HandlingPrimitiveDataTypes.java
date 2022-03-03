package com.java_complete_reference.reading_writing_files;

import java.io.*;
import java.util.StringTokenizer;

public class HandlingPrimitiveDataTypes {

    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\sagar\\Desktop\\first.txt"));

        // Reading from console
        System.out.println("Enter code number : ");
        st = new StringTokenizer(din.readLine());
        int code = Integer.parseInt(st.nextToken());

        System.out.println("Enter number of items : ");
        st = new StringTokenizer(din.readLine());
        int items = Integer.parseInt(st.nextToken());

        System.out.println("Enter cost : ");
        st = new StringTokenizer(din.readLine());
        double cost = Double.valueOf(st.nextToken());

        // Writing to the file "first.txt"
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);

        // processing data from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\sagar\\Desktop\\first.txt"));
        int codeNumber = dis.readInt();
        int totalItems = dis.readInt();
        double itemCost = dis.readDouble();
        double totalCost = totalItems * itemCost;
        dis.close();

        //writing to the console
        System.out.println();
        System.out.println("Code Number : " + codeNumber);
        System.out.println("Item Cost : " + itemCost);
        System.out.println("Total Items : " + totalItems);
        System.out.println("Total Cost :" + totalCost);
    }
}
