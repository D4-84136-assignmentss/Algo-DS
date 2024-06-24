package com.sunbeam;

public class CircularLinkedList {
    private Node tail;

    public CircularLinkedList() {
        this.tail = null;
    }

    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // Point to itself to make it circular
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add a new node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    // Delete a node from the list
    public void delete(int data) {
        if (tail == null) return; // List is empty

        Node current = tail.next;
        Node prev = tail;
        do {
            if (current.data == data) {
                if (current == tail) {
                    if (tail == tail.next) {
                        tail = null;
                    } else {
                        prev.next = current.next;
                        tail = prev;
                    }
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }

    // Print the list
    public void printList() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return tail == null;
    }

    // Get the size of the list
    public int size() {
        if (tail == null) return 0;

        int count = 0;
        Node current = tail.next;
        do {
            count++;
            current = current.next;
        } while (current != tail.next);
        return count;
    }

    // Search for an element in the list
    public boolean search(int data) {
        if (tail == null) return false;

        Node current = tail.next;
        do {
            if (current.data == data) return true;
            current = current.next;
        } while (current != tail.next);
        return false;
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
