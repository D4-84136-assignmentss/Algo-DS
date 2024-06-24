package com.sunbeam;

public class DescendingStack {
    private int[] stack;
    private int top;
    private int size;

    public DescendingStack(int capacity) {
        stack = new int[capacity];
        top = capacity; // Initialize top to SIZE
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return top == 0;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        top--; // Decrement top
        stack[top] = item;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }
        int item = stack[top];
        top++; // Increment top
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }
        return stack[top];
    }

    public int getSize() {
        return size;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
