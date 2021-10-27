/*
implementation of a singly linked list
node class for this linked list is below the LinkedList class
many examples of methods you may want to implement
 */


package DataStructures;

import java.util.Objects;

class SinglyLinkedList {

    // linked list head instance variable
    public SinglyLinkedNode head;

    // linked list constructor with head null
    public SinglyLinkedList() {
        this.head = null;
    }

    // add new node to head of linked list
    public void addToHead(String data) {
        // create new node with passed data
        SinglyLinkedNode newHead = new SinglyLinkedNode(data);
        // stores the current head node or null
        SinglyLinkedNode currentHead = this.head;
        // set linked list head to new node
        this.head = newHead;
        // checks if there was a head, if so sets new head pointer to the prior head
        if (currentHead != null) {
            newHead.setNextNode(currentHead);
        }
    }

    // add node to tail of linked list
    public void addToTail(String data) {
        // stores linked list node, starting at head
        SinglyLinkedNode checkIfNodeExists = this.head;
        // checks if head exists, if not new node is set to head
        if (checkIfNodeExists == null) {
            this.head = new SinglyLinkedNode(data);
        } else {
            // loops through linked list checking if next node is null, checkIfNOdeExists == last node when done
            while (checkIfNodeExists.getNextNode() != null) {
                checkIfNodeExists = checkIfNodeExists.getNextNode();
            }
            // sets last node in linked list pointer to new node
            checkIfNodeExists.setNextNode(new SinglyLinkedNode(data));
        }
    }

    // remove head of linked list and returns data of removed head
    public void removeHead() {
        // sets variable to head node
        SinglyLinkedNode removedHead = this.head;
        // if head node is null prints string and exits out of method
        if (removedHead == null) {
            System.out.println("This Linked List Has No Head!");
            return;
        }
        // sets head to pointer node of removed head
        this.head = removedHead.getNextNode();
        // prints removed head data
        System.out.println("We Removed Head Node: |" + removedHead + "| With Data: |" + removedHead.data + "|");
    }

    // remove tail from linked list
    public void removeTail() {
        // sets currentNode to head of linked list
        SinglyLinkedNode currentNode = this.head;
        // checks if linked list has head
        if (currentNode == null) {
            System.out.println("This Linked List Has No Tail, No Head Either!");
            return;
        } else if (currentNode.getNextNode() == null) {
            System.out.println("Only One Node In This Linked List. Removing Head Node. This List Will Have No Nodes.");
            this.removeHead();
            return;
        } else {
            // loops through the linked list stopping at the second to last node
            while (currentNode.getNextNode().getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            // stores removed tail node to print
            SinglyLinkedNode removedTail = currentNode.getNextNode();
            // changes second to last node pointer to null
            currentNode.setNextNode(null);
            System.out.println("We Removed Tail Node: |" + removedTail + "| With Data: |" + removedTail.data + "|");
        }
    }

    // checks if list is empty and returns boolean
    public boolean isEmpty() {
        return (this.head == null);
    }

    // swaps 2 elements in singly linked list based of node data
    public void swapElements(String elm1, String elm2) {
        // checks if list is empty
        if (this.head == null) {
            System.out.println("This linked list is empty.");
            return;
        }
        // checks if elm to be switched are the same element
        else if (Objects.equals(elm1, elm2)) {
            System.out.println("Both elements are the same, no need to swap.");
            return;
        } else {
            // printing out what elements we are swapping
            System.out.println("Swapping " + elm1 + " with " + elm2 + " in linked list.");
        }
        // finding node with first elm parameter as nodes data
        SinglyLinkedNode node1 = this.head;
        SinglyLinkedNode node1Prev = null;
        while (node1 != null) {
            if (Objects.equals(node1.data, elm1)) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }
        // finding node with second elm parameter as nodes data
        SinglyLinkedNode node2 = this.head;
        SinglyLinkedNode node2Prev = null;
        while (node2 != null) {
            if (Objects.equals(node2.data, elm2)) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }
        // if node1 was head sets node2 to head, if not sets node1Prev next node to node2
        if (Objects.equals(node1Prev, null)) {
            this.head = node2;
        } else {
            node1Prev.setNextNode(node2);
        }
        // if node2 was head sets node1 to head, if not sets node2Prev next node to node1
        if (Objects.equals(node2Prev, null)) {
            this.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }
        // checks if either node1 or node2 are null
        if (Objects.equals(node1, null) || Objects.equals(node2, null)) {
            System.out.println("One of the data elements are not in the linked list.");
        // sets node1 to node2 next node, sets node2 to node1 next node
        } else {
            SinglyLinkedNode node1NextNode = node1.getNextNode();
            SinglyLinkedNode node2NextNode = node2.getNextNode();
            node1.setNextNode(node2NextNode);
            node2.setNextNode(node1NextNode);
        }

    }

    // prints linked list from head to tail
    public void printList() {
        // sets string output variable
        String output = "<Head>";
        // sets currentNode to linked list head
        SinglyLinkedNode currentNode = this.head;
        // loops through linked list adding its data to output
        while (currentNode != null) {
            output = output + " |" + currentNode.data + "| ";
            currentNode = currentNode.getNextNode();
        }
        // adds tail to output
        output += "<Tail>";
        System.out.println(output);
    }


    // main method
    public static void main(String[] args) {

        SinglyLinkedList test = new SinglyLinkedList();

        test.addToHead("A");
        test.addToTail("B");
        test.addToTail("C");
        test.printList();
        System.out.println();

        test.removeTail();
        test.printList();
        test.removeTail();
        test.printList();
        test.removeTail();
        test.printList();
        System.out.println();

        test.removeHead();
        test.removeTail();
        System.out.println("Is this list empty? " + test.isEmpty());
        System.out.println();

        test.addToTail("A");
        test.addToTail("B");
        test.addToTail("C");
        test.printList();
        System.out.println("Is this list empty? " + test.isEmpty());
        System.out.println();

        test.removeHead();
        test.printList();
        System.out.println();

        test.addToHead("A");
        test.printList();
        test.swapElements("A","C");
        test.printList();

    }
}

// This is the singly linked list node class used
class SinglyLinkedNode {

    // node instance variables
    public String data;
    private SinglyLinkedNode next;

    // node constructor
    public SinglyLinkedNode(String data) {
        this.data = data;
        this.next = null;
    }

    // set node next pointer to node passed in
    public void setNextNode(SinglyLinkedNode node) {
        this.next = node;
    }

    // get next node in the linked list of node
    public SinglyLinkedNode getNextNode() {
        return this.next;
    }
}

