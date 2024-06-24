package com.sunbeam;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Print the list in reverse order
    public void printReverse() {
        printReverseHelper(head);
        System.out.println();
    }

    // Helper method to print the list in reverse order using recursion
    private void printReverseHelper(Node node) {
        if (node == null) return;
        printReverseHelper(node.next);
        System.out.print(node.data + " ");
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
