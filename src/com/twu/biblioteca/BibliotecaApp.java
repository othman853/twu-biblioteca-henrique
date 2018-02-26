package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.presentation.UserInterface;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Clean Code", "Uncle Bob", 2008));
        bookList.add(new Book("Head First Java", "Kathy Sierra", 2003));

        System.out.println(UserInterface.buildWelcomeMessage() + "\n");
        System.out.println(UserInterface.buildStringForTheMenuOptions() + "\n");

        int chosenOption = UserInterface.waitForUserChoice();

        switch (chosenOption) {
            case 0:
                System.out.println("\n" + UserInterface.buildStringForABookList(bookList));
                break;
        }
    }
}
