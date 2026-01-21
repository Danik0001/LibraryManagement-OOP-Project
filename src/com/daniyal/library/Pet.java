package com.daniyal.library;

public class Pet {

    private String name;
    private String species;
    private int age;
    private String ownerName;

    public Pet(String name, String species, int age, String ownerName) {
        setName(name);
        setSpecies(species);
        setAge(age);
        setOwnerName(ownerName);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Pet name cannot be empty");
        }
        this.name = name;
    }

    public void setSpecies(String species) {
        if (species == null || species.trim().isEmpty()) {
            throw new IllegalArgumentException("Species cannot be empty");
        }
        this.species = species;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new InvalidPetAgeException("Pet age cannot be negative");
        }
        this.age = age;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be empty");
        }
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", owner='" + ownerName + '\'' +
                '}';
    }
}
