package com.sunbeam;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add nodes to the list
        list.add(1);
        list.add(2);
        list.add(4);

        // Print the list
        System.out.print("Initial list: ");
        list.printList(); // Output: 1 2 4 

        // Insert a new node after a given node
        list.insertAfter(2, 3);
        System.out.print("After inserting 3 after 2: ");
        list.printList(); // Output: 1 2 3 4 

        // Insert a new node before a given node
        list.insertBefore(1, 0);
        System.out.print("After inserting 0 before 1: ");
        list.printList(); // Output: 0 1 2 3 4 

        list.insertBefore(3, 2); 
        System.out.print("After inserting 2 before 3: ");
        list.printList(); // Output: 0 1 2 2 3 4 
    }
}
