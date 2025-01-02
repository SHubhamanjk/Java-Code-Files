// Main class to demonstrate the usage of the DoubleLinkedList
public class LL_day_6 {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList(); // Create a new DoubleLinkedList instance

        dll.add_first(6); // Add 6 to the beginning of the list
        dll.add_first(4); // Add 4 to the beginning of the list
        dll.add_last(19); // Add 19 to the end of the list
        dll.print(); // Print the current state of the list

        // dll.remove_last(); // Uncomment to remove the last element from the list

        dll.reverse(); // Reverse the list
        dll.print(); // Print the reversed list
    }

    // Inner class representing a Doubly Linked List
    public static class DoubleLinkedList {
        // Node class represents each element/node in the doubly linked list
        public class Node {
            int data; // Data stored in the node
            Node prev; // Pointer to the previous node
            Node next; // Pointer to the next node

            // Constructor to initialize a node with data
            public Node(int data) {
                this.data = data;
                this.prev = null; // Initially, the previous pointer is null
                this.next = null; // Initially, the next pointer is null
            }
        }

        // Head points to the first node of the list
        public static Node head;
        // Tail points to the last node of the list
        public static Node tail;

        // Method to add a node at the beginning of the list
        public void add_first(int data) {
            Node newNode = new Node(data); // Create a new node
            if (head == null) { // If the list is empty
                head = tail = newNode; // The new node is both head and tail
                return;
            } else {
                newNode.next = head; // Link the new node to the former head
                head.prev = newNode; // Set the previous of the old head to the new node
                head = newNode; // Update head to the new node
            }
        }

        // Method to add a node at the end of the list
        public void add_last(int data) {
            Node newNode = new Node(data); // Create a new node
            if (head == null) { // If the list is empty
                head = tail = newNode; // The new node is both head and tail
                return;
            } else {
                newNode.prev = tail; // Link the new node to the former tail
                tail.next = newNode; // Set the next of the old tail to the new node
                tail = newNode; // Update tail to the new node
            }
        }

        // Method to remove the first node from the list
        public void remove_first() {
            if (head == null) { // If the list is empty
                System.out.println("DLL is Empty"); // Print message
            } else if (head.next == null) { // If there is only one node
                head = tail = null; // Set both head and tail to null
            } else {
                head = head.next; // Move head to the next node
                head.prev = null; // Set the previous pointer of the new head to null
            }
        }

        // Method to remove the last node from the list
        public void remove_last() {
            if (head == null) { // If the list is empty
                System.out.println("DLL is Empty"); // Print message
            } else if (head.next == null) { // If there is only one node
                head = tail = null; // Set both head and tail to null
            } else {
                tail = tail.prev; // Move tail to the previous node
                tail.next = null; // Set the next pointer of the new tail to null
            }
        }

        // Method to print the list from head to tail
        public void print() {
            Node temp = head; // Start from the head
            System.out.print("Null-->"); // Print the start of the list
            while (temp != null) { // Traverse the list
                System.out.print(temp.data + "<-->"); // Print data of each node
                temp = temp.next; // Move to the next node
            }
            System.out.println("Null"); // Print the end of the list
        }

        // Method to reverse the doubly linked list
        public void reverse() {
            Node curr = head; // Start from the head
            Node prev = null; // Initialize previous as null
            Node next; // Will be used to store the next node during reversal

            while (curr != null) { // Traverse the list
                next = curr.next; // Store the next node
                curr.next = prev; // Reverse the next pointer of the current node
                curr.prev = next; // Reverse the prev pointer of the current node
                prev = curr; // Move prev to current node
                curr = next; // Move to the next node in the original list
            }
            head = prev; // Update head to the last node (new head) after reversal
        }
    }
}
