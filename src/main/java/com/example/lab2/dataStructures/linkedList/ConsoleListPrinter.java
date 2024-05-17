package com.example.lab2.dataStructures.linkedList;

public class ConsoleListPrinter implements ListPrinter {
    @Override
    public void printList(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
