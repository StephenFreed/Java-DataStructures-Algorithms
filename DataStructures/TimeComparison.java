package DataStructures;

import java.util.List;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ArrayDeque;

/*
test speed of different data structures with same operation
 */

public class TimeComparison {

    public static void main(String[] args) {
        // data structures
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // add to structures
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
            deque.add(i);
        }

        long startTime;
        long endTime;
        long elapsedTime;

        int number = 0;

        // =========== LinkedList ===========
        startTime = System.nanoTime();

        // do something
        linkedList.remove(number);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: " + elapsedTime);
        // =========== LinkedList ===========


        // =========== ArrayList  ===========
        startTime = System.nanoTime();

        // do something
        arrayList.remove(number);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: " + elapsedTime);
        // =========== LinkedList ===========


        // =========== Deque  ===========
        startTime = System.nanoTime();

        // do something
        deque.remove();

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Deque: " + elapsedTime);
        // =========== LinkedList ===========

    }

}
