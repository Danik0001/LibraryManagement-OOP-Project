package com.daniyal.library.model;

public class Librarian extends Person {

    public Librarian(String name, String phone) {
        super(name, phone);
    }

    @Override
    public String getRole() {
        return "Librarian";
    }
}

