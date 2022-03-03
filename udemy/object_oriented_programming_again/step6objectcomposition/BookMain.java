package com.udemy.object_oriented_programming_again.step6objectcomposition;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented Programming in Java", "Ranga");
        book.addReview(new BookReview(10, "Great Book", 5));
        book.addReview(new BookReview(100, "Awsome", 4));

        System.out.println(book.toString());
    }
}
