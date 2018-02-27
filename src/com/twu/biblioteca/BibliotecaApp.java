package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Library;
import com.twu.biblioteca.presentation.UserInterface;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = Library.getBookList();
        String hyphensLine = UserInterface.buildAHorizontalLine('-', 50);
        String asterisksLine = UserInterface.buildAHorizontalLine('=', 50);

        System.out.println(asterisksLine);
        System.out.println(UserInterface.buildWelcomeMessage());
        System.out.println(asterisksLine);

        int chosenOption;

        do {
            System.out.println(UserInterface.buildStringForTheMenuOptions());
            System.out.println(hyphensLine);
            chosenOption = UserInterface.waitForUserChoice();

            switch (chosenOption) {
                case 1:
                    System.out.println(hyphensLine);
                    System.out.println(UserInterface.buildStringForABookList(bookList));
                    System.out.println(hyphensLine);
                    break;
                case 2:
                    System.out.println("\n" + UserInterface.buildStringForABookList(bookList) + "\n");
                    Book chosenBook = UserInterface.waitForUserChooseABook(bookList);
                    chosenBook.checkOut();
                    break;
            }
        } while (chosenOption != 0);
    }
}
