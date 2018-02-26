package com.twu.biblioteca.presentation;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;

public class UserInterface {

    private static final String[] MENU_OPTIONS = {
            "List Books"
    };

    public static String buildWelcomeMessage() {
        return "Welcome to 'Biblioteca' Library Management System!";
    }

    public static String buildStringForTheMenuOptions() {
        String menuOptionsToString = "";

        for (int i = 0; i < MENU_OPTIONS.length; i++) {
            menuOptionsToString += "(" + i + ") " + MENU_OPTIONS[i].toUpperCase();
            if (i < MENU_OPTIONS.length - 1) menuOptionsToString += "\n";
        }

        return menuOptionsToString;
    }

    public static String buildStringForABookList(ArrayList<Book> bookList) {
        String listToString = "";

        for (int i = 0; i < bookList.size(); i++) {
            listToString += "(" + i + ") " + bookList.get(i);
            if (i < bookList.size() - 1) listToString += "\n";
        }

        return listToString;
    }
}
