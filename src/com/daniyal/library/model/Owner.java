package com.daniyal.library.model;

public class Owner extends Person {

    private int numberOfPets;
    private boolean vip;

    public Owner(String name, String phone, int numberOfPets) {
        super(name, phone);
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
        if (numberOfPets < 0) {
            throw new IllegalArgumentException("Number of pets cannot be negative");
        }
        this.numberOfPets = numberOfPets;
        this.vip = numberOfPets > 2;
    }

    public void addPet() {
        numberOfPets++;
        vip = numberOfPets > 2;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pets=" + numberOfPets +
                ", vip=" + vip +
                '}';
    }
}
