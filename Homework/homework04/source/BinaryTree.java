package source;
import java.util.Random;

public class BinaryTree{
    private Node root;
    private int size;
    private Random rand;

    public BinaryTree(Node node){
        Node tempNode1 = new Node(0, '*');
        Node tempNode2 = new Node(0, '*');
        Node tempNode3 = new Node(0, '*');
        root = tempNode1;
        size = 4;
        rand = new Random();
        rand.ints();

        tempNode1.lSet(tempNode2);
        tempNode1.rSet(tempNode3);
        tempNode2.parentSet(tempNode1);
        tempNode3.parentSet(tempNode1);

        node.parentSet(tempNode2);
        tempNode2.lSet(node);
    }
    
    public void insert(Node indexNode, Node node){
        if (indexNode.lGet() == null){
            Node tempNode = new Node(0, '*');
            indexNode.lSet(tempNode);
            tempNode.parentSet(indexNode);
            size ++;
            tempNode.lSet(node);
            node.parentSet(tempNode);
            size ++;
        } else if(indexNode.rGet() == null){
            Node tempNode = new Node(0, '*');
            indexNode.rSet(tempNode);
            tempNode.parentSet(indexNode);
            size ++;
            tempNode.lSet(node);
            node.parentSet(tempNode);
            size ++;
        } else {
            int randInt = rand.nextInt(1000);
            if(randInt % 2 != 0){
                if (indexNode.lGet().getChar() == '*')
                    insert(indexNode.lGet(), node);
                else
                    insert(indexNode.rGet(), node);
            }
            else
                insert(indexNode.rGet(), node);
        }
    }

    public void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.lGet());
 
        /* then print the data of node */
        System.out.print(node.getChar() + " ");
 
        /* now recur on right child */
        printInorder(node.rGet());
    }

    public void preOrder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.lGet());
 
        /* then print the data of node */
        System.out.print(node.getChar() + " ");
 
        /* now recur on right child */
        printInorder(node.rGet());
    }

    public Node getRoot(){
        return root;
    }

    public int getSize(){
        return size;
    }

    public byte[] getRoute(Node node){
        Node iteratorParent = node.parentGet();
        Node iterator = node;
        int counter = 0;
        byte[] output = new byte[50];
        while(true){
            if (iteratorParent == null){
                return optimize(output);
            }
            if (iteratorParent.lGet() == iterator){
                output[counter] = 1;
                counter ++;
            } else {
                output[counter] = 2;
                counter ++;
            }
            iterator = iterator.parentGet();
            iteratorParent = iteratorParent.parentGet();
        }
    }

    private byte[] optimize(byte[] input){
        int arraySize = 0;
        int index = 0;
        boolean check = false;
        while(!check){
            if (input[index] == 0){
                arraySize = index + 1;
                check = true;
            }
            index ++;
        }

        arraySize --;

        byte[] output = new byte[arraySize != -1 ? arraySize : 0];
        for (int i = 0; i < arraySize; i++){
            output[i] = (byte)(input[i] - 1);
        }


        //reverse it so its right 
        int start = 0 ;
        int end = output.length - 1;
        while (start < end) {
            byte temp = output[start];
            output[start] = output[end];
            output[end] = temp;
            start = start + 1;
            end = end - 1;
        }

        return output;
    }
}