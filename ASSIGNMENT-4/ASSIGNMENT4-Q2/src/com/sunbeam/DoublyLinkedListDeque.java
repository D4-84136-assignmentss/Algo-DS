package com.sunbeam;

public class DoublyLinkedListDeque {
    private Node front;
    private Node rear;

    public DoublyLinkedListDeque() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Insert element at the front of the deque
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    // Insert element at the rear of the deque
    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    // Remove element from the front of the deque
    public int deleteFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty. Cannot delete from front.");
        }
        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        return data;
    }

    // Remove element from the rear of the deque
    public int deleteRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty. Cannot delete from rear.");
        }
        int data = rear.data;
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        return data;
    }

    // Get the element at the front of the deque
    public int getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty. No front element.");
        }
        return front.data;
    }

    // Get the element at the rear of the deque
    public int getRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty. No rear element.");
        }
        return rear.data;
    }

    // Print the elements of the deque from front to rear
    public void printDeque() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        Node current = front;
        System.out.print("Deque (front to rear): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
