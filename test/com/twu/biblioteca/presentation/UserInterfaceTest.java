package com.twu.biblioteca.presentation;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserInterfaceTest {

    @Test
    public void testBuildWelcomeMessage() {
        assertEquals("Welcome to 'Biblioteca' Library Management System!", UserInterface.buildWelcomeMessage());
    }

    @Test
    public void testBuildStringForABookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Clean Code", "Uncle Bob", 2008));

        final String EXPECTED_RETURN = "(0) UNCLE BOB, Clean Code - 2008";

        assertEquals(EXPECTED_RETURN, UserInterface.buildStringFor(bookList));
    }
}