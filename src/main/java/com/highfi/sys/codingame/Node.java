package com.highfi.sys.codingame;


public class Node {
    Node left, right;
    int value;

    public Node() {
    }

    public Node(int x) {
        value = x;
        left = right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public Node find(int v) {
        Node n = this;
        while (n != null) {
            if (v > n.value) {
                n = n.right;
            } else if (v < n.value) {
                n = n.left;
            } else {
                return n;
            }
        }
        return null;
    }
}
