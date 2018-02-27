package com.twu.biblioteca.models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void successfulCheckOutBook() {
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        availableBooks.add(new Book("A", "B", 2001, false));
        User.checkOut(availableBooks.get(0), availableBooks);
        assertTrue(availableBooks.size() == 0);
        assertFalse(User.getBooks().isEmpty());
    }
}