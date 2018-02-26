package com.twu.biblioteca.models;

import java.util.ArrayList;

public class Library {

    private static ArrayList<Book> bookList;

    public static ArrayList<Book> getBookList() {
        if (bookList == null) {
            bookList = new ArrayList<Book>();
            initialSeed();
        }

        return bookList;
    }

    private static void initialSeed() {
        bookList.add(new Book("Clean Code", "Uncle Bob", 2008));
        bookList.add(new Book("Head First Java", "Kathy Sierra", 2003));
    }
}
