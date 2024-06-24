package com.sunbeam;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert a new node at the end of the list
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

    // Insert a new node after a given node
    public void insertAfter(int afterData, int newData) {
        Node current = head;
        while (current != null && current.data != afterData) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Insert a new node before a given node
    public void insertBefore(int beforeData, int newData) {
        if (head == null) return;

        if (head.data == beforeData) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != beforeData) {
            current = current.next;
        }
        if (current.next != null) {
            Node newNode = new Node(newData);
            newNode.next = current.next;
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

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
