import java.util.*;

public class LL_day_3 {
    public static void main(String[] args) {
        // Create an instance of LinkedList
        LinkedList ll = new LinkedList();
        
        // Add elements to the beginning of the linked list
        ll.add_first(1);
        ll.add_first(5);
        
        // Add an element to the end of the linked list
        ll.add_last(12);
        
        // Add another element to the beginning of the linked list
        ll.add_first(-4);
        
        // Add an element at the specified index (2 in this case)
        ll.add(2, 2);

        // Print the linked list
        ll.print_LL();
        
        // Delete the nth node from the end of the linked list
        ll.delete_nth_from_end(2);
        
        // Print the linked list after deletion
        ll.print_LL();
        
        // Remove the last element of the linked list
        ll.remove_last();
        
        // Remove the first element of the linked list
        ll.remove_first();
        
        // Remove the last element of the linked list
        ll.remove_last();
        
        // Remove the first element of the linked list
        ll.remove_first();
        
        // Remove the first element of the linked list
        ll.remove_first();
        
        // Add elements to test for palindrome
        ll.add_first(1);
        ll.add_last(1);
        ll.add_first(2);
        ll.add_last(2);
        
        // Check if the linked list is a palindrome
        System.out.println(ll.check_palindrone());
        
        // Print the linked list
        ll.print_LL();
        
        // Print the linked list as an ArrayList
        ll.print_();
    }

    public static class LinkedList {
        // Node class to represent each element in the linked list
        public class Node {
            int data;  // Data stored in the node
            Node next; // Pointer to the next node in the linked list

            // Constructor to create a new node with given data
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head; // Head of the linked list
        public static Node tail; // Tail of the linked list
        public static int size = 1; // Size of the linked list

        // Method to add a node at the beginning of the linked list
        public void add_first(int data) {
            Node newNode = new Node(data); // Create a new node
            if (head == null) { // If the list is empty, both head and tail point to the new node
                head = tail = newNode;
                return;
            } else { // Otherwise, insert the new node at the beginning
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        // Method to add a node at the end of the linked list
        public void add_last(int data) {
            Node newNode = new Node(data); // Create a new node
            if (head == null) { // If the list is empty, both head and tail point to the new node
                head = tail = newNode;
                return;
            } else { // Otherwise, append the new node at the end
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Method to print the linked list
        public void print_LL() {
            if (head == null) { // If the list is empty, print a message
                System.out.println("LL Is empty");
            }
            Node temp = head; // Start from the head
            while (temp != null) { // Traverse the list until the end
                System.out.print(temp.data + "-->"); // Print each node's data
                temp = temp.next; // Move to the next node
            }
            System.out.println("Null"); // Indicate the end of the list
        }

        // Method to add a node at a specific index in the linked list
        public void add(int data, int idx) {
            if (idx == 0) {
                add_first(data); // If index is 0, add at the beginning
                return;
            }
            Node temp = head;
            int i = 0;
            Node newNode = new Node(data); // Create a new node
            while (i < idx - 1) { // Traverse to the node before the specified index
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next; // Insert the new node
            temp.next = newNode;
            size++;
        }

        // Method to get the size of the linked list
        public int size() {
            Node temp = head;
            int i = 1;
            while (temp.next != null) { // Traverse the list to count nodes
                temp = temp.next;
                i++;
            }
            return i;
        }

        // Method to remove the first node of the linked list
        public void remove_first() {
            if (head == null) {
                System.out.println("LL is Empty!!"); // If the list is empty
                return;
            } else if (size == 1) { // If there's only one node
                head = tail = null;
                size--;
                return;
            } else {
                Node temp = head.next;
                head = temp; // Move head to the next node
                size--;
            }
        }

        // Method to remove the last node of the linked list
        public void remove_last() {
            if (head == null) {
                System.out.println("LL Is Empty"); // If the list is empty
                return;
            } else if (size == 1) { // If there's only one node
                head = tail = null;
                size--;
                return;
            }
            Node temp = head;
            int i = 1;
            while (i != size - 1) { // Traverse to the second last node
                temp = temp.next;
                i++;
            }
            temp.next = null; // Remove the last node
            tail = temp; // Update the tail
            size--;
        }

        // Method to print the data of the head node
        public void print_head() {
            if (head == null) {
                System.out.println("LL is Empty"); // If the list is empty
                return;
            }
            System.out.println(head.data); // Print the data of the head node
        }

        // Method to print the data of the tail node
        public void print_tail() {
            if (head == null) {
                System.out.println("LL is Empty"); // If the list is empty
                return;
            }
            System.out.println(tail.data); // Print the data of the tail node
        }

        // Method to search for a specific value in the linked list
        public int search(int target) {
            Node temp = head;
            for (int i = 1; i <= size; i++) {
                if (temp.data == target) {
                    return i - 1; // Return the index if found
                } else {
                    temp = temp.next;
                }
            }
            return -1; // Return -1 if not found
        }

        // Recursive method to search for a specific value in the linked list
        public int search_rec(int target, Node temp, int i) {
            if (temp.data == target) {
                return i; // Return the index if found
            }
            return search_rec(target, temp.next, i + 1); // Recursively search the rest of the list
        }

        // Method to get the head node
        public Node get_head() {
            return head;
        }

        // Method to reverse the linked list
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev; // Set the last node as the new head
        }

        // Method to delete the nth node from the end of the linked list
        public void delete_nth_from_end(int n) {
            int target = size - n + 1;
            int i = 1;
            Node temp = head;
            while (i != target - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next; // Skip the nth node
        }

        // Method to check if the linked list is a palindrome
        public boolean check_palindrone() {
            ArrayList<Integer> temp = new ArrayList<>();
            Node temp2 = head;
            while (temp2 != null) {
                temp.add(temp2.data); // Add all elements to an ArrayList
                temp2 = temp2.next;
            }
            for (int i = 0; i < (temp.size()) / 2; i++) {
                if (!temp.get(i).equals(temp.get(temp.size() - 1 - i))) {
                    return false; // Return false if the list is not a palindrome
                }
            }
            return true; // Return true if the list is a palindrome
        }

        // Method to print the linked list as an ArrayList
        public void print_() {
            ArrayList<Integer> temp = new ArrayList<>();
            Node temp2 = head;
            while (temp2 != null) {
                temp.add(temp2.data); // Add all elements to an ArrayList
                temp2 = temp2.next;
            }
            System.out.println(temp); // Print the ArrayList
        }
    }
}
