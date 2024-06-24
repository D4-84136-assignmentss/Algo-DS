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
        System.out.print("Enter the value of the node to find its children: ");
        int value = scanner.nextInt();

        BST.Node node = bst.findNode(value);
        if (node != null) {
            if (node.left != null) {
                System.out.println("Left child of node with value " + value + " is: " + node.left.value);
            } else {
                System.out.println("Node with value " + value + " has no left child.");
            }
            if (node.right != null) {
                System.out.println("Right child of node with value " + value + " is: " + node.right.value);
            } else {
                System.out.println("Node with value " + value + " has no right child.");
            }
        } else {
            System.out.println("Node with value " + value + " does not exist in the BST.");
        }

        scanner.close();
    }
}
