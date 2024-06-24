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

        int leafCount = bst.countLeafNodes();
        System.out.println("Number of leaf nodes in the BST: " + leafCount);
    }
}
