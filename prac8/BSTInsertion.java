package prac8;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTInsertion {

    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        Node root = null;

        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("Inorder: ");
        inorder(root);
    }
}