package com.sunbeam;

public class main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Add nodes to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);

        // Print the list
        list.printList(); // Output: 0 1 2 3 

        // Delete a node from the list
        list.delete(2);

        // Print the list after deletion
        list.printList(); // Output: 0 1 3 

        // Search for an element
        System.out.println(list.search(1)); // Output: true
        System.out.println(list.search(2)); // Output: false

        // Get the size of the list
        System.out.println("Size: " + list.size()); // Output: 3

        // Check if the list is empty
        System.out.println("Is empty: " + list.isEmpty()); // Output: false

        // Clear the list
        list.delete(0);
        list.delete(1);
        list.delete(3);

        // Check if the list is empty after clearing
        System.out.println("Is empty: " + list.isEmpty()); // Output: true
    }
}
