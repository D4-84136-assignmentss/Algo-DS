package com.sunbeam;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);
        bst.add(6);
        bst.add(8);

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the node to find its parent: ");
        int value = scanner.nextInt();

        BST.Node parent = bst.findParent(value);
        if (parent != null) {
            System.out.println("The parent of node with value " + value + " is: " + parent.value);
        } else {
            System.out.println("Node with value " + value + " has no parent (it is the root node) or does not exist in the BST.");
        }

        scanner.close();
    }
}
