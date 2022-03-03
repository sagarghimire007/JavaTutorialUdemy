package com.headfirstjava.primitiveandreference;

public class Book {
    public String title;
    public String author;

    public static void main(String[] args) {
        Book[] myBooks = new Book[3];
        for(int i = 0; i < 3; i++){
            myBooks[i] = new Book();

        }
    }
}
