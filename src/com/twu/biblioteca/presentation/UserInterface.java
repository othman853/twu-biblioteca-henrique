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

    // TODO: Write tests for this method!!
    public static int waitForUserChoice() {
        Scanner input = new Scanner(System.in);

        System.out.print("Select an option: ");
        int userChoice = input.nextInt();

        if (userChoice < 0 || userChoice > MENU_OPTIONS.length - 1) try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Select a valid option!");
            waitForUserChoice();
        }

        return userChoice;
    }

    public static Book waitForUserChooseABook(ArrayList<Book> bookList) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a book: ");
        int userChoice = input.nextInt();

        if (userChoice < 0 || userChoice > bookList.size() - 1 || bookList.get(userChoice).isCheckedOut()) try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("That book is not available.");
            waitForUserChooseABook(bookList);
        }

        return bookList.get(userChoice);
    }
}
