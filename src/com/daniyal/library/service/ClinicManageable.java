package com.daniyal.library.service;

import com.daniyal.library.model.Owner;
import com.daniyal.library.model.Pet;

public interface ClinicManageable {

    void addOwner(Owner owner);

    void addPet(Pet pet);

    void showOwners();

    void showPets();
}

