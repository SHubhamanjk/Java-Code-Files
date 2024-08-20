public class LL_day_1 {
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

        // Print the linked list
        ll.print_LL();
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
    }
}
