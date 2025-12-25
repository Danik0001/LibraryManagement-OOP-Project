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

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public boolean isVip() {
        return vip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
        this.vip = numberOfPets > 2;
    }

    public void addPet() {
        numberOfPets++;
        vip = numberOfPets > 2;
    }

    @Override
    public String toString() {
        return "Owner{name='" + name + "', phone='" + phone +
                "', pets=" + numberOfPets + ", vip=" + vip + "}";
    }
}
