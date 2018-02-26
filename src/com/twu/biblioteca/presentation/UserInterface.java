package com.twu.biblioteca.presentation;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.ArrayList;

public class UserInterface {

    public static String buildWelcomeMessage() {
        return "Welcome to 'Biblioteca' Library Management System!";
    }

    public static String buildStringFor(ArrayList<Book> bookList) {
        String bookListToString = "";

        for (int i = 0; i < bookList.size(); i++) {
            bookListToString += "(" + i + ") " + bookList.get(i);
            if (i < bookList.size() - 1) bookListToString += "\n";
        }

        return bookListToString;
    }
}
