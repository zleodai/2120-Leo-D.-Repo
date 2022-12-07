package source;

public class UnorderedTree {
    private Node root;

    public UnorderedTree(int x) {
        root = new Node(x);
    }

    public void insert(int x) {
        Node node = new Node(x);
        Node target = root;
        while (!(target.lGet() == null && node.valueGet() <= target.valueGet()
                || target.rGet() == null && node.valueGet() > target.valueGet())) {
            if (node.valueGet() >= target.valueGet())
                target = target.rGet();
            else
                target = target.lGet();
        }
        if (node.valueGet() <= target.valueGet())
            target.lSet(node);
        else
            target.rSet(node);
    }

    public Node getRoot() {
        return root;
    }
}
