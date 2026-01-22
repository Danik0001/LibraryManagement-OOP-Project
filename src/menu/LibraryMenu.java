package menu;

import com.daniyal.library.model.Librarian;
import com.daniyal.library.model.Owner;
import com.daniyal.library.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMenu implements Menu {

    private ArrayList<Person> people;
    private Scanner scanner;

    public LibraryMenu() {
        this.people = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        // Test data (optional but useful)
        people.add(new Owner("Ali", "87001234567", 2));
        people.add(new Librarian("Dana", "87007654321"));
    }

    @Override
    public void displayMenu() {
        System.out.println("\n==============================");
        System.out.println("     LIBRARY MANAGEMENT");
        System.out.println("==============================");
        System.out.println("1. Add Owner");
        System.out.println("2. Add Librarian");
        System.out.println("3. View All People");
        System.out.println("4. Demonstrate Polymorphism");
        System.out.println("0. Exit");
        System.out.println("==============================");
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addOwner();
                    case 2 -> addLibrarian();
                    case 3 -> viewAllPeople();
                    case 4 -> demonstratePolymorphism();
                    case 0 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("❌ Invalid option");
                }

            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private void addOwner() {
        System.out.println("\n--- Add Owner ---");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Number of pets: ");
        int pets = scanner.nextInt();
        scanner.nextLine();

        Owner owner = new Owner(name, phone, pets);
        people.add(owner);

        System.out.println("✅ Owner added");
    }

    private void addLibrarian() {
        System.out.println("\n--- Add Librarian ---");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        Librarian librarian = new Librarian(name, phone);
        people.add(librarian);

        System.out.println("✅ Librarian added");
    }

    private void viewAllPeople() {
        if (people.isEmpty()) {
            System.out.println("No people found.");
            return;
        }

        System.out.println("\n--- All People ---");
        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            System.out.println((i + 1) + ". " + p.getRole() + " → " + p);
        }
    }

    private void demonstratePolymorphism() {
        System.out.println("\n--- Polymorphism Demo ---");

        for (Person p : people) {
            System.out.println("Role: " + p.getRole());

            if (p instanceof Owner) {
                Owner o = (Owner) p;
                System.out.println("Pets: " + o.getNumberOfPets());
            } else if (p instanceof Librarian) {
                System.out.println("Manages library system");
            }

            System.out.println();
        }

        System.out.println("✅ Same parent (Person), different behavior");
    }
}

