package com.sunbeam;


public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add nodes to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Print the list
        System.out.print("List: ");
        list.printList(); // Output: 1 2 3 4 

        // Print the list in reverse order
        System.out.print("Reversed List: ");
        list.printReverse(); // Output: 4 3 2 1 
    }
}
