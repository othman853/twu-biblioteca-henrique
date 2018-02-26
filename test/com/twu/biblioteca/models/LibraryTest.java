package com.twu.biblioteca.models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testGetBookList() {
        ArrayList<Book> bookList = Library.getBookList();

        assertNotNull(bookList);
        assertEquals(2, bookList.size());
    }
}