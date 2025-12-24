package com.daniyal.library;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Vet Clinic System ===");

        VetClinic clinic = new VetClinic();

        Owner owner1 = new Owner("Alex", "+77001234567", 1);
        Owner owner2 = new Owner("Anna", "+77007654321", 3);

        Pet pet1 = new Pet("Bobik", "Dog", 1, "Alex");
        Pet pet2 = new Pet("Murka", "Cat", 4, "Anna");

        clinic.addPet(pet1);
        clinic.addPet(pet2);

        System.out.println("\n--- All pets ---");
        clinic.showPets();

        System.out.println("\nIs Bobik young? " + pet1.isYoung());
        pet1.grow();
        System.out.println("Bobik after growing: " + pet1);

        System.out.println("\nOwners:");
        System.out.println(owner1);
        System.out.println(owner2);

        System.out.println("\n=== Program finished ===");
    }
}

