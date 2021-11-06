package DataStructures;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/*
examples using Java built in data structures
and common methods of those structures
 */

public class BuiltInDataStructures {

    public static void main(String[] args) {


        System.out.println("============== Stack ==============");
        Stack<String> stack = new Stack<>();
        // add to top of stack
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        System.out.println(stack);
        // remove from top of stack
        stack.pop();
        System.out.println(stack);
        // return top of stack without removing
        System.out.println("Top of stack is " + stack.peek());
        // checks if stack is empty
        System.out.println(stack.empty());
        // search element place in stack, 1 is the top
        System.out.println("The place of \"Three\" in the stack is: " + stack.search("Three"));


        System.out.println("============== Queue ==============");
        Queue<String> queue = new LinkedList<String>();
        // enqueue to the back of the line
        queue.offer("One");
        queue.offer("Two");
        System.out.println(queue);
        // dequeue from the front of the line
        queue .poll();
        System.out.println(queue);
        // get head element without removing
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("One"));


    }

}
