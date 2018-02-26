package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Library;
import com.twu.biblioteca.presentation.UserInterface;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = Library.getBookList();

        System.out.println(UserInterface.buildWelcomeMessage() + "\n");
        System.out.println(UserInterface.buildStringForTheMenuOptions() + "\n");

        int chosenOption;

        do {
            chosenOption = UserInterface.waitForUserChoice();

            switch (chosenOption) {
                case 1:
                    System.out.println("\n" + UserInterface.buildStringForABookList(bookList) + "\n");
                    break;
            }
        } while (chosenOption != 0);
    }
}
