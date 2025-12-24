package com.daniyal.library;

public class Owner {

    private String name;
    private String phone;
    private int numberOfPets;
    private boolean vip;

    public Owner(String name, String phone, int numberOfPets) {
        this.name = name;
        this.phone = phone;
        this.numberOfPets = numberOfPets;
        this.vip = numberOfPets > 2;
    }

    public void addPet() {
        numberOfPets++;
        vip = numberOfPets > 2;
    }

    public boolean isVip() {
        return vip;
    }

    @Override
    public String toString() {
        return "Owner{name='" + name + "', phone='" + phone +
                "', pets=" + numberOfPets + ", vip=" + vip + "}";
    }
}

