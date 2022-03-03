package com.headfirstjava.collections_in_java.set_collection.tree_set;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {

        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How cat works");
        Book b2 = new Book("Remix your body");
        Book b3 = new Book("Finding Emo");
        Book b4 = new Book("Finding Emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree.toString());
    }
}
