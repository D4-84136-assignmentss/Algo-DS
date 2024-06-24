package com.sunbeam;

public class main {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Print the queue
        queue.printQueue();

        // Try to enqueue another element (should be full)
        queue.enqueue(60);

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Print the queue
        queue.printQueue();

        // Enqueue more elements
        queue.enqueue(60);
        queue.enqueue(70);

        // Print the queue
        queue.printQueue();

        // Peek at the front element
        System.out.println("Peek: " + queue.peek());

        // Print the size of the queue
        System.out.println("Queue size: " + queue.getSize());
    }
}
