/*
Implementation of a singly linked list
node class for this linked list is below the LinkedList class
 */

// comment out package to run file by itself
package DataStructures;

class LinkedList {

    // linked list head instance variable
    public SinglyLinkedNode head;

    // linked list constructor with head null
    public LinkedList() {
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

        LinkedList test = new LinkedList();

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

