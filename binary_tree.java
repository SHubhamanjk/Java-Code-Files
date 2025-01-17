import java.util.Scanner; 
public class binary_tree {

    
    public static class Node {
        int value; 
        Node right; 
        Node left;  

       
        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }


    public static class BinaryTree {
        Node root; 

        BinaryTree() {
            root = null;
        }

        public void add(int value) {
            if (root == null) {
                root = new Node(value);
                System.out.println("Inserted " + value + " as the root node.");
            } else {
                add_helper(root, value);
            }
        }

        public void add_helper(Node current, int value) {
            Scanner sc = new Scanner(System.in);

            // Show the current node's value
            System.out.println("Current Node Value is " + current.value);

            // Ask the user where to insert the new value
            System.out.print("Where do you want to insert " + value + "? (left/right of " + current.value + "): ");
            String direction = sc.nextLine().toLowerCase(); // Convert input to lowercase for consistency

            if (direction.equals("left")) {
                if (current.left == null) {
                    // If the left child is empty, insert the new node
                    current.left = new Node(value);
                    System.out.println("Inserted " + value + " to the left of " + current.value);
                } else {
                    // If the left child exists, recurse further
                    add_helper(current.left, value);
                }
            } else if (direction.equals("right")) {
                if (current.right == null) {
                    // If the right child is empty, insert the new node
                    current.right = new Node(value);
                    System.out.println("Inserted " + value + " to the right of " + current.value);
                } else {
                    // If the right child exists, recurse further
                    add_helper(current.right, value);
                }
            } else {
                // Invalid input handling
                System.out.println("Invalid input! Please type 'left' or 'right'.");
                add_helper(current, value); // Retry the current node
            }
        }

        // Method to display the tree using inorder traversal
        public void inorderTraversal(Node node) {
            if (node != null) {
                inorderTraversal(node.left);
                System.out.print(node.value + " ");
                inorderTraversal(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree(); // Create a new BinaryTree instance
        Scanner sc = new Scanner(System.in);

        // Loop to add multiple nodes
        System.out.println("Enter the number of nodes to insert:");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter the value for node " + (i + 1) + ":");
            int value = sc.nextInt();
            b1.add(value); // Add each value to the tree
            sc.nextLine(); // Consume newline character
        }

        // Print the tree in Inorder Traversal to verify structure
        System.out.println("\nInorder Traversal of the Tree:");
        b1.inorderTraversal(b1.root);
        System.out.println();
    }
}
