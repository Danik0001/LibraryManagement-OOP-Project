package com.daniyal.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

