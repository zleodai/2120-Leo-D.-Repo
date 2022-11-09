
// Comments will either describe what's going on or will mark which methods are messing up the decoding 

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

public class Huffman {
    // initilizing Huffman node
    public class HuffmanNode implements Comparable<HuffmanNode> {

        public char value;
        public int count;
        public HuffmanNode leftNode;
        public HuffmanNode rightNode;
        public String code = "";

        public HuffmanNode(char v, int c, HuffmanNode l, HuffmanNode r) {

            value = v;
            count = c;
            leftNode = l;
            rightNode = r;
        }

        public int compareTo(HuffmanNode huff) {
            int comp = 0;

            if (count == huff.count) {
                comp = value - huff.value;
            } else {
                comp = count - huff.count;
            }
            return comp;
        }
    }

    // Compression process
    public ArrayList compress(String string) {
        ArrayList<HuffmanNode> message = new ArrayList<HuffmanNode>(53);
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        int counter = 0;

        // Having the code = the letter (i and j)

        for (int j = 0; j < 53; j++) {
            HuffmanNode insert = new HuffmanNode(letters.charAt(j), 0, null, null);
            message.add(insert);
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == (message.get(j).value)) {
                    message.get(j).count++;
                }
            }
        }
        for (int x = 0; x < 53; x++) {
            if (message.get(x).count != 0) {
                counter++;
            }
        }

        ArrayList<HuffmanNode> MessageReturn = new ArrayList<HuffmanNode>(counter);
        for (int y = 0; y < message.size(); y++) {
            if (message.get(y).count != 0) {
                HuffmanNode Inserter = message.get(y);
                MessageReturn.add(Inserter);
            }
        }
        Collections.sort(MessageReturn);
        return MessageReturn;
    }

    // Huff tree functions
    public PriorityQueue huffTree(ArrayList<HuffmanNode> Nodes) {
        PriorityQueue<HuffmanNode> tree = new PriorityQueue<HuffmanNode>(Nodes.size());
        HuffmanNode leftNode = null;
        HuffmanNode rightNode = null;
        char otherL = 'o';
        PriorityQueue<HuffmanNode> local = new PriorityQueue<HuffmanNode>(1);

        for (int i = 0; i < Nodes.size(); i++) {
            System.out.println("Letter of phrase " + Nodes.get(i).value);
            tree.add(Nodes.get(i));
            System.out.println("Value of letter " + tree.peek().count);
        }
        while (tree.size() > 1) {
            leftNode = tree.peek();
            tree.remove();
            rightNode = tree.peek();
            tree.remove();

            HuffmanNode parent = new HuffmanNode(otherL, leftNode.count + rightNode.count, leftNode, rightNode);
            tree.add(parent);
        }
        return tree;
    }

    // Encoding process
    public String encode(PriorityQueue<HuffmanNode> treelist, String TextInput) {
        Huffman exc = new Huffman();
        HuffmanNode TreeRoot = treelist.peek();
        String text = TextInput;
        char edge = ' ';
        String comp = "";

        for (int i = 0; i < text.length(); i++) {

            edge = text.charAt(i);
            comp += exc.treeTraversal(TreeRoot, edge);
            System.out.println("Binary Code By Letter: " + comp);
            // prints the binary code of each letter + previous letter
        }

        return comp;
    }

    // Traversing through tree, left move is 0, right move is 1
    public String treeTraversal(HuffmanNode step, char nextNode) {

        if (step.leftNode != null || step.rightNode != null) {
            if (step.leftNode.value == nextNode) {
                return "0";
            }
            if (step.rightNode.value == nextNode) {
                return "1";
            }

            String leftTraverse = treeTraversal(step.leftNode, nextNode);
            if (leftTraverse != null) {
                return "0" + leftTraverse;
            }

            String rightTraverse = treeTraversal(step.rightNode, nextNode);
            if (rightTraverse != null) {
                return "1" + rightTraverse;
            }
        }

        return null;
    }

    // Decoding process, not working properly for some reason...
    public String decode(String binary, PriorityQueue<HuffmanNode> treelist) {
        HuffmanNode TreeRoot = treelist.peek();
        HuffmanNode pointer = TreeRoot;
        String bincode = "";

        for (int i = 0; i < binary.length(); i++) {
            if (pointer.leftNode == null && pointer.rightNode == null) {
                bincode += pointer.value;
                pointer = TreeRoot;

            } else {
                if (binary.charAt(i) == '0') {
                    pointer = pointer.leftNode;

                } else {
                    pointer = pointer.rightNode;
                }
            }

        }
        bincode += pointer.value;
        return bincode;

    }

    // Something is messing up the decoding procssess.
    public static void main(String[] args) {
        System.out.println("Please input a phrase");
        Scanner sc = new Scanner(System.in);
        String input = "";
        int counter = 0;

        while (counter == 0) {
            input += sc.nextLine();
            System.out.println("Please press enter again");
            if (sc.nextLine().equals("")) {
                counter += 1;
            }

        }

        System.out.println("Your selected Phrase Is: " + input);
        Huffman test = new Huffman();
        ArrayList<HuffmanNode> HuffTester = new ArrayList<HuffmanNode>();
        HuffTester = test.compress(input);
        PriorityQueue<HuffmanNode> tree = new PriorityQueue<HuffmanNode>();
        tree = test.huffTree(HuffTester);

        System.out.println("Now Creating Binary Code from Tree:");
        String bincode = "";
        bincode = test.encode(tree, input);
        System.out.println("Recieved Final Binary Code: " + bincode);

        String decodedMsg = "";
        decodedMsg = test.decode(bincode, tree);
        System.out.println("Decoded Result: " + decodedMsg);

    }

}