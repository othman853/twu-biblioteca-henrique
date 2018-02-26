package com.twu.biblioteca.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testToString() {
        Book exampleBook = new Book("Title", "Author", 2018, false);
        assertEquals("AUTHOR, Title - 2018", exampleBook.toString());
    }
}