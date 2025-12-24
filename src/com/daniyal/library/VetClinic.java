package com.daniyal.library;

import java.util.ArrayList;

public class VetClinic {

    private ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added: " + pet);
    }

    public void showPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    @Override
    public String toString() {
        return "VetClinic{totalPets=" + pets.size() + "}";
    }
}


