package com.headfirstjava.collections_in_java.set_collection.tree_set;

public class Book implements Comparable<Book> {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }

    public String toString() {
        return title;
    }
}
