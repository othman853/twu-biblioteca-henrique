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
    public void testBuildStringForTheMenuOptions() {
        final String EXPECTED_RETURN = "(0) QUIT\n" +
                "(1) LIST BOOKS";

        assertEquals(EXPECTED_RETURN, UserInterface.buildStringForTheMenuOptions());
    }

    @Test
    public void testBuildStringForABookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("Random Title", "Random Author", 2018, false));
        bookList.add(new Book("Other Title", "Other Person", 2018, true));
        bookList.add(new Book("Another Title", "Another Person", 2018, false));

        final String EXPECTED_RETURN = "(0) RANDOM AUTHOR, Random Title - 2018\n" +
                "(2) ANOTHER PERSON, Another Title - 2018";

        assertEquals(EXPECTED_RETURN, UserInterface.buildStringForABookList(bookList));
    }

    @Test
    public void testWaitForUserChoice() {

    }
}