// // import java.util.Scanner; 
// public class binary_tree {

    
//     public static class Node {
//         int value; 
//         Node right; 
//         Node left;  

       
//         Node(int value) {
//             this.value = value;
//             this.left = null;
//             this.right = null;
//         }
//     }


//     // public static class BinaryTree {
//     //     Node root; 

//     //     BinaryTree() {
//     //         root = null;
//     //     }

//     //     public void add(int value) {
//     //         if (root == null) {
//     //             root = new Node(value);
//     //             System.out.println("Inserted " + value + " as the root node.");
//     //         } else {
//     //             add_helper(root, value);
//     //         }
//     //     }

//     //     public void add_helper(Node current, int value) {
//     //         Scanner sc = new Scanner(System.in);

//     //         // Show the current node's value
//     //         System.out.println("Current Node Value is " + current.value);

//     //         // Ask the user where to insert the new value
//     //         System.out.print("Where do you want to insert " + value + "? (left/right of " + current.value + "): ");
//     //         String direction = sc.nextLine().toLowerCase(); // Convert input to lowercase for consistency

//     //         if (direction.equals("left")) {
//     //             if (current.left == null) {
//     //                 // If the left child is empty, insert the new node
//     //                 current.left = new Node(value);
//     //                 System.out.println("Inserted " + value + " to the left of " + current.value);
//     //             } else {
//     //                 // If the left child exists, recurse further
//     //                 add_helper(current.left, value);
//     //             }
//     //         } else if (direction.equals("right")) {
//     //             if (current.right == null) {
//     //                 // If the right child is empty, insert the new node
//     //                 current.right = new Node(value);
//     //                 System.out.println("Inserted " + value + " to the right of " + current.value);
//     //             } else {
//     //                 // If the right child exists, recurse further
//     //                 add_helper(current.right, value);
//     //             }
//     //         } else {
//     //             // Invalid input handling
//     //             System.out.println("Invalid input! Please type 'left' or 'right'.");
//     //             add_helper(current, value); // Retry the current node
//     //         }
//     //     }

    

//     //     // Method to display the tree using inorder traversal
//         // public void inorderTraversal(Node node) {
//         //     if (node != null) {
//         //         inorderTraversal(node.left);
//         //         System.out.print(node.value + " ");
//         //         inorderTraversal(node.right);
//         //     }
//         // }
//     // }

//     public static class BinarySearchTree{
//         Node root;
//         public BinarySearchTree(){
//             this.root = null;
//         }

//         public void add(int value){
//             if(root==null){
//                 root=new Node(value);
//             }
//             add_helper_bst(value,root);
//         }

//         public void add_helper_bst(int value,Node root){
//             if(root.value>value){
//                 if(root.right==null){
//                     root.right=new Node(value);
//                 }
//                 add_helper_bst(value,root.right);
//             }
//             else{
//                 if(root.left==null){
//                     root.left=new Node(value);
//                 }
//                 add_helper_bst(value,root.left);
//             }   
//         }

//         public boolean is_empty(){
//             return root==null;
//         }

//         public int get_height(){
//             if(root==null){
//                 return 0;
//             }
//             return get_height_helper(root);
//         }

//         public int get_height_helper(Node root){
//             if(root==null){
//                 return 0;
//             }
//             int left_height=get_height_helper(root.left);
//             int right_height=get_height_helper(root.right);
//             return Math.max(left_height, right_height)+1;
//         }

//         public void inorderTraversal(Node node) {
//             if (node != null) {
//                 inorderTraversal(node.left);
//                 System.out.print(node.value + " ");
//                 inorderTraversal(node.right);
//             }
//         }

//     }

//     public static void main(String[] args) {
//         BinarySearchTree b1 = new BinarySearchTree(); // Create a new BinaryTree instance
//         // Scanner sc = new Scanner(System.in);
//         b1.add(5);
//         b1.add(8);
//         b1.add(4);
//         b1.add(16);
//         b1.add(7);

//         // Print the tree in Inorder Traversal to verify structure
//         System.out.println("\nInorder Traversal of the Tree:");
//         b1.inorderTraversal(b1.root);
//         System.out.println();

//         // Print the height of the tree
//         System.out.println("Height of the Tree: " + b1.get_height());
//         // Loop to add multiple nodes
//         // System.out.println("Enter the number of nodes to insert:");
//         // int numNodes = sc.nextInt();

//         // for (int i = 0; i < numNodes; i++) {
//         //     System.out.println("Enter the value for node " + (i + 1) + ":");
//         //     int value = sc.nextInt();
//         //     b1.add(value); // Add each value to the tree
//         //     sc.nextLine(); // Consume newline character
//         // }

//         // // Print the tree in Inorder Traversal to verify structure
//         // System.out.println("\nInorder Traversal of the Tree:");
//         // b1.inorderTraversal(b1.root);
//         // System.out.println();
//     }
// }








// public class binary_tree {

//     public static class Node {
//         int value;
//         Node left, right;

//         Node(int value) {
//             this.value = value;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static class BinarySearchTree {
//         Node root;

//         public BinarySearchTree() {
//             this.root = null;
//         }

//         public void add(int value) {
//             if (root == null) {
//                 root = new Node(value);
//             } else {
//                 add_helper_bst(value, root);
//             }
//         }

