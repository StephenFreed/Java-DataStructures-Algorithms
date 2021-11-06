package DataStructures;

/*
implementation of a doubly linked list
node class for this linked list is below the DoublyLinkedList class
 */

class DoublyLinkedList {

    // instance variables
    public DoublyLinkedNode head;
    public DoublyLinkedNode tail;

    // constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // add to head
    public void addToHead(String data) {
        DoublyLinkedNode newHead = new DoublyLinkedNode(data);
        DoublyLinkedNode currentHead = this.head;
        if (currentHead != null) {
            newHead.setNextNode(currentHead);
            currentHead.setPreviousNode(newHead);
        }
        this.head = newHead;
        // checks if tail is null, meaning we created a list on this call, sets head node to tail node
        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    // add to tail
    public void addToTail(String data) {
        DoublyLinkedNode newTail = new DoublyLinkedNode(data);
        DoublyLinkedNode currentTail = this.tail;
        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;
        // Checks if head node is null, meaning we created a list on this call, sets head node to tail node
        if (this.head == null) {
            this.head = newTail;
        }
    }

    // remove head node
    public void removeHead() {
        DoublyLinkedNode removedHead = this.head;
        if (removedHead == null) {
            System.out.println("This Linked List Has No Head!");
            return;
        }
        // sets head to next node, could be null if only one element in linked list
        this.head = removedHead.getNextNode();
        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        // checks if head was also tail, if so sets tail to null since node is removed
        if (removedHead == this.tail) {
            this.tail = null;
        }
        System.out.println("We Removed Head Node: |" + removedHead + "| With Data: |" + removedHead.data + "|");
    }

    // remove tail node
    public void removeTail() {
        DoublyLinkedNode removedTail = this.tail;
        if (removedTail == null) {
            System.out.println("This Linked List Has No Tail, No Head Either!");
            return;
        }
        // sets tail to previous node, could be null if only one element in linked list
        this.tail = removedTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        // checks if removed tail was also the head, if so head is set to null since node is removed
        if (removedTail == this.head) {
            this.head = null;
            System.out.println("We Removed Tail Node That Was Also The Head Node: |" + removedTail + "| With Data: |" + removedTail.data + "|");
            return;
        }
        System.out.println("We Removed Tail Node: |" + removedTail + "| With Data: |" + removedTail.data + "|");
    }

    // removes node by data
    public void removeByData(String data) {
        DoublyLinkedNode currentNode = this.head;
        DoublyLinkedNode nodeToRemove = null;

        // loops through linked list checking for data, finds node to remove
        while (currentNode != null) {
            if (currentNode.data == data) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }

        // if loop through linked list doesn't change nodeToRemove from null to a node, breaks out of method after printing
        if (nodeToRemove == null) {
            System.out.println("There Was No Node With Data: |" + data + "|");
            return;
        }

        if (nodeToRemove == this.head) {
            this.removeHead();
        } else if (nodeToRemove == this.tail) {
            this.removeTail();
        } else {
            DoublyLinkedNode nextNode = nodeToRemove.getNextNode();
            DoublyLinkedNode previousNode = nodeToRemove.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNextNode(nextNode);
            System.out.println("We Removed Node: |" + nodeToRemove + "| With data: |" +  nodeToRemove.data + "|");
        }
    }

    // checks if list is empty and returns boolean
    public boolean isEmpty() {
        return (this.head == null && this.tail == null);
    }

    // prints out linked list
    public void printList() {
        String output = "<Head>";
        DoublyLinkedNode currentNode = this.head;
        while (currentNode != null) {
            output = output + " |" + currentNode.data + "| ";
            currentNode = currentNode.getNextNode();
        }
        output += "<Tail>";
        System.out.println(output);
    }

    public static void main(String[] args) {
        DoublyLinkedList test = new DoublyLinkedList();

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

        test.removeByData("B");
        test.printList();
        System.out.println();

        test.removeHead();
        test.printList();


    }
}

// This is the doubly linked list node class used
class DoublyLinkedNode {

    // instance variables
    public String data;
    private DoublyLinkedNode next;
    private DoublyLinkedNode previous;

    // constructor
    public DoublyLinkedNode(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    // set next node
    public void setNextNode(DoublyLinkedNode node) {
        this.next = node;
    }

    // set previous node
    public void setPreviousNode(DoublyLinkedNode node) {
        this.previous = node;
    }

    // get next node
    public DoublyLinkedNode getNextNode() {
        return this.next;
    }

    // get previous node
    public DoublyLinkedNode getPreviousNode() {
        return this.previous;
    }
}
