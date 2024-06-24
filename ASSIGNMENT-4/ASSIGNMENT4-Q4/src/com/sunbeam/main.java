package com.sunbeam;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Undo");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int insertElement = scanner.nextInt();
                    list.insert(insertElement);
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    if (list.getUndoCount() < 5) {
                        list.undo();
                    } else {
                        System.out.println("Undo limit reached (5 operations). Cannot undo further.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
