import java.util.*; // Importing the necessary Java utilities

public class LL_day_5 {
    public static void main(String[] args) {
        // Create an instance of LinkedList
        LinkedList ll2 = new LinkedList();

        // Add elements to the end of the linked list
        ll2.add_last(1);
        ll2.add_last(2);
        ll2.add_last(3);
        ll2.add_last(12);
        ll2.add_last(10);
        
        // Print the linked list before sorting
        ll2.print_LL();
        
        // Check if the linked list is a palindrome (Commented out in this code)
        // System.out.println(ll2.is_palindrome());
        // System.out.println(ll2.check_palindrone());
        
        // Sort the linked list (Commented out in this code)
        // ll2.sort();
        
        // Convert the linked list into a zigzag fashion
        ll2.zigZag();

        // Print the linked list after converting to zigzag
        ll2.print_LL();
    }

    public static class LinkedList {
        // Node class to represent each element in the linked list
        public class Node {
            int data;  // Data stored in the node
            Node next; // Pointer to the next node in the linked list

            // Constructor to create a new node with given data
            public Node(int data) {
                this.data = data;
                this.next = null; // Initially, next is set to null
            }
        }

        public static Node head; // Head of the linked list
        public static Node tail; // Tail of the linked list
        public static int size = 1; // Size of the linked list initialized to 1

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
            size++; // Increment the size of the list
        }

        // Method to find the middle node of the linked list
        public Node find_mid(Node head) {
            Node slow = head; // Slow pointer starts at the head
            Node fast = head; // Fast pointer also starts at the head

            // Move fast by two steps and slow by one step until fast reaches the end
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Slow pointer will now be at the middle of the list
            return slow;
        }

        // Method to check if the linked list is a palindrome
        public boolean is_palindrome() {
            if (head == null || head.next == null) {
                return true; // An empty list or a single node list is always a palindrome
            }

            // Find the middle node of the linked list
            Node midNode = find_mid(head);

            // Reverse the second half of the list starting from the middle node
            Node curr = midNode;
            Node prev = null;
            Node next;

            while (curr != null) {
                next = curr.next; // Store the next node
                curr.next = prev; // Reverse the current node's pointer
                prev = curr; // Move prev and curr one step forward
                curr = next;
            }

            Node right = prev; // Right half now starts from prev
            Node left = head; // Left half starts from head

            // Compare both halves
            while (right != null) {
                if (right.data != left.data) {
                    return false; // If mismatch found, return false
                }
                right = right.next; // Move to the next node in right half
                left = left.next; // Move to the next node in left half
            }

            return true; // If all nodes matched, return true
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
            size++; // Increment the size of the list
        }

        // Method to print the linked list
        public void print_LL() {
            if (head == null) { // If the list is empty, print a message
                System.out.println("LL is empty");
                return;
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

            Node temp = head; // Start from the head
            int i = 0; // Initialize a counter

            // Create a new node with the given data
            Node newNode = new Node(data);

            // Traverse to the node before the specified index
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }

            // Insert the new node at the specified index
            newNode.next = temp.next;
            temp.next = newNode;
            size++; // Increment the size of the list
        }

        // Method to get the size of the linked list
        public int size() {
            Node temp = head; // Start from the head
            int i = 1; // Initialize a counter

            // Traverse the list to count nodes
            while (temp.next != null) {
                temp = temp.next;
                i++;
            }

            return i; // Return the size of the list
        }

        // Method to reorder the linked list into a zigzag fashion
        public void zigZag() {
            Node midNode = find_mid(head); // Find the middle node

            // Reverse the second half of the list
            Node curr = midNode;
            Node prev = null;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev; // Right half now starts from prev
            Node left = head; // Left half starts from head

            Node rightN, leftN;

            // Reorder the nodes in zigzag fashion
            while (right != null && left != null) {
                leftN = left.next; // Store next nodes
                left.next = right; // Point current left node to right
                rightN = right.next;
                right.next = leftN; // Point current right node to left's next

                right = rightN; // Move to next nodes
                left = leftN;
            }
        }

        // Method to remove the first node of the linked list
        public void remove_first() {
            if (head == null) {
                System.out.println("LL is Empty!!"); // If the list is empty, print a message
                return;
            } else if (size == 1) { // If there's only one node
                head = tail = null; // Set head and tail to null
                size--;
                return;
            } else {
                Node temp = head.next; // Move head to the next node
                head = temp;
                size--;
            }
        }

        // Method to remove the last node of the linked list
        public void remove_last() {
            if (head == null) {
                System.out.println("LL Is Empty"); // If the list is empty, print a message
                return;
            } else if (size == 1) { // If there's only one node
                head = tail = null; // Set head and tail to null
                size--;
                return;
            }

            Node temp = head; // Start from the head
            int i = 1;

            // Traverse to the second last node
            while (i != size - 1) {
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
                System.out.println("LL is Empty"); // If the list is empty, print a message
                return;
            }

            System.out.println(head.data); // Print the data of the head node
        }

        // Method to print the data of the tail node
        public void print_tail() {
            if (head == null) {
                System.out.println("LL is Empty"); // If the list is empty, print a message
                return;
            }

            System.out.println(tail.data); // Print the data of the tail node
        }
    }
}
