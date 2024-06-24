package com.sunbeam;

public class main {
    public static void main(String[] args) {
        MaxStack stack = new MaxStack();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Print the stack and current max
        stack.printStack();

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Print the stack and current max
        stack.printStack();

        // Push more elements
        stack.push(60);
        stack.push(70);

        // Print the stack and current max
        stack.printStack();
    }
}
