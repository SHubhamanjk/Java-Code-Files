import java.util.ArrayList;

public class Queue_day2 {
    // Inner Stack class using ArrayList for stack operations
    public static class Stack {
        ArrayList<Integer> s = new ArrayList<>();

        // Push an element onto the stack
        public void push(int data) {
            s.add(data);
        }

        // Pop the top element from the stack (LIFO)
        public int pop() {
            if (s.size() == 0) {
                return -1; // Stack is empty
            }
            return s.remove(s.size() - 1);
        }

        // Peek at the top element without removing it
        public int peek() {
            if (s.size() == 0) {
                return -1; // Stack is empty
            }
            return s.get(s.size() - 1);
        }

        // Return the size of the stack
        public int size() {
            return s.size();
        }
    }

    // Two stacks for enqueue and dequeue operations
    Stack s = new Stack();
    Stack s2 = new Stack();

    // Enqueue operation: add an element to the queue
    public void enqueue(int data) {
        s.push(data);
    }

    // Rear operation: return the last element added to the queue
    public int rear() {
        return s.peek();
    }

    // Dequeue operation: remove and return the front element of the queue
    public int dequeue() {
        // Transfer elements from s to s2 only if s2 is empty
        if (s2.size() == 0) {
            while (s.size() != 0) {
                s2.push(s.pop());
            }
        }

        // If s2 still has elements, pop from s2
        if (s2.size() != 0) {
            return s2.pop();
        }

        // If both stacks are empty, the queue is empty
        System.out.println("Queue is empty.");
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        Queue_day2 queue = new Queue_day2();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Rear element: " + queue.rear()); // Should print 30

        System.out.println("Dequeued: " + queue.dequeue());  // Should print 10
        System.out.println("Dequeued: " + queue.dequeue());  // Should print 20

        queue.enqueue(40);
        System.out.println("Rear element: " + queue.rear()); // Should print 40

        System.out.println("Dequeued: " + queue.dequeue());  // Should print 30
        System.out.println("Dequeued: " + queue.dequeue());  // Should print 40
    }
}
