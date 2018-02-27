package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Library;
import com.twu.biblioteca.presentation.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = Library.getBookList();

        String equalSignsLine = UserInterface.buildAHorizontalLine('=', 50);
        String hyphensLine = UserInterface.buildAHorizontalLine('-', 50);

        System.out.println(equalSignsLine);
        System.out.println(UserInterface.buildWelcomeMessage());
        System.out.println(equalSignsLine);
        System.out.println(UserInterface.buildStringForTheMenuOptions());
        System.out.println(hyphensLine);

        Scanner input = new Scanner(System.in);

        System.out.print("Select your option: ");
        int chosenOption = input.nextInt();

        switch (chosenOption) {
            case 1:
                UserInterface.buildStringForABookList(bookList);
                break;
            case 2:
                UserInterface.buildStringForABookList(bookList);
                System.out.print("Choose a book: ");// INJECAO DE DEPENDENCIAS
                Book chosenBook = bookList.get(input.nextInt());
                chosenBook.checkOut();
                break;

        }
    }
}
