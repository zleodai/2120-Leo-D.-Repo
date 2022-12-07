import source.*;

class InOrderTraversal {

    public static void printInOrder(Node node) {
        if (node == null)
            return;

        printInOrder(node.lGet());
        System.out.println(node.valueGet());
        printInOrder(node.rGet());
    }

    public static void main(String[] args) {
        UnorderedTree testTree = new UnorderedTree(10);

        testTree.insert(5);
        testTree.insert(15);
        testTree.insert(3);
        testTree.insert(7);
        testTree.insert(13);
        testTree.insert(18);

        System.out.println("InOrder Tree:");
        printInOrder(testTree.getRoot());
    }
}