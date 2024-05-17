package com.example.lab2.dataStructures.linkedList;

public class Main {
    /**
     * Main method to test the LinkedList implementation.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ListPrinter printer = new ConsoleListPrinter();

        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);

        printer.printList(list.getHead()); // Output: 1 2 3

        list.addToBeginning(0);
        printer.printList(list.getHead()); // Output: 0 1 2 3

        list.addAtPosition(4, 2);
        printer.printList(list.getHead()); // Output: 0 1 4 2 3

        System.out.println("Search 3: " + list.search(3)); // Output: true

        list.delete(2);
        printer.printList(list.getHead()); // Output: 0 1 4 3
    }
}
