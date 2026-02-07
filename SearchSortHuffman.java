import java.util.*;

// Node class representing a character and its frequency in Huffman Tree
class Node implements Comparable<Node> {
    char character;
    int frequency;
    Node left, right;

    Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    Node(int frequency, Node left, Node right) {
        this.character = '\0';
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node other) {
        return this.frequency - other.frequency;
    }
}

public class SearchSortHuffman {
    private Map<Character, String> huffmanCodes = new HashMap<>();
    
    public void buildHuffmanTree(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node newNode = new Node(left.frequency + right.frequency, left, right);
            queue.add(newNode);
        }

        generateCodes(queue.poll(), "");
    }

    private void generateCodes(Node root, String code) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.character, code);
        }
        generateCodes(root.left, code + "0");
        generateCodes(root.right, code + "1");
    }

    public void calculateBits(String input) {
        int initialBits = input.length() * 8;
        System.out.println("Initial bits required: " + initialBits + " bits");

        int compressedBits = 0;
        System.out.println("Huffman Codes:");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (char c : input.toCharArray()) {
            compressedBits += huffmanCodes.get(c).length();
        }
        System.out.println("Compressed bits required: " + compressedBits + " bits");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "230301120502";
        String inputPassword;

        while (true) {
            System.out.print("Enter password to access the menu: ");
            inputPassword = sc.nextLine();
            if (inputPassword.equals(password)) {
                break;
            } else {
                System.out.println("Sorry Abhilipsa, the password is incorrect. Please try again.");
            }
        }

        SearchSortHuffman ssh = new SearchSortHuffman();

        while (true) {
            System.out.println("A. Searching ");
            System.out.println("  1. Linear Search");
            System.out.println("  2. Binary Search");
            System.out.println("B. Sorting");
            System.out.println("  1. Bubble Sort");
            System.out.println("C. Huffman Coding");
            System.out.print("Enter your choice (A/B/C) or 'exit' to quit: ");
            String choice = sc.nextLine().toUpperCase();

            if (choice.equals("EXIT")) break;

            if (choice.equals("C")) {
                System.out.print("Enter a string for Huffman coding: ");
                String inputString = sc.nextLine().trim();
                if (!inputString.isEmpty()) {
                    ssh.buildHuffmanTree(inputString);
                    ssh.calculateBits(inputString);
                } else {
                    System.out.println("Input string cannot be empty.");
                }
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
