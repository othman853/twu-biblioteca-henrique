package com.twu.biblioteca.models;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private boolean checkedOut;

    public Book(String title, String author, int publicationYear, boolean checkedOut) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return author.toUpperCase() + ", " + title + " - " + publicationYear;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }
}
