package com.daniyal.library;

import java.util.ArrayList;

public class VetClinic {

    private ArrayList<Pet> pets;
    private String clinicName;
    private String address;
    private int totalPets;

    public VetClinic() {
        this.pets = new ArrayList<>();
        this.clinicName = "Happy Vet";
        this.address = "Almaty";
        this.totalPets = 0;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getAddress() {
        return address;
    }

    public int getTotalPets() {
        return totalPets;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        totalPets++;
        System.out.println("Pet added: " + pet);
    }

    public void showPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    @Override
    public String toString() {
        return "VetClinic{name='" + clinicName +
                "', address='" + address +
                "', totalPets=" + totalPets + "}";
    }
}
