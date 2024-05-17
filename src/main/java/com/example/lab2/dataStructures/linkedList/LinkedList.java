package com.example.lab2.dataStructures.linkedList;

/**
 * Represents a singly linked list.
 */
public class LinkedList {

    private Node head = null;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    /**
     * Adds a new node with the given data to the beginning of the linked list.
     *
     * @param data The data to be added to the beginning of the linked list.
     */
    public void addToBeginning(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }


    /**
     * Adds a new node with the given data to the end of the linked list.
     *
     * @param data The data to be added to the end of the linked list.
     */
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        lastNode.setNext(newNode);
    }

    /**
     * Adds a new node with the given data at the specified position in the linked list.
     *
     * @param data     The data to be added.
     * @param position The position at which the data should be added (zero-based index).
     */
    public void addAtPosition(int data, int position) {
        if (position == 0) {
            addToBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        for (int i = 0; currentNode != null && i < position - 1; i++) {
            currentNode = currentNode.getNext();
        }
        if (currentNode == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
    }

    /**
     * Searches for the specified key in the linked list.
     *
     * @param key The value to search for.
     * @return true if the key is found in the linked list, otherwise false.
     */
    public boolean search(int key) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == key) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    /**
     * Deletes the first occurrence of the specified key from the linked list.
     *
     * @param key The value to be deleted.
     */
    public void delete(int key) {
        Node currentNode = head;
        Node prevNode = null;

        if (currentNode != null && currentNode.getData() == key) {
            head = currentNode.getNext();
            return;
        }

        while (currentNode != null && currentNode.getData() != key) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            System.out.println("Element not found");
            return;
        }

        prevNode.setNext(currentNode.getNext());
    }
}
