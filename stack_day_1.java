// Today I learned about the stack data structure and implemented it using both ArrayList and LinkedList.
// I also implemented the basic functions: push, pop, peek, and isEmpty for both implementations.
// Additionally, I created an external function, which is often asked in Amazon interviews, 
// to implement a "push bottom" function using ArrayList with O(1) time complexity.

import java.util.*;

public class stack_day_1 {
    public static void main(String[] args) {
        // Using Stack implemented with ArrayList
        StackUsingArrayList stackArrayList = new StackUsingArrayList();
        stackArrayList.push(14);
        stackArrayList.push(55);
        stackArrayList.pushBottom(99);
        stackArrayList.push(442);

        System.out.println("Stack using ArrayList:");
        while (!stackArrayList.isEmpty()) {
            System.out.println(stackArrayList.pop());
        }

        // Using Stack implemented with LinkedList
        StackUsingLinkedList stackLinkedList = new StackUsingLinkedList();
        stackLinkedList.push(14);
        stackLinkedList.push(55);
        stackLinkedList.pushBottom(99);
        stackLinkedList.push(442);

        System.out.println("Stack using LinkedList:");
        while (!stackLinkedList.isEmpty()) {
            System.out.println(stackLinkedList.pop());
        }
    }
}

// Implementing Stack using ArrayList
class StackUsingArrayList {
    private ArrayList<Integer> stack;

    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    public void push(int data) {
        stack.add(data);
    }

    public void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void pushBottom(int data) {
        stack.add(0, data);
    }
}

// Implementing Stack using LinkedList
class StackUsingLinkedList {
    private LinkedList<Integer> stack;

    public StackUsingLinkedList() {
        stack = new LinkedList<>();
    }

    public void push(int data) {
        stack.addFirst(data);
    }

    public void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(stack.getFirst());
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.removeFirst();
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void pushBottom(int data) {
        stack.addLast(data);
    }
}
