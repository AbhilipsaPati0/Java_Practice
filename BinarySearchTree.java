import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive method to insert a new value
    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.val) {
            node.left = insertRec(node.left, value);
        } else if (value > node.val) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    // Function to perform inorder traversal
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left); // Traverse left subtree
            System.out.print(node.val + " "); // Visit node
            inorderTraversal(node.right); // Traverse right subtree
        }
    }

    // Method to initiate inorder traversal from the root
    public void inorder() {
        inorderTraversal(root);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers to insert into the BST (type 'exit' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                bst.insert(value);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'exit' to stop.");
            }
        }

        System.out.println("Inorder traversal of the BST:");
        bst.inorder(); // Output should be in sorted order

        scanner.close();
    }
}