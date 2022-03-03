package com.udemy.collection_in_java.map_in_java;

public class HashMapBook {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int quantity;

    HashMapBook(Integer id , String name , String author , String publisher , int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }
}
