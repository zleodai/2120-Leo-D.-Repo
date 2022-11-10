package src;

public class HeapNode {

    private int data;

    // constructor
    public HeapNode(int key) {
        data = key;
    }

    // get the data value
    public int getKey() {
        return data;
    }

    // set the data value
    public void setKey(int value) {
        data = value;
    }

}