import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

// Class representing a node in the Huffman tree
class Node implements Comparable<Node> {
    int frequency;
    char character;
    Node left, right;

    Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        left = right = null;
    }

    // For priority queue to order nodes by frequency
    @Override
    public int compareTo(Node other) {
        return this.frequency - other.frequency;
    }
}

// Main class for Huffman coding
public class HuffmanCoding {
    private Map<Character, String> huffmanCodes = new HashMap<>();

    // Build the Huffman tree and generate codes
    public void buildHuffmanTree(char[] characters, int[] frequencies) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        // Create leaf nodes for each character and add to the priority queue
        for (int i = 0; i < characters.length; i++) {
            priorityQueue.add(new Node(characters[i], frequencies[i]));
        }

        // Build the Huffman tree
        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node newNode = new Node('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }

        // Generate codes from the Huffman tree
        generateCodes(priorityQueue.poll(), "");
    }

    // Recursive function to generate codes
    private void generateCodes(Node root, String code) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.character, code);
        }
        generateCodes(root.left, code + "0");
        generateCodes(root.right, code + "1");
    }

    // Encode the input string
    public String encode(String input) {
        StringBuilder encodedString = new StringBuilder();
        for (char character : input.toCharArray()) {
            encodedString.append(huffmanCodes.get(character));
        }
        return encodedString.toString();
    }

    // Decode the encoded string
    public String decode(String encodedString) {
        StringBuilder decodedString = new StringBuilder();
        Node currentNode = buildHuffmanTreeFromCodes();

        for (char bit : encodedString.toCharArray()) {
            currentNode = (bit == '0') ? currentNode.left : currentNode.right;
            if (currentNode.left == null && currentNode.right == null) {
                decodedString.append(currentNode.character);
                currentNode = buildHuffmanTreeFromCodes(); // Reset to root
            }
        }
        return decodedString.toString();
    }

    // Rebuild the Huffman tree from the codes
    private Node buildHuffmanTreeFromCodes() {
        Node root = new Node('\0', 0);
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            char character = entry.getKey();
            String code = entry.getValue();
            Node currentNode = root;

            for (char bit : code.toCharArray()) {
                if (bit == '0') {
                    if (currentNode.left == null) {
                        currentNode.left = new Node('\0', 0);
                    }
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = new Node('\0', 0);
                    }
                    currentNode = currentNode.right;
                }
            }
            currentNode.character = character; // Assign character to leaf node
        }
        return root;
    }

    // Main method to test the Huffman coding implementation
    public static void main(String[] args) {
        char[] characters = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] frequencies = { 5, 9, 12, 13, 16, 45 };

        HuffmanCoding huffmanCoding = new HuffmanCoding();
        huffmanCoding.buildHuffmanTree(characters, frequencies);

        String input = "ABCD";
        String encodedString = huffmanCoding.encode(input);
        System.out.println("Encoded String: " + encodedString);

        String decodedString = huffmanCoding.decode(encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}