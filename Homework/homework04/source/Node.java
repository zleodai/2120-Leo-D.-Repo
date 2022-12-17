package source;

public class Node {
    private int value;
    private Node l;
    private Node r;
    private char nodeChar;
    private Node parent;

    public Node(int integer, char character) {
        value = integer;
        nodeChar = character;
    }

    public void parentSet(Node node){
        parent = node;
    }

    public Node parentGet(){
        return parent;
    }

    public char getChar(){
        return nodeChar;
    }

    public void lSet(Node node) {
        l = node;
    }

    public void rSet(Node node) {
        r = node;
    }

    public Node lGet() {
        return l;
    }

    public Node rGet() {
        return r;
    }

    public int valueGet() {
        return value;
    }

    public boolean isLeaf(){
        return l == null && r == null;
    }
}