package com.sunbeam;

public class main {
    public static void main(String[] args) {
        DescendingStack stack = new DescendingStack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Print the stack
        stack.printStack();

        // Try to push another element (should be full)
        stack.push(60);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Print the stack
        stack.printStack();

        // Push more elements
        stack.push(60);
        stack.push(70);

        // Print the stack
        stack.printStack();

        // Peek at the top element
        System.out.println("Peek: " + stack.peek());

        // Print the size of the stack
        System.out.println("Stack size: " + stack.getSize());
    }
}
