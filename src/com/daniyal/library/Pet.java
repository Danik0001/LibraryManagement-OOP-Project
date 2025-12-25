package com.daniyal.library;

public class Pet {

    private String name;
    private String species;
    private int age;
    private String ownerName;

    public Pet(String name, String species, int age, String ownerName) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isYoung() {
        return age < 2;
    }

    public void grow() {
        age++;
    }
}