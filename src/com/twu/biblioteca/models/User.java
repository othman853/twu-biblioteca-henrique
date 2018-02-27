package com.twu.biblioteca.models;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class User {

    private static List<Book> books = new ArrayList<Book>();

    public static void checkOut(Book book, List<Book> bookList) {
        bookList.remove(book);
        books.add(book);
    }

    public static List<Book> getBooks() {
        return books;
    }
}
