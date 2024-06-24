package com.sunbeam;

public class main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Print the queue
        queue.printQueue();

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Print the queue
        queue.printQueue();

        // Enqueue more elements
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        // Print the queue
        queue.printQueue();

        // Peek at the front element
        System.out.println("Peek: " + queue.peek());

        // Print the size of the queue
        System.out.println("Queue size: " + queue.getSize());
    }
}
