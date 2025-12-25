package com.daniyal.library;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Vet Clinic System ===");

        VetClinic clinic = new VetClinic();

        clinic.setClinicName("Happy Vet Clinic");
        clinic.setAddress("Almaty");

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

        System.out.println("\nClinic name: " + clinic.getClinicName());
        System.out.println("Clinic address: " + clinic.getAddress());
        System.out.println("Total pets in clinic: " + clinic.getTotalPets());

        System.out.println("\nOwner info:");
        System.out.println(owner1);
        System.out.println(owner2);

        owner1.addPet();
        System.out.println("\nOwner after adding pet:");
        System.out.println(owner1);

        System.out.println("\n=== Program finished ===");
    }
}
