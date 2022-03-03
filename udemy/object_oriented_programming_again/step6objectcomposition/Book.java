package com.udemy.object_oriented_programming_again.step6objectcomposition;

import com.headfirstjava.ploymorphismexample3.A;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private ArrayList<BookReview> reviews = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id=  id;
        this.name = name;
        this.author = author;
    }

    public void addReview(BookReview review){
        this.reviews.add(review);
    }

    public String toString(){
        return String.format("Book id = %d, Book Name = %s, Book Author =  %s\nReview = %s", id,name,author,reviews);
    }
}
