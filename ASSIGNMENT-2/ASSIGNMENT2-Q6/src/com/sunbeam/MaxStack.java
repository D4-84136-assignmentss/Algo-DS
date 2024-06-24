package com.sunbeam;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        dataStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int item) {
        dataStack.push(item);
        if (maxStack.isEmpty() || item >= maxStack.peek()) {
            maxStack.push(item);
        }
    }

    public int pop() {
        if (dataStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        int popped = dataStack.pop();
        if (popped == maxStack.peek()) {
            maxStack.pop();
        }
        return popped;
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. No max value.");
        }
        return maxStack.peek();
    }

    public void printStack() {
        System.out.print("Data Stack: ");
        for (int i : dataStack) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Max Value: " + getMax());
    }
}
