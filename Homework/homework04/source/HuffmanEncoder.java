package source;

import java.util.Base64.Decoder;

public class HuffmanEncoder {
    private BinaryTree decoderTree;
    private char[] refrenceArray;
    private String inputedMessage;

    public HuffmanEncoder(String inputMessage) {
        inputedMessage = inputMessage;
    }

    public Node getRoot(){
        return decoderTree.getRoot();
    }

    public void setString(String input){
        inputedMessage = input;
    }

    public byte[] encode(){
        char[] charArray = inputedMessage.toCharArray();
        int[] fullCharFreqArray = new int[128];
        Heap charFreqHeap = new Heap(128, 129, '`');

        for (int i = 0; i < charArray.length; i++) {
            fullCharFreqArray[charArray[i]] += 1;
        }

        for (int currentIndex = 0; currentIndex < fullCharFreqArray.length; currentIndex++) {
            char currentCharacter = (char) currentIndex;
            if (fullCharFreqArray[currentIndex] != 0)
                charFreqHeap.insert(fullCharFreqArray[currentIndex], currentCharacter);
        }

        char[] charPriorityArray = new char[charFreqHeap.getSize()];

        int arrayIndex = 0;
        while (!charFreqHeap.isEmpty()){
            Node xNode = charFreqHeap.remove();
            charPriorityArray[arrayIndex] = xNode.getChar();
            arrayIndex += 1;
        }

        refrenceArray = charPriorityArray;
        //renamed for convience :)

        byte[][] locations = new byte[refrenceArray.length][];

        Node newNode = new Node(0, charPriorityArray[0]);
        decoderTree = new BinaryTree(newNode);
        locations[0] = null;

        for(int x = 1; x < charPriorityArray.length; x++){
            Node temppNode = new Node(x, charPriorityArray[x]);
            decoderTree.insert(decoderTree.getRoot(), temppNode);
            byte[] tempRoute = decoderTree.getRoute(temppNode);
            locations[x] = tempRoute;
        }

        int encodedMessageSize = 0;

        for(int charIndex = 0; charIndex < charArray.length; charIndex++){
            boolean found = false;
            for(int refIndex = 0; refIndex < refrenceArray.length || !found; refIndex++){
                if (refrenceArray[refIndex] == charArray[charIndex]){
                    found = true;
                    byte[] charRoute = locations[refIndex];
                    encodedMessageSize += charRoute.length;
                }
            }
        }

        byte[] output = new byte[encodedMessageSize];
        int anotherCounter = 0;

        for(int charIndex = 0; charIndex < charArray.length; charIndex++){
            boolean found = false;
            for(int refIndex = 0; refIndex < refrenceArray.length || !found; refIndex++){
                if (refrenceArray[refIndex] == charArray[charIndex]){
                    found = true;
                    byte[] charRoute = locations[refIndex];
                    for (int i = 0; i < charRoute.length; i++){
                        output[anotherCounter] = charRoute[i];
                        anotherCounter ++;
                    }
                }
            }
        }
        
        System.out.print("\n\n Encoded Message: \n\n");

        for(int i = 0; i < output.length; i++){
            System.out.print(output[i]);
        }

        System.out.println("\n");

        return output;
    }

    public String decode(byte[] encodedMessage){
        String decodedMessage = "";
        
        Node target = decoderTree.getRoot();

        for(int i = 0; i < encodedMessage.length; i++){
            if (target.isLeaf()){
                decodedMessage = decodedMessage + target.getChar();
                target = decoderTree.getRoot();
            }
            if (encodedMessage[i] == 0){
                target = target.lGet();
            } else if (encodedMessage[i] == 1){
                target = target.rGet();
            }
        }

        System.out.print("\n\n  Decoded Message:\n" + decodedMessage + "\n");
        return decodedMessage;
    }

}