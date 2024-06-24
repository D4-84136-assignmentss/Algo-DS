package com.sunbeam;

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

        int valueToFind = 4;
        int level = bst.getNodeLevel(valueToFind);
        if (level != -1) {
            System.out.println("The level of node with value " + valueToFind + " is: " + level);
        } else {
            System.out.println("Node with value " + valueToFind + " not found in the BST.");
        }
    }
}
