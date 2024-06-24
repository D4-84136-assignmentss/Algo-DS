package com.sunbeam;

public class main {
    public static void main(String[] args) {
        DoublyLinkedListDeque deque = new DoublyLinkedListDeque();

        deque.insertFront(10);
        deque.insertFront(20);
        deque.insertRear(30);
        deque.insertRear(40);

        deque.printDeque();

        System.out.println("Front element: " + deque.getFront());
        System.out.println("Rear element: " + deque.getRear());

        System.out.println("Deleted front: " + deque.deleteFront());
        System.out.println("Deleted rear: " + deque.deleteRear());

        deque.printDeque();

        deque.insertFront(50);
        deque.insertRear(60);

        deque.printDeque();
    }
}
