package com.daniyal.library.menu;

import com.daniyal.library.database.LibraryDAO;
import java.util.Scanner;

public class LibraryMenu implements Menu {
    private Scanner scanner = new Scanner(System.in);
    private LibraryDAO dao = new LibraryDAO();

    @Override
    public void displayMenu() {
        System.out.println("\n1. Add Owner\n2. View All\n3. Delete\n4. Search\n0. Exit");
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addOwner();
                case 2 -> dao.getAllPeople();
                case 3 -> deleteWithConfirm();
                case 4 -> searchPerson();
                case 0 -> running = false;
            }
        }
    }

    private void addOwner() {
        System.out.print("Name: "); String n = scanner.nextLine();
        System.out.print("Phone: "); String p = scanner.nextLine();
        System.out.print("Pets count: "); int pts = scanner.nextInt();
        dao.insertOwner(n, p, pts);
    }

    private void deleteWithConfirm() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        System.out.print("Are you sure? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            dao.deletePerson(id);
            System.out.println("Deleted.");
        }
    }

    private void searchPerson() {
        System.out.print("Search name: ");
        dao.searchByName(scanner.next());
    }
}