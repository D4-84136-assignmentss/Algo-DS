package com.sunbeam;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert nodes in sorted order
        list.insertSorted(5);
        list.insertSorted(1);
        list.insertSorted(3);
        list.insertSorted(2);
        list.insertSorted(4);

        // Print the sorted list
        System.out.print("Sorted List: ");
        list.printList(); // Output: 1 2 3 4 5 
    }
}
