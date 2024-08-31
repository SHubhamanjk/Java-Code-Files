// Today I created the function for reversing a string and a number using a stack.
// Also, I wrote the method to reverse a stack.

import java.util.*;

public class stack_day_2 {
    public static void main(String[] args) {
        // Using Stack implemented with ArrayList
        StackUsingArrayList stackArrayList = new StackUsingArrayList();
        stackArrayList.push(14);
        stackArrayList.push(55);
        stackArrayList.pushBottom(99);
        stackArrayList.push(442);
        
        // Reversing the stack and printing its contents
        stackArrayList.revese_stack(); 
        System.out.println();
        // Printing the reversed stack elements
        while (!stackArrayList.isEmpty()) {
            System.out.print(stackArrayList.pop() + " ");
        }
    }
}

// Implementing Stack using ArrayList
class StackUsingArrayList {
    private ArrayList<Integer> stack;

    // Constructor to initialize the stack
    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    // Method to push an element onto the stack
    public void push(int data) {
        stack.add(data);
    }

    // Method to view the top element of the stack without removing it
    public int peek() {
        if (stack.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    // Method to remove the top element from the stack and return it
    public int pop() {
        if (stack.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to add an element at the bottom of the stack
    public void pushBottom(int data) {
        stack.add(0, data);
    }

    // Method to reverse a string using a stack
    public void reverse(String word) {
        ArrayList<Character> stack_char = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            stack_char.add(0, word.charAt(i)); // Push each character onto the stack
        }
        for (int i = 0; i < stack_char.size(); i++) {
            System.out.print(stack_char.get(i)); // Print each character in reverse order
        }
    }

    // Method to reverse a number using a stack
    public void reverse(int num) {
        ArrayList<Character> stack_char = new ArrayList<>();
        String mnum = Integer.toString(num);
        for (int i = 0; i < mnum.length(); i++) {
            stack_char.add(0, mnum.charAt(i)); // Push each digit onto the stack
        }
        for (int i = 0; i < stack_char.size(); i++) {
            System.out.print(stack_char.get(i)); // Print each digit in reverse order
        }
    }

    // Method to reverse the stack using another temporary stack
    public void revese_stack() {
        StackUsingArrayList temp_stack = new StackUsingArrayList(); // Temporary stack for reversal
        int count = 1;
        while (count != stack.size() + 1) {
            int temp = stack.get(stack.size() - count); // Get the element from the original stack
            count++;
            temp_stack.push(temp); // Push the element onto the temporary stack
        }
        // Printing elements from the temporary stack (which is in reversed order)
        while (temp_stack.isEmpty() != true) {
            System.out.print(temp_stack.peek() + " ");
            temp_stack.pop(); // Remove the element from the temporary stack after printing
        }
    }
}
