import java.util.Scanner;

// Node class
class NodeEmployee {
    int empNumber;
    String empName;
    Node left;
    Node right;

    public NodeEmployee(int empNumber, String empName) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.left = null;
        this.right = null;
    }

    public void displayNode() {
        System.out.println("Employee Number: " + empNumber + ", Employee Name: " + empName);
    }
}

// Tree class
class TreeE {
    private Node root;

    public TreeE() {
        root = null;
    }

    // Insert a new node
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

    // Recursive find
    public Node findRecursive(int empNumber) {
        return findRecursive(root, empNumber);
    }

    private Node findRecursive(Node current, int empNumber) {
        if (current == null) {
            return null;
        }
        if (current.empNumber == empNumber) {
            return current;
        }
        if (empNumber < current.empNumber) {
            return findRecursive(current.left, empNumber);
        } else {
            return findRecursive(current.right, empNumber);
        }
    }

    // Traversals
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node current) {
        if (current != null) {
            inorderTraversal(current.left);
            current.displayNode();
            inorderTraversal(current.right);
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node current) {
        if (current != null) {
            current.displayNode();
            preorderTraversal(current.left);
            preorderTraversal(current.right);
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node current) {
        if (current != null) {
            postorderTraversal(current.left);
            postorderTraversal(current.right);
            current.displayNode();
        }
    }

    // Delete all nodes
    public void deleteAll() {
        root = null;
        System.out.println("All nodes have been deleted.");
    }
}

// Main Application
public class EmployeeTreeApp {
    public static void main(String[] args) {
        TreeE tree = new TreeE();

        // Insert 10 employees
        tree.insert(149, "Anusha");
        tree.insert(167, "Kosala");
        tree.insert(047, "Dinusha");
        tree.insert(066, "Mihiri");
        tree.insert(159, "Jayani");
        tree.insert(118, "Nimal");
        tree.insert(195, "Nishantha");
        tree.insert(034, "Avodya");
        tree.insert(105, "Bimali");
        tree.insert(133, "Sampath");

        // Display traversals
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal();

        System.out.println("\nPreorder Traversal:");
        tree.preorderTraversal();

        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal();

        // Search for an employee
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an employee number to search: ");
        int empNumber = scanner.nextInt();

        Node found = tree.findRecursive(empNumber);
        if (found != null) {
            System.out.println("Employee found:");
            found.displayNode();
        } else {
            System.out.println("Employee not found!");
        }

        // Delete all nodes
        System.out.println("\nDeleting all nodes...");
        tree.deleteAll();

        // Try displaying the tree after deleting
        System.out.println("\nInorder Traversal after deletion:");
        tree.inorderTraversal();

    }
}

