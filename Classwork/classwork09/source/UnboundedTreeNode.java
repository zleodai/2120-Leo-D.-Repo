package source;

import java.util.ArrayList;


public class UnboundedTreeNode {
    private int data;
    private ArrayList<UnboundedTreeNode> children;

    public UnboundedTreeNode(int x){
        data = x;
        children = new ArrayList<UnboundedTreeNode>();
    }

    public void add(int x){
        children.add(new UnboundedTreeNode(x));
    }

    public UnboundedTreeNode getChild(int index){
        return children.get(index);
    }

    public int getValue(){
        return data;
    }
}
