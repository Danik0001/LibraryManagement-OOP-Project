package com.daniyal.library.model;

public class Owner extends Person {

    private int numberOfPets;
    private boolean vip;


    public Owner(int id, String name, String phone, int numberOfPets) {
        super(id, name, phone); // Person-ға ID-ні өткізу
        setNumberOfPets(numberOfPets);
    }

    @Override
    public String getRole() {
        return "Owner";
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public boolean isVip() {
        return vip;
    }

    public void setNumberOfPets(int numberOfPets) {
        // Талап бойынша (Week 6): Exception handling in setters [cite: 86, 213]
        if (numberOfPets < 0) {
            throw new IllegalArgumentException("Number of pets cannot be negative");
        }
        this.numberOfPets = numberOfPets;
        this.vip = numberOfPets > 2;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pets=" + numberOfPets +
                ", vip=" + vip +
                '}';
    }
}
