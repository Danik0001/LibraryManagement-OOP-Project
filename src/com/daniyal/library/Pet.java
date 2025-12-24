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

    public boolean isYoung() {
        return age < 2;
    }

    public void grow() {
        age++;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species +
                "', age=" + age + ", owner='" + ownerName + "'}";
    }
}
