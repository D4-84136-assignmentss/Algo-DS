package com.sunbeam;

import java.util.Stack;

public class LinkedList {
    private Node head;
    private Stack<Node> operationStack;
    private int undoCount;

    public LinkedList() {
        this.head = null;
        this.operationStack = new Stack<>();
        this.undoCount = 0;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        operationStack.push(newNode); // Push operation onto stack for undo
        undoCount = 0; // Reset undo count after new operation
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        Node deletedNode = head;
        head = head.next;
        operationStack.push(deletedNode); // Push operation onto stack for undo
        undoCount = 0; // Reset undo count after new operation
    }

    public void undo() {
        if (!operationStack.isEmpty()) {
            Node lastOperation = operationStack.pop();
            if (lastOperation == head) {
                head = head.next;
            }
            undoCount++;
            System.out.println("Undo successful.");
        } else {
            System.out.println("Cannot undo. No more operations to undo.");
        }
    }

    public void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getUndoCount() {
        return undoCount;
    }
}
