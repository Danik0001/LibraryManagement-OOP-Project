package com.daniyal.library;

import com.daniyal.library.model.Owner;
import com.daniyal.library.model.Pet;
import com.daniyal.library.service.VetClinic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VetClinic clinic = new VetClinic();

        boolean running = true;

        while (running) {
            System.out.println("\n--- Vet Clinic Menu ---");
            System.out.println("1. Add owner");
            System.out.println("2. Add pet");
            System.out.println("3. Show owners");
            System.out.println("4. Show pets");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer cleanup

            switch (choice) {
                case 1 -> {
                    System.out.print("Owner name: ");
                    String name = scanner.nextLine();

                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Number of pets: ");
                    int pets = scanner.nextInt();
                    scanner.nextLine();

                    Owner owner = new Owner(name, phone, pets);
                    clinic.addOwner(owner);
                }

                case 2 -> {
                    System.out.print("Pet name: ");
                    String petName = scanner.nextLine();

                    System.out.print("Species: ");
                    String species = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Owner name: ");
                    String ownerName = scanner.nextLine();

                    Pet pet = new Pet(petName, species, age, ownerName);
                    clinic.addPet(pet);
                }

                case 3 -> clinic.showOwners();

                case 4 -> clinic.showPets();

                case 0 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }

                default -> System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}
