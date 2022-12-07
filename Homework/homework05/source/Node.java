package source;

public class Node {
    private int value;
    private Node l;
    private Node r;

    public Node(int x) {
        value = x;
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
}