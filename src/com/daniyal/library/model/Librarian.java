package com.daniyal.library.model;

public class Librarian extends Person {

    // Конструкторға 'int id' қосылды
    public Librarian(int id, String name, String phone) {
        super(id, name, phone); // Енді Person талап еткен 3 аргумент те бар
    }

    @Override
    public String getRole() {
        return "Librarian";
    }
}
