package source;

public class Heap {
    private int maxSize;
    private int size = 0;
    private Node[] heapArray;

    public Heap(int sizeConstraint, int rootValue, char rootChar) {
        maxSize = sizeConstraint;
        heapArray = new Node[maxSize];
        heapArray[++size - 1] = new Node(rootValue, rootChar);
    }

    public void insert(int nodeValue, char rootChar) {
        heapArray[++size - 1] = new Node(nodeValue, rootChar);
        sortUp(size - 1);
    }

    public Node remove() {
        Node oldRoot = heapArray[0];
        heapArray[0] = heapArray[size-- - 1];
        heapArray[size] = null;
        sortDown(0);

        return oldRoot;
    }

    public void sortUp(int index) {
        if (heapArray[(index - 1) / 2].valueGet() < heapArray[index].valueGet()) {
            Node temp = heapArray[index];
            heapArray[index] = heapArray[(index - 1) / 2];
            heapArray[(index - 1) / 2] = temp;
            sortUp((index - 1) / 2);
        }
    }

    public void sortDown(int index) {
        int leftIndex = (index * 2) + 1;
        int rightIndex = (index * 2) + 2;
        if (leftIndex < maxSize) {
            if (heapArray[leftIndex] != null) {
                if (heapArray[index].valueGet() < heapArray[leftIndex].valueGet()) {
                    Node temp = heapArray[index];
                    heapArray[index] = heapArray[leftIndex];
                    heapArray[leftIndex] = temp;
                    sortDown(leftIndex);
                }
            }
        }
        if (rightIndex < maxSize) {
            if (heapArray[rightIndex] != null) {
                if (heapArray[index].valueGet() < heapArray[rightIndex].valueGet()) {
                    Node temp = heapArray[index];
                    heapArray[index] = heapArray[rightIndex];
                    heapArray[rightIndex] = temp;
                    sortDown(rightIndex);
                }
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
