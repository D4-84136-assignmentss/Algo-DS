package com.sunbeam;


public class main {
    public static void main(String[] args) {
        // Test LinkedListStack
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.printStack();

        System.out.println("Peek: " + stack.peek());

        // Test LinkedListQueue
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.printQueue();

        System.out.println("Peek: " + queue.peek());
    }
}
