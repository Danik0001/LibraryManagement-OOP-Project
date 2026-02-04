package com.daniyal.library.model;

public abstract class Person {
    protected int id; // Базада Primary Key бар [cite: 41, 42]
    protected String name;
    protected String phone;

    public Person(int id, String name, String phone) {
        this.id = id;
        setName(name);
        setPhone(phone);
    }

    // Абстрактілі әдіс - соңында міндетті түрде ';' болуы керек
    public abstract String getRole();

    public int getId() { return id; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone cannot be empty");
        }
        this.phone = phone;
    }
}