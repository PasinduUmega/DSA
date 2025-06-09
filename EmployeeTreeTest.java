// Node class
class Node {
    int empNumber;
    String empName;
    Node left;
    Node right;

    // Constructor
    public Node(int empNumber, String empName) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.left = null;
        this.right = null;
    }

    // Method to display node details
    public void displayNode() {
        System.out.println("Employee Number: " + empNumber + ", Employee Name: " + empName);
    }
}

// Tree class
class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    // Public method to start recursive find
    public Node findRecursive(int empNumber) {
        return findRecursive(root, empNumber);
    }

    // Private helper method for recursive find
    private Node findRecursive(Node current, int empNumber) {
        if (current == null) {
            return null; // Not found
        }
        if (current.empNumber == empNumber) {
            return current; // Found
        }
        if (empNumber < current.empNumber) {
            return findRecursive(current.left, empNumber); // Search left
        } else {
            return findRecursive(current.right, empNumber); // Search right
        }
    }

    // Insert method (to add nodes into tree)
    public void insert(int empNumber, String empName) {
        Node newNode = new Node(empNumber, empName);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (empNumber < current.empNumber) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Method to delete all nodes
    public void deleteAll() {
        root = null; // Java's garbage collector will clean up
        System.out.println("All nodes have been deleted.");
    }

    // Inorder traversal to display all nodes (optional)
    public void displayTree() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node current) {
        if (current != null) {
            inorderTraversal(current.left);
            current.displayNode();
            inorderTraversal(current.right);
        }
    }
}

// Main class to test
public class EmployeeTreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Insert some employees
        tree.insert(1001, "Alice");
        tree.insert(1003, "Bob");
        tree.insert(1002, "Charlie");

        // Display all nodes
        System.out.println("All Employees:");
        tree.displayTree();

        // Find an employee
        System.out.println("\nSearching for employee 1002:");
        Node found = tree.findRecursive(1002);
        if (found != null) {
            found.displayNode();
        } else {
            System.out.println("Employee not found.");
        }

        // Delete all nodes
        System.out.println("\nDeleting all nodes...");
        tree.deleteAll();

        // Try displaying after delete
        System.out.println("\nTrying to display after delete:");
        tree.displayTree();
    }
}

