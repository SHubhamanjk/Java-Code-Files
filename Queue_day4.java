import java.util.*;

public class Queue_day4 {
    public static void main(String args[]){
        // Create an instance of the custom queue class
        queue qq = new queue();

        // Add elements 1 to 10 to the queue
        for(int i=1; i<=10; i++){
            qq.add(i);
        }

        // Reverse the queue using the custom reverse method
        qq.reverse();

        // Print elements from the queue after reversing
        while(!qq.isEmpty()){
            System.out.print(qq.remove() + " ");
        }
    }

    // A method to interleave the elements of an array.
    // This method is not used in the current implementation, but it's designed
    // to print the first half and second half of the array alternately.
    public static void interleave(int arr[]){
        int temp = arr.length / 2;
        // Loop through the first half and second half of the array
        for(int i=0; i<temp; i++){
            System.out.print(arr[i] + " ");        // Print element from the first half
            System.out.print(arr[temp+i] + " ");   // Print element from the second half
        }
    }

    // Custom queue class with additional methods for interleaving and reversing
    public static class queue{
        // Use Java's built-in LinkedList as a queue to store integers
        Queue<Integer> q1 = new LinkedList<>();
        
        // Add an element to the queue
        public void add(int data){
            q1.offer(data);   // offer() adds an element to the queue
        }

        // Check if the queue is empty
        public boolean isEmpty(){
            return q1.isEmpty();
        }

        // Remove and return the front element from the queue
        public int remove(){
            return q1.poll();  // poll() retrieves and removes the head of the queue
        }

        // Peek at the front element without removing it
        public int peek(){
            return q1.peek();
        }

        // Interleave method to rearrange the queue by alternating the first half
        // and the second half of the queue elements
        public void interleave(){
            int temp = q1.size() / 2;        // Find half of the queue size
            int arr[] = new int[q1.size()];  // Temporary array to store elements

            // Move all queue elements into the array
            for(int i=0; i<2*temp; i++){
                arr[i] = q1.poll();
            }

            // Rearrange the elements in interleaved order
            for(int j=0; j<temp; j++){
                q1.offer(arr[j]);            // Add element from first half
                q1.offer(arr[temp+j]);       // Add element from second half
            }
        }

        // Reverse method to reverse the order of elements in the queue
        public void reverse(){
            Stack<Integer> s = new Stack<>();  // Use a stack to help reverse the queue

            // Transfer all queue elements into the stack (LIFO order)
            while(!q1.isEmpty()){
                s.push(q1.poll());
            }

            // Transfer the elements back from the stack to the queue (in reversed order)
            while(!s.isEmpty()){
                q1.offer(s.pop());
            }
        }
    }
}
