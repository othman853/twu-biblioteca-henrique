package com.twu.biblioteca.presentation;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private static final String[] MENU_OPTIONS = { //extrair p/ uma nova classe
            "Quit",
            "List Books",
            "Checkout a book"
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

    public static String buildStringForABookList(ArrayList<Book> bookList) { // rever o filtro dos livros checkedout
        String listToString = "";

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).isCheckedOut()) continue;
            listToString += "(" + i + ") " + bookList.get(i);
            if (i < bookList.size() - 1) listToString += "\n";
        }

        return listToString;
    }

    public static String buildAHorizontalLine(char key, int size) {
        String horizontalLine = "";

        for (int i = 0; i < size; i++) {
            horizontalLine += key;
        }

        return horizontalLine;
    }
}
