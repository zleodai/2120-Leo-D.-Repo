import source.UnboundedTreeNode;


class UnboundedTreeTester{

    public static void main (String[] args){
        int rootValue = 23;
        int rootFirstChildIndex = 0;
        int rootThirdChildIndex = 2;

        UnboundedTreeNode root = new UnboundedTreeNode(rootValue);
        root.add(2);
        root.add(3);
        root.add(4);

        UnboundedTreeNode it = root.getChild(rootFirstChildIndex);
        it.add(5);
        it.add(6);

        UnboundedTreeNode it2 = root.getChild(rootThirdChildIndex);
        it2.add(7);
        it2.add(8);
        it2.add(9);
        it2.add(10);
        it2.add(11);
        it2.add(12);
        it2.add(13);
        it2.add(14);

    }
}