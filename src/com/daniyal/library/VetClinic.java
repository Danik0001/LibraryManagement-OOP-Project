package com.daniyal.library;

import java.util.ArrayList;
import java.util.List;

public class VetClinic implements ClinicManageable {

    private List<Owner> owners;
    private List<Pet> pets;

    public VetClinic() {
        owners = new ArrayList<>();
        pets = new ArrayList<>();
    }

    @Override
    public void addOwner(Owner owner) {
        if (owner == null) {
            throw new IllegalArgumentException("Owner cannot be null");
        }
        owners.add(owner);
    }

    @Override
    public void addPet(Pet pet) {
        if (pet == null) {
            throw new IllegalArgumentException("Pet cannot be null");
        }
        pets.add(pet);
    }

    @Override
    public void showOwners() {
        if (owners.isEmpty()) {
            System.out.println("No owners found");
            return;
        }
        for (Owner owner : owners) {
            System.out.println(owner);
        }
    }

    @Override
    public void showPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets found");
            return;
        }
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
