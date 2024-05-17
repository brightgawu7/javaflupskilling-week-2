package com.example.lab2.dataStructures.linkedList;

/**
 * Represents a node in a linked list.
 */
public class Node {
    private final int data;
    private Node next;

    /**
     * Constructs a new node with the given data.
     *
     * @param data The data to be stored in the node.
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Gets the data stored in this node.
     *
     * @return The data stored in this node.
     */
    public int getData() {
        return data;
    }

    /**
     * Gets the next node in the linked list.
     *
     * @return The next node in the linked list, or null if there is no next node.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node in the linked list.
     *
     * @param next The next node to be set.
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