//         public void add_helper_bst(int value, Node root) {
//             if (value < root.value) {
//                 if (root.left == null) {
//                     root.left = new Node(value);
//                 } else {
//                     add_helper_bst(value, root.left);
//                 }
//             } else {
//                 if (root.right == null) {
//                     root.right = new Node(value);
//                 } else {
//                     add_helper_bst(value, root.right);
//                 }
//             }
//         }

//         public boolean is_empty() {
//             return root == null;
//         }

//         public int get_height() {
//             if (root == null) {
//                 return 0;
//             }
//             return get_height_helper(root);
//         }

//         public int get_height_helper(Node root) {
//             if (root == null) {
//                 return 0;
//             }
//             int left_height = get_height_helper(root.left);
//             int right_height = get_height_helper(root.right);
//             return Math.max(left_height, right_height) + 1;
//         }

//         public boolean is_balanced(){
//             if(root==null){
//                 return false;
//             }
//             return is_balanced_helper(root);
//         }

//         public boolean is_balanced_helper(Node root){
//             if(root==null){
//                 return true;
//             }
//             if(Math.abs((get_height_helper(root.left)-get_height_helper(root.right)))>=1){
//                 return false;
//             }
//             else{
//                 is_balanced_helper(root.left);
//                 is_balanced_helper(root.right);
//             }
//         }

//         public void inorderTraversal(Node node) {
//             if (node != null) {
//                 inorderTraversal(node.left);
//                 System.out.print(node.value + " ");
//                 inorderTraversal(node.right);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         BinarySearchTree b1 = new BinarySearchTree();

//         b1.add(5);
//         b1.add(8);
//         b1.add(4);
//         b1.add(16);
//         b1.add(7);

//         // Print the tree in Inorder Traversal to verify structure
//         System.out.println("\nInorder Traversal of the Tree:");
//         b1.inorderTraversal(b1.root);
//         System.out.println();

//         // Print the height of the tree
//         System.out.println("Height of the Tree: " + b1.get_height());
//     }
// }







// Revising
import java.util.Scanner;

public class binary_tree {
    public static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        public void add() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value you want to add: ");
            int value = sc.nextInt();
            sc.nextLine(); // Consume newline
            if (root == null) {
                root = new Node(value);
                return;
            }
            System.out.print("In which direction (left/right) you want to add? ");
            String direction = sc.nextLine().trim().toLowerCase();

            if (!direction.equals("left") && !direction.equals("right")) {
                System.out.println("Invalid direction! Please use 'left' or 'right'.");
                return;
            }

            addHelper(value, root, direction);
        }

        private void addHelper(int value, Node root, String direction) {
            if (direction.equals("left")) {
                if (root.left == null) {
                    root.left = new Node(value);
                } else {
                    addHelper(value, root.left, direction);
                }
            } else { // right
                if (root.right == null) {
                    root.right = new Node(value);
                } else {
                    addHelper(value, root.right, direction);
                }
            }
        }

        public void preorder(Node root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        public void height(){
            if(root==null){
                System.out.println(0);
                return;
            }
            System.out.println(height_helper(root));
        }

        public int height_helper(Node root){
            if(root==null){
                return 0;
            }
            return (Math.max(height_helper(root.left), height_helper(root.right)))+1;

        }
    }

    public static class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            root = null;
        }

        public void add(int value) {
            if (root == null) {
                root = new Node(value);
            } else {
                addHelperBST(value, root);
            }
        }

        private void addHelperBST(int value, Node root) {
            if (value < root.value) {
                if (root.left == null) {
                    root.left = new Node(value);
                } else {
                    addHelperBST(value, root.left);
                }
            } else {
                if (root.right == null) {
                    root.right = new Node(value);
                } else {
                    addHelperBST(value, root.right);
                }
            }
        }

        public void preorder(Node root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        public void height(){
            if(root==null){
                System.out.println(0);
                return;
            }
            System.out.println(height_helper(root));
        }

        public int height_helper(Node root){
            if(root==null){
                return 0;
            }
            return (Math.max(height_helper(root.left), height_helper(root.right)))+1;

        }

        public boolean is_balanced(){
            if(root==null){
                return true;
            }
            return is_balanced_helper(root);
        }

        public boolean is_balanced_helper(Node root){
            if(root==null){
                return false;
            }
            if(Math.abs((height_helper(root.left))-height_helper(root.right))>1){
                return false;
            }
            else{
                return is_balanced_helper(root.left) && is_balanced_helper(root.right);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bTree = new BinaryTree();
        BinarySearchTree bst = new BinarySearchTree();

        // Test Binary Tree
        System.out.println("Testing Binary Tree:");
        for (int i = 0; i < 3; i++) {
            bTree.add();
        }
        System.out.print("Preorder Traversal of Binary Tree: ");
        bTree.preorder(bTree.root);
        System.out.println();

        // Test Binary Search Tree
        System.out.println("Testing Binary Search Tree:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a value to add to BST: ");
            int value = sc.nextInt();
            bst.add(value);
        }
        System.out.print("Preorder Traversal of BST: ");
        bst.preorder(bst.root);
        System.out.println();

        sc.close();
    }
}
