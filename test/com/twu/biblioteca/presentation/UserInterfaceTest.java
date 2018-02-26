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

        bookList.add(new Book("Random Title", "Random Author", 2018));
        bookList.add(new Book("Another Title", "Another Person", 2018));

        final String EXPECTED_RETURN = "(0) RANDOM AUTHOR, Random Title - 2018\n" +
                "(1) ANOTHER PERSON, Another Title - 2018";

        assertEquals(EXPECTED_RETURN, UserInterface.buildStringFor(bookList));
    }
}