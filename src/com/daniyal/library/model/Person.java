package com.daniyal.library.model;

public abstract class Person {

    protected String name;
    protected String phone;

    public Person(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

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

    public abstract String getRole();
}

