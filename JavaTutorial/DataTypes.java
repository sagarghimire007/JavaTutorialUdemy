package com.JavaTutorial;

public class DataTypes {
    int a = 10, b = 20;
    public void display(int a,int b)
    {
        a += 10;
        b += 10;
        System.out.println("The value of a is " + a + " and b is " +b);
    }
    public static void main(String[] args) {
        DataTypes dt = new DataTypes();
        int a = 10, b = 20;
        dt.display(a, b);
        System.out.println("The value of a is " + a + " and b is " +b);
    }
}
