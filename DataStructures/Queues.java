/*
implements a queue and relevant methods
uses doubly linked list
 */

package DataStructures;

public class Queues {

    // fields
    public DoublyLinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    // default constructor
    public Queues() {
        this(DEFAULT_MAX_SIZE);
    }

    // bounded constructor
    public Queues(int maxSize) {
        this.queue = new DoublyLinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    // add to queue
    public void enqueue(String data) {
        if (this.hasSpace()) {
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added " + data + "! Queue size is now " + this.size);
        } else {
            throw new Error("Queue is full!");
        }
    }

    // remove from queue
    public String dequeue() {
        if (!this.isEmpty()) {
            String data = this.peek();
            this.queue.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Queue size is now " + this.size);
            return data;
        } else {
            throw new Error("Queue is empty!");
        }
    }

    // peek at head
    public String peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.queue.head.data;
        }
    }

    // check if empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // check if bounded queue has space
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    public static void main(String[] args) {

        Queues boundedQueue = new Queues(3);
        boundedQueue.enqueue("latte");
        boundedQueue.enqueue("yea");

        System.out.println(boundedQueue.peek());


    }
}

