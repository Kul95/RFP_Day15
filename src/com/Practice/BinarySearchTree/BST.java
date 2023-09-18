package com.Practice.BinarySearchTree;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insertData(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = insertData(root.left, value);
        } else {
            root.right = insertData(root.right, value);
        }
        return root;
    }


    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        inorder(root.left);
        inorder(root.right);
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + "->");
    }


    public static void main(String[] args) {
        int values[] = {56, 30, 70,69,2,34};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertData(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}

